package com.dicoding.subintermidiatesatu.view.maps

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.subintermidiatesatu.data.Result
import com.dicoding.subintermidiatesatu.data.UserRepository
import com.dicoding.subintermidiatesatu.response.ListStoryItem

class MapsViewModel(private val repository: UserRepository) : ViewModel() {

    fun getStoriesWithLocation(): LiveData<Result<List<ListStoryItem>>> {
        return repository.getStoriesWithLocation()
    }
}