package com.example.rickandmorty.di

import com.example.rickandmorty.mapper.CharacterDetailMapper
import com.example.rickandmorty.mapper.CharacterDetailMapperImpl
import com.example.rickandmorty.mapper.CharactersMapper
import com.example.rickandmorty.mapper.CharactersMapperImpl
import com.example.rickandmorty.mapper.LocalDatabaseMapper
import com.example.rickandmorty.mapper.LocalDatabaseMapperImpl
import com.example.rickandmorty.repository.DetailCharacterRepositoryImpl
import org.koin.dsl.bind
import org.koin.dsl.module

val mappersModule = module {
    single { CharactersMapperImpl() } bind CharactersMapper::class
    single { LocalDatabaseMapperImpl(get()) } bind LocalDatabaseMapper::class
    single { CharacterDetailMapperImpl() } bind CharacterDetailMapper::class
}