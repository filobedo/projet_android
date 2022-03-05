package com.flaceliere_lemaire.projet_android.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.album.*
import com.flaceliere_lemaire.projet_android.artist.ArtistAdapter
import com.flaceliere_lemaire.projet_android.artist.ArtistCardModel
import com.flaceliere_lemaire.projet_android.artist.ArtistService
import com.flaceliere_lemaire.projet_android.artist.ArtistsIntoCard
import com.flaceliere_lemaire.projet_android.model.AlbumsDAO
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import com.flaceliere_lemaire.projet_android.track.*
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.homepage_classment.*
import kotlinx.android.synthetic.main.homepage_search.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlin.math.log

class HomepageClassment : Fragment() {
    var tracksCurrentLayoutManagerType: homepageSearch.LayoutManagerType? = null
    var albumCurrentLayoutManagerType: homepageSearch.LayoutManagerType? = null

    var tracksRecyclerView: RecyclerView? = null
    var albumRecyclerView: RecyclerView? = null

    var tracksAdapter: TracksAdapter? = null
    var albumAdapter: AlbumAdapter? = null

    var tracksAayoutManager: RecyclerView.LayoutManager? = null
    var albumLayoutManager: RecyclerView.LayoutManager? = null

    var tracksDataset: List<TracksCardModel> = ArrayList<TracksCardModel>()
    var albumDataset: List<AlbumCardModel> = ArrayList<AlbumCardModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,

    ): View? {
        var rootView =  inflater.inflate(R.layout.homepage_classment, container, false)
        rootView.tag = "RecyclerViewFragment"

        tracksRecyclerView = rootView.findViewById<View>(R.id.listTracks) as RecyclerView
        albumRecyclerView = rootView.findViewById<View>(R.id.listAlbums) as RecyclerView

        tracksAayoutManager = LinearLayoutManager(activity)
        albumLayoutManager = LinearLayoutManager(activity)

        tracksCurrentLayoutManagerType = homepageSearch.LayoutManagerType.LINEAR_LAYOUT_MANAGER
        albumCurrentLayoutManagerType = homepageSearch.LayoutManagerType.LINEAR_LAYOUT_MANAGER

        tracksAdapter = TracksAdapter(tracksDataset)
        albumAdapter = AlbumAdapter(albumDataset)


        tracksRecyclerView!!.adapter = tracksAdapter
        albumRecyclerView!!.adapter = albumAdapter

        tracksRecyclerView!!.layoutManager = LinearLayoutManager(context)
        albumRecyclerView!!.layoutManager = LinearLayoutManager(context)

        return rootView
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val trackService = TracksService()
        val albumService = AlbumService()

        MainScope().launch {
            try {
                var tracks = async {trackService.getTopTracks()}
                var albums = async {albumService.getTopAlbums()}
                updateTracksList(tracks.await())
                updateAlbumList(albums.await())

                searchView.clearFocus()
            }catch (e: Exception){
                Log.d("DEBUG", e.toString())
            }
        }

        ClassmentTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.d("DEBUG", tab!!.position.toString())
                // Handle tab select
                if (tab!!.position == 0) {
                    listTracks.visibility = View.VISIBLE
                    listAlbums.visibility = View.GONE
                } else {
                    listTracks.visibility = View.GONE
                    listAlbums.visibility = View.VISIBLE
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
                println(tab.toString())
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
                println(tab.toString())
            }
        })

    }

    fun updateTracksList(tracks: TracksDAO?){
        var tracksCard: List<TracksCardModel>? = TracksIntoCard.convert(tracks)
        if(tracksCard != null){
            tracksAdapter!!.currentResults = tracksCard
            tracksAdapter!!.notifyDataSetChanged()
        }
    }

    fun updateAlbumList(albums: LovedAlbumsDAO?){
        var albumsCard: List<AlbumCardModel>? = AlbumIntoCard.convert(albums)

        parentFragmentManager
        if(albumsCard != null){
            albumAdapter!!.currentResults = albumsCard
            albumAdapter!!.notifyDataSetChanged()
        }
    }


}