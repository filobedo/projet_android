package com.flaceliere_lemaire.projet_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flaceliere_lemaire.projet_android.view.homepageFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentMain, homepageFragment())
            .commitAllowingStateLoss()

//        ButterKnife.bind(this)

        val recyclerview = findViewById<RecyclerView>(R.id.listTracks)
        recyclerview.layoutManager = LinearLayoutManager(this)


//        val albumsRequest = AlbumService.create().getAlbum()
//        println(albumsRequest.request().url)
//        albumsRequest.enqueue(object : Callback<AlbumsModel> {
//
//            override fun onResponse(call: Call<AlbumsModel>, response: Response<AlbumsModel>) {
//                if (response.body() != null) {
//                    println(response.body()!!.album[0].strAlbum) //response.body()!!
//
//                    // ArrayList of class ItemsViewModel
//                    val data = ArrayList<Album>()
//                    for (value in response.body()!!.album) {
//                        data.add(value)
//                        println("------- dans boucle ${data[0].strAlbum}")
//                    }
//
//                    // This will pass the ArrayList to our Adapter
//                    val adapter = AlbumController(data)
//
//                    // Setting the Adapter with the recyclerview
//                    recyclerview.adapter = adapter
//
//
//                }
//            }
//
//            override fun onFailure(call: Call<AlbumsModel>, t: Throwable) {
//                println("KO ${t.cause}")
//                error("KO")
//            }
//        })


    }

    override fun onStart() {
        super.onStart()




//        val textInput: TextView = findViewById<TextView>(R.id.textTemp)
//        textInput.text = "toto"
//        val courseRequest = ArtistService.create().getArtist()
//        courseRequest.enqueue(object : Callback<ArtistModel> {
//
//            override fun onResponse(call: Call<ArtistModel>, response: Response<ArtistModel>) {
//                if (response.body() != null) {
////                    textInput.text = response.body()!!.artists[0].strArtist
////                    recyclerAdapter.setMovieListItems(response.body()!!)
////                    for (c in allCourse) {
////                        println(" one course : ${c.artists[0]}")
////                        textInput.text = c.artists[0].toString()
////                    }
//                }
//            }
//
//            override fun onFailure(call: Call<ArtistModel>, t: Throwable) {
//                println("KO ${t.cause}")
//                error("KO")
//            }
//        })




    }
}