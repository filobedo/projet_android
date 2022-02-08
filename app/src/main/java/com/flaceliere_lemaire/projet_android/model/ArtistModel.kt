package com.flaceliere_lemaire.projet_android.model

import com.google.gson.annotations.SerializedName

data class ArtistModel (
    @SerializedName("artists") val artists: List<Artist>,
//    val title: String
    ) {

}


data class Artist (
    @SerializedName("idArtist")
    val idArtist: String? = null,

    @SerializedName("strArtist")
    val strArtist: String? = null,

    @SerializedName("strArtistStripped")
    val strArtistStripped: String? = null,

    @SerializedName("strArtistAlternate")
    val strArtistAlternate: String? = null,

    @SerializedName("strLabel")
    val strLabel: String? = null,

    @SerializedName("idLabel")
    val idLabel: String? = null,

    @SerializedName("intFormedYear")
    val intFormedYear: String? = null,

    @SerializedName("intDiedYear")
    val intDiedYear: String? = null,

    @SerializedName("strDisbanded")
    val strDisbanded: String? = null,

    @SerializedName("strStyle")
    val strStyle: String? = null,

    @SerializedName("strGenre")
    val strGenre: String? = null,

    @SerializedName("strMood")
    val strMood: String? = null,

    @SerializedName("strWebsite")
    val strWebsite: String? = null,

    @SerializedName("strFacebook")
    val strFacebook: String? = null,

    @SerializedName("strTwitter")
    val strTwitter: String? = null,

    @SerializedName("strBiographyEN")
    val strBiographyEN: String? = null,

    @SerializedName("strBiographyDE")
    val strBiographyDE: String? = null,

    @SerializedName("strBiographyFR")
    val strBiographyFR: String? = null,

    @SerializedName("strBiographyCN")
    val strBiographyCN: String? = null,

    @SerializedName("strBiographyIT")
    val strBiographyIT: String? = null,

    @SerializedName("strBiographyJP")
    val strBiographyJP: String? = null,

    @SerializedName("strBiographyES")
    val strBiographyES: String? = null,

    @SerializedName("strBiographyPT")
    val strBiographyPT: String? = null,

    @SerializedName("strBiographySE")
    val strBiographySE: String? = null,

    @SerializedName("strBiographyNL")
    val strBiographyNL: String? = null,

    @SerializedName("strBiographyHU")
    val strBiographyHU: String? = null,

    @SerializedName("strBiographyNO")
    val strBiographyNO: String? = null,
    
    @SerializedName("strBiographyIL")
    val strBiographyIL: String? = null,

    @SerializedName("strGender")
    val strGender: String? = null,

    @SerializedName("intMembers")
    val intMembers: String? = null,

    @SerializedName("strCountry")
    val strCountry: String? = null,

    @SerializedName("strCountryCode")
    val strCountryCode: String? = null,

    @SerializedName("strArtistThumb")
    val strArtistThumb: String? = null,

    @SerializedName("strArtistLogo")
    val strArtistLogo: String? = null,

    @SerializedName("strArtistCutout")
    val strArtistCutout: String? = null,

    @SerializedName("strArtistClearart")
    val strArtistClearart: String? = null,
    
    @SerializedName("strArtistWideThumb")
    val strArtistWideThumb: String? = null,

    @SerializedName("strArtistFanart")
    val strArtistFanart: String? = null,

    @SerializedName("strArtistFanart2")
    val strArtistFanart2: String? = null,

    @SerializedName("strArtistFanart3")
    val strArtistFanart3: String? = null,

    @SerializedName("strArtistFanart4")
    val strArtistFanart4: String? = null,

    @SerializedName("strArtistBanner")
    val strArtistBanner: String? = null,

    @SerializedName("strMusicBrainzID")
    val strMusicBrainzID: String? = null,

    @SerializedName("strISNIcode")
    val strISNIcode: String? = null,

    @SerializedName("strLastFMChart")
    val strLastFMChart: String? = null,

    @SerializedName("intCharted")
    val intCharted: String? = null,

    @SerializedName("strLocked")
    val strLocked: String? = null,
)