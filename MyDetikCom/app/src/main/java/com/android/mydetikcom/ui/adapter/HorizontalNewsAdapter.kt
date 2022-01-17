package com.android.mydetikcom.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.mydetikcom.R
import com.android.mydetikcom.ui.adapter.itemview.ItemViewHorizontalNews2

class HorizontalNewsAdapter : RecyclerView.Adapter<ItemViewHorizontalNews2>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHorizontalNews2 {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_horizontal_news_2, parent, false)
        return ItemViewHorizontalNews2(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ItemViewHorizontalNews2, position: Int) {
        // Do something here
    }

}