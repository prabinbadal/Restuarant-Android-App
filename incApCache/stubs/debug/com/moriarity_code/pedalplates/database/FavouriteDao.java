package com.moriarity_code.pedalplates.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/moriarity_code/pedalplates/database/FavouriteDao;", "", "deleteFav", "", "favouriteEntity", "Lcom/moriarity_code/pedalplates/database/FavouriteEntity;", "getAllFavourites", "", "getFavouriteById", "id", "", "insertFav", "app_debug"})
public abstract interface FavouriteDao {
    
    @androidx.room.Insert()
    public abstract void insertFav(@org.jetbrains.annotations.NotNull()
    com.moriarity_code.pedalplates.database.FavouriteEntity favouriteEntity);
    
    @androidx.room.Delete()
    public abstract void deleteFav(@org.jetbrains.annotations.NotNull()
    com.moriarity_code.pedalplates.database.FavouriteEntity favouriteEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favourites_db")
    public abstract java.util.List<com.moriarity_code.pedalplates.database.FavouriteEntity> getAllFavourites();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favourites_db WHERE id = :id")
    public abstract com.moriarity_code.pedalplates.database.FavouriteEntity getFavouriteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}