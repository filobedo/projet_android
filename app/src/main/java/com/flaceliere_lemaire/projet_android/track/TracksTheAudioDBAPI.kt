package com.flaceliere_lemaire.projet_android.track;

import com.flaceliere_lemaire.projet_android.model.AlbumsDAO;

import kotlinx.coroutines.Deferred;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface TracksTheAudioDBAPI {

    @GET("/api/v1/json/523532/mostloved.php?format=track")
    fun getTopTracksAsync(): Deferred<TracksDAO>
}
