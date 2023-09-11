package com.example.kotlinarjun.service

import com.example.kotlinarjun.domain.vos.PostVo
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET("posts")

   suspend fun getAllPost() : List<PostVo>
}