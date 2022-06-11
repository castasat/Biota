package castasat.biota

import org.junit.Test
import kotlin.test.assertTrue

class AndroidGreetingTest {
    @Test
    fun checkGreetingContainsAndroid() {
        assertTrue(
            Greeting().greeting().contains("Android"),
            "Check greeting contains Android"
        )
    }
}