package com.example.rickandmorty.ui.characters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/rickandmorty/ui/characters/CharactersViewModel;", "Lcom/example/rickandmorty/base/BaseViewModel;", "characterRepository", "Lcom/example/rickandmorty/repository/CharacterRepository;", "(Lcom/example/rickandmorty/repository/CharacterRepository;)V", "charactersFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "getCharactersFlow", "()Lkotlinx/coroutines/flow/Flow;", "setCharactersFlow", "(Lkotlinx/coroutines/flow/Flow;)V", "getAllCharacters", "", "onSearchClicked", "view", "Landroid/view/View;", "app_debug"})
public final class CharactersViewModel extends com.example.rickandmorty.base.BaseViewModel {
    private final com.example.rickandmorty.repository.CharacterRepository characterRepository = null;
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.rickandmorty.local.entity.CharacterEntity>> charactersFlow;
    
    public CharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.repository.CharacterRepository characterRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.rickandmorty.local.entity.CharacterEntity>> getCharactersFlow() {
        return null;
    }
    
    public final void setCharactersFlow(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.rickandmorty.local.entity.CharacterEntity>> p0) {
    }
    
    private final void getAllCharacters() {
    }
    
    public final void onSearchClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}