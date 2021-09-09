package com.example.rickandmorty.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\b\u0010\n\u001a\u00020\u0011H\u0004R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/rickandmorty/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "setErrorMessage", "(Landroidx/lifecycle/MutableLiveData;)V", "showProgress", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getShowProgress", "()Landroidx/databinding/ObservableField;", "hideProgress", "", "showErrorMessage", "message", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Integer> showProgress = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getShowProgress() {
        return null;
    }
    
    protected final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    public final void showErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
}