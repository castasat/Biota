package castasat.biota

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {
    @Test
    fun checkGreetingContainsHello() {
        assertTrue(
            Greeting().greeting().contains("Hello"),
            "Check greeting contains Hello"
        )
    }
}