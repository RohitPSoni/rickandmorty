package com.example.rickandmorty.service.model

import com.google.gson.annotations.SerializedName

data class CharactersData(
    @SerializedName("info") val pageInfo: PageInfo,
    @SerializedName("results") val results: List<Character>
)
data class PageInfo(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)