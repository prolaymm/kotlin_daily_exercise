package com.example.roomwithhilt.data.repo

import com.example.roomwithhilt.data.vos.TodoVo
import com.example.roomwithhilt.service.TodoDao
import javax.inject.Inject

class  TodoRepo @Inject constructor(private  val todoDao: TodoDao) {

    fun insertData(todoVo: TodoVo) {
        todoDao.insertToDo(todoVo)
    }
}
