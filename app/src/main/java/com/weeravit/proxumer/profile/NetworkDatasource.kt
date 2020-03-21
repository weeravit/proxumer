package com.weeravit.proxumer.profile

import io.socket.client.IO

class NetworkDatasource : ProfileRepository {
    override fun listenNotification(callback: () -> Unit) {
        val socket = IO.socket("https://px-socket-api.herokuapp.com")
        socket.on("new-notification") {
            callback.invoke()
        }
        socket.connect()
    }
}