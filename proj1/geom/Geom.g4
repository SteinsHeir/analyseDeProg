grammar Geom;

import GeomWords;

main: MAIN LBRA (consdecl)+ (intervaldecl)* RBRA;

consdecl: CONS ID ':' LBRA lindecl* RBRA;
intervaldecl: 'Interval' ID 'of' ID EQUAL LA numericValue COMMA numericValue RA SEMICOLON;
lindecl: leftexpr rightexpr? (linop numericValue)? int_comp_op numericValue SEMICOLON;
numericValue: MINUS? NUMERIC (COMMA NUMERIC)?;

leftexpr: (numericValue | MINUS)? ID;
rightexpr: linop numericValue? ID;
booleq: DIFF | EQUAL;
int_comp_op: G | GE | L | LE;
booldecl: BOOLEAN;
num_op: PLUS | MINUS | DIV | MUL | MOD;
linop: PLUS | MINUS;

exprent:
LPAR exprent RPAR
| MINUS LPAR exprent RPAR
|numericValue num_op numericValue
|numericValue num_op MINUS? ID
| MINUS? ID num_op numericValue
| MINUS? ID num_op MINUS? ID
| exprent num_op exprent
| MINUS? ID
| numericValue
;

consexpr: exprent;

exprcomp: ID |
| booldecl
| exprent
;

exprbool:
ID
| NOT exprbool
| ID int_comp_op exprent
| ID int_comp_op numericValue
| numericValue int_comp_op ID
| exprent int_comp_op ID
| exprent int_comp_op exprent
| (exprcomp) booleq (exprcomp)
| exprbool AND exprbool
| exprbool OR exprbool
| booldecl
| LPAR exprbool RPAR
;