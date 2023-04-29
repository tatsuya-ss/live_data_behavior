package com.example.live_data_behavior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.live_data_behavior.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Tatsuya ٩( ᐛ )و", "onCreate: ")
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel.onCreate()
        observedLiveData()
    }

    private fun observedLiveData() {
        viewModel.data.observe(this) {
            Log.d("Tatsuya ٩( ᐛ )و", "observedLiveData: $it")
            binding.numberText.text = it.toString()
        }
    }
}