from antlr4.error.ErrorListener import *
from SyntaxAnalyzerListener import SyntaxAnalyzerListener


class VerboseListener(ErrorListener) :
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print("line " + str(line) + ":" + str(column) + " " + msg, file=sys.stderr)
        SyntaxAnalyzerListener.addSyntaxError(line, column, msg, e)

