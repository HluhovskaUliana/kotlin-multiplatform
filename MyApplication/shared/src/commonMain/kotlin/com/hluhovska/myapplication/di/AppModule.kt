package com.hluhovska.myapplication.di

import com.hluhovska.myapplication.data.about.AboutRepository
import com.hluhovska.myapplication.data.about.Platform
import com.hluhovska.myapplication.ui.about.AboutViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    single { Platform() }
    singleOf(::AboutRepository)
    viewModelOf(::AboutViewModel)
}