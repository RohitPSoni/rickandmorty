package com.example.rickandmorty.local;

import java.lang.System;

@androidx.room.Database(version = 1, entities = {com.example.rickandmorty.local.entity.CharacterEntity.class}, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/rickandmorty/local/RickAndMortyOffline;", "Landroidx/room/RoomDatabase;", "()V", "getCharacterDao", "Lcom/example/rickandmorty/local/dao/CharacterDao;", "app_debug"})
public abstract class RickAndMortyOffline extends androidx.room.RoomDatabase {
    
    public RickAndMortyOffline() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.rickandmorty.local.dao.CharacterDao getCharacterDao();
}