package castasat.biota

import org.junit.Test
import kotlin.test.assertTrue

class AndroidGreetingTest {
    @Test
    fun testExample() {
        assertTrue(
            Greeting().greeting().contains("Android"),
            "Check Android is mentioned"
        )
    }
}