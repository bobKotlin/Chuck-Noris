package com.example.chacknoris

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {
    var myResponse = MutableLiveData<Response<ChuckNoris>>()
    fun getVoice() {
        viewModelScope.launch {
            val response = repository.getVoice()
            myResponse.value = response
        }
    }
}