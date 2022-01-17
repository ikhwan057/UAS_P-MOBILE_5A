package com.android.mydetikcom.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.android.mydetikcom.ui.adapter.pagerFragment.FragmentOne
import com.android.mydetikcom.ui.adapter.pagerFragment.FragmentThree
import com.android.mydetikcom.ui.adapter.pagerFragment.FragmentTwo

class HomeViewPagerAdapter(fragmentManager: FragmentManager?) :
    FragmentStatePagerAdapter(fragmentManager) {

    private var dataPager: MutableList<String> = arrayListOf()

    private val pages = listOf(
        FragmentOne(),
        FragmentTwo(),
        FragmentThree(),
        FragmentOne(),
        FragmentTwo()
    )

    fun setData(data: MutableList<String>) {
        dataPager = data
    }

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return dataPager.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return dataPager[position]
    }

}