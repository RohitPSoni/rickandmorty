package com.example.rickandmorty.di

import com.example.rickandmorty.BuildConfig
import com.example.rickandmorty.service.CharacterApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    factory { provideOkHttpClient() }
    factory { provideExchangeApi(get()) }
    single { provideRetrofit(get()) }
}

fun provideOkHttpClient(): OkHttpClient {
    val client = OkHttpClient().newBuilder()
    if (BuildConfig.DEBUG) {
        val logger = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        client.addInterceptor(logger)
    }
    return client.build()
}

fun provideExchangeApi(retrofit: Retrofit): CharacterApi = retrofit.create(CharacterApi::class.java)

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Builder().baseUrl(BuildConfig.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
