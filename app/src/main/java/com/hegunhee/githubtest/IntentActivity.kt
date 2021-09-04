package com.hegunhee.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hegunhee.githubtest.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchData()
    }
    private fun fetchData() = with(binding){

    }
}