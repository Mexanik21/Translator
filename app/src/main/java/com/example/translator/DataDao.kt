package com.example.translator

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DataDao {
    @Insert
    fun insertData(data:Data)

    @Query("SELECT * FROM data ORDER BY id DESC")
    fun getAllData(): LiveData<List<Data>>

    @Query("SELECT * FROM data")
    fun getAllDa(): List<Data>

    @Query("DELETE FROM data")
    fun clearData()

    @Query("DELETE FROM data WHERE id=:dataId")
    fun removeData(dataId: Long)
}