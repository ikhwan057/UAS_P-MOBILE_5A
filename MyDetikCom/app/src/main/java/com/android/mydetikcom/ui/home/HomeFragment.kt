package com.android.mydetikcom.ui.home

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.mydetikcom.R
import com.android.mydetikcom.ui.adapter.HomeViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        (activity as? AppCompatActivity)?.setSupportActionBar(root.toolbar_home)
        setHasOptionsMenu(true)
        initViewPager(root)
        return root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater) {
        inflater.inflate(R.menu.home_app_bar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    //init tabhost
    private fun initViewPager(view: View) {
        val viewPagerAdapter = HomeViewPagerAdapter(fragmentManager)
        val dataTabhost =
            arrayListOf(
                "Berita Utama",
                "Berita Terbaru",
                "Trending",
                "Lifestyle",
                "Most Commented"
            )
        viewPagerAdapter.setData(dataTabhost)
        view.view_pager_home.adapter = viewPagerAdapter
        view.tabs_main.tabMode = TabLayout.MODE_SCROLLABLE
        view.tabs_main.setupWithViewPager(view.view_pager_home)

    }
}