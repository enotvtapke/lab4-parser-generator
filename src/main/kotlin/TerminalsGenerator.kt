import com.squareup.kotlinpoet.*
import model.Terminal

class TerminalsGenerator(private val ids: List<String>) {

    fun generate(): List<TypeSpec> = ids.map {
        terminal(it, Terminal::class.asClassName())
    }

    private fun terminal(terminalName: String, superclass: ClassName) = TypeSpec.classBuilder(terminalName)
        .primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter("text", String::class)
                .build()
        )
        .superclass(superclass)
        .addSuperclassConstructorParameter(CodeBlock.of("text"))
        .build()
}