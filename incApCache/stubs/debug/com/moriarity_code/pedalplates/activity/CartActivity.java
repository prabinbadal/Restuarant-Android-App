package com.moriarity_code.pedalplates.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0015J\b\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/moriarity_code/pedalplates/activity/CartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ljava/io/Serializable;", "()V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "recyclerAdapter", "Lcom/moriarity_code/pedalplates/adapter/CartAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "sharedPreferences", "Landroid/content/SharedPreferences;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setToolbar", "app_debug"})
public final class CartActivity extends androidx.appcompat.app.AppCompatActivity implements java.io.Serializable {
    private com.moriarity_code.pedalplates.adapter.CartAdapter recyclerAdapter;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private android.content.SharedPreferences sharedPreferences;
    private java.util.HashMap _$_findViewCache;
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setToolbar() {
    }
    
    public CartActivity() {
        super();
    }
}