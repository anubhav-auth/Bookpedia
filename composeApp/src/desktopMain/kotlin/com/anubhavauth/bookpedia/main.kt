package com.anubhavauth.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.anubhavauth.bookpedia.app.App
import com.anubhavauth.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}