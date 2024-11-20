package com.anubhavauth.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.anubhavauth.bookpedia.app.App
import com.anubhavauth.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }