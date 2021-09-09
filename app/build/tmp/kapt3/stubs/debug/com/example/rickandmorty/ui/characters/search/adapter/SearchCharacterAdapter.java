package com.example.rickandmorty.ui.characters.search.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R>\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/rickandmorty/ui/characters/search/adapter/SearchCharacterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/rickandmorty/ui/characters/search/adapter/SearchCharacterAdapter$SearchCharacterViewHolder;", "callback", "Lkotlin/Function2;", "Lcom/example/rickandmorty/databinding/ItemCharacterBinding;", "Lkotlin/ParameterName;", "name", "binding", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "character", "", "(Lkotlin/jvm/functions/Function2;)V", "filteredList", "", "addData", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchCharacterViewHolder", "app_debug"})
public final class SearchCharacterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.rickandmorty.ui.characters.search.adapter.SearchCharacterAdapter.SearchCharacterViewHolder> {
    private final kotlin.jvm.functions.Function2<com.example.rickandmorty.databinding.ItemCharacterBinding, com.example.rickandmorty.local.entity.CharacterEntity, kotlin.Unit> callback = null;
    private final java.util.List<com.example.rickandmorty.local.entity.CharacterEntity> filteredList = null;
    
    public SearchCharacterAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.rickandmorty.databinding.ItemCharacterBinding, ? super com.example.rickandmorty.local.entity.CharacterEntity, kotlin.Unit> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.rickandmorty.ui.characters.search.adapter.SearchCharacterAdapter.SearchCharacterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.ui.characters.search.adapter.SearchCharacterAdapter.SearchCharacterViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.rickandmorty.local.entity.CharacterEntity> list) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/rickandmorty/ui/characters/search/adapter/SearchCharacterAdapter$SearchCharacterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/rickandmorty/databinding/ItemCharacterBinding;", "(Lcom/example/rickandmorty/ui/characters/search/adapter/SearchCharacterAdapter;Lcom/example/rickandmorty/databinding/ItemCharacterBinding;)V", "bind", "", "item", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "app_debug"})
    public final class SearchCharacterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.rickandmorty.databinding.ItemCharacterBinding binding = null;
        
        public SearchCharacterViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.databinding.ItemCharacterBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.local.entity.CharacterEntity item) {
        }
    }
}