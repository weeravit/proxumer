package com.weeravit.proxumer.modules.profile.domain

import com.weeravit.proxumer.modules.profile.data.ProfileRepository

class ProfileUsecase(private val repository: ProfileRepository) {
    fun listenNotification(callback: () -> Unit) {
        repository.listenNotification(callback)
    }
}