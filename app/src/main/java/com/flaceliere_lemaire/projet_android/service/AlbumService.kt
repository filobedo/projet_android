package com.flaceliere_lemaire.projet_android.service

import com.flaceliere_lemaire.projet_android.model.AlbumsModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface AlbumService {
    @GET("api/v1/json/523532//album.php?i=112024")
    fun getAlbum(): Call<AlbumsModel> //@Path("s") employeeId: String


    companion object {

        var BASE_URL = "https://theaudiodb.com/"

        fun create() : AlbumService {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(AlbumService::class.java)

        }
    }
}