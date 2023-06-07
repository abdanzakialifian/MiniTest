package com.app.minitest

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("schedule/web?date=2020-05-29&country=US")
    suspend fun getData(): Response<MiniTestResponse>
}