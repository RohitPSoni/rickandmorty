package com.example.rickandmorty.base

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {
    protected lateinit var viewBinding: VB

    abstract fun getViewModel(): ViewModel?

    @LayoutRes
    abstract fun getLayoutId(): Int

    open fun bindData() {

    }

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, getLayoutId())
        getViewModel()?.let {
            with(viewBinding) {
                setVariable(androidx.databinding.library.baseAdapters.BR.viewModel, it)
                lifecycleOwner = this@BaseActivity
            }
        }
        bindData()
    }
}