grammar Expression;

expr [acc=Int] returns [res=Int]
: t=term[acc] { val tVal = t.res!! } e=expr_[tVal] { expr.res = e.res }
;

expr_ [acc=Int] returns [res=Int]
: PLUS t=term[acc] { val tmp = acc + t.res!! } e_=expr_[tmp] { expr_.res = e_.res }
| { expr_.res = acc }
;

term [acc=Int] returns [res=Int]
: number=NUMBER { term.res = number.text.toInt() }
| LBRACKER e=expr[acc] RBRACKER { term.res = e.res }
;

PLUS : '\\+';
NUMBER : '[0-9]+';
LBRACKER : '\\(';
RBRACKER : '\\)';