package com.example.rickandmorty.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.rickandmorty.local.dao.CharacterDao
import com.example.rickandmorty.local.entity.CharacterEntity

@Database(
    version = DATABASE_VERSION,
    entities = [CharacterEntity::class],
    exportSchema = false
)
abstract class RickAndMortyOffline: RoomDatabase() {
    abstract fun getCharacterDao(): CharacterDao
}