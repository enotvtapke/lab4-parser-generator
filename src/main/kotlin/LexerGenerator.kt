import com.squareup.kotlinpoet.*
import lexer.BaseLexer
import lexer.LexerException
import model.LexerRule
import model.Terminal

class LexerGenerator(private val lexerRules: List<LexerRule>) {

    fun generate(lexerRules: MemberName, terminalsPackageName: String): TypeSpec {
        CodeBlock.builder().addStatement("%T(", BaseLexer::class).indent().add("input, listOf())")
        return TypeSpec.classBuilder("Lexer")
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("input", CharSequence::class)
                    .build()
            )
            .addProperty(
                baseLexerProperty(lexerRules)
            )
            .addFunction(
                nextTokenMethod(terminalsPackageName)
            )
            .build()
    }

    private fun nextTokenMethod(terminalsPackageName: String) = FunSpec.builder("nextToken")
        .returns(Terminal::class.asClassName().copy(nullable = true))
        .addCode(CodeBlock.builder()
            .addStatement("val token = baseLexer.nextToken() ?: return null")
            .beginControlFlow("return when (token.id)")
            .apply {
                lexerRules.forEach {
                    addStatement(
                        "%S -> %T(token.text)",
                        it.id,
                        ClassName(terminalsPackageName, it.id)
                    )
                }
            }
            .addStatement(
                "else -> throw %T(%P, baseLexer.pos)",
                LexerException::class,
                "Unknown terminal identifier \${token.id} of text \${token.text}"
            )
            .endControlFlow()
            .build())
        .build()

    private fun baseLexerProperty(lexerRulesMember: MemberName) = PropertySpec.builder("baseLexer", BaseLexer::class)
        .addModifiers(KModifier.PRIVATE)
        .initializer(
            "%T(input, %M)",
            BaseLexer::class,
            lexerRulesMember
        )
        .build()
}