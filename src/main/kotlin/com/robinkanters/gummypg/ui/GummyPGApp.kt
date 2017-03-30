package com.robinkanters.gummypg.ui

import com.robinkanters.gummypg.ui.main.MainView
import javafx.application.Application
import tornadofx.App

class GummyPGApp : App() {
    override val primaryView = MainView::class
}

fun main(args: Array<String>) {
    Application.launch(GummyPGApp::class.java, *args)
}
