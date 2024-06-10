package com.moriarity_code.pedalplates.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020%2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020%H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/moriarity_code/pedalplates/activity/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ljava/io/Serializable;", "()V", "cartFoodCost", "Ljava/util/ArrayList;", "", "cartFoodId", "cartFoodName", "cartLayout", "Landroid/widget/RelativeLayout;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "menuList", "Lcom/moriarity_code/pedalplates/model/RestaurantMenu;", "getMenuList", "()Ljava/util/ArrayList;", "recyclerAdapter", "Lcom/moriarity_code/pedalplates/adapter/DetailAdapter;", "getRecyclerAdapter", "()Lcom/moriarity_code/pedalplates/adapter/DetailAdapter;", "setRecyclerAdapter", "(Lcom/moriarity_code/pedalplates/adapter/DetailAdapter;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "resName", "Landroid/widget/TextView;", "txtCartItemNumber", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setToolbar", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    public com.moriarity_code.pedalplates.adapter.DetailAdapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.GridLayoutManager layoutManager;
    private android.widget.TextView resName;
    private android.widget.RelativeLayout cartLayout;
    private android.widget.TextView txtCartItemNumber;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.moriarity_code.pedalplates.model.RestaurantMenu> menuList = null;
    private final java.util.ArrayList<java.lang.String> cartFoodName = null;
    private final java.util.ArrayList<java.lang.String> cartFoodCost = null;
    private final java.util.ArrayList<java.lang.String> cartFoodId = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moriarity_code.pedalplates.adapter.DetailAdapter getRecyclerAdapter() {
        return null;
    }
    
    public final void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.moriarity_code.pedalplates.adapter.DetailAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.GridLayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.moriarity_code.pedalplates.model.RestaurantMenu> getMenuList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void setToolbar() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public DetailActivity() {
        super();
    }
}