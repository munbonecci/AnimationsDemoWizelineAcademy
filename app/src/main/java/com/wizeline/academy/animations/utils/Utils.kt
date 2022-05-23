package com.wizeline.academy.animations.utils

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.wizeline.academy.animations.R
import kotlin.random.Random

fun ImageView.loadImage(imageId: Int) {
    val url = "https://picsum.photos/id/$imageId/200/200"
    Glide.with(context)
        .load(url)
        .centerCrop()
        .error(ContextCompat.getDrawable(context, R.drawable.not_available))
        .into(this)
}

fun Fragment.getRandomPicsumUrl(): String {
    val random = Random.nextInt(0, 9)
    return "https://picsum.photos/20$random"
}