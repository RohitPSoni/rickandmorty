package com.example.rickandmorty.di

import com.example.rickandmorty.ui.characters.CharactersViewModel
import com.example.rickandmorty.ui.search.SearchCharacterViewModel
import com.example.rickandmorty.ui.detail.CharacterDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { CharactersViewModel(get()) }
    viewModel { CharacterDetailViewModel(get()) }
    viewModel { SearchCharacterViewModel(get()) }
}