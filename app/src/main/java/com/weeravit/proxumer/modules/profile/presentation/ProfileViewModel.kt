package com.weeravit.proxumer.modules.profile.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weeravit.proxumer.modules.profile.domain.ProfileUsecase
import org.koin.java.KoinJavaComponent.inject

class ProfileViewModel() : ViewModel() {
    private val profileUsecase by inject(ProfileUsecase::class.java)

    val notification = MutableLiveData<String>()

    fun listenNotification() {
        profileUsecase.listenNotification {
            val value = notification.value ?: "0"
            val count = value.toInt() + 1
            notification.postValue("$count")
        }
    }
}