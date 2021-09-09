package com.example.rickandmorty.ui.characters.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\u0012B\u0019\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/rickandmorty/ui/characters/adapter/PagingLoadStateAdapter;", "T", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/paging/LoadStateAdapter;", "Lcom/example/rickandmorty/ui/characters/adapter/PagingLoadStateAdapter$NetworkStateItemViewHolder;", "adapter", "Landroidx/paging/PagingDataAdapter;", "(Landroidx/paging/PagingDataAdapter;)V", "onBindViewHolder", "", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "NetworkStateItemViewHolder", "app_debug"})
public final class PagingLoadStateAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.paging.LoadStateAdapter<com.example.rickandmorty.ui.characters.adapter.PagingLoadStateAdapter.NetworkStateItemViewHolder> {
    private final androidx.paging.PagingDataAdapter<T, VH> adapter = null;
    
    public PagingLoadStateAdapter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingDataAdapter<T, VH> adapter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.rickandmorty.ui.characters.adapter.PagingLoadStateAdapter.NetworkStateItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.ui.characters.adapter.PagingLoadStateAdapter.NetworkStateItemViewHolder holder, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/rickandmorty/ui/characters/adapter/PagingLoadStateAdapter$NetworkStateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/rickandmorty/databinding/ItemNetworkStateBinding;", "retryCallback", "Lkotlin/Function0;", "", "(Lcom/example/rickandmorty/databinding/ItemNetworkStateBinding;Lkotlin/jvm/functions/Function0;)V", "bind", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
    public static final class NetworkStateItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.rickandmorty.databinding.ItemNetworkStateBinding binding = null;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> retryCallback = null;
        
        public NetworkStateItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.rickandmorty.databinding.ItemNetworkStateBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retryCallback) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
    }
}