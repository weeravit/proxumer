package com.weeravit.proxumer.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel() : ViewModel() {
    private val profileUsecase by lazy {
        ProfileUsecase(NetworkDatasource())
    }
    val notification = MutableLiveData<String>()

    fun listenNotification() {
        profileUsecase.listenNotification {
            val value = notification.value ?: "0"
            val count = value.toInt() + 1
            notification.postValue("$count")
        }
    }
}