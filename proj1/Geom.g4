grammar Geom;

import GeomWords;

main: MAIN LBRA (valdecl | polydecl | funcdecl)* RBRA;

valdecl: POINT ID EQUAL exprcomp SEMICOLON;
polydecl: POLYHEDRON ID EQUAL LPAR ID (COMMA ID)* RPAR SEMICOLON;
funcdecl: FUNC ID  EQUAL exprcomp SEMICOLON;
integer: MINUS? NUMERIC;

booleq: DIFF | EQUAL;
int_comp_op: G | GE | L | LE;
booldecl: BOOLEAN;

exprent: exprent (DIV | MUL) exprent
| LPAR exprent RPAR
| exprent (PLUS | MINUS) exprent
| exprent MOD exprent
| MINUS LPAR exprent RPAR
| MINUS? ID
| integer
;

exprcomp: ID |
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