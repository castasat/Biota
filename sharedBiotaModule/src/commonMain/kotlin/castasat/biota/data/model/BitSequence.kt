package castasat.biota.data.model

import castasat.biota.data.model.Bit.*

open class BitSequence() {
    var bits: List<Bit> = emptyList()

    constructor(bitList: List<Bit>) : this() {
        this.bits = bitList
    }

    constructor(vararg bits: Bit) : this() {
        this.bits = listOf(*bits)
    }

    constructor(vararg booleans: Boolean) : this() {
        this.bits = booleans
            .map { boolean: Boolean ->
                when (boolean) {
                    false -> NEGATIVE
                    true -> POSITIVE
                }
            }
    }

    constructor(vararg chars: Char) : this() {
        this.bits = chars
            .map { char ->
                when (char) {
                    '0' -> NEGATIVE
                    '1' -> POSITIVE
                    else -> null
                }
            }
            .filterNotNull()
    }

    constructor(charSequence: CharSequence) : this() {
        this.bits = charSequence
            .map { char ->
                when (char) {
                    '0' -> NEGATIVE
                    '1' -> POSITIVE
                    else -> null
                }
            }
            .filterNotNull()
    }
}