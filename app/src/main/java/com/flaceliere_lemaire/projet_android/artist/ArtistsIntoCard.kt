package com.flaceliere_lemaire.projet_android.artist

import com.flaceliere_lemaire.projet_android.model.ArtistsDAO

class ArtistsIntoCard {
    companion object {
        fun convert (artists: ArtistsDAO?): List<ArtistCardModel>?{
            if (artists != null){
                var artistsCard = ArrayList<ArtistCardModel>(0);

                for (artist in artists.artists){
                    var artistCardModel = ArtistCardModel()
                    artistCardModel.name = artist.strArtist
                    artistCardModel.imgUrl = artist.strArtistThumb

                    artistsCard.add(artistCardModel)
                }

                return artistsCard
            }

            return null
        }
    }
}