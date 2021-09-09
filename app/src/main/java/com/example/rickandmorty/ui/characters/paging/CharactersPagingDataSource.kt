package com.example.rickandmorty.ui.characters.paging

import androidx.paging.PagingSource
import androidx.paging.PagingSource.LoadResult.Page
import androidx.paging.PagingState
import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.mapper.CharactersMapper
import com.example.rickandmorty.mapper.LocalDatabaseMapper
import com.example.rickandmorty.service.CharacterApi

class CharactersPagingDataSource(
    private val service: CharacterApi,
    private val mapper: CharactersMapper,
    private val localDatabaseMapper: LocalDatabaseMapper
) : PagingSource<Int, CharacterEntity>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CharacterEntity> {
        val pageNumber = params.key ?: 1
        return runCatching {
            val response = service.getAllCharacters(pageNumber)
            val data = mapper.invoke(response.results)
            localDatabaseMapper.insertDataIntoDatabase(data)
            val nextPageNumber = response.pageInfo.next?.let {
                pageNumber + 1
            } ?: run { null }
            val prevPageNo = response.pageInfo.prev?.let {
                pageNumber - 1
            } ?: run {
                null
            }
            Page(
                data = data,
                prevKey = prevPageNo,
                nextKey = nextPageNumber
            )
        }.getOrElse {
            val cachedData = localDatabaseMapper.getAllInfo()
            cachedData?.let { data ->
                Page(
                    data = data,
                    prevKey = null,
                    nextKey = null
                )
            } ?: run {
                LoadResult.Error(it)
            }
        }
    }

    override fun getRefreshKey(state: PagingState<Int, CharacterEntity>): Int = 1
}