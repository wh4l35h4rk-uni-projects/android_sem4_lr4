package com.example.lr_4

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Delete
    suspend fun delete(user: User)

    @Update
    suspend fun update(user: User)

    @Query("SELECT * FROM USER")
    suspend fun getAllUsers() : List<User>

    @Query("SELECT * FROM USER WHERE id = :id")
    suspend fun getUserById(id: Int) : User
}