package com.hegunhee.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hegunhee.githubtest.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    lateinit var adapter : IntentAdapter
    private lateinit var binding: ActivityIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
        initViews()

//        val items = (0..9).map { i ->
//            item("$i 번째 제목", "$i 번째 설명")
//        }.toList()

    }
    private fun initAdapter() = with(binding){
        adapter = IntentAdapter((0..9).map { i ->
            item("$i 번째 제목", "$i 번째 설명")
        }.toList())
        itemAdapter.adapter = adapter
    }
    private fun initViews() = with(binding){
        button.setOnClickListener {
            fetchData()
        }
    }
    private fun fetchData() = with(binding){
    }
}