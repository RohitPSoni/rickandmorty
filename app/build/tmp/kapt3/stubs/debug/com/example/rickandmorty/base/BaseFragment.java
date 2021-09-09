package com.example.rickandmorty.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\'J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/example/rickandmorty/base/BaseFragment;", "VB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_viewBinder", "Landroidx/databinding/ViewDataBinding;", "viewBinder", "getViewBinder", "()Landroidx/databinding/ViewDataBinding;", "bindData", "", "getLayoutId", "", "getViewModel", "Landroidx/lifecycle/ViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showError", "errorCause", "", "app_debug"})
public abstract class BaseFragment<VB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    private VB _viewBinder;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getViewBinder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.ViewModel getViewModel();
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public void bindData() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void showError(java.lang.String errorCause) {
    }
}