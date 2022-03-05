package com.flaceliere_lemaire.projet_android.album

import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.artist.ArtistCardModel
import com.flaceliere_lemaire.projet_android.view.AlbumFragment
import com.squareup.picasso.Picasso

class AlbumCardHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val albumImageView: ImageView = itemView.findViewById<ImageView>(R.id.albumProfilePicture)
    private val albumTextView: TextView = itemView.findViewById<TextView>(R.id.albumName)
    private val albumCard = itemView.findViewById<View>(R.id.album_card)

    private var currentAlbum: AlbumCardModel? = null;

    fun updateAlbumCard(album: AlbumCardModel){
        currentAlbum = album
        albumTextView.text = album.name

        if(album.imgUrl != null)
            Picasso.get().load(album.imgUrl).into(albumImageView)

        albumCard.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var activity: AppCompatActivity = v?.context as AppCompatActivity

                activity.supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentMain, AlbumFragment.newInstance(currentAlbum!!.id))
                    .addToBackStack("BACK")
                    .commit()
            }


        })

    }
}