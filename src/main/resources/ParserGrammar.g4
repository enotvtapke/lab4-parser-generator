grammar ParserGrammar;

gram
: 'grammar' TYPE_ID ';' myParserRule*
;

myParserRule
: VAR_ID types? return? ':' alternatives ';'
;

return
: 'returns' types
;

alternatives
: tokens('|' tokens)*;

nonterm: label? VAR_ID args?;

args: '[' (VAR_ID) (',' (VAR_ID))* ']';

types: '[' label TYPE_ID (',' label TYPE_ID)* ']';
type: '[' label TYPE_ID ']';

token
: nonterm
| terminal
| CODE
;

label: VAR_ID '=';

terminal: label? TYPE_ID;

tokens: token+;

//TYPE : [A-Za-z][A-Za-z_0-9]*;
TYPE_ID  : [A-Z][A-Za-z_0-9]* ;
VAR_ID : [a-z][A-Za-z_0-9]* ;
//STRING      : '\'' (~('\'') | '\\\'')* '\'';
STRING : '\'' (~('\''|'\r'|'\n') | '\\\'')* '\'';
INT : ('+'|'-'|)[0-9]+;

SK : '->' WS* 'skip' ;
CODE : '{' (~[{}]+ CODE?)* '}';
WS : [ \t\r\n]+ -> skip ;