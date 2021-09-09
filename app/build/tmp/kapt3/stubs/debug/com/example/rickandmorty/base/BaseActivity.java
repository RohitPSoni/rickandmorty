package com.example.rickandmorty.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\'J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0015R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/example/rickandmorty/base/BaseActivity;", "VB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewBinding", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "bindData", "", "getLayoutId", "", "getViewModel", "Landroidx/lifecycle/ViewModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<VB extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    protected VB viewBinding;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getViewBinding() {
        return null;
    }
    
    protected final void setViewBinding(@org.jetbrains.annotations.NotNull()
    VB p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.ViewModel getViewModel();
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public void bindData() {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}