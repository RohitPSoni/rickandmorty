package com.example.rickandmorty.di

import com.example.rickandmorty.mapper.CharactersMapper
import com.example.rickandmorty.mapper.CharactersMapperImpl
import com.example.rickandmorty.mapper.LocalDatabaseMapper
import com.example.rickandmorty.mapper.LocalDatabaseMapperImpl
import org.koin.dsl.bind
import org.koin.dsl.module

val mappersModule = module {
    single { CharactersMapperImpl() } bind CharactersMapper::class
    single { LocalDatabaseMapperImpl(get()) } bind LocalDatabaseMapper::class
}