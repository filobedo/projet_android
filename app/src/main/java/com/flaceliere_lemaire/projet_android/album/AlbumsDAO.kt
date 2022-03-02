package com.flaceliere_lemaire.projet_android.model

import com.google.gson.annotations.SerializedName

data class AlbumsDAO(
    @SerializedName("album")
    val album: List<AlbumDAO>
) {}


data class AlbumDAO(
    @SerializedName("idAlbum")
    val idAlbum: String? = null,

    @SerializedName("idArtist")
    val idArtist: String? = null,

    @SerializedName("idLabel")
    val idLabel: String? = null,

    @SerializedName("strAlbum")
    val strAlbum: String? = null,

    @SerializedName("strAlbumStripped")
    val strAlbumStripped: String? = null,

    @SerializedName("strArtist")
    val strArtist: String? = null,

    @SerializedName("strArtistStripped")
    val strArtistStripped: String? = null,

    @SerializedName("intYearReleased")
    val intYearReleased: String? = null,

    @SerializedName("strStyle")
    val strStyle: String? = null,

    @SerializedName("strGenre")
    val strGenre: String? = null,

    @SerializedName("strLabel")
    val strLabel: String? = null,

    @SerializedName("strReleaseFormat")
    val strReleaseFormat: String? = null,

    @SerializedName("intSales")
    val intSales: String? = null,

    @SerializedName("strAlbumThumb")
    val strAlbumThumb: String? = null,

    @SerializedName("strAlbumThumbHQ")
    val strAlbumThumbHQ: String? = null,

    @SerializedName("strAlbumThumbBack")
    val strAlbumThumbBack: String? = null,

    @SerializedName("strAlbumCDart")
    val strAlbumCDart: String? = null,

    @SerializedName("strAlbumSpine")
    val strAlbumSpine: String? = null,

    @SerializedName("strAlbum3DCase")
    val strAlbum3DCase: String? = null,

    @SerializedName("strAlbum3DFlat")
    val strAlbum3DFlat: String? = null,

    @SerializedName("strAlbum3DFace")
    val strAlbum3DFace: String? = null,

    @SerializedName("strAlbum3DThumb")
    val strAlbum3DThumb: String? = null,

    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String? = null,

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

    @SerializedName("strReview")
    val strReview: String? = null,

    @SerializedName("strMood")
    val strMood: String? = null,

    @SerializedName("strTheme")
    val strTheme: String? = null,

    @SerializedName("strSpeed")
    val strSpeed: String? = null,

    @SerializedName("strLocation")
    val strLocation: String? = null,

    @SerializedName("strMusicBrainzID")
    val strMusicBrainzID: String? = null,

    @SerializedName("strMusicBrainzArtistID")
    val strMusicBrainzArtistID: String? = null,

    @SerializedName("strAllMusicID")
    val strAllMusicID: String? = null,

    @SerializedName("strBBCReviewID")
    val strBBCReviewID: String? = null,

    @SerializedName("strRateYourMusicID")
    val strRateYourMusicID: String? = null,

    @SerializedName("strDiscogsID")
    val strDiscogsID: String? = null,

    @SerializedName("strWikidataID")
    val strWikidataID: String? = null,

    @SerializedName("strWikipediaID")
    val strWikipediaID: String? = null,

    @SerializedName("strGeniusID")
    val strGeniusID: String? = null,

    @SerializedName("strLyricWikiID")
    val strLyricWikiID: String? = null,

    @SerializedName("strItunesID")
    val strItunesID: String? = null,

    @SerializedName("strAmazonID")
    val strAmazonID: String? = null,

    @SerializedName("strLocked")
    val strLocked: String? = null
)