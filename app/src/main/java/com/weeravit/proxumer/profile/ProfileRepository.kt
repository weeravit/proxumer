package com.weeravit.proxumer.profile

interface ProfileRepository {
    fun listenNotification(callback : () -> Unit)
}