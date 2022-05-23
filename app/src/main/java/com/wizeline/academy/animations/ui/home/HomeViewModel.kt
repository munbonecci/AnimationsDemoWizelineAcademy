package com.wizeline.academy.animations.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wizeline.academy.animations.core.data.repository.HomeRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(var repository: HomeRepository): ViewModel() {

    val images: LiveData<List<Int>>
        get() = _images

    private val _images = MutableLiveData<List<Int>>()

    init {
        fetchData()
    }

    private fun fetchData() {
        val images = repository.fetchMockedImages()
        _images.postValue(images)
    }
}