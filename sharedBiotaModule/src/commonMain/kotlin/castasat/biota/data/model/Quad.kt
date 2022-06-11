package castasat.biota.data.model

import castasat.biota.data.model.Twin.Companion.EAST
import castasat.biota.data.model.Twin.Companion.NORTH
import castasat.biota.data.model.Twin.Companion.SOUTH
import castasat.biota.data.model.Twin.Companion.WEST
import castasat.biota.data.model.Twin.Companion.toBitList

data class Quad(val twinPair: Pair<Twin, Twin>) {
    companion object {
        val ONE = Quad(twinPair = Pair(first = EAST, second = EAST))
        val TWO = Quad(twinPair = Pair(first = EAST, second = NORTH))
        val THREE = Quad(twinPair = Pair(first = EAST, second = WEST))
        val FOUR = Quad(twinPair = Pair(first = EAST, second = SOUTH))
        val FIVE = Quad(twinPair = Pair(first = NORTH, second = EAST))
        val SIX = Quad(twinPair = Pair(first = NORTH, second = NORTH))
        val SEVEN = Quad(twinPair = Pair(first = NORTH, second = WEST))
        val EIGHT = Quad(twinPair = Pair(first = NORTH, second = SOUTH))
        val NINE = Quad(twinPair = Pair(first = WEST, second = EAST))
        val TEN = Quad(twinPair = Pair(first = WEST, second = NORTH))
        val ELEVEN = Quad(twinPair = Pair(first = WEST, second = WEST))
        val TWELVE = Quad(twinPair = Pair(first = WEST, second = SOUTH))
        val THIRTEEN = Quad(twinPair = Pair(first = SOUTH, second = EAST))
        val FOURTEEN = Quad(twinPair = Pair(first = SOUTH, second = NORTH))
        val FIFTEEN = Quad(twinPair = Pair(first = SOUTH, second = WEST))
        val SIXTEEN = Quad(twinPair = Pair(first = SOUTH, second = SOUTH))

        @Suppress("MemberVisibilityCanBePrivate")
        fun toTwinList(quad: Quad): List<Twin> =
            with(quad.twinPair) { listOf(first, second) }

        fun toBitList(quad: Quad): List<Bit> =
            toTwinList(quad).flatMap { twin -> toBitList(twin) }
    }
}