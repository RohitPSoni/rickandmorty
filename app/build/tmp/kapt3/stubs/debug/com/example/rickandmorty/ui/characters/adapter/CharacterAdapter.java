package com.example.rickandmorty.ui.characters.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0016B=\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/rickandmorty/ui/characters/adapter/CharacterAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "Lcom/example/rickandmorty/ui/characters/adapter/CharacterAdapter$CharacterViewHolder;", "callback", "Lkotlin/Function2;", "Lcom/example/rickandmorty/databinding/ItemCharacterBinding;", "Lkotlin/ParameterName;", "name", "binding", "character", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CharacterComparator", "CharacterViewHolder", "app_debug"})
public final class CharacterAdapter extends androidx.paging.PagingDataAdapter<com.example.rickandmorty.local.entity.CharacterEntity, com.example.rickandmorty.ui.characters.adapter.CharacterAdapter.CharacterViewHolder> {
    private final kotlin.jvm.functions.Function2<com.example.rickandmorty.databinding.ItemCharacterBinding, com.example.rickandmorty.local.entity.CharacterEntity, kotlin.Unit> callback = null;
    
    public CharacterAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.rickandmorty.databinding.ItemCharacterBinding, ? super com.example.rickandmorty.local.entity.CharacterEntity, kotlin.Unit> callback) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.rickandmorty.ui.characters.adapter.CharacterAdapter.CharacterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.ui.characters.adapter.CharacterAdapter.CharacterViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/rickandmorty/ui/characters/adapter/CharacterAdapter$CharacterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/rickandmorty/databinding/ItemCharacterBinding;", "(Lcom/example/rickandmorty/ui/characters/adapter/CharacterAdapter;Lcom/example/rickandmorty/databinding/ItemCharacterBinding;)V", "bind", "Landroidx/appcompat/widget/AppCompatImageView;", "item", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "app_debug"})
    public final class CharacterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.rickandmorty.databinding.ItemCharacterBinding binding = null;
        
        public CharacterViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.databinding.ItemCharacterBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatImageView bind(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.local.entity.CharacterEntity item) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/rickandmorty/ui/characters/adapter/CharacterAdapter$CharacterComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/rickandmorty/local/entity/CharacterEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class CharacterComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.rickandmorty.local.entity.CharacterEntity> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.rickandmorty.ui.characters.adapter.CharacterAdapter.CharacterComparator INSTANCE = null;
        
        private CharacterComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.local.entity.CharacterEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.local.entity.CharacterEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.local.entity.CharacterEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.local.entity.CharacterEntity newItem) {
            return false;
        }
    }
}