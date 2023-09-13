package com.example.roomwithhilt.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.roomwithhilt.data.vos.TodoVo

@Dao
interface TodoDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun  insertToDo(todoVo: TodoVo)
}