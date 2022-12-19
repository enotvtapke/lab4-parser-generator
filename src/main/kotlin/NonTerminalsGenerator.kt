import com.squareup.kotlinpoet.*
import model.*
import java.nio.file.Path

fun main() {
    val parserRules = listOf(
        ParserRule(
            "type",
            listOf(listOf(TermToken("SSS", null))),
            listOf(Argument("g", "Int")),
            listOf()
        ),
        ParserRule(
            "add",
            listOf(
                listOf(
                    TermToken("SSS", null),
                    NonTermToken("type", listOf("var"), null),
                    TermToken("GGG", null),
                    NonTermToken("add", listOf("var1", "var2"), null)
                ), listOf(TermToken("H", null))
            ),
            listOf(Argument("a", "Int"), Argument("a", "Long")),
            listOf(Argument("b", "String"))
        )
    )

    val nonTerminalsGenerator = NonTerminalsGenerator(parserRules)

    val nonTerminals = nonTerminalsGenerator.generate()
    val file = FileSpec.builder("gen", "NonTerminals")
        .apply { nonTerminals.forEach { addType(it) } }
        .build()
    file.writeTo(System.out)
    file.writeTo(Path.of("src/main/kotlin"))
}

class NonTerminalsGenerator(private val parserRules: List<ParserRule>) {
    fun generate(): List<TypeSpec> {
        return parserRules.map {
            nonTerminal(it)
        }
    }

    private fun nonTerminal(parserRule: ParserRule) =
        TypeSpec.classBuilder(parserRule.id.replaceFirstChar { it.uppercaseChar() })
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("text", String::class)
                    .addParameters(parserRule.returnValuesTypes
                        .map { ParameterSpec.builder(it.label, ClassName("", it.type)).build() }
                    )
                    .build()
            )
            .addProperties(
                parserRule.returnValuesTypes
                    .map {
                        PropertySpec.builder(it.label, ClassName("", it.type))
                            .initializer(it.label).build() }
            )
            .superclass(NonTerminal::class.asClassName())
            .addSuperclassConstructorParameter(CodeBlock.of("text"))
            .build()
}