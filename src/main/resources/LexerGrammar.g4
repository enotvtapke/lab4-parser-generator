grammar LexerGrammar;

gram
: 'grammar' LEXER_RULE_ID ';' term+
;

term
: LEXER_RULE_ID ':' PATTERN SK ';'
| LEXER_RULE_ID ':' PATTERN ';'
;

LEXER_RULE_ID : [A-Z][A-Za-z_0-9]* ;
SK : '->' WS* 'skip' ;
PATTERN : '\'' (~('\''|'\r'|'\n') | '\\\'')* '\'';
WS : [ \t\r\n]+ -> skip ;