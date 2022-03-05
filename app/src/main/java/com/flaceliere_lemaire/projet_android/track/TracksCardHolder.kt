package com.flaceliere_lemaire.projet_android.track;

import android.view.View;
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.view.AlbumFragment
import com.squareup.picasso.Picasso


class TracksCardHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
    private val albumImageView: ImageView = itemView.findViewById<ImageView>(R.id.albumProfilePicture)
    private val albumTextView: TextView = itemView.findViewById<TextView>(R.id.albumName)
    private val albumCard = itemView.findViewById<View>(R.id.album_card)

    private var currentTracks: TracksCardModel? = null;

    fun updateTracksCard(track: TracksCardModel){
        currentTracks = track
        albumTextView.text = track.name

//        if(track.imgUrl != null)
//            Picasso.get().load(track.imgUrl).into(albumImageView)

        albumCard.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var activity: AppCompatActivity = v?.context as AppCompatActivity

                activity.supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentMain, AlbumFragment.newInstance(currentTracks!!.id))
                    .addToBackStack("BACK")
                    .commit()
            }
        })

    }
}
