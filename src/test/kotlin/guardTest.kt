import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

internal class GuardKtTest {


    @Test
    fun `guard p1 is null, p2 is null returns null`() {
        // arrange
        val p1 = null
        val p2 = null

        // act
        val result = guard(p1, p2) { a1, a2 -> "${a1} - ${a2}" }

        // assert
        assertNull(result)
    }

    @Test
    fun `guard p1 is null, p2 is not null returns null`() {
        // arrange
        val p1 = null
        val p2 = "world"

        // act
        val result = guard(p1, p2) { a1, a2 -> "${a1} - ${a2}" }

        // assert
        assertNull(result)
    }

    @Test
    fun `guard p1 is not null, p2 is null returns null`() {
        // arrange
        val p1 = "hello"
        val p2 = null

        // act
        val result = guard(p1, p2) { a1, a2 -> "$a1 - $a2" }

        // assert
        assertNull(result)

    }

    @Test
    fun `guard p1 is not null, p2 is not null returns some`() {
        // arrange
        val p1 = "hello"
        val p2 = "world"

        // act
        val result = guard(p1, p2) { a1, a2 -> "$a1 - $a2" }

        // assert
        assertEquals("hello - world", result)
    }

    @Test
    fun `guard p1 is not null, p2 is not null, condition is false returns null`() {
        // arrange
        val p1 = "hello"
        val p2 = "world"
        val condition = false

        // act
        val result = guard(p1, p2, condition) { a1, a2 -> "$a1 - $a2" }

        // assert
        assertNull(result)
    }

    @Test
    fun `guard p1 is not null, p2 is not null, condition is true returns some`() {
        // arrange
        val p1 = "hello"
        val p2 = "world"
        val condition = true

        // act
        val result = guard(p1, p2, condition) { a1, a2 -> "$a1 - $a2" }
        // assert
        assertEquals("hello - world", result)
    }

}