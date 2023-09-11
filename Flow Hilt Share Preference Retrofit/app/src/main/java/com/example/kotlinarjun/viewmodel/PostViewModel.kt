package com.example.kotlinarjun.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinarjun.domain.data.impl.ApiRepoImpl
import com.example.kotlinarjun.domain.vos.PostVo
import com.example.kotlinarjun.service.ApiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val apiRepoImpl: ApiRepoImpl) : ViewModel() {



    private val allPost: MutableStateFlow<ApiState<List<PostVo>>> = MutableStateFlow(ApiState.Loading())

     fun  getAllPost(){
         viewModelScope.launch {
             allPost.value = ApiState.Loading()
             apiRepoImpl.getAllPost().catch {e->

                 Log.d("arjun","${e} arjun")
               allPost.value = ApiState.Failure("$e")
             }.collect{
                 Log.d("arjun","${it} arjun")
                 allPost.value = ApiState.Success(it)
             }
         }
    }
}