package com.flaceliere_lemaire.projet_android.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO

class ArtistAdapter(
    var currentResults: List<ArtistCardModel>
): RecyclerView.Adapter<ArtistCardHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistCardHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.artist_card_item, parent, false)
        return ArtistCardHolder(cardItem)
    }

    override fun onBindViewHolder(holder: ArtistCardHolder, position: Int) {
        var artistCardModel = currentResults[position]
        holder?.updateArtistCard(artistCardModel)
    }

    override fun getItemCount(): Int {
        return currentResults.size
    }


}