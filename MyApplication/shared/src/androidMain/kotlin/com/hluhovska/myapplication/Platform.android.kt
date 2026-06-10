package com.hluhovska.myapplication.data.about

import android.os.Build
import com.hluhovska.myapplication.data.about.Platform

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()