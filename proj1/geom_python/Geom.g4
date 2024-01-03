grammar Geom;

import GeomWords;

main: MAIN LBRA (valdecl | polydecl | funcdecl | consdecl)+ interpointconsdecl* RBRA;

valdecl: 'Point' ID SEMICOLON;
polydecl: POLYHEDRON ID EQUAL LPAR ID (COMMA ID)* RPAR SEMICOLON;
funcdecl: FUNC ID  EQUAL exprcomp SEMICOLON;
consdecl: CONS ID ':' LBRA lindecl* RBRA;
interpointconsdecl: ID 'of' ID int_comp_op ID 'of' ID SEMICOLON;
lindecl: (numericValue | MINUS)? ID (linop numericValue? ID)? int_comp_op numericValue SEMICOLON;
numericValue: MINUS? NUMERIC (COMMA NUMERIC)?;

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