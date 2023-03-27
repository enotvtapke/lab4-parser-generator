grammar Expression;

@prefix {
    import kotlin.math.log
    import kotlin.math.roundToInt
}

bin_expr [acc=Int] returns [res=Int]
: t=bin_term[acc] { val tVal = t.res!! } b=bin_expr_[tVal] { bin_expr.res = b.res }
;

bin_expr_ [acc=Int] returns [res=Int]
: BIT_OR e=bin_term[acc] { val tmp = acc or e.res!! } b_=bin_expr_[tmp] { bin_expr_.res = b_.res }
| { bin_expr_.res = acc }
;

bin_term [acc=Int] returns [res=Int]
: e=expr[acc] { val eVal = e.res!! } b=bin_term_[eVal] { bin_term.res = b.res }
;

bin_term_ [acc=Int] returns [res=Int]
: BIT_AND e=expr[acc] { val tmp = acc and e.res!! } b_=bin_term_[tmp] { bin_term_.res = b_.res }
| { bin_term_.res = acc }
;

expr [acc=Int] returns [res=Int]
: t=term[acc] { val tVal = t.res!! } e=expr_[tVal] { expr.res = e.res }
;

expr_ [acc=Int] returns [res=Int]
: PLUS t=term[acc] { val tmp = acc + t.res!! } e_=expr_[tmp] { expr_.res = e_.res }
| MINUS t=term[acc] { val tmp = acc - t.res!! } e_=expr_[tmp] { expr_.res = e_.res }
| { expr_.res = acc }
;

term [acc=Int] returns [res=Int]
: n=log_term[acc] { val nVal = n.res!! } t_=term_[nVal] { term.res = t_.res }
;

term_ [acc=Int] returns [res=Int]
: MULT n=log_term[acc] { val tmp = acc * n.res!! } t_=term_[tmp] { term_.res = t_.res }
| DIV n=log_term[acc] { val tmp = acc / n.res!! } t_=term_[tmp] { term_.res = t_.res }
| { term_.res = acc }
;

log_term [acc=Int] returns [res=Int]
: n=num[acc] { val nVal = n.res!! } t_=log_term_[nVal] { log_term.res = t_.res }
;

log_term_ [acc=Int] returns [res=Int]
: LOG n=num[acc] { val nVal = n.res!! } t_=log_term_[nVal] { log_term_.res = log(acc.toDouble(), t_.res!!.toDouble()).roundToInt() }
| { log_term_.res = acc }
;

num [acc=Int] returns [res=Int]
: number=NUMBER { num.res = number.text.toInt() }
| LBRACKET e=bin_expr[acc] RBRACKET { num.res = e.res }
| BIT_INV LBRACKET e=bin_expr[acc] RBRACKET { num.res = e.res!!.inv() }
;

PLUS : '\\+';
BIT_AND : '&';
BIT_OR : '\\|';
BIT_INV : '~';
MINUS : '-';
MULT : '\\*';
LOG : '//';
DIV : '/';
NUMBER : '[0-9]+';
LBRACKET : '\\(';
RBRACKET : '\\)';
WS : '[ \t\r\n]+' -> skip;