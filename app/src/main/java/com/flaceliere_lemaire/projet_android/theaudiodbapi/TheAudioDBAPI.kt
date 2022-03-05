package com.flaceliere_lemaire.projet_android.theaudiodbapi

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.Authenticator
import okhttp3.OkHttpClient


object TheAudioDBAPI {
    private val baseUrl = "https://www.theaudiodb.com/"

    fun getInstance(): Retrofit {

        return Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(
                CoroutineCallAdapterFactory()
            )
            .build()
    }
}