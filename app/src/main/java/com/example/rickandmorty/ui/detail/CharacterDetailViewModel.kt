package com.example.rickandmorty.ui.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.base.BaseViewModel
import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.repository.DetailCharacterRepository
import kotlinx.coroutines.launch

class CharacterDetailViewModel(private val repo: DetailCharacterRepository) : BaseViewModel() {

    val characterData = MutableLiveData<CharacterEntity>()

    fun getCharacter(id: Int) {
        viewModelScope.launch {
            runCatching {
                characterData.postValue(repo.getDetailCharacter(id))
            }.getOrElse {
                showErrorMessage(it.localizedMessage)
            }
            hideProgress()
        }
    }
}