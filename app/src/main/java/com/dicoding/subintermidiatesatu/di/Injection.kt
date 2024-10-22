package com.dicoding.subintermidiatesatu.di

import android.content.Context
import com.dicoding.subintermidiatesatu.data.UserRepository
import com.dicoding.subintermidiatesatu.data.pref.UserPreference
import com.dicoding.subintermidiatesatu.data.pref.dataStore
import com.dicoding.subintermidiatesatu.data.room.ApiConfig
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking


object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        val user = runBlocking { pref.getSession().first() }
        val apiService = ApiConfig.getApiService(user.token)
        return UserRepository.getInstance(apiService, pref)
    }
}