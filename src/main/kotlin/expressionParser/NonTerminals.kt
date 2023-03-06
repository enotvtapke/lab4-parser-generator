package expressionParser

import generator.runtime.NonTerminal
import java.math.BigDecimal

public data class Bin_expr(
  public var res: Int? = null,
) : NonTerminal()

public data class Bin_expr_(
  public var res: Int? = null,
) : NonTerminal()

public data class Bin_term(
  public var res: Int? = null,
) : NonTerminal()

public data class Bin_term_(
  public var res: Int? = null,
) : NonTerminal()

public data class Expr(
  public var res: Int? = null,
) : NonTerminal()

public data class Expr_(
  public var res: Int? = null,
) : NonTerminal()

public data class Term(
  public var res: Int? = null,
) : NonTerminal()

public data class Term_(
  public var res: Int? = null,
) : NonTerminal()

public data class Num(
  public var res: Int? = null,
) : NonTerminal()