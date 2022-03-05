package com.flaceliere_lemaire.projet_android.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.album.AlbumAdapter
import com.flaceliere_lemaire.projet_android.album.AlbumCardModel
import com.flaceliere_lemaire.projet_android.album.AlbumIntoCard
import com.flaceliere_lemaire.projet_android.album.AlbumService
import com.flaceliere_lemaire.projet_android.artist.*
import com.flaceliere_lemaire.projet_android.model.AlbumsDAO
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import kotlinx.android.synthetic.main.homepage_search.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class homepageSearch : Fragment() {

    enum class LayoutManagerType {
        GRID_LAYOUT_MANAGER, LINEAR_LAYOUT_MANAGER
    }

    var artistCurrentLayoutManagerType: LayoutManagerType? = null
    var albumCurrentLayoutManagerType: LayoutManagerType? = null

    var artistRecyclerView: RecyclerView? = null
    var albumRecyclerView: RecyclerView? = null

    var artistAdapter: ArtistAdapter? = null
    var albumAdapter: AlbumAdapter? = null

    var artistLayoutManager: RecyclerView.LayoutManager? = null
    var albumLayoutManager: RecyclerView.LayoutManager? = null

    var artistDataset: List<ArtistCardModel> = ArrayList<ArtistCardModel>()
    var albumDataset: List<AlbumCardModel> = ArrayList<AlbumCardModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView: View = inflater.inflate(R.layout.homepage_search, container, false)
        rootView.tag = "RecyclerViewFragment"

        artistRecyclerView = rootView.findViewById<View>(R.id.artiste_recycler_view) as RecyclerView
        albumRecyclerView = rootView.findViewById<View>(R.id.album_recycler_view) as RecyclerView

        artistLayoutManager = LinearLayoutManager(activity)
        albumLayoutManager = LinearLayoutManager(activity)


        artistCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER
        albumCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER

        artistAdapter = ArtistAdapter(artistDataset)
        albumAdapter = AlbumAdapter(albumDataset)


        artistRecyclerView!!.adapter = artistAdapter
        albumRecyclerView!!.adapter = albumAdapter

        artistRecyclerView!!.layoutManager = LinearLayoutManager(context)
        albumRecyclerView!!.layoutManager = LinearLayoutManager(context)


        return rootView

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                val artistService = ArtistService()
                val albumService = AlbumService()

                MainScope().launch {
                    try {
                        var artists = async {artistService.getArtistsByName(query)}
                        var albums = async {albumService.getAlbumByArtistsByName(query)}
                        updateArtistList(artists.await())
                        updateAlbumList(albums.await())

                        searchView.clearFocus()
                    }catch (e: Exception){
                        Log.d("DEBUG", e.toString())
                    }
                }
                return true
            }
            override fun onQueryTextChange(newText: String): Boolean {
                Log.d("TEST", newText)
                return true
            }
        })



    }

    fun updateArtistList(artists: ArtistsDAO?){
        var artistsCard: List<ArtistCardModel>? = ArtistsIntoCard.convert(artists)
        if(artistsCard != null){
            artistAdapter!!.currentResults = artistsCard
            artistAdapter!!.notifyDataSetChanged()
        }
    }

    fun updateAlbumList(albums: AlbumsDAO?){
        var albumsCard: List<AlbumCardModel>? = AlbumIntoCard.convert(albums)

        parentFragmentManager
        if(albumsCard != null){
            albumAdapter!!.currentResults = albumsCard
            albumAdapter!!.notifyDataSetChanged()
        }
    }

}