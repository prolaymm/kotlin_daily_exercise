package com.example.kotlinarjun.domain.data.impl

import com.example.kotlinarjun.domain.data.ApiRepo
import com.example.kotlinarjun.domain.vos.PostVo
import com.example.kotlinarjun.service.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

import javax.inject.Inject

class ApiRepoImpl @Inject constructor(private  val apiClient: ApiClient) : ApiRepo {
    override suspend  fun getAllPost(): Flow<List<PostVo>> = flow {
        emit(apiClient.getAllPost())
    }.flowOn(Dispatchers.IO)
}