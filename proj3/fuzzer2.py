import subprocess

from fuzzingbook.GrammarFuzzer import GrammarFuzzer
import random
import mangadex
import requests
import json
import process

site = "https://api.mangadex.org"

API_GRAMMAR = {
    "<start>": ["<url>"],
    "<url>": [f"{site}/<category>"],
    "<category>": [f"manga"],
}

DL_GRAMMAR = {
    "<start>": ["<url>"],
    "<url>": [f"https://mangadex.org/<section>/<id>"],
    "<section>": [f"manga"],
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


req = GrammarFuzzer(API_GRAMMAR, "<start>")
tags = get_tags()
for i in range(0, 7):
    params = add_params(tags)
    res = requests.get(req, params).json()
    if res["result"] == "ok":
        print(res)
        for manga in res["data"]:
            print(manga["id"])
            print(manga["attributes"]["title"])
    else:
        print(res)

subprocess.Popen(["./mangadex-dl/mangadex-dl.exe", ])
