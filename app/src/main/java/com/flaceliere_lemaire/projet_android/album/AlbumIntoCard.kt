package com.flaceliere_lemaire.projet_android.album

import com.flaceliere_lemaire.projet_android.artist.ArtistCardModel
import com.flaceliere_lemaire.projet_android.model.AlbumsDAO
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO

class AlbumIntoCard {
    companion object {
        fun convert (albums: AlbumsDAO?): List<AlbumCardModel>?{
            if (albums != null){
                var albumsCard = ArrayList<AlbumCardModel>(0);

                for (album in albums.album){
                    var albumCardModel = AlbumCardModel()
                    albumCardModel.id = album.idAlbum
                    albumCardModel.name = album.strAlbum
                    albumCardModel.imgUrl = album.strAlbumThumb

                    albumsCard.add(albumCardModel)
                }

                return albumsCard
            }

            return null
        }

        fun convert (albums: LovedAlbumsDAO?): List<AlbumCardModel>?{
            if (albums != null){
                var albumsCard = ArrayList<AlbumCardModel>(0);

                for (album in albums.album){
                    var albumCardModel = AlbumCardModel()
                    albumCardModel.id = album.idAlbum
                    albumCardModel.name = album.strAlbum
                    albumCardModel.imgUrl = album.strAlbumThumbHQ

                    albumsCard.add(albumCardModel)
                }

                return albumsCard
            }

            return null
        }
    }
}