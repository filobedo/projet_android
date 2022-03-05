package com.flaceliere_lemaire.projet_android.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.artist.ArtistCardHolder
import com.flaceliere_lemaire.projet_android.artist.ArtistCardModel

class AlbumAdapter(var currentResults: List<AlbumCardModel>): RecyclerView.Adapter<AlbumCardHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumCardHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.album_card_item, parent, false)
        return AlbumCardHolder(cardItem)
    }

    override fun onBindViewHolder(holder: AlbumCardHolder, position: Int) {
        var albumCardModel = currentResults[position]
        holder?.updateAlbumCard(albumCardModel)
    }

    override fun getItemCount(): Int {
        return currentResults.size
    }


}