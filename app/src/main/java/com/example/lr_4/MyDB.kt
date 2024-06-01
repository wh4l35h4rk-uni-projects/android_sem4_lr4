package com.example.lr_4
import androidx.room.Database

@Database(entities = [User::class], version = 1)
abstract class MyDB {
    abstract fun getUserDao() : UserDao
}