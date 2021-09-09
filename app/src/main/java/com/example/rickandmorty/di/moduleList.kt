package com.example.rickandmorty.di

import com.example.rickandmorty.App
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

fun App.initKoin(){
    startKoin {
        androidContext(applicationContext)
        modules(
            listOf(
                networkModule,
                repoModule,
                viewModelModule,
                databaseModule,
                mappersModule
            )
        )
    }
}