package com.app.minitest

import kotlinx.coroutines.flow.Flow

interface MiniTestRepository {
    fun getData(): Flow<UiState<List<MiniTestResponseItem>>>
}