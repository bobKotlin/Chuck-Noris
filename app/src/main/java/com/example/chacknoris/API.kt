package com.example.chacknoris

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("jokes/random")
    suspend fun getVoice(): Response<ChuckNoris>
}