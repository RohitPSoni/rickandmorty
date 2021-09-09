package com.example.rickandmorty.ui.characters.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/rickandmorty/ui/characters/search/SearchCharacterViewModel;", "Lcom/example/rickandmorty/base/BaseViewModel;", "repo", "Lcom/example/rickandmorty/repository/FilterCharacterRepository;", "(Lcom/example/rickandmorty/repository/FilterCharacterRepository;)V", "filteredList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "getFilteredList", "()Landroidx/lifecycle/MutableLiveData;", "searchJob", "Lkotlinx/coroutines/Job;", "", "pattern", "", "searchDebounced", "searchText", "app_debug"})
public final class SearchCharacterViewModel extends com.example.rickandmorty.base.BaseViewModel {
    private final com.example.rickandmorty.repository.FilterCharacterRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.rickandmorty.local.entity.CharacterEntity>> filteredList = null;
    private kotlinx.coroutines.Job searchJob;
    
    public SearchCharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.repository.FilterCharacterRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.rickandmorty.local.entity.CharacterEntity>> getFilteredList() {
        return null;
    }
    
    private final void getFilteredList(java.lang.String pattern) {
    }
    
    public final void searchDebounced(@org.jetbrains.annotations.Nullable()
    java.lang.String searchText) {
    }
}