package model

open class Terminal(val text: String) {
    override fun toString(): String = "${this::class.simpleName}($text)"
}