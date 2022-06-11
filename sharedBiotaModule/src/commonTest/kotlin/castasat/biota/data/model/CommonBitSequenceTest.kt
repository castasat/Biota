package castasat.biota.data.model

import castasat.biota.data.model.Bit.*
import kotlin.test.*

class CommonBitSequenceTest {
    @Test
    fun checkBitSequenceCanBeConstructedFromSinglePositiveBit() {
        with(BitSequence(POSITIVE)) { // constructor
            assertContains(
                iterable = bits,
                element = POSITIVE,
                message = "BitSequence constructed from single POSITIVE Bit should contain POSITIVE"
            )
            assertEquals(
                expected = 1,
                actual = bits.size,
                message = "BitSequence constructed from single POSITIVE Bit should have single element"
            )
        }
    }

    @Test
    fun checkBitSequenceCanBeConstructedFromSingleNegativeBit() {
        with(BitSequence(NEGATIVE)) { // constructor
            assertContains(
                iterable = bits,
                element = NEGATIVE,
                message = "BitSequence constructed from single NEGATIVE Bit should contain NEGATIVE"
            )
            assertEquals(
                expected = 1,
                actual = bits.size,
                message = "BitSequence constructed from single NEGATIVE Bit should have single element"
            )
        }
    }
}