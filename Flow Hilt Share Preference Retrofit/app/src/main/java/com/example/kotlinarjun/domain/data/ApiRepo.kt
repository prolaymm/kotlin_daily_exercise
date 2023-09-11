package com.example.kotlinarjun.domain.data

import com.example.kotlinarjun.domain.vos.PostVo
import kotlinx.coroutines.flow.Flow

interface ApiRepo {

  suspend  fun getAllPost() : Flow<List<PostVo>>
}