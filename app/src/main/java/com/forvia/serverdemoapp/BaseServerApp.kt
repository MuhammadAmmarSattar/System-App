package com.forvia.serverdemoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseServerApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}