package castasat.biota.data.model

data class Bit(private val value: Boolean) {
    companion object {
        val POSITIVE = Bit(value = true)
        val NEGATIVE = Bit(value = false)
    }
}