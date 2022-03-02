package com.flaceliere_lemaire.projet_android.artist


import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ArtistTheAudioDBAPI {
    @GET("/api/v1/json/523532/search.php?")
    fun getArtistsByName(@Query("s") s : String): Deferred<ArtistsDAO>
}