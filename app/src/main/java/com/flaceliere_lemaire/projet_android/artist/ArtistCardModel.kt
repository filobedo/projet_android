package com.flaceliere_lemaire.projet_android.artist

class ArtistCardModel {
    var id: String? = null
    var name: String? = null;
    var imgUrl: String? = null

    override fun toString(): String {
        return "$id, $name, $imgUrl"
    }
}