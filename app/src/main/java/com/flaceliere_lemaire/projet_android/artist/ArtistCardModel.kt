package com.flaceliere_lemaire.projet_android.artist

class ArtistCardModel {
    var name: String? = null;
    var imgUrl: String? = null

    override fun toString(): String {
        return "$name, $imgUrl"
    }
}