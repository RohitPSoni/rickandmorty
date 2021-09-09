package com.example.rickandmorty.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;", "", "getAllInfo", "", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNameByPattern", "pattern", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDataIntoDatabase", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocalDatabaseMapper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertDataIntoDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.rickandmorty.local.entity.CharacterEntity> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNameByPattern(@org.jetbrains.annotations.NotNull()
    java.lang.String pattern, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.local.entity.CharacterEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.local.entity.CharacterEntity>> continuation);
}