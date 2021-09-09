package com.example.rickandmorty.mapper

import com.example.rickandmorty.local.dao.CharacterDao
import com.example.rickandmorty.local.entity.CharacterEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

interface LocalDatabaseMapper {

    suspend fun insertDataIntoDatabase(list: List<CharacterEntity>)

    suspend fun getNameByPattern(pattern: String): List<CharacterEntity>?

    suspend fun getAllInfo(): List<CharacterEntity>?

    suspend fun getCharacterById(id: Int): CharacterEntity?
}

class LocalDatabaseMapperImpl(private val dao: CharacterDao) : LocalDatabaseMapper {

    override suspend fun insertDataIntoDatabase(list: List<CharacterEntity>) {
        val deferred = withContext(context = Dispatchers.IO) {
            async {
                dao.insertCharacters(list)
            }
        }
        deferred.await()
    }

    override suspend fun getNameByPattern(pattern: String): List<CharacterEntity>? {
        return dao.getFilteredName(pattern)
    }

    override suspend fun getAllInfo(): List<CharacterEntity>? {
        return dao.getAllCharacters()
    }

    override suspend fun getCharacterById(id: Int): CharacterEntity? {
        return dao.getCharacterFromId(id)
    }
}