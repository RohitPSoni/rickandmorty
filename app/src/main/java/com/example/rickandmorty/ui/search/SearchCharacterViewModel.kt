package com.example.rickandmorty.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.base.BaseViewModel
import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.repository.FilterCharacterRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SearchCharacterViewModel(private val repo: FilterCharacterRepository) : BaseViewModel() {

    val filteredList = MutableLiveData<List<CharacterEntity>>()

    private var searchJob: Job? = null

    private fun getFilteredList(pattern: String) {
        viewModelScope.launch {
            filteredList.postValue(repo.getFilteredCharacters(pattern))
            hideProgress()
        }
    }

    fun searchDebounced(searchText: String?) {
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            delay(500)
            searchText?.let {
                if (it.length > 2) {
                    getFilteredList(it)
                }
            }
        }
    }
}