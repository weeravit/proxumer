package com.weeravit.proxumer.modules.profile.data

interface ProfileRepository {
    fun listenNotification(callback : () -> Unit)
}