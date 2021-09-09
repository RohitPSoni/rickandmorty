package com.example.rickandmorty.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/rickandmorty/repository/FilterCharacterRepositoryImpl;", "Lcom/example/rickandmorty/repository/FilterCharacterRepository;", "service", "Lcom/example/rickandmorty/service/CharacterApi;", "mapper", "Lcom/example/rickandmorty/mapper/CharactersMapper;", "localDatabaseMapper", "Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;", "(Lcom/example/rickandmorty/service/CharacterApi;Lcom/example/rickandmorty/mapper/CharactersMapper;Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;)V", "getFilteredCharacters", "", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "pattern", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FilterCharacterRepositoryImpl implements com.example.rickandmorty.repository.FilterCharacterRepository {
    private final com.example.rickandmorty.service.CharacterApi service = null;
    private final com.example.rickandmorty.mapper.CharactersMapper mapper = null;
    private final com.example.rickandmorty.mapper.LocalDatabaseMapper localDatabaseMapper = null;
    
    public FilterCharacterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.service.CharacterApi service, @org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.mapper.CharactersMapper mapper, @org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.mapper.LocalDatabaseMapper localDatabaseMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFilteredCharacters(@org.jetbrains.annotations.NotNull()
    java.lang.String pattern, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.local.entity.CharacterEntity>> continuation) {
        return null;
    }
}