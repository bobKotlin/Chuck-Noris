package com.example.chacknoris

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val URL = "https://api.icndb.com/"
object RetrofitInstance {
    val retrofitBuilder by lazy { Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(API::class.java)}

}