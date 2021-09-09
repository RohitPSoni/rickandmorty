package com.example.rickandmorty.repository

import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.mapper.CharacterDetailMapper
import com.example.rickandmorty.mapper.LocalDatabaseMapper
import com.example.rickandmorty.service.CharacterApi

interface DetailCharacterRepository {

    suspend fun getDetailCharacter(id: Int): CharacterEntity
}

class DetailCharacterRepositoryImpl(
    private val service: CharacterApi,
    private val mapper: CharacterDetailMapper,
    private val localDatabaseMapper: LocalDatabaseMapper
) : DetailCharacterRepository {

    override suspend fun getDetailCharacter(id: Int): CharacterEntity {
        return runCatching {
            mapper.invoke(service.getCharacterDetail(id))
        }.getOrElse {
            localDatabaseMapper.getCharacterById(id) ?: throw it
        }
    }
}