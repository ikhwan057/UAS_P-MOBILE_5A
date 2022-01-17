package com.android.mydetikcom.ui.adapter

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.mydetikcom.R
import com.android.mydetikcom.ui.adapter.itemview.ItemViewHorizontalNews
import com.android.mydetikcom.ui.adapter.itemview.NewsItemView


class NewsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            3 -> {
                val view = layoutInflater.inflate(R.layout.item_tag_news, parent, false)
                NewsItemView(view)
            }
            5, 10, 15, 20, 25 -> {
                val view = layoutInflater.inflate(R.layout.item_ads_news, parent, false)
                NewsItemView(view)
            }
            6, 12 -> {
                val view = layoutInflater.inflate(R.layout.item_horizontal_news, parent, false)
                ItemViewHorizontalNews(view)
            }
            else -> {
                val view = layoutInflater.inflate(R.layout.item_news, parent, false)
                NewsItemView(view)
            }
        }
    }

    override fun getItemCount(): Int {
        return 30
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (position) {
            6, 12 -> {
                if (holder is ItemViewHorizontalNews) {
                    holder.setupHorizontalNews()
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}