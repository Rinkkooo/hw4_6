package com.example.hw4_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw4_6.databinding.ItemCarBinding

class Adapter(private val carList: List<ItemsViewModel>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCarBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(carList[position])
    }


    override fun getItemCount(): Int {
        return carList.size
    }

}

class ViewHolder(private val binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root) {


    fun onBind(itemsViewModel: ItemsViewModel) {
        Glide.with(binding.root).load(itemsViewModel.image).into(binding.imgCar)
        binding.tvName.text = itemsViewModel.text
        binding.tvDesc.text = itemsViewModel.description
    }


}