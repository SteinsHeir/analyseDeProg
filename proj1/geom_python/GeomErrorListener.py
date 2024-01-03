import sys
from antlr4 import *
from antlr4.error.ErrorListener import *
from pprint import pprint

from GeomLexer import GeomLexer
from GeomParser import GeomParser



class VerboseListener(ErrorListener) :
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        stack = recognizer.getRuleInvocationStack()
        stack.reverse()
        print("line", line, ":", column, "at", offendingSymbol, ":", "msg")