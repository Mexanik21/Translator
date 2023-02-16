package com.example.translator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/example/translator/DataRepository;", "", "dataDao", "Lcom/example/translator/DataDao;", "(Lcom/example/translator/DataDao;)V", "getDataDao", "()Lcom/example/translator/DataDao;", "setDataDao", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/translator/Data;", "app_debug"})
public final class DataRepository {
    @org.jetbrains.annotations.NotNull()
    private com.example.translator.DataDao dataDao;
    
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.example.translator.DataDao dataDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.translator.DataDao getDataDao() {
        return null;
    }
    
    public final void setDataDao(@org.jetbrains.annotations.NotNull()
    com.example.translator.DataDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.translator.Data>> getAll() {
        return null;
    }
}