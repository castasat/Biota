package castasat.biota.data.model

import castasat.biota.data.model.Bit.*
import kotlin.test.*

class CommonBitSequenceTest {
    @Test
    fun checkBitSequenceCanBeConstructedFromSingleBit() {
        with(BitSequence(POSITIVE)) { // constructor with single POSITIVE
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
        with(BitSequence(NEGATIVE)) { // constructor with single NEGATIVE
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

    @Test
    fun checkBitSequenceCanBeConstructedFromBitList() {
        val bitList = listOf(POSITIVE, NEGATIVE)
        with(BitSequence(bitList)) { // constructor
            assertContains(
                iterable = bits,
                element = NEGATIVE,
                message = "BitSequence constructed from bitList containing NEGATIVE should contain NEGATIVE"
            )
            assertContains(
                iterable = bits,
                element = POSITIVE,
                message = "BitSequence constructed from bitList containing POSITIVE should contain POSITIVE"
            )
            assertEquals(
                expected = 2,
                actual = bits.size,
                message = "BitSequence constructed from bitList containing two elements should have two elements"
            )
            assertContentEquals(
                expected = bitList,
                actual = bits,
                message = "BitSequence constructed from bitList should have equal Bit elements"
            )
        }
    }

    @Test
    fun checkBitSequenceCanBeConstructedFromBitVararg() {
        with(BitSequence(POSITIVE, NEGATIVE)) { // constructor
            assertContains(
                iterable = bits,
                element = NEGATIVE,
                message = "BitSequence constructed from Bit vararg containing NEGATIVE should contain NEGATIVE"
            )
            assertContains(
                iterable = bits,
                element = POSITIVE,
                message = "BitSequence constructed from Bit vararg containing POSITIVE should contain POSITIVE"
            )
            assertEquals(
                expected = 2,
                actual = bits.size,
                message = "BitSequence constructed from Bit vararg containing two elements should have two elements"
            )
            assertContentEquals(
                expected = listOf(POSITIVE, NEGATIVE),
                actual = bits,
                message = "BitSequence constructed from Bit vararg should have equal list of Bits elements"
            )
        }
    }

    @Test
    fun checkBitSequenceCanBeConstructedFromBooleanVararg() {
        with(BitSequence(true, false)) { // constructor
            assertContains(
                iterable = bits,
                element = NEGATIVE,
                message = "BitSequence constructed from Boolean vararg containing false should contain NEGATIVE"
            )
            assertContains(
                iterable = bits,
                element = POSITIVE,
                message = "BitSequence constructed from Boolean vararg containing true should contain POSITIVE"
            )
            assertEquals(
                expected = 2,
                actual = bits.size,
                message = "BitSequence constructed from Boolean vararg containing two elements should have two elements"
            )
            assertContentEquals(
                expected = listOf(POSITIVE, NEGATIVE),
                actual = bits,
                message = "BitSequence constructed from Boolean vararg should have equal list of Bits elements"
            )
        }
    }

    @Test
    fun checkBitSequenceCanBeConstructedFromCharVararg() {
        with(BitSequence('1', '0')) { // constructor
            assertContains(
                iterable = bits,
                element = NEGATIVE,
                message = "BitSequence constructed from Char vararg containing '0' should contain NEGATIVE"
            )
            assertContains(
                iterable = bits,
                element = POSITIVE,
                message = "BitSequence constructed from Char vararg containing '1' should contain POSITIVE"
            )
            assertEquals(
                expected = 2,
                actual = bits.size,
                message = "BitSequence constructed from Char vararg containing two elements should have two elements"
            )
            assertContentEquals(
                expected = listOf(POSITIVE, NEGATIVE),
                actual = bits,
                message = "BitSequence constructed from Char vararg should have equal list of Bits elements"
            )
        }
    }
}