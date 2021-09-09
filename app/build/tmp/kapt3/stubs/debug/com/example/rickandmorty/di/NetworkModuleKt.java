package com.example.rickandmorty.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\f"}, d2 = {"networkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "provideExchangeApi", "Lcom/example/rickandmorty/service/CharacterApi;", "retrofit", "Lretrofit2/Retrofit;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "app_debug"})
public final class NetworkModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module networkModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.rickandmorty.service.CharacterApi provideExchangeApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}