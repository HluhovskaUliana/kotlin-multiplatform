package com.hluhovska.myapplication


class PlatformRepository {
    fun getPlatformName(): String {
        return getPlatform().name
    }
}