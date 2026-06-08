package com.hluhovska.myapplication

import androidx.lifecycle.ViewModel
import co.touchlab.kermit.Logger
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AboutViewModel : ViewModel() {

    private val _platformInfo = MutableStateFlow("")

    val platformInfo: StateFlow<String> = _platformInfo.asStateFlow()

    init {
        loadPlatformInfo()
    }

    private fun loadPlatformInfo() {

        val platform = getPlatform()
        _platformInfo.value = platform.name

        Logger.i(tag = "MMP_LAB_7") { "ViewModel ініціалізовано. Платформа: ${platform.name}" }
    }
}