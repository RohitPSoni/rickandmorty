package com.example.rickandmorty.local.entity

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity
data class CharacterEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val imageURL: String?,
    val status: String?,
    val gender: String?
) {
    @Ignore var spacies = ""

    @Ignore var location = ""

    @Ignore var url = ""

    @Ignore var episodes : List<String>? = null
}