package com.weeravit.proxumer.modules.profile.data

import io.socket.client.IO

class NetworkProfileDatasource :
    ProfileRepository {
    override fun listenNotification(callback: () -> Unit) {
        val socket = IO.socket("https://px-socket-api.herokuapp.com")
        socket.on("new-notification") {
            callback.invoke()
        }
        socket.connect()
    }
}