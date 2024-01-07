import sys
from antlr4 import *
from GeomLexer import GeomLexer
from GeomParser import GeomParser
from GeomListener import GeomListener
from PolytopeAnalyzerListener import PolytopeAnalyzerListener
from SyntaxAnalyzerListener import SyntaxAnalyzerListener


def main(argv):
    input = FileStream(argv[1])
    lexer = GeomLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GeomParser(stream)
    tree = parser.main()

    syntax = SyntaxAnalyzerListener()
    walker = ParseTreeWalker()
    walker.walk(syntax, tree)
    syntaxRes = syntax.report()
    if syntaxRes:
        polytope = PolytopeAnalyzerListener(syntaxRes)
        walker.walk(polytope, tree)

    output.close()


if __name__ == '__main__':
    main(sys.argv)
