package com.flaceliere_lemaire.projet_android.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.album.AlbumService
import com.flaceliere_lemaire.projet_android.artist.*
import com.flaceliere_lemaire.projet_android.model.ArtistsDAO
import kotlinx.android.synthetic.main.homepage_search.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import okhttp3.internal.toImmutableList

class homepageSearch : Fragment() {

    enum class LayoutManagerType {
        GRID_LAYOUT_MANAGER, LINEAR_LAYOUT_MANAGER
    }

    var mCurrentLayoutManagerType: LayoutManagerType? = null
    var mRecyclerView: RecyclerView? = null
    var mAdapter: ArtistAdapter? = null
    var mLayoutManager: RecyclerView.LayoutManager? = null
    var mDataset: List<ArtistCardModel> = ArrayList<ArtistCardModel>();
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView: View = inflater.inflate(R.layout.homepage_search, container, false)
        rootView.tag = "RecyclerViewFragment"

        mRecyclerView = rootView.findViewById<View>(R.id.artiste_recycler_view) as RecyclerView
        mLayoutManager = LinearLayoutManager(activity)

        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER

        mAdapter = ArtistAdapter(mDataset)

        mRecyclerView!!.adapter = mAdapter
        mRecyclerView!!.layoutManager = LinearLayoutManager(context)





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
                        var albums = albumService.getAlbumByArtistsByName("coldplay")
                        updateArtistList(artists.await())





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
            mAdapter!!.currentResults = artistsCard
            mAdapter!!.notifyDataSetChanged()
            Log.d("adapteter", artistsCard.toString())
        }
    }

}