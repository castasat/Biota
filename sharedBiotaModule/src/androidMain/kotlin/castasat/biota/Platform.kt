package castasat.biota

import android.os.Build.VERSION.SDK_INT

actual class Platform actual constructor() {
    actual val platform: String = "Android $SDK_INT"
}