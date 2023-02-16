package com.example.translator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020/H\u0002J\u0012\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020/H\u0002J\u000e\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u0006>"}, d2 = {"Lcom/example/translator/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/translator/WordsAdapter;", "getAdapter", "()Lcom/example/translator/WordsAdapter;", "setAdapter", "(Lcom/example/translator/WordsAdapter;)V", "appDataBase", "Lcom/example/translator/AppDataBase;", "getAppDataBase", "()Lcom/example/translator/AppDataBase;", "setAppDataBase", "(Lcom/example/translator/AppDataBase;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dataList", "", "Lcom/example/translator/Data;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dialog", "Lcom/example/translator/SaveDataDialog;", "getDialog", "()Lcom/example/translator/SaveDataDialog;", "setDialog", "(Lcom/example/translator/SaveDataDialog;)V", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getFab", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setFab", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "buildRecyclerView", "", "filter", "text", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "openDialog", "toDataActivity", "data", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.translator.WordsAdapter adapter;
    public com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    public android.content.Context context;
    public com.example.translator.SaveDataDialog dialog;
    public androidx.recyclerview.widget.RecyclerView rv;
    public com.example.translator.AppDataBase appDataBase;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.translator.Data> dataList;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.translator.WordsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.translator.WordsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getFab() {
        return null;
    }
    
    public final void setFab(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.translator.SaveDataDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    com.example.translator.SaveDataDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRv() {
        return null;
    }
    
    public final void setRv(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.translator.AppDataBase getAppDataBase() {
        return null;
    }
    
    public final void setAppDataBase(@org.jetbrains.annotations.NotNull()
    com.example.translator.AppDataBase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.translator.Data> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.translator.Data> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void buildRecyclerView() {
    }
    
    private final void openDialog() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void filter(java.lang.String text) {
    }
    
    public final void toDataActivity(@org.jetbrains.annotations.NotNull()
    com.example.translator.Data data) {
    }
}