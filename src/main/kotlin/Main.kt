
import generator.Generator
import java.io.File
import java.nio.file.Path

fun main() {
    generateVarDeclarationParser()
    parserVarDeclaration()

    generateExpressionParser()
    parseExpression()
}

private fun generateVarDeclarationParser() {
    val parserGenerator = Generator(
        Path.of("src/main/resources/VarDeclaration.g4"),
        Path.of("src/main/kotlin"),
        "varDeclaration",
    )
    parserGenerator.generate()
}

private fun generateExpressionParser() {
    val parserGenerator = Generator(
        Path.of("src/main/resources/Expression.g4"),
        Path.of("src/main/kotlin"),
        "expressionParser",
        Context::class,
        "context"
    )
    parserGenerator.generate()
}

private fun parserVarDeclaration() {
    val parser = varDeclaration.Parser("var arrayOfMaps: Array<Map<Int, String>>;")
    val res = parser.varDeclaration()
    File("./varDeclaration.dot").writeText(res.toString())
}

private fun parseExpression() {
    val parser = expressionParser.Parser("1 + 2 + 3+( 43 +2 )+100")
    val res = parser.expr(0)
    println(res.label.res)
    File("./expression.dot").writeText(res.toString())
}
