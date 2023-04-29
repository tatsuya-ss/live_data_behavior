package com.example.live_data_behavior

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _data: MutableLiveData<Int> = MutableLiveData()
    val data: LiveData<Int> = _data

    fun onCreate() {
        _data.value = 1
    }
}