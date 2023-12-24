lexer grammar GeomWords;

WS: [ \n\t\r]+ -> channel(HIDDEN);

MAIN: 'Main';
FUNC: 'Function';
LPAR: '(';
RPAR: ')';
LBRA: '{';
RBRA: '}';
COMMA: ',';
SEMICOLON: ';';
IF:'if';
THEN:'then';
ELSE:'else';
POINT: 'Point';
POLYHEDRON: 'Polyhedron';
NOT: '!';

EQUAL: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD:'%';
G: '>';
OR: 'or';
AND: 'and';
L: '<';
GE: '>=';
LE: '<=';
DIFF: '!=';
BOOLEAN: 'true' | 'false' ;

ID: LETTER (LETTER | DIGIT)*;

DQUOTE: '"';
STRING: DQUOTE(~[\\,\r\n])+DQUOTE;
CHAR: '\''(DIGIT | LETTER | ':' | '.' | '&' | '{' | '\\' | SEMICOLON)+'\'';
NUMERIC: DIGIT+;
fragment DIGIT: [0-9] ;
fragment LETTER: [A-Za-z] ;