package castasat.biota.data.model

import castasat.biota.data.model.Bit.*
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class CommonBitTest {
    @Test
    fun checkBitValueOfPositiveIsPositive() {
        assertEquals(
            expected = valueOf("POSITIVE"),
            actual = POSITIVE,
            message = "Bit valueOf 'POSITIVE' should be POSITIVE"
        )
    }

    @Test
    fun checkBitValueOfNegativeIsNegative() {
        assertEquals(
            expected = valueOf("NEGATIVE"),
            actual = NEGATIVE,
            message = "Bit valueOf 'NEGATIVE' should be NEGATIVE"
        )
    }

    @Test
    fun checkBitValuesContainsPositive() {
        assertContains(
            array = values(),
            element = POSITIVE,
            message = "Bit values should contain POSITIVE"
        )
    }

    @Test
    fun checkBitValuesContainsNegative() {
        assertContains(
            array = values(),
            element = NEGATIVE,
            message = "Bit values should contain NEGATIVE"
        )
    }
}