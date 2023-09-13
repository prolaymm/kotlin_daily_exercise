package com.example.roomwithhilt.service

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun provideTodoDao(appDatabase: AppDatabase) : TodoDao {
        return  appDatabase.getToDoDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context : Context) : AppDatabase{

        return  Room.databaseBuilder(context,
            AppDatabase::class.java,
            "todo_database")
            .build()
    }
}

