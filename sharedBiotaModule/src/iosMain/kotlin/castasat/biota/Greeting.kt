package castasat.biota

actual class Greeting {
    actual fun greeting(): String = "Hello, ${Platform().platform}!"
}