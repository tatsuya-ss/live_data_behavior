package com.example.live_data_behavior

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _data: MutableLiveData<Int> = MutableLiveData()
    val data: LiveData<Int> = _data

    fun onCreate() {
        _data.value = 1
        Log.d("Tatsuya ٩( ᐛ )و", "onCreate: ViewModelで　_data.value = 1　を実行")
    }

    fun onPause() {
        _data.value = 2
        Log.d("Tatsuya ٩( ᐛ )و", "onPause: ViewModelで　_data.value = 2　を実行")
    }

    fun onStop() {
        _data.value = 3
        Log.d("Tatsuya ٩( ᐛ )و", "onStop: ViewModelで　_data.value = 3　を実行")
    }
}