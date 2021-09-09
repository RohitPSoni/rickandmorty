package com.example.rickandmorty.di

import androidx.room.Room
import com.example.rickandmorty.local.DATABASE_NAME
import com.example.rickandmorty.local.RickAndMortyOffline
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            get(),
            RickAndMortyOffline::class.java,
            DATABASE_NAME
        ).build()
    }
    single { get<RickAndMortyOffline>().getCharacterDao()  }
}