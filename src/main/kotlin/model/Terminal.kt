package model

data class Terminal(val id: String, val text: String)

val END = Terminal("END", "")
val EPS = Terminal("EPS", "")
