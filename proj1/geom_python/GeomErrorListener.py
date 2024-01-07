import sys
from antlr4 import *
from antlr4.error.ErrorListener import *
from pprint import pprint
from GeomLexer import GeomLexer
from GeomParser import GeomParser
from SyntaxAnalyzerListener import SyntaxAnalyzerListener


class VerboseListener(ErrorListener) :
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print("line " + str(line) + ":" + str(column) + " " + msg, file=sys.stderr)
        SyntaxAnalyzerListener.addSyntaxError(line, column, msg, e)

