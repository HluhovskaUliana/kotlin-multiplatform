package com.hluhovska.myapplication.ui.about

import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.touchlab.kermit.Logger
import com.hluhovska.myapplication.data.about.AboutRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@Stable
class AboutViewModel(
    private val repository: AboutRepository
) : ViewModel() {

    private val _aboutInfo = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val aboutInfo: StateFlow<List<Pair<String, String>>> = _aboutInfo.asStateFlow()

    init {
        viewModelScope.launch {
            _aboutInfo.value = repository.getAbout()
            Logger.Companion.i(tag = "MMP_LAB") {
                "AboutViewModel created via Koin! Info loaded: ${_aboutInfo.value.size} items"
            }
        }
    }
}