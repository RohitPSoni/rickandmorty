package com.example.rickandmorty.local.entity

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
@Entity
data class CharacterEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val imageURL: String?,
    val status: String,
    val gender: String
): Parcelable