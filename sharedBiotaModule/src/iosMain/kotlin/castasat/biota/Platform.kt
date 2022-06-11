package castasat.biota

import platform.UIKit.UIDevice.Companion.currentDevice

actual class Platform actual constructor() {
    actual val platform: String = with(currentDevice) {
        systemName() + " " + systemVersion
    }
}