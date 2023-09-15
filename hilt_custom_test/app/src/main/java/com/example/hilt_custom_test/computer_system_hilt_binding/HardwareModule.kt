package com.example.hilt_custom_test.computer_system_hilt_binding

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class HardwareModule {

    @Binds
   abstract fun provideHardware(gaming: Gaming) : Hardware

}