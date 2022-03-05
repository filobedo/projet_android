package com.flaceliere_lemaire.projet_android.artist

import android.util.Log
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import com.flaceliere_lemaire.projet_android.theaudiodbapi.TheAudioDBAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception


class ArtistService(

){
    var artistTheAudioDBAPI: ArtistTheAudioDBAPI

    init {
        artistTheAudioDBAPI = TheAudioDBAPI.getInstance().create(ArtistTheAudioDBAPI::class.java)
    }

    suspend fun getArtistsByName(artistName: String): ArtistsDAO?{
        var artists: ArtistsDAO
        try {
            artists = withContext(Dispatchers.IO){
                artistTheAudioDBAPI.getArtistsByName(artistName).await()
            }

            return artists
        }
        catch (e: Exception){
            Log.d("DEBUG", e.toString())
        }

        return null
    }
}

// GlobalScope.launch (Dispatchers.Main){  }
//                var artistTheAudioDBAPI = TheAudioDBAPI.getInstance().create(ArtistTheAudioDBAPI::class.java)
//                var call = artistTheAudioDBAPI.getArtists()
//                Log.d("DEBUG URL", artistTheAudioDBAPI.getArtists().request().url.toString());
//
//                call.enqueue(object: Callback<ArtistsDAO> {
//                        override fun onResponse(
//                                call: Call<ArtistsDAO>,
//                                response: Response<ArtistsDAO>
//                        ) {
//                                if (response?.isSuccessful) {
//                                        Log.d("DEBUG : OK", response.body().toString())
//                                        var artits: ArtistsDAO? = response.body()
//                                } else {
//                                        Log.d("DEBUG : KO", response.toString())
//                                }
//                        }
//
//                        override fun onFailure(call: Call<ArtistsDAO>, t: Throwable) {
//                                Log.d("DEBUFG", t.toString())
//                                return
//                        }
//                })