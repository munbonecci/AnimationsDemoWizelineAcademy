package com.wizeline.academy.animations.ui.home

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.wizeline.academy.animations.R
import com.wizeline.academy.animations.utils.loadImage

class HomeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val ivImage = view.findViewById<ImageView>(R.id.ivImage)

    fun bind(imageId: Int, onClickListener: (Int) -> Unit) {
        view.setOnClickListener { onClickListener.invoke(imageId) }
        ivImage.loadImage(imageId)
    }
}