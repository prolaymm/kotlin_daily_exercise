package com.example.kotlinarjun.service

import com.example.kotlinarjun.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiService {

    @Provides
    @Singleton
    fun getBaseUrl(): String = BASE_URL

    @Provides
    @Singleton
    fun getRetrofit(url: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providerApiClient(retrofit: Retrofit) : ApiClient = retrofit.create(ApiClient::class.java)
}