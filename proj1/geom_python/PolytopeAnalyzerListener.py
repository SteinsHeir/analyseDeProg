import sys
from sympy import *
from antlr4 import *
from GeomParser import GeomParser
from GeomListener import GeomListener
import cdd
from Constraint import Constraint
from spb import *


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
        dCoef = 0
        consType = 0
        l = ctx.leftexpr()
        if l.ID().getText() == 'x':
            if l.numericValue():
                xCoef = int(l.numericValue().getText())
            elif l.MINUS():
                xCoef = -1
        else:
            if l.numericValue():
                yCoef = int(l.numericValue().getText())
            elif l.MINUS():
                yCoef = -1
        if ctx.rightexpr():
            r = ctx.rightexpr()
            if r.ID().getText() == 'x':
                if r.numericValue():
                    xCoef = int(r.numericValue().getText())
                if r.linop().MINUS():
                    xCoef = -xCoef
            else:
                if r.numericValue():
                    yCoef = int(r.numericValue().getText())
                if r.linop().MINUS():
                    yCoef = -yCoef
        else:
            if l.ID().getText() == 'x':
                yCoef = 0
            else:
                xCoef = 0
        match ctx.int_comp_op().getText():
            case '>=':
                consType = 1
            case '<':
                consType = 2
            case '>':
                consType = 3
        if len(ctx.numericValue()) > 1:
            dCoef = int(ctx.numericValue(0).getText())
            if ctx.linop().MINUS():
                dCoef = -dCoef
            value = int(ctx.numericValue(1).getText())
        else:
            value = int(ctx.numericValue(0).getText())
        #res = Constraint(xCoef, yCoef, dCoef, consType, value)
        res = [xCoef, yCoef, dCoef, consType, value]
        self.matrices[self.currentPoint].append(res)

    def exitConsdecl(self, ctx: GeomParser.ConsdeclContext):
        self.currentPoint = ''

    def enterInterpointconsdecl(self, ctx:GeomParser.InterpointconsdeclContext):
        for i in range(0, 4):
            if i == 1:
                pass
            if i == 3:
                pass

    def exitMain(self, ctx:GeomParser.MainContext):
        for matrix in self.matrices:
            self.drawPolygon(self.matrices[matrix])
            print(f'matrix of {matrix} \n---')
            # for row in self.matrices[matrix]:
            #     print(row.getText())
            # print('---')
            #
            #
            for row in self.matrices[matrix]:
                print(row)
            print('---')

    def drawPolygon(self, matrix):
        var("x, y")

        plotLength = [0, 0]
        expr = True

        for i in range(0, len(matrix)):
            a = matrix[i][0]
            b = matrix[i][1]
            c = matrix[i][2]
            v = matrix[i][4]

            if v > plotLength[1]:
                plotLength[1] = v
            if v < plotLength[0]:
                plotLength[0] = v

            match matrix[i][3]:
                case 0:
                    rep = (a * x + b * y + c <= v)
                case 1:
                    rep = (a * x + b * y + c >= v)
                case 2:
                    rep = (a * x + b * y + c < v)
                case 3:
                    rep = (a * x + b * y + c > v)
            expr = expr & rep
            print(expr)
        expressions = []
        for a in expr.args:
            #print(a)
            rhs = a.args[len(a.args) - 1]
            expressions.append((rhs, str(a)))

        p1 = plot(*expressions, (x, plotLength[0], plotLength[1]), aspect="equal",
                  rendering_kw={"linestyle": "--"})
        p2 = plot_implicit(expr, (x, plotLength[0], plotLength[1]), (y, plotLength[0], plotLength[1]))
        (p1 + p2).show()