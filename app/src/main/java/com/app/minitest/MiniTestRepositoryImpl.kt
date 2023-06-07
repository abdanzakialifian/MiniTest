package com.app.minitest

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MiniTestRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    MiniTestRepository {
    override fun getData(): Flow<UiState<List<MiniTestResponseItem>>> = flow {
        val response = apiService.getData()
        val responseBody = response.body()

        emit(UiState.Loading)
        if (response.isSuccessful && responseBody != null) {
            emit(UiState.Success(responseBody))
        } else {
            emit(UiState.Error(response.errorBody().toString()))
        }
    }.flowOn(Dispatchers.IO)
}