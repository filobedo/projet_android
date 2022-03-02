package com.flaceliere_lemaire.projet_android.album

import com.flaceliere_lemaire.projet_android.model.AlbumsDAO
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumTheAudioDBAPI {
    @GET("/api/v1/json/523532/searchalbum.php?")
    fun getAlbumByArtistName(@Query("s") s : String): Deferred<AlbumsDAO>
}