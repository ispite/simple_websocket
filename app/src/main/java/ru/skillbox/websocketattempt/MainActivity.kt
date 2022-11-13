package ru.skillbox.websocketattempt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.OkHttpClient
import okhttp3.Request
import timber.log.Timber

class MainActivity : AppCompatActivity() {


    private lateinit var client: OkHttpClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.d("onCreate")

        client = OkHttpClient()

        val request: Request = Request.Builder()
//            .url("wss://pubwss.bithumb.com/pub/ws")
//            .url("ws://echo.websocket.com")
            .url("wss://ws.postman-echo.com/raw")
            .build()
        val listener: WebSocketListener = WebSocketListener()

        client.newWebSocket(request, listener)
//        client.dispatcher().executorService().shutdown()
        client.dispatcher.executorService.shutdown()
    }
}