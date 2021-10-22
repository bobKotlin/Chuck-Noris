package com.example.chacknoris

import retrofit2.Response

class Repository {
    suspend fun getVoice(): Response<ChuckNoris>{
        return RetrofitInstance.retrofitBuilder.getVoice()
    }
}