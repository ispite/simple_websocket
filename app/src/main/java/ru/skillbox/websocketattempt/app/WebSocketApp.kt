package ru.skillbox.websocketattempt.app

import android.app.Application
import ru.skillbox.websocketattempt.BuildConfig
import timber.log.Timber

class WebSocketApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}