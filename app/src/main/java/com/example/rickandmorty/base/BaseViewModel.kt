package com.example.rickandmorty.base

import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    var errorMessage = MutableLiveData<String?>()
    val showProgress = ObservableField(View.VISIBLE)

    protected fun showProgress(){
        showProgress.set(View.VISIBLE)
    }

    fun hideProgress(){
        showProgress.set(View.GONE)
    }

    fun showErrorMessage(message: String?){
        errorMessage.postValue(message)
    }
}