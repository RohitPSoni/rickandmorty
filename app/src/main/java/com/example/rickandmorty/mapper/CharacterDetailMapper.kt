package com.example.rickandmorty.mapper

import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.service.model.Character

interface CharacterDetailMapper {

    suspend fun invoke(p1: Character): CharacterEntity
}

class CharacterDetailMapperImpl : CharacterDetailMapper {

    override suspend fun invoke(p1: Character): CharacterEntity {
        return CharacterEntity(
            id = p1.id,
            name = p1.name,
            imageURL = p1.image,
            gender = p1.gender,
            status = p1.status
        ).apply {
            spacies = p1.species
            location = p1.location.name
            url = p1.url
            episodes = p1.episode
        }
    }
}