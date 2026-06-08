package com.hluhovska.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform