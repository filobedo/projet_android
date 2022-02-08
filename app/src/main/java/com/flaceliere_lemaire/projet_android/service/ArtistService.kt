package com.flaceliere_lemaire.projet_android.service

import com.flaceliere_lemaire.projet_android.model.ArtistModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ArtistService {
        @GET("api/v1/json/2/search.php/?s=coldplay")
        fun getArtist(): Call<ArtistModel> //@Path("s") employeeId: String


        companion object {

                var BASE_URL = "https://www.theaudiodb.com/"

                fun create() : ArtistService {

                        val retrofit = Retrofit.Builder()
                                .addConverterFactory(GsonConverterFactory.create())
                                .baseUrl(BASE_URL)
                                .build()
                        return retrofit.create(ArtistService::class.java)

                }
        }
}