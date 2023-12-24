grammar Geom;

import GeomWords;

pointdecl: POINT ID;
pointval: ID EQUAL LPAR DIGIT* COMMA DIGIT* RPAR | ID EQUAL  ;
polydecl: POLYHEDRON;
polyval: ID EQUAL LPAR ID (COMMA ID)* RPAR;
stringdecl: STRING;
integer: MINUS? NUMERIC;

booleq: DIFF | EQUAL;
int_comp_op: G | GE | L | LE;
booldecl: BOOLEAN;

exprd:stringdecl
| ID
| integer
| LPAR exprd  RPAR
| exprent
| exprbool;

exprent: exprent (DIV | MUL) exprent
| exprent (PLUS | MINUS) exprent
| exprent MOD exprent
| MINUS LPAR exprent RPAR
| MINUS? ID
| integer
| MINUS? ID
| LPAR exprd RPAR ;

exprcomp: ID |
| stringdecl
| booldecl
| exprent
;

exprbool:
ID
| NOT exprbool
| exprent int_comp_op exprent
| exprcomp booleq exprcomp
| exprbool AND exprbool
| exprbool OR exprbool
| booldecl
| LPAR exprbool RPAR
;