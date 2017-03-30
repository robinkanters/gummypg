package com.robinkanters.gummypg.ui.main

import javafx.collections.ObservableList
import tornadofx.Controller
import tornadofx.observable

class MainController : Controller() {
    fun listIdentities(): ObservableList<PgpIdentity> {
        Thread.sleep(2000)

        return listOf(
                PgpIdentity("A", "1"),
                PgpIdentity("B", "2"),
                PgpIdentity("C", "3"),
                PgpIdentity("D", "4")
        ).observable()
    }
}
