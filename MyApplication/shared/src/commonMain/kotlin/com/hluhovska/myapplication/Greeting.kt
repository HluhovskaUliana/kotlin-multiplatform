package com.hluhovska.myapplication

import com.hluhovska.myapplication.data.about.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}