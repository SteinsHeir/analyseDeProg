import copy

from fuzzingbook.GeneratorGrammarFuzzer import GeneratorGrammarFuzzer
from fuzzingbook.GreyboxFuzzer import PowerSchedule
from fuzzingbook.GreyboxGrammarFuzzer import FragmentMutator, SeedWithStructure, LangFuzzer
from fuzzingbook.Grammars import Grammar, opts, is_valid_grammar
from fuzzingbook.Parser import EarleyParser
import json
import markdown_to_json
import string
import sys

c = []
s = []


def main(argv):
    try:
        errors = fuzzing_with_mutations(int(argv[1]))
        print(f"total number of errors for {argv[1]} inputs : {errors}")
    except ValueError:
        print("invalid argument passed")


def crange(character_start: str, character_end: str):
    return [chr(i)
            for i in range(ord(character_start), ord(character_end) + 1)]


def srange(characters: str):
    return [c for c in characters]


MD_GRAMMAR = {
    "<start>": ["<md>"],
    "<md>": ["<header>\n<list_item>", "<header>\n<char>", "<header>\n<list_item>\n<md>", "<header>\n<char>\n<md>"],
    "<header>": ["<hashtag> <char>", "\n<char>\n<header_symbol>", "\n<html_tag><char><end_html_tag>"],
    "<header_symbol>": ["===", "---"],
    "<html_tag>": ["<left-angle>h<num><right-angle>"],
    "<end_html_tag>": ["<left-angle>/h<num><right-angle>"],
    "<left-angle>": ["<"],
    "<right-angle>": [">"],
    "<hashtag>": ["#", "##", "###", "####", "#####", "######"],
    "<num>": crange('0', '6'),
    "<list_item>": ["<star> <char>", "<star> <char>\n<list_item>"],
    "<star>": ["*"],
    "<char>": ["<letter><char>", "<letter>"],
    "<letter>": srange(string.ascii_letters),
}

REDUCED_GRAMMAR: Grammar = {
    "<start>": ["""<md>"""],
    "<md>": ["<header>\n<list_item>", "<header>\n<char>", "<header>\n<list_item>\n<md>", "<header>\n<char>\n<md>"],
    "<header>": ["<hashtag> <char>", "\n<char>\n<header_symbol>"],
    "<header_symbol>": ["===", "---"],
    "<hashtag>": ["#", "##", "###", "####", "#####", "######"],
    "<list_item>": ["<list_symbol> <char>", "<list_symbol> <char>\n<list_item>",
                    "<list_symbol> <char>\n<sublist_item>"],
    "<sublist_item>": ["\t<list_symbol> <char>", "\t<list_symbol> <char>\n<sublist_item>"],
    "<list_symbol>": ["*", "-", "+"],
    "<char>": ["<letter><char>", "<letter>"],
    "<letter>": srange(string.ascii_letters) + srange(string.digits),
}

REDUCED_EXPANDED_GRAMMAR = copy.deepcopy(REDUCED_GRAMMAR)

REDUCED_EXPANDED_GRAMMAR.update({
   "<header>": [
       ("<hashtag> <char>", opts(post=lambda _, i: c.append(i))),
       ("\n<char>\n<header_symbol>", opts(post=lambda i, _: c.append(i)))
   ],
   "<list_symbol>": [
       ("*", opts(post=lambda: s.append("*"))),
       ("-", opts(post=lambda: s.append("-"))),
       ("+", opts(post=lambda: s.append("+")))
   ],
})

assert is_valid_grammar(REDUCED_GRAMMAR)
MUT_TOKENS = {"<list_item>", "<header>", "<sublist_item>"}


def fuzzing_with_mutations(n):
    fuzzer = GeneratorGrammarFuzzer(REDUCED_GRAMMAR)
    parser = EarleyParser(REDUCED_GRAMMAR, tokens=MUT_TOKENS)
    schedule = PowerSchedule()
    fragment_mutator = FragmentMutator(parser)
    errors = 0

    data = []
    for i in range(0, 10):
        seed = fuzzer.fuzz()
        valid_seed = SeedWithStructure(seed)
        fragment_mutator.add_to_fragment_pool(valid_seed)
        data.append(valid_seed.data)
    mut_fuzzer = LangFuzzer(data, fragment_mutator, schedule)

    for i in range(0, n):
        print("####################################")
        res = mut_fuzzer.fuzz()
        errors += write_and_check(str(res))
    return errors


def fuzzing_without_mutations(n):
    fuzzer = GeneratorGrammarFuzzer(REDUCED_GRAMMAR)
    errors = 0
    for i in range(0, n):
        res = fuzzer.fuzz()
        errors += write_and_check(res)
    return errors


def write_and_check(result):
    curr_errors = 0
    output = open("test.md", 'w')
    output.write(result)
    output.close()
    infos = parse_md()
    output = open("test.md", 'r')
    txt = output.read()
    output.close()
    jsonified = json.loads(markdown_to_json.jsonify(txt))
    print(f"Parsed values\n"
          f"=============\n"
          f"keys = {infos['cles']}\n"
          f"list elems = {infos['listes']}\n"
          f"values = {infos['vals']}\n")
    print(f"json = {jsonified}")
    for k in infos['cles']:
        if not k in jsonified:
            curr_errors += 1
    print(markdown_to_json.dictify(txt))
    print(f"current errors = {curr_errors}")
    return curr_errors


def parse_md():
    info = {}
    output = open("test.md", 'r')
    txt = output.readlines()
    output.close()
    c = []
    l = []
    v = []
    for line in txt:
        line_index = txt.index(line)
        if line[0] == '#':
            c.append(line.split(' ')[1].strip('\n'))
        elif line == "===\n" or line == "---\n":
            c.append(txt[line_index - 1].strip('\n'))
        elif line[0] == '+' or line[0] == '-' or line[0] == '*':
            l.append(line.split(' ')[1].strip('\n'))
        elif line.split(' ')[0].strip('\t') != line.split(' ')[0] and (
                line.split(' ')[0].strip('\t') == '+' or line.split(' ')[0].strip('\t') == '-' or line.split(' ')[
            0].strip('\t') == '*'):
            if not isinstance(l[len(l) - 1], str):
                l[len(l) - 1].append(line.split(' ')[1].strip('\n').strip('\t'))
            else:
                l.append([line.split(' ')[1].strip('\n').strip('\t')])
        elif line_index == len(txt) - 1:
            v.append(line.strip('\n'))
        elif line != '\n' and (txt[line_index + 1] != "===\n" and txt[line_index + 1] != "---\n"):
            v.append(line.strip('\n'))
        else:
            pass
    info['cles'] = c
    info['listes'] = l
    info['vals'] = v
    return info


if __name__ == '__main__':
    main(sys.argv)
