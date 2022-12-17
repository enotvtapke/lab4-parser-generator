grammar TestLexer;

TRUE : 'true' ;
FALSE : 'false' ;
IDENT : '[A-Za-z_][A-Za-z_0-9]*' ;
INT : '(\\+|-|)[0-9]+' ;
WS: '[ \n\t\r]'  ->  skip;