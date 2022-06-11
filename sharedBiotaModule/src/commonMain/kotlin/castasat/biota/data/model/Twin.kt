package castasat.biota.data.model

import castasat.biota.data.model.Bit.Companion.NEGATIVE
import castasat.biota.data.model.Bit.Companion.POSITIVE

data class Twin(val bitPair: Pair<Bit, Bit>) {
    companion object {
        val EAST = Twin(bitPair = Pair(first = POSITIVE, second = NEGATIVE))
        val NORTH = Twin(bitPair = Pair(first = POSITIVE, second = POSITIVE))
        val WEST = Twin(bitPair = Pair(first = NEGATIVE, second = POSITIVE))
        val SOUTH = Twin(bitPair = Pair(first = NEGATIVE, second = NEGATIVE))

        fun toBitList(twin: Twin): List<Bit> =
            with(twin.bitPair) { listOf(first, second) }
    }
}