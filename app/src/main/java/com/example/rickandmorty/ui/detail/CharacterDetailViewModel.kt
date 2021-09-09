package com.example.rickandmorty.ui.detail

import androidx.databinding.ObservableField
import com.example.rickandmorty.base.BaseViewModel
import com.example.rickandmorty.local.entity.CharacterEntity

class CharacterDetailViewModel : BaseViewModel() {
    val characterData = ObservableField<CharacterEntity>()

    fun setCharacter(character: CharacterEntity){
        characterData.set(character)
    }
}