package com.example.translator

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Data::class], version = 1)
abstract class AppDataBase():RoomDatabase() {

    abstract fun dataDao(): DataDao

    companion object{
        private var instance: AppDataBase? = null

        @Synchronized
        fun getInstance(context: Context): AppDataBase {
            if (instance == null){
                instance = Room.databaseBuilder(context, AppDataBase::class.java, "data.db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }
}