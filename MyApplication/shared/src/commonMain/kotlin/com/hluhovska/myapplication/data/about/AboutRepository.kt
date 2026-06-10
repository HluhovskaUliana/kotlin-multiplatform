package com.hluhovska.myapplication.data.about

class AboutRepository {
    fun getPlatformName(): String {
        return getPlatform().name
    }
}