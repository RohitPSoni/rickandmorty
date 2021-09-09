package com.example.rickandmorty.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickandmorty.local.entity.CharacterEntity

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(list: List<CharacterEntity>)

    @Query("SELECT * FROM `CharacterEntity`")
    suspend fun getAllCharacters(): List<CharacterEntity>?

    @Query("SELECT * FROM `CharacterEntity` WHERE id = :id")
    suspend fun getCharacterFromId(id: Int): CharacterEntity?

    @Query("SELECT * FROM `CharacterEntity` WHERE name LIKE '%' || :namePattern ||'%'")
    suspend fun getFilteredName(namePattern: String): List<CharacterEntity>?
}