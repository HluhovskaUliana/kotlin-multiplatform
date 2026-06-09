package com.hluhovska.myapplication

import androidx.lifecycle.ViewModel
import co.touchlab.kermit.Logger
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AboutViewModel(
    private val repository: PlatformRepository
) : ViewModel() {

    private val _platformInfo = MutableStateFlow("")
    val platformInfo: StateFlow<String> = _platformInfo.asStateFlow()

    init {
        _platformInfo.value = repository.getPlatformName()
        Logger.i(tag = "MMP_LAB") { "AboutViewModel створено через Koin! Платформа: ${_platformInfo.value}" }
    }
}