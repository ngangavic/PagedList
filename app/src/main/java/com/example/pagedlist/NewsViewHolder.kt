package com.example.pagedlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_row.view.*

class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(news: News?) {
        if (news != null) {
            itemView.textViewNews.text = news.title
            Picasso.get().load(news.image).into(itemView.imageViewNews)
        }
    }

    companion object {
        fun create(parent: ViewGroup): NewsViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_row, parent, false)
            return NewsViewHolder(view)
        }
    }
}