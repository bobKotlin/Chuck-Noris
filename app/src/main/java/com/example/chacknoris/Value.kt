package com.example.chacknoris

import com.google.gson.annotations.SerializedName

data class Value (
    val id:Int,
    val joke:String,
    val categories: List<String>

)
