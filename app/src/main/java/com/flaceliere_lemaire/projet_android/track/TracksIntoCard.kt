package com.flaceliere_lemaire.projet_android.track


class TracksIntoCard {
    companion object {
        fun convert (tracks: TracksDAO?): List<TracksCardModel>?{
            if (tracks != null){
                var trackCard = ArrayList<TracksCardModel>(0);

                for (track in tracks.tracks){
                    var trackCardModel = TracksCardModel()
                    trackCardModel.id = track.idTrack
                    trackCardModel.name = track.strTrack
                    trackCardModel.imgUrl = track.strTrackThumb

                    trackCard.add(trackCardModel)
                }

                return trackCard
            }

            return null
        }
    }
}