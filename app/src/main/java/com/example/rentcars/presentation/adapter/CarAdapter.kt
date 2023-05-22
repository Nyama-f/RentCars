package com.example.rentcars.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rentcars.data.entity.CarEntity
import com.example.rentcars.databinding.ItemCarBinding


class CarAdapter : ListAdapter<CarEntity, CarAdapter.CarViewHolder>(DiffCallback) {

    companion object{

        object DiffCallback : DiffUtil.ItemCallback<CarEntity>() {
            override fun areItemsTheSame(
                oldItem: CarEntity,
                newItem: CarEntity): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: CarEntity,
                newItem: CarEntity): Boolean {
                return oldItem == newItem
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding = ItemCarBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return CarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    class CarViewHolder(val binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root)
}

