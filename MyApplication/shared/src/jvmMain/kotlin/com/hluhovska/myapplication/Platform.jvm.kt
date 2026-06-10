package com.hluhovska.myapplication.data.about

import com.hluhovska.myapplication.data.about.Platform

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()