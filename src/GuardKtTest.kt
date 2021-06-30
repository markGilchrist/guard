import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class GuardKtTest {

    @Test
    fun `guard p1 is null, p2 is null returns null`() {
        // arrange
        val p1 = null
        val p2 = null

        // act
        val result = guard(p1, p2) { a1, a2 -> "$a1 - $a2" }

        // assert
        assertEquals(null, result)
    }

    @Test
    fun `guard p1 is null, p2 is not null returns null`() {
        // arrange
        val p1 = null
        val p2 = "world"

        // act
        val result = guard(p1, p2) { a1, a2 -> "$a1 - $a2" }

        // assert
        assertEquals(null, result)
    }

    @Test
    fun `guard p1 is not null, p2 is null returns null`() {
        // arrange
        val p1 = "hello"
        val p2 = null

        // act
        val result = guard(p1, p2) { a1, a2 -> "$a1 - $a2" }

        // assert
        assertEquals(null, result)
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
        val result = guard(p1, p2,condition) { a1, a2 -> "$a1 - $a2" }
        // assert
        assertEquals(null, result)
    }

    @Test
    fun `guard p1 is not null, p2 is not null, condition is true returns some`() {
        // arrange
        val p1 = "hello"
        val p2 = "world"
        val condition = true

        // act
        val result = guard(p1, p2,condition) { a1, a2 -> "$a1 - $a2" }
        // assert
        assertEquals("hello - world", result)
    }

    @Test
    fun testGuard() {
    }

    @Test
    fun testGuard1() {
    }

    @Test
    fun testGuard2() {
    }

    @Test
    fun testGuard3() {
    }

    @Test
    fun testGuard4() {
    }

    @Test
    fun testGuard5() {
    }

    @org.junit.jupiter.api.Test
    fun testGuard6() {
    }
}