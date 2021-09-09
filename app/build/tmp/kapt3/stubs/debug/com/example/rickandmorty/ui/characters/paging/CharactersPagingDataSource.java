package com.example.rickandmorty.ui.characters.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/rickandmorty/ui/characters/paging/CharactersPagingDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "service", "Lcom/example/rickandmorty/service/CharacterApi;", "mapper", "Lcom/example/rickandmorty/mapper/CharactersMapper;", "localDatabaseMapper", "Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;", "(Lcom/example/rickandmorty/service/CharacterApi;Lcom/example/rickandmorty/mapper/CharactersMapper;Lcom/example/rickandmorty/mapper/LocalDatabaseMapper;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CharactersPagingDataSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.rickandmorty.local.entity.CharacterEntity> {
    private final com.example.rickandmorty.service.CharacterApi service = null;
    private final com.example.rickandmorty.mapper.CharactersMapper mapper = null;
    private final com.example.rickandmorty.mapper.LocalDatabaseMapper localDatabaseMapper = null;
    
    public CharactersPagingDataSource(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.service.CharacterApi service, @org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.mapper.CharactersMapper mapper, @org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.mapper.LocalDatabaseMapper localDatabaseMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.rickandmorty.local.entity.CharacterEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.rickandmorty.local.entity.CharacterEntity> state) {
        return null;
    }
}