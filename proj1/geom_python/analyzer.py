import sys
from antlr4 import *

import GeomErrorListener
from GeomLexer import GeomLexer
from GeomParser import GeomParser
from PolytopeAnalyzerListener import PolytopeAnalyzerListener
from SyntaxAnalyzerListener import SyntaxAnalyzerListener


def main(argv):
    input = FileStream(argv[1])
    lexer = GeomLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GeomParser(stream)
    parser.addErrorListener(GeomErrorListener.VerboseListener())
    tree = parser.main()

    syntax = SyntaxAnalyzerListener()
    walker = ParseTreeWalker()
    walker.walk(syntax, tree)
    syntaxRes = syntax.report()
    if syntaxRes:
        polytope = PolytopeAnalyzerListener(syntaxRes)
        walker.walk(polytope, tree)
    else:
        raise ValueError(f"Syntax check detected errors")


if __name__ == '__main__':
    main(sys.argv)
