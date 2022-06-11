package castasat.biota

actual class Greeting actual constructor() {
    actual fun greeting(): String = "Hello, ${Platform().platform}!"
}