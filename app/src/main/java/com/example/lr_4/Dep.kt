package com.example.lr_4

import android.content.Context
import androidx.room.Room

object Dep {
    lateinit var db: MyDB

    fun init(context: Context) {
        val db = Room.databaseBuilder(
            context,
            MyDB::class.java,
            "myDb"
        ).build()
    }
}