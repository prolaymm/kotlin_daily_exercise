package com.example.hilt_custom_test.phone_system_hilt_provide

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object BrandModule {

    @Provides
    @Singleton
    fun provider(gamingBrand: GamingBrand) : Brand{
        return  gamingBrand
    }


}