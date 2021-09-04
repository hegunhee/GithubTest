package com.hegunhee.githubtest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import com.hegunhee.githubtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()


    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initViews() = with(binding) {
        textView.setOnTouchListener { _, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> textView.text = "Hello AndroidWorld"
                MotionEvent.ACTION_UP -> textView.text = "Hello GithubWorld"
            }

            return@setOnTouchListener true
        }

        IntentButton.setOnClickListener {
            val intent = Intent(this@MainActivity, IntentActivity::class.java)
            startActivity(intent)
        }


    }
}