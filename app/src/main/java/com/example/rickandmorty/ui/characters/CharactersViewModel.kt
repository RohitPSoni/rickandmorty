package com.example.rickandmorty.ui.characters

import android.util.Log
import android.view.View
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.rickandmorty.R
import com.example.rickandmorty.base.BaseViewModel
import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val characterRepository: CharacterRepository
) : BaseViewModel() {

    lateinit var charactersFlow: Flow<PagingData<CharacterEntity>>

    init {
        showProgress()
        getAllCharacters()
    }

    private fun getAllCharacters() {
        viewModelScope.launch {
            Log.e("fatal", "Launched..... VM")
            runCatching {
                charactersFlow = characterRepository.getAllCharacters().cachedIn(viewModelScope)
                hideProgress()
            }.getOrElse {
                showErrorMessage(it.localizedMessage)
                hideProgress()
            }
        }
    }

    fun onSearchClicked(view: View){
        view.findNavController().navigate(R.id.action_charactersFragment_to_searchCharacterFragment)
    }
}