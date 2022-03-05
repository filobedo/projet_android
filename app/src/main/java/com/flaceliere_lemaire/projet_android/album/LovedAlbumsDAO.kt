package com.flaceliere_lemaire.projet_android.album;

import com.flaceliere_lemaire.projet_android.model.AlbumDAO;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LovedAlbumsDAO (
    @SerializedName("loved")
    val album:List<LovedAlbumDAO>
) {}

    data class LovedAlbumDAO(
            @SerializedName("idTrack")
            val idTrack: String? = null,

            @SerializedName("idAlbum")
            val idAlbum: String? = null,

            @SerializedName("idArtist")
            val idArtist: String? = null,

            @SerializedName("idIMVDB")
            val idIMVDB: String? = null,

            @SerializedName("idLyric")
            val idLyric: String? = null,

            @SerializedName("strAlbum")
            val strAlbum: String? = null,

            @SerializedName("strTrack")
            val strTrack: String? = null,

            @SerializedName("strArtist")
            val strArtist: String? = null,

            @SerializedName("strArtistAlternate")
            val strArtistAlternate: String? = null,

            @SerializedName("strMood")
            val strMood: String? = null,

            @SerializedName("strStyle")
            val strStyle: String? = null,

            @SerializedName("strTheme")
            val strTheme: String? = null,

            @SerializedName("strDescription")
            val strDescription: String? = null,

            @SerializedName("strDescriptionDE")
            val strDescriptionDE: String? = null,

            @SerializedName("strDescriptionFR")
            val strDescriptionFR: String? = null,

            @SerializedName("strDescriptionCN")
            val strDescriptionCN: String? = null,

            @SerializedName("strDescriptionIT")
            val strDescriptionIT: String? = null,

            @SerializedName("strDescriptionJP")
            val strDescriptionJP: String? = null,

            @SerializedName("strDescriptionRU")
            val strDescriptionRU: String? = null,

            @SerializedName("strDescriptionES")
            val strDescriptionES: String? = null,

            @SerializedName("strDescriptionPT")
            val strDescriptionPT: String? = null,

            @SerializedName("strDescriptionSE")
            val strDescriptionSE: String? = null,

            @SerializedName("strDescriptionNL")
            val strDescriptionNL: String? = null,

            @SerializedName("strDescriptionHU")
            val strDescriptionHU: String? = null,

            @SerializedName("strDescriptionNO")
            val strDescriptionNO: String? = null,

            @SerializedName("strDescriptionIL")
            val strDescriptionIL: String? = null,

            @SerializedName("strDescriptionPL")
            val strDescriptionPL: String? = null,

            @SerializedName("intLoved")
            val intLoved: String? = null,

            @SerializedName("intScore")
            val intScore: String? = null,

            @SerializedName("intScoreVotes")
            val intScoreVotes: String? = null,

            @SerializedName("intTotalListeners")
            val intTotalListeners: String? = null,

            @SerializedName("intTotalPlays")
            val intTotalPlays: String? = null,

            @SerializedName("strMusicBrainzID")
            val strMusicBrainzID: String? = null,

            @SerializedName("strMusicBrainzAlbumID")
            val strMusicBrainzAlbumID: String? = null,

            @SerializedName("strMusicBrainzArtistID")
            val strMusicBrainzArtistID: String? = null,

            @SerializedName("intDuration")
            val intDuration: String? = null,

            @SerializedName("strGenre")
            val strGenre: String? = null,

            @SerializedName("strLocked")
            val strLocked: String? = null,
    )