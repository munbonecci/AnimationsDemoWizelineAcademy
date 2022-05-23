package com.wizeline.academy.animations.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wizeline.academy.animations.core.data.repository.LoreIpsumRepository
import javax.inject.Inject
import kotlin.random.Random

class DetailViewModel @Inject constructor(private var repository: LoreIpsumRepository) :
    ViewModel() {

    val title: LiveData<String>
        get() = _title

    private val _title = MutableLiveData<String>()

    val subtitle: LiveData<String>
        get() = _subtitle

    private val _subtitle = MutableLiveData<String>()

    var contentIndex: Int = 0

    init {
        fetchData()
    }

    private fun fetchData() {
        contentIndex = Random.nextInt(0, 4)
        fetchTitle(contentIndex)
        fetchSubtitle(contentIndex)
    }

    private fun fetchTitle(index: Int) {
        val title = repository.getTitle(index)
        _title.postValue(title)
    }

    private fun fetchSubtitle(index: Int) {
        val subtitle = repository.getContent(index)
        _subtitle.postValue(subtitle)
    }
}