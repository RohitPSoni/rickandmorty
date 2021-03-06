package com.example.rickandmorty.service

import com.example.rickandmorty.service.model.Character
import com.example.rickandmorty.service.model.CharactersData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterApi {

    @GET("character/")
    suspend fun getAllCharacters(
        @Query("page") page: Int,
    ): CharactersData

    @GET("character/")
    suspend fun getFilteredCharacters(
        @Query("name") name: String,
    ): CharactersData

    @GET("character/{id}")
    suspend fun getCharacterDetail(
        @Path("id") id: Int
    ): Character
}