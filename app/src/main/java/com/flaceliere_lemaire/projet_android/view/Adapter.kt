//package com.flaceliere_lemaire.projet_android.view
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.flaceliere_lemaire.projet_android.R
//import java.lang.Exception
//
//class Adapter(val months: List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    companion object {
//        const val ITEM_TYPE_TITLE = 0
//        const val ITEM_TYPE_CONTENT = 0
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        if(viewType == ITEM_TYPE_TITLE) {
//            return ItemViewHolder(LayoutInflater.from(parent).inflate(R.layout.xxx, parent, false))
//        } else if (viewType == ITEM_TYPE_CONTENT) {
//            return ContentViewHolder(
//                LayoutInflater.from(parent).inflate(R.layout.xxx, parent, false)
//            )
//        } else {
//            throw Exception("Unkown type $ViewType !")
//        }
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
////        holder.updateWith(months[position])}
//    }
//
//    override fun getItemCount(): Int {
//        return months.size
//    }
//
//    override fun getItemViewType(position: Int): Int {
//
//        if (position == 0) {
//            return ITEM_TYPE_TITLE
//        } else {
//            return ITEM_TYPE_CONTENT
//        }
//    }
//
//}
//
//class ItemViewHolder(v: View) : RecyclerView.ViewHolder(v) {
//
//}