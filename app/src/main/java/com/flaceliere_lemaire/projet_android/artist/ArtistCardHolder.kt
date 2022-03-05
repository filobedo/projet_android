package com.flaceliere_lemaire.projet_android.artist

import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.squareup.picasso.Picasso
import com.squareup.picasso.Target

class ArtistCardHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val artistImageView: ImageView = itemView.findViewById<ImageView>(R.id.artisteProfilePicture)
    private val artistTextView: TextView = itemView.findViewById<TextView>(R.id.artistName)

    private var currentArtist: ArtistCardModel? = null;

    fun updateArtistCard(artist: ArtistCardModel){
        currentArtist = artist
        artistTextView.text = artist.name

        if(artist.imgUrl != null)
            Picasso.get().load(artist.imgUrl).into(artistImageView)

    }

}