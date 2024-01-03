
class Constraint():

    def __init__(self, x, y, consType, value):
        self.x = x
        self.y = y
        self.consType = consType
        self.value = value

    def getText(self):
        op = ''
        match self.consType:
            case 0:
              op = '<='
            case 1:
                op = '>='
            case 2:
                op = '<'
            case 3:
                op = '>'
        return f'{self.x}x {self.y}y {op} {self.value}'
