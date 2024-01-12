from fuzzingbook.Grammars import simple_grammar_fuzzer
import random
import mangadex
import requests
import json

site = "https://api.mangadex.org"

API_GRAMMAR = {
    "<start>": ["<url>"],
    "<url>": [f"{site}/<category>"],
    "<category>": [f"manga"],
}

def get_tags():
    tags = requests.get(
        f"{site}/manga/tag"
    ).json()
    return tags["data"]


def mute_tags(data):
    tag_list = []
    nb = random.randint(1, 3)
    print(nb)
    while nb > 0:
        choice = random.choice(data)
        print(choice["attributes"]["name"]["en"])
        tag_list.append(choice["id"])
        nb -= 1

    if tag_list:
        mutant = random.choice(tag_list)
        for mutant in tag_list:
            print(f"before : {mutant}")
            tag_list[tag_list.index(mutant)] = flip_random_character(mutant)
            print(f"after: {mutant}")
    return tag_list


def add_params(tags):
    body = {}
    body["includedTags[]"] = mute_tags(tags)
    return body

def insert_random_character(arg: str) -> str:
    pos = random.randint(0, len(arg))
    random_character = chr(random.randrange(32, 127))
    return arg[:pos] + random_character + arg[pos:]

def flip_random_character(s):
    if s == "":
        return s

    pos = random.randint(0, len(s) - 1)
    c = s[pos]
    bit = 1 << random.randint(0, 6)
    new_c = chr(ord(c) ^ bit)
    return s[:pos] + new_c + s[pos + 1:]


req = simple_grammar_fuzzer(API_GRAMMAR, "<start>")
tags = get_tags()
for i in range(0,7):
    params = add_params(tags)
    res = requests.get(req, params).json()
    if res["result"] == "ok":
        print(res)
        for manga in res["data"]:
            print(manga["id"])
            print(manga["attributes"]["title"])
    else:
        print(res)

#api = mangadex.Api()
#print(api.get_manga_list(limit = 2))

#res = requests.get('https://api.mangadex.org/manga/random')
#response = json.loads(res.text)
#print(response)
