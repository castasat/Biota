package castasat.biota.data.model

class BitSequence() {
    var bits: List<Bit> = emptyList()

    constructor(bitList: List<Bit>) : this() {
        this.bits = bitList
    }

    constructor(vararg bits: Bit) : this() {
        this.bits = listOf(*bits)
    }
}