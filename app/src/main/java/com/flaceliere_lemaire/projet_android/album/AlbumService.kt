package com.flaceliere_lemaire.projet_android.album

import android.util.Log
import com.flaceliere_lemaire.projet_android.artist.ArtistTheAudioDBAPI
import com.flaceliere_lemaire.projet_android.model.AlbumsDAO
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import com.flaceliere_lemaire.projet_android.theaudiodbapi.TheAudioDBAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class AlbumService {
    var albumTheAudioDBAPI: AlbumTheAudioDBAPI

    init {
        albumTheAudioDBAPI = TheAudioDBAPI.getInstance().create(AlbumTheAudioDBAPI::class.java)
    }

    suspend fun getAlbumByArtistsByName(artistName: String): AlbumsDAO?{
        var albums: AlbumsDAO
        try {
            albums = withContext(Dispatchers.IO){
                albumTheAudioDBAPI.getAlbumByArtistName(artistName).await()
            }

            return albums
        }
        catch (e: Exception){
            Log.d("DEBUG", e.toString())
        }

        return null
    }

    suspend fun getTopAlbums(): LovedAlbumsDAO?{
        var albums: LovedAlbumsDAO
        try {
            albums = withContext(Dispatchers.IO){
                albumTheAudioDBAPI.getTopAlbums().await()
            }

            return albums
        }
        catch (e: Exception){
            Log.d("DEBUG", e.toString())
        }

        return null
    }
}