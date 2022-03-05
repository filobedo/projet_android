package com.flaceliere_lemaire.projet_android.track;

import com.google.gson.annotations.SerializedName

public class TracksDAO(
    @SerializedName("loved")
    val tracks: List<TrackDAO>
    ) {}


    data class TrackDAO(
        @SerializedName("idTrack")
        val idTrack: String? = null,

        @SerializedName("idAlbum")
        val idAlbum: String? = null,

        @SerializedName("idArtist")
        val idArtist: String? = null,

        @SerializedName("idLyric")
        val idLyric: String? = null,

        @SerializedName("idIMVDB")
        val idIMVDB: String? = null,

        @SerializedName("strTrack")
        val strTrack: String? = null,

        @SerializedName("strAlbum")
        val strAlbum: String? = null,

        @SerializedName("strArtist")
        val strArtist: String? = null,

        @SerializedName("strArtistAlternate")
        val strArtistAlternate: String? = null,

        @SerializedName("intCD")
        val intCD: String? = null,

        @SerializedName("intDuration")
        val intDuration: String? = null,

        @SerializedName("strGenre")
        val strGenre: String? = null,

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

        @SerializedName("strTrackThumb")
        val strTrackThumb: String? = null,

        @SerializedName("strTrack3DCase")
        val strTrack3DCase: String? = null,

        @SerializedName("strTrackLyrics")
        val strTrackLyrics: String? = null,

        @SerializedName("strMusicVid")
        val strMusicVid: String? = null,

        @SerializedName("strMusicVidDirector")
        val strMusicVidDirector: String? = null,

        @SerializedName("strMusicVidCompany")
        val strMusicVidCompany: String? = null,

        @SerializedName("strMusicVidScreen1")
        val strMusicVidScreen1: String? = null,

        @SerializedName("strMusicVidScreen2")
        val strMusicVidScreen2: String? = null,

        @SerializedName("strMusicVidScreen3")
        val strMusicVidScreen3: String? = null,

        @SerializedName("intMusicVidViews")
        val intMusicVidViews: String? = null,

        @SerializedName("intMusicVidLikes")
        val intMusicVidLikes: String? = null,

        @SerializedName("intMusicVidDislikes")
        val intMusicVidDislikes: String? = null,

        @SerializedName("intMusicVidFavorites")
        val intMusicVidFavorites: String? = null,

        @SerializedName("intMusicVidComments")
        val intMusicVidComments: String? = null,

        @SerializedName("intTrackNumber")
        val intTrackNumber: String? = null,

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
    )
