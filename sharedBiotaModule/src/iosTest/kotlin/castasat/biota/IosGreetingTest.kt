package castasat.biota

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {
    @Test
    fun checkGreetingContainsIOS() {
        assertTrue(
            Greeting().greeting().contains("iOS"),
            "Check greeting contains iOS"
        )
    }
}