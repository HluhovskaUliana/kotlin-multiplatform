package com.hluhovska.myapplication

import com.hluhovska.myapplication.data.about.Platform

class Greeting {
    private val platform = Platform()

    fun greet(): String {
        return sayHello("${platform.osName} ${platform.osVersion}")
    }
}