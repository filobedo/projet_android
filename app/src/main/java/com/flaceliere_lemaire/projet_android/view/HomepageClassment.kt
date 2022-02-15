package com.flaceliere_lemaire.projet_android.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.R
import com.flaceliere_lemaire.projet_android.controller.AlbumController
import com.flaceliere_lemaire.projet_android.model.Album
import com.flaceliere_lemaire.projet_android.model.AlbumsModel
import com.flaceliere_lemaire.projet_android.service.AlbumService
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.homepage_classment.*
import kotlinx.android.synthetic.main.homepage_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomepageClassment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,

    ): View? {
        var res =  inflater.inflate(R.layout.homepage_classment, container, false)
        return res
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ClassmentTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                // Handle tab select
                if (tab!!.position == 0) {
                    listTitle.visibility = View.VISIBLE
                    listAlbum.visibility = View.GONE
                } else {
                    listTitle.visibility = View.GONE
                    listAlbum.visibility = View.VISIBLE
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

}