package com.hluhovska.myapplication.data.about

import com.hluhovska.myapplication.data.about.Platform

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()