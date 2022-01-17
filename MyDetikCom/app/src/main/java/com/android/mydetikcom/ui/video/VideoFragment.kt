package com.android.mydetikcom.ui.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.mydetikcom.R
import com.android.mydetikcom.ui.dashboard.DashboardViewModel

class VideoFragment : Fragment() {

    private lateinit var dashboardViewModel: VideoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(VideoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_video, container, false)
        val textView: TextView = root.findViewById(R.id.text_video)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}