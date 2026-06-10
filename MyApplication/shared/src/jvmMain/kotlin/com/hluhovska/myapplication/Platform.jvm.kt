package com.hluhovska.myapplication.data.about

import co.touchlab.kermit.Logger
import java.awt.Toolkit

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform actual constructor() {
    actual val osName: String
        get() = System.getProperty("os.name") ?: "Desktop"
    actual val osVersion: String
        get() = System.getProperty("os.version") ?: "Unknown"
    actual val deviceModel: String
        get() = System.getProperty("sun.desktop") ?: "Desktop"
    actual val cpuType: String
        get() = System.getProperty("os.arch") ?: "Unknown"
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
    private val toolkit = Toolkit.getDefaultToolkit()
    private val screenSize = toolkit.screenSize
    actual val width: Int
        get() = screenSize.width
    actual val height: Int
        get() = screenSize.height
    actual val density: Int?
        get() = (toolkit.screenResolution / 96f).toInt()
}