package com.example.kotlinarjun.domain.vos

import com.google.gson.annotations.SerializedName

data class PostVo(
    @SerializedName("id")
    val id : Int,
    @SerializedName("userId")
    val userId : Int,
    @SerializedName("title")
    val title : String,
    @SerializedName("body")
    val body : String)