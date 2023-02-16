package com.example.translator;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/translator/DataDao;", "", "clearData", "", "getAllDa", "", "Lcom/example/translator/Data;", "getAllData", "Landroidx/lifecycle/LiveData;", "insertData", "data", "removeData", "dataId", "", "app_debug"})
public abstract interface DataDao {
    
    @androidx.room.Insert()
    public abstract void insertData(@org.jetbrains.annotations.NotNull()
    com.example.translator.Data data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM data ORDER BY id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.translator.Data>> getAllData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM data")
    public abstract java.util.List<com.example.translator.Data> getAllDa();
    
    @androidx.room.Query(value = "DELETE FROM data")
    public abstract void clearData();
    
    @androidx.room.Query(value = "DELETE FROM data WHERE id=:dataId")
    public abstract void removeData(long dataId);
}