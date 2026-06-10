package com.hluhovska.myapplication.di

import com.hluhovska.myapplication.ui.AboutViewModel
import com.hluhovska.myapplication.data.about.AboutRepository
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::AboutRepository)
    viewModelOf(::AboutViewModel)
}

fun initKoin(config: (KoinApplication.() -> Unit)? = null) {
    startKoin {
        config?.invoke(this)
        modules(appModule)
    }
}