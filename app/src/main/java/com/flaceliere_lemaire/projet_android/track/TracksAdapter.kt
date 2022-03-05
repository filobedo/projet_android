package com.flaceliere_lemaire.projet_android.track;

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R

public class TracksAdapter(var currentResults: List<TracksCardModel>): RecyclerView.Adapter<TracksCardHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TracksCardHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.album_card_item, parent, false)
        return TracksCardHolder(cardItem)
    }

    override fun onBindViewHolder(holder: TracksCardHolder, position: Int) {
        var trackCardModel = currentResults[position]
        holder?.updateTracksCard(trackCardModel)
    }

    override fun getItemCount(): Int {
        return currentResults.size
    }


}