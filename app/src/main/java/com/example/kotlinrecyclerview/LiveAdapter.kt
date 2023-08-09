package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerview.databinding.ResItemLiveBinding
import com.ocanha.kotlinrecyclerview.models.Live

class LiveAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val itens: List<Live> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = ResItemLiveBinding.inflate(inflater)
        return LiveViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return itens.size
    }

    class LiveViewHolder constructor(
        itemView: ResItemLiveBinding
    ): RecyclerView.ViewHolder(itemView.root){

        private val liveTitle = itemView.title
        private val liveAuthor = itemView.author
        private val liveThumbnail = itemView.thumbnail
    }
}