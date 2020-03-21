package com.weeravit.proxumer.profile

class ProfileUsecase(private val repository: ProfileRepository) {
    fun listenNotification(callback: () -> Unit) {
        repository.listenNotification(callback)
    }
}