import sys
from antlr4 import *
from GeomParser import GeomParser
from GeomListener import GeomListener
import cdd
from Constraint import Constraint


class PolytopeAnalyzerListener(GeomListener):
    matrices = {}
    matrix = []
    errors = []
    currentPoint = ''

    def __init__(self, points):
        self.points = points
        pointNames = points.keys()
        for name in pointNames:
            self.matrices[name] = []

    def enterConsdecl(self, ctx: GeomParser.ConsdeclContext):
        self.currentPoint = ctx.ID().getText()

    def enterLindecl(self, ctx: GeomParser.LindeclContext):
        value = 0
        xCoef = 1
        yCoef = 1
        consType = 0
        if(ctx.linop()):
            print(ctx.linop().getText())
        if ctx.int_comp_op() and ctx.ID() and ctx.numericValue():
            match ctx.int_comp_op().getText():
                case '>=':
                    consType = 1
                case '<':
                    consType = 2
                case '>':
                    consType = 3
            if len(ctx.numericValue()) == 1:
                value = int(ctx.numericValue(0).getText())
                if ctx.MINUS():
                    if ctx.ID(0).getText() == 'x':
                        xCoef = -1
                    else:
                        yCoef = -1
            if ctx.linop() and len(ctx.ID()) > 1:
                if len(ctx.numericValue()) == 3:
                    if ctx.ID(0).getText() == 'x':
                        xCoef = int(ctx.numericValue(0).getText())
                    else :
                        yCoef = int(ctx.numericValue(0).getText())
                    if(ctx.linop().MINUS()):
                        if ctx.ID(1).getText() == 'x':
                            xCoef = -int(ctx.numericValue(1).getText())
                        else:
                            yCoef = -int(ctx.numericValue(1).getText())
                    else:
                        if ctx.ID(1).getText() == 'x':
                            xCoef = int(ctx.numericValue(1).getText())
                        else:
                            yCoef = int(ctx.numericValue(1).getText())
                    value = int(ctx.numericValue(2).getText())
                if len(ctx.numericValue()) == 2:
                    print('hi')
                    # - x + wy <= z
                    if ctx.MINUS():
                        if ctx.ID(0).getText() == 'x':
                            xCoef = -1
                        else:
                            yCoef = -1
                        if ctx.linop().MINUS():
                            if ctx.ID(1).getText() == 'x':
                                xCoef = -int(ctx.numericValue(0).getText())
                            else:
                                yCoef = -int(ctx.numericValue(0).getText())
                        else:
                            if ctx.ID(1).getText() == 'x':
                                xCoef = int(ctx.numericValue(0).getText())
                            else:
                                yCoef = int(ctx.numericValue(0).getText())
                    # x + wy <= z
                    ctx.getSourceInterval()
                    if ctx.ID(1).getText() == 'x':
                        xCoef = int(ctx.numericValue(0).getText())
                    else:
                        yCoef = int(ctx.numericValue(0).getText())
                    if ctx.linop().MINUS():
                        if ctx.ID(1).getText() == 'x':
                            xCoef = -xCoef
                        else:
                            yCoef = -yCoef
                    value = int(ctx.numericValue(1).getText())
            elif len(ctx.numericValue()) > 1:
                print(ctx.linop().getText())
                if ctx.linop().MINUS():
                    if ctx.ID(0).getText() == 'x':
                        xCoef = -int(ctx.numericValue(0).getText())
                        yCoef = 0
                    else:
                        yCoef = -int(ctx.numericValue(0).getText())
                        xCoef = 0
                else:
                    if ctx.ID(0).getText() == 'x':
                        xCoef = int(ctx.numericValue(0).getText())
                        yCoef = 0
                    else:
                        yCoef = int(ctx.numericValue(0).getText())
                        xCoef = 0
            else:
                if ctx.ID(0).getText() == 'x':
                    yCoef = 0
                else:
                    xCoef = 0
            res = Constraint(xCoef, yCoef, consType, value)
        else:
            pass
        self.matrices[self.currentPoint].append(res)
        print(f"constraint : {res.getText()} for point {self.currentPoint} parsed")

    def exitConsdecl(self, ctx: GeomParser.ConsdeclContext):
        self.currentPoint = ''

    def enterInterpointconsdecl(self, ctx:GeomParser.InterpointconsdeclContext):
        for i in range(0, 4):
            if i == 1:
                pass
            if i == 3:
                pass


    def drawPolygon(self, matrix):

        pass
