package com.android.mydetikcom.ui.adapter.pagerFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.mydetikcom.R
import com.android.mydetikcom.ui.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_one.view.*


class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        initDataNews(view)
        return view
    }

    private fun initDataNews(view: View) {
        val adapter = NewsAdapter()
        val layoutManager = LinearLayoutManager(activity)
        view.rv_main_news.layoutManager = layoutManager
        view.rv_main_news.adapter = adapter
    }
}