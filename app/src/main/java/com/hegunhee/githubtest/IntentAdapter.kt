package com.hegunhee.githubtest

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hegunhee.githubtest.databinding.ItemBinding

class IntentAdapter(var adapterData: List<item>) : RecyclerView.Adapter<IntentAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : item) = with(binding){
            title.text = item.title
            description.text = item.description
        }
        fun initViews() = with(binding){
            binding.root.setOnClickListener {
                Log.d("test","${title.text.toString()}")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(adapterData[position])
        holder.initViews()
    }

    override fun getItemCount(): Int = adapterData.size ?: 0

    fun setData(data : List<item>){
        adapterData = data
        notifyDataSetChanged()
    }
}