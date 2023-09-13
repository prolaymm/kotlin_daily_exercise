package com.example.roomwithhilt.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("todo")
  data class TodoVo(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo("title")
    val title : String ,

    @ColumnInfo("description")
    val  description : String
)