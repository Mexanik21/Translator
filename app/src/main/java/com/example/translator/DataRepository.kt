package com.example.translator

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData

class DataRepository(var dataDao: DataDao) {


    fun getAll() = dataDao.getAllData()


}