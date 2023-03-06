package expressionParser

import app.Context
import generator.runtime.Node
import generator.runtime.ParserException
import generator.runtime.Terminal
import java.math.BigDecimal
import kotlin.String

public class Parser(
  input: String,
) {
  private val lexer: Lexer = Lexer(input)

  public val context: Context = Context()
  init {
    lexer.nextToken()
  }

  public fun bin_expr(acc: Int): Node<Bin_expr> {
    val bin_expr = Bin_expr()
    val res = Node(bin_expr)
    when (lexer.curTerminal.id) {
      in listOf("NUMBER", "LBRACKET", "BIT_INV") -> {
        val t = bin_term(acc).also { res.addChild(it) }.label
        val tVal = t.res!!
        val b = bin_expr_(tVal).also { res.addChild(it) }.label
        bin_expr.res = b.res
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun bin_expr_(acc: Int): Node<Bin_expr_> {
    val bin_expr_ = Bin_expr_()
    val res = Node(bin_expr_)
    when (lexer.curTerminal.id) {
      in listOf("BIT_OR") -> {
        lexer.expect("BIT_OR")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val e = bin_term(acc).also { res.addChild(it) }.label
        val tmp = acc or e.res!!
        val b_ = bin_expr_(tmp).also { res.addChild(it) }.label
        bin_expr_.res = b_.res
      }
      in listOf("END", "RBRACKET") -> {
        res.addChild(Terminal("EPS", ""))
        bin_expr_.res = acc
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun bin_term(acc: Int): Node<Bin_term> {
    val bin_term = Bin_term()
    val res = Node(bin_term)
    when (lexer.curTerminal.id) {
      in listOf("NUMBER", "LBRACKET", "BIT_INV") -> {
        val e = expr(acc).also { res.addChild(it) }.label
        val eVal = e.res!!
        val b = bin_term_(eVal).also { res.addChild(it) }.label
        bin_term.res = b.res
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun bin_term_(acc: Int): Node<Bin_term_> {
    val bin_term_ = Bin_term_()
    val res = Node(bin_term_)
    when (lexer.curTerminal.id) {
      in listOf("BIT_AND") -> {
        lexer.expect("BIT_AND")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val e = expr(acc).also { res.addChild(it) }.label
        val tmp = acc and e.res!!
        val b_ = bin_term_(tmp).also { res.addChild(it) }.label
        bin_term_.res = b_.res
      }
      in listOf("BIT_OR", "END", "RBRACKET") -> {
        res.addChild(Terminal("EPS", ""))
        bin_term_.res = acc
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun expr(acc: Int): Node<Expr> {
    val expr = Expr()
    val res = Node(expr)
    when (lexer.curTerminal.id) {
      in listOf("NUMBER", "LBRACKET", "BIT_INV") -> {
        val t = term(acc).also { res.addChild(it) }.label
        val tVal = t.res!!
        val e = expr_(tVal).also { res.addChild(it) }.label
        expr.res = e.res
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun expr_(acc: Int): Node<Expr_> {
    val expr_ = Expr_()
    val res = Node(expr_)
    when (lexer.curTerminal.id) {
      in listOf("PLUS") -> {
        lexer.expect("PLUS")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val t = term(acc).also { res.addChild(it) }.label
        val tmp = acc + t.res!!
        val e_ = expr_(tmp).also { res.addChild(it) }.label
        expr_.res = e_.res
      }
      in listOf("MINUS") -> {
        lexer.expect("MINUS")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val t = term(acc).also { res.addChild(it) }.label
        val tmp = acc - t.res!!
        val e_ = expr_(tmp).also { res.addChild(it) }.label
        expr_.res = e_.res
      }
      in listOf("BIT_AND", "BIT_OR", "END", "RBRACKET") -> {
        res.addChild(Terminal("EPS", ""))
        expr_.res = acc
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun term(acc: Int): Node<Term> {
    val term = Term()
    val res = Node(term)
    when (lexer.curTerminal.id) {
      in listOf("NUMBER", "LBRACKET", "BIT_INV") -> {
        val n = num(acc).also { res.addChild(it) }.label
        val nVal = n.res!!
        val t_ = term_(nVal).also { res.addChild(it) }.label
        term.res = t_.res
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun term_(acc: Int): Node<Term_> {
    val term_ = Term_()
    val res = Node(term_)
    when (lexer.curTerminal.id) {
      in listOf("MULT") -> {
        lexer.expect("MULT")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val n = num(acc).also { res.addChild(it) }.label
        val tmp = acc * n.res!!
        val t_ = term_(tmp).also { res.addChild(it) }.label
        term_.res = t_.res
      }
      in listOf("DIV") -> {
        lexer.expect("DIV")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val n = num(acc).also { res.addChild(it) }.label
        val tmp = acc / n.res!!
        val t_ = term_(tmp).also { res.addChild(it) }.label
        term_.res = t_.res
      }
      in listOf("PLUS", "MINUS", "BIT_AND", "BIT_OR", "END", "RBRACKET") -> {
        res.addChild(Terminal("EPS", ""))
        term_.res = acc
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }

  public fun num(acc: Int): Node<Num> {
    val num = Num()
    val res = Node(num)
    when (lexer.curTerminal.id) {
      in listOf("NUMBER") -> {
        val number = lexer.curTerminal
        lexer.expect("NUMBER")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        num.res = number.text.toInt()
      }
      in listOf("LBRACKET") -> {
        lexer.expect("LBRACKET")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val e = bin_expr(acc).also { res.addChild(it) }.label
        lexer.expect("RBRACKET")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        num.res = e.res
      }
      in listOf("BIT_INV") -> {
        lexer.expect("BIT_INV")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        lexer.expect("LBRACKET")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        val e = bin_expr(acc).also { res.addChild(it) }.label
        lexer.expect("RBRACKET")
        res.addChild(lexer.curTerminal)
        lexer.nextToken()

        num.res = e.res!!.inv()
      }
      else -> throw ParserException("Invalid terminal ${lexer.curTerminal}", lexer.curPos)
    }
    return res
  }
}