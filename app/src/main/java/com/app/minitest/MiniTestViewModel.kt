package com.app.minitest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MiniTestViewModel @Inject constructor(miniTestRepository: MiniTestRepository) :
    ViewModel() {
    val getData: StateFlow<UiState<List<MiniTestResponseItem>>> = miniTestRepository.getData().stateIn(
        scope = viewModelScope,
        initialValue = UiState.Loading,
        started = SharingStarted.WhileSubscribed()
    )
}