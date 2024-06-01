package com.example.lr_4

import android.app.Application
import androidx.room.Room

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Dep.init(applicationContext)
    }
}