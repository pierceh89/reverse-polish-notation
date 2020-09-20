grammar PolishNotation;

@header {
    package io.github.pierceh89.notation;
}

OPER : [+*/-] ;
VALUE : [0-9]+ ;
WS : ' ';

expr:   VALUE
    |   expr WS expr WS OPER;