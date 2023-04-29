package com.example.live_data_behavior

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _data: MutableLiveData<Int> = MutableLiveData()
    val data: LiveData<Int> = _data

    fun onCreate() {
        for (number in 1..100) {
            _data.value = number
        }
    }
}