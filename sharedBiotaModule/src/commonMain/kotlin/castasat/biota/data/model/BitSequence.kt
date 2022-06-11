package castasat.biota.data.model

class BitSequence() {
    var bits: List<Bit> = emptyList()

    constructor(bit: Bit) : this() {
        this.bits = listOf(bit)
    }

    constructor(bitList: List<Bit>) : this() {
        this.bits = bitList
    }
}