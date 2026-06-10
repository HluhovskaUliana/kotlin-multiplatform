package com.hluhovska.myapplication.data.about

import co.touchlab.kermit.Logger
import kotlinx.browser.window

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform actual constructor() {
    actual val osName: String
        get() = "Web Wasm"
    actual val osVersion: String
        get() = window.navigator.userAgent
    actual val deviceModel: String
        get() = window.navigator.platform
    actual val cpuType: String
        get() = "Unknown"
    actual val screen: ScreenInfo
        get() = ScreenInfo()

    actual fun logSystemInfo() {
        Logger.i(tag = "Platform") {
            "OS: $osName $osVersion | Device: $deviceModel | CPU: $cpuType | Screen: ${screen.width}x${screen.height}"
        }
    }
}

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ScreenInfo actual constructor() {
    actual val width: Int
        get() = window.screen.width
    actual val height: Int
        get() = window.screen.height
    actual val density: Int?
        get() = window.devicePixelRatio.toInt()
}