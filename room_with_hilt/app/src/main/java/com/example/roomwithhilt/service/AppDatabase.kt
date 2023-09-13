package com.example.roomwithhilt.service

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomwithhilt.data.vos.TodoVo

@Database(entities = [TodoVo::class], version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

   abstract fun getToDoDao() : TodoDao
}