import sys
from antlr4 import *
from GeomParser import GeomParser
from GeomListener import GeomListener
from antlr4.error.ErrorListener import *


class SyntaxAnalyzerListener(GeomListener):
    points = {}
    vars = {}
    errors = []
    currentPoint = ''

    def __init__(self):
        pass

    def enterConsdecl(self, ctx: GeomParser.ConsdeclContext):
        if ctx.ID() is not None and ctx.ID().getText() in self.points:
            varName = ctx.ID().getText()
            self.errors.append(f'point {varName} already registered. Skipping constraints')
        else:
            varName = ctx.ID().getText()
            print(f'point {varName} registered')
            self.currentPoint = varName
            self.points[varName] = []
            self.vars[varName] = []

    def enterLindecl(self, ctx: GeomParser.LindeclContext):
        buffer = []
        if self.currentPoint != '':
            self.points[self.currentPoint].append(ctx.getText())
            if ctx.leftexpr() and ctx.int_comp_op() and ctx.numericValue():
                l = ctx.leftexpr()
                if l.ID():
                    if l.ID().getText() != 'x' and l.ID().getText() != 'y':
                        self.errors.append(f"wrong variable name in constraint {ctx.getText()}")
                    else:
                        if l.ID().getText() in buffer:
                            self.errors.append(f"wrong format for constraint {ctx.getText()}, please do not use redundant x or y var")
                        else:
                            buffer.append(l.ID().getText())
                else:
                    self.errors.append(f"invalid syntax for constraint {ctx.getText()}")
                if ctx.rightexpr():
                    r = ctx.rightexpr()
                    if r.ID():
                        if r.ID().getText() != 'x' and r.ID().getText() != 'y':
                            self.errors.append(f"wrong variable name in constraint {ctx.getText()}")
                        else:
                            if r.ID().getText() in buffer:
                                self.errors.append(f"wrong format for constraint {ctx.getText()}. expected only one x and/or y")
                            else:
                                buffer.append(r.ID().getText())
                    else:
                        self.errors.append(f"invalid syntax for constraint {ctx.getText()}")
                if ctx.linop() and len(ctx.numericValue()) == 1 or not ctx.linop() and len(ctx.numericValue()) > 1:
                    self.errors.append(f"invalid syntax for constraint {ctx.getText()}")


            else:
                self.errors.append(f"invalid syntax for constraint {ctx.getText()}")

    def exitConsdecl(self, ctx: GeomParser.ConsdeclContext):

        self.currentPoint = ''

    def enterInterpointconsdecl(self, ctx: GeomParser.InterpointconsdeclContext):
        if ctx.ID() and len(ctx.ID()) == 4:
            for i in range(0, 4):
                if ((i + 1) % 2) == 0:
                    if ctx.ID(i).getText() not in self.points.keys():
                        self.errors.append(f'no point {ctx.ID(i).getText()} was previously declared for "{ctx.getText()}"')
                    else:
                        if ctx.ID(i - 1).getText() != 'x' and ctx.ID(i - 1).getText() != 'y':
                            self.errors.append(f'wrong variable name for {ctx.ID(i).getText()} in {ctx.getText()}. expected x or y')
        else:
            self.errors.append(f'declaration {ctx.getText()} is missing some arguments')

    def enterIntervaldecl(self, ctx:GeomParser.IntervaldeclContext):
        if not ctx.ID() or len(ctx.ID()) != 2 or len(ctx.numericValue()) != 2:
            self.errors.append(f'invalid interval declaration at {ctx.getText()}')
        else:
            if ctx.ID(0).getText() != 'x' and ctx.ID(0).getText() != 'y':
                self.errors.append(f'invalid variable at {ctx.getText()}')
            if ctx.ID(1).getText() not in self.vars.keys():
                self.errors.append(f'invalid point name at {ctx.getText()}')
            x = int(ctx.numericValue(0).getText())
            y = int(ctx.numericValue(1).getText())
            if y - x == 0:
                self.errors.append(f'invalid range not valid at {ctx.getText()}')


    def exitMain(self, ctx: GeomParser.MainContext):
        if len(self.points) == 0:
            self.errors.append(f'no points entered')
        else:
            pointNames = self.points.keys()
            if pointNames is not None:
                for point in pointNames:
                    if not self.points[point]:
                        self.errors.append(f'no constrains for {point} were entered')
        for error in self.errors:
            print(error)
        print('parsing done')

    def addSyntaxError(self):
        self.errors.append('Syntax error detected')

    def report(self):
        if not self.errors:
            return self.vars
        else:
            return None
