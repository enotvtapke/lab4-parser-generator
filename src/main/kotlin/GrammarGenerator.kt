import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import model.LexerRule

class GrammarGenerator(private val lexerRules: List<LexerRule>) {
    fun generate(): TypeSpec {
        return TypeSpec.objectBuilder("Grammar")
            .addProperty(
                PropertySpec.builder("LEXER_RULES",
                    List::class.asClassName().parameterizedBy(LexerRule::class.asClassName()))
                    .initializer(
                        CodeBlock.builder()
                            .addStatement("listOf(")
                            .indent()
                            .apply { lexerRules.forEach { addStatement("${it.initializerCode()}, ") } }
                            .unindent()
                            .add(")")
                            .build()
                    )
                    .build()
            ).build()
    }

    private fun LexerRule.initializerCode(): String {
        return """model.LexerRule("$id", "$pattern".toRegex(), $ignored)"""
    }
}