package com.flaceliere_lemaire.projet_android.track;

import android.util.Log
import com.flaceliere_lemaire.projet_android.theaudiodbapi.TheAudioDBAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

public class TracksService {
    var tracksTheAudioDBAPI: TracksTheAudioDBAPI = TheAudioDBAPI.getInstance().create(TracksTheAudioDBAPI::class.java)

    suspend fun getTopTracks(): TracksDAO?{
        var tracks: TracksDAO
        try {
            tracks = withContext(Dispatchers.IO){
                tracksTheAudioDBAPI.getTopTracksAsync().await()
            }

            return tracks
        }
        catch (e: Exception){
            Log.d("DEBUG", e.toString())
        }

        return null
    }
}
