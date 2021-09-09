package com.example.rickandmorty.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.rickandmorty.ui.characters.paging.CharactersPagingDataSource
import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.mapper.CharactersMapper
import com.example.rickandmorty.mapper.LocalDatabaseMapper
import com.example.rickandmorty.service.CharacterApi
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    suspend fun getAllCharacters(): Flow<PagingData<CharacterEntity>>
}

class CharacterRepositoryImpl(
    private val service: CharacterApi,
    private val mapper: CharactersMapper,
    private val localDatabaseMapper: LocalDatabaseMapper
) : CharacterRepository {

    override suspend fun getAllCharacters(): Flow<PagingData<CharacterEntity>> {
        return Pager(
            config = PagingConfig(pageSize = 20),
            pagingSourceFactory = {
                CharactersPagingDataSource(
                    service,
                    mapper,
                    localDatabaseMapper
                )
            }
        ).flow
    }
}
