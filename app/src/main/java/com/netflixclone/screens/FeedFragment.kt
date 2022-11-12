package com.netflixclone.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import com.netflixclone.screens.feed.FeedScreen

class FeedFragment : BottomNavFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme(colors = darkColors(background = Color.Black)) {
                    FeedScreen()
                }
            }
        }
    }

    override fun onFirstDisplay() {
    }
}

