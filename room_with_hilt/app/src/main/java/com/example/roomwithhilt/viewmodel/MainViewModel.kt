package com.example.roomwithhilt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomwithhilt.data.repo.TodoRepo
import com.example.roomwithhilt.data.vos.TodoVo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: TodoRepo
): ViewModel() {
    fun databaseSize(todoVo: TodoVo)  {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertData(todoVo =todoVo )
        }
    }
}