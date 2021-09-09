package com.example.rickandmorty.di

import com.example.rickandmorty.repository.CharacterRepository
import com.example.rickandmorty.repository.CharacterRepositoryImpl
import com.example.rickandmorty.repository.DetailCharacterRepository
import com.example.rickandmorty.repository.DetailCharacterRepositoryImpl
import com.example.rickandmorty.repository.FilterCharacterRepository
import com.example.rickandmorty.repository.FilterCharacterRepositoryImpl
import org.koin.dsl.bind
import org.koin.dsl.module

val repoModule = module {
    single { CharacterRepositoryImpl(get(), get(), get()) } bind  CharacterRepository::class
    single { FilterCharacterRepositoryImpl(get(), get(), get()) } bind  FilterCharacterRepository::class
    single { DetailCharacterRepositoryImpl(get(), get(), get()) } bind  DetailCharacterRepository::class
}