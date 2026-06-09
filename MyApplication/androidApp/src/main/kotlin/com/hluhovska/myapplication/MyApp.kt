package com.hluhovska.myapplication

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApp)
            androidLogger()
        }
    }
}
