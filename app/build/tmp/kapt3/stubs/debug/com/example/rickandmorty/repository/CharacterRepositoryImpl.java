package com.example.rickandmorty.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/rickandmorty/repository/CharacterRepositoryImpl;", "Lcom/example/rickandmorty/repository/CharacterRepository;", "service", "Lcom/example/rickandmorty/service/CharacterApi;", "mapper", "Lcom/example/rickandmorty/mapper/CharactersMapper;", "localDatabaseMapper", "Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;", "(Lcom/example/rickandmorty/service/CharacterApi;Lcom/example/rickandmorty/mapper/CharactersMapper;Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;)V", "getAllCharacters", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CharacterRepositoryImpl implements com.example.rickandmorty.repository.CharacterRepository {
    private final com.example.rickandmorty.service.CharacterApi service = null;
    private final com.example.rickandmorty.mapper.CharactersMapper mapper = null;
    private final com.example.rickandmorty.mapper.LocalDatabaseMapper localDatabaseMapper = null;
    
    public CharacterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.service.CharacterApi service, @org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.mapper.CharactersMapper mapper, @org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.mapper.LocalDatabaseMapper localDatabaseMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.rickandmorty.local.entity.CharacterEntity>>> continuation) {
        return null;
    }
}