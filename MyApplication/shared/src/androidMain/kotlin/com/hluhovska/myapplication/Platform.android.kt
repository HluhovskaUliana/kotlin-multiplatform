package com.hluhovska.myapplication.data.about

import android.content.res.Resources
import android.os.Build
import co.touchlab.kermit.Logger
import kotlin.math.round

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform actual constructor() {
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = "${Build.VERSION.SDK_INT}"
    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"
    actual val cpuType: String
        get() = Build.SUPPORTED_ABIS.firstOrNull() ?: "Unknown"
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
    private val metrics = Resources.getSystem().displayMetrics
    actual val width: Int
        get() = metrics.widthPixels
    actual val height: Int
        get() = metrics.heightPixels
    actual val density: Int?
        get() = (round(metrics.density * 10) / 10f).toInt()
}