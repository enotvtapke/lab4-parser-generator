import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalsGeneratorTest {

    @Test
    fun `should generate`() {
        val ids = listOf("TRUE", "INT")
        val terminalsGenerator = TerminalsGenerator(ids)
        val expected = terminals(ids)
        val actual = terminalsGenerator.generate()
        assertThat(expected.size).isEqualTo(actual.size)
        actual.zip(expected).forEach {
            assertThat(it.first.toString()).isEqualTo(it.second)
        }
    }

    @Test
    fun `generate in case of zero terminals`() {
        val terminalsGenerator = TerminalsGenerator(listOf())
        val actual = terminalsGenerator.generate()
        assertThat(actual.size).isEqualTo(0)
    }

    private fun terminals(ids: List<String>) = ids.map { terminal(it) }

    private fun terminal(id: String) = """
        public class $id(
          text: kotlin.String,
        ) : model.Terminal(text)
        
    """.trimIndent()
}