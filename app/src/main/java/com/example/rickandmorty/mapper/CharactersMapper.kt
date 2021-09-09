package com.example.rickandmorty.mapper

import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.service.model.Character

interface CharactersMapper {

    suspend fun invoke(characterList: List<Character>): List<CharacterEntity>
}

class CharactersMapperImpl : CharactersMapper {

    override suspend fun invoke(characterList: List<Character>): List<CharacterEntity> {
        val entityData = mutableListOf<CharacterEntity>()
        characterList.forEach {
            entityData.add(
                CharacterEntity(
                    id = it.id,
                    name = it.name,
                    status = it.status,
                    imageURL = it.image,
                    gender = it.gender
                )
            )
        }

        return entityData
    }
}