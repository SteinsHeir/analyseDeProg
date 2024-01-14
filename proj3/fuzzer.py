from IPython.core.display_functions import display
from fuzzingbook.GrammarFuzzer import GrammarFuzzer, display_tree, DerivationTree, tree_to_string
from fuzzingbook.GeneratorGrammarFuzzer import GeneratorGrammarFuzzer
from fuzzingbook.GreyboxFuzzer import PowerSchedule, AdvancedMutationFuzzer
from fuzzingbook.GreyboxGrammarFuzzer import DictMutator, FragmentMutator, SeedWithStructure, LangFuzzer
from fuzzingbook.Grammars import Grammar, opts, is_valid_grammar
from fuzzingbook.MutationFuzzer import FunctionCoverageRunner
from fuzzingbook.Parser import EarleyParser, Parser
import random
import subprocess
import json
import markdown_to_json
import string

site = "https://api.mangadex.org"
grammar_tags = ""

c = []
s = []


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


#REDUCED_GRAMMAR.update({
#    "<header>": [
#        ("<hashtag> <char>", opts(post=lambda _, i: c.append(i))),
#         ("\n<char>\n<header_symbol>", opts(post=lambda i, _: c.append(i)))
#    ],
#    "<list_symbol>": [
#        ("*", opts(post=lambda: s.append("*"))),
#        ("-", opts(post=lambda: s.append("-"))),
#        ("+", opts(post=lambda: s.append("+")))
#    ],
#})

def my_parser(inp: str) -> None:
    parser_ = EarleyParser(REDUCED_GRAMMAR, tokens=MUT_TOKENS)
    parser_.feed(inp)


assert is_valid_grammar(REDUCED_GRAMMAR)
fuzzer = GeneratorGrammarFuzzer(REDUCED_GRAMMAR)
seed1 = fuzzer.fuzz()
MUT_TOKENS = {"<list_item>", "<header>", "<sublist_item>"}
parser = EarleyParser(REDUCED_GRAMMAR, tokens=MUT_TOKENS)
valid_seed = SeedWithStructure(str(seed1))
print(valid_seed)


fragment_mutator = FragmentMutator(parser)
print("####################################")
print(fragment_mutator.mutate(valid_seed))
print("####################################")
schedule = PowerSchedule()
mut_fuzzer = LangFuzzer([valid_seed.data], fragment_mutator, schedule)
print("####################################")
for i in range(0, 10):
    res = mut_fuzzer.fuzz()
    print(res)
    output = open("test.md", 'w')
    output.write(str(res))
    output.close()
    output = open("test.md", 'r')
    txt = output.read()
    output.close()
    jsonified = markdown_to_json.jsonify(txt)
    print(jsonified)
    res_json = json.loads(jsonified)
    for header in c:
        if not res_json:
            pass
    print(markdown_to_json.dictify(txt))
