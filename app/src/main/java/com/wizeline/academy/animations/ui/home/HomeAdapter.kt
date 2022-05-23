package com.wizeline.academy.animations.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wizeline.academy.animations.R

class HomeAdapter(
    private var dataSet: List<Int> = emptyList(),
    private var onClickListener: (Int) -> Unit
) : RecyclerView.Adapter<HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = dataSet.size

    fun updateDateSet(images: List<Int>) {
        dataSet = images
    }
}