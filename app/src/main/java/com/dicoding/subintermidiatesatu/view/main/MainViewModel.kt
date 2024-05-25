package com.dicoding.subintermidiatesatu.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.dicoding.subintermidiatesatu.data.UserRepository
import com.dicoding.subintermidiatesatu.data.pref.UserModel
import com.dicoding.subintermidiatesatu.response.ListStoryItem
import kotlinx.coroutines.launch

class MainViewModel(private val repository: UserRepository) : ViewModel() {

    fun getSession(): LiveData<UserModel> {
        return repository.getSession().asLiveData()
    }

    fun logout() {
        viewModelScope.launch {
            repository.logout()
        }
    }

    val listStory = MutableLiveData<PagingData<ListStoryItem>>()
    val dataStory: LiveData<PagingData<ListStoryItem>> = listStory


    init {
        getStories()
    }

    fun getStories() {
        viewModelScope.launch {
            val storyResponse = repository.getStories()
            storyResponse.asFlow().collect {
                listStory.value = it
            }
        }
    }
}