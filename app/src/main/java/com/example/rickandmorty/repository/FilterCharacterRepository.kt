package com.example.rickandmorty.repository

import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.mapper.CharactersMapper
import com.example.rickandmorty.mapper.LocalDatabaseMapper
import com.example.rickandmorty.service.CharacterApi

interface FilterCharacterRepository {
    suspend fun getFilteredCharacters(pattern: String): List<CharacterEntity>
}

class FilterCharacterRepositoryImpl(
    private val service: CharacterApi,
    private val mapper: CharactersMapper,
    private val localDatabaseMapper: LocalDatabaseMapper
): FilterCharacterRepository{
    override suspend fun getFilteredCharacters(pattern: String): List<CharacterEntity> {
        return runCatching {
            mapper.invoke(service.getFilteredCharacters(pattern).results)
        }.getOrElse {
            localDatabaseMapper.getNameByPattern(pattern) ?: emptyList()
        }
    }
}