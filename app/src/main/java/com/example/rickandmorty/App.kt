package com.example.rickandmorty

import androidx.multidex.MultiDexApplication
import com.example.rickandmorty.di.initKoin

class App : MultiDexApplication(){

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}