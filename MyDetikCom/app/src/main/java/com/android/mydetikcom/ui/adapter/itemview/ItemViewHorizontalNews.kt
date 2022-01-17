package com.android.mydetikcom.ui.adapter.itemview

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.mydetikcom.ui.adapter.HorizontalNewsAdapter
import kotlinx.android.synthetic.main.item_horizontal_news.view.*

class ItemViewHorizontalNews(view: View) : RecyclerView.ViewHolder(view) {


    fun setupHorizontalNews() = with(itemView) {
        val adapter = HorizontalNewsAdapter()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        id_rv_horizontal_news.layoutManager = layoutManager
        id_rv_horizontal_news.adapter = adapter
    }
}