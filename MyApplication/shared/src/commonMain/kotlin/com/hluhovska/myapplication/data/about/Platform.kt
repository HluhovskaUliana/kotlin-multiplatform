package com.hluhovska.myapplication.data.about

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform