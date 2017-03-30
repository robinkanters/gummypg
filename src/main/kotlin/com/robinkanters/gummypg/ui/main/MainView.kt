package com.robinkanters.gummypg.ui.main

import javafx.scene.Parent
import javafx.scene.control.TableView
import tornadofx.View

class MainView : View() {
    val controller: MainController by inject()

    override val root: Parent by fxml()
    val keyList by fxid<TableView<PgpIdentity>>()

    init {
        runAsync {
            controller.listIdentities()
        } ui (keyList::setItems)
    }
}

data class PgpIdentity(val email: String, val name: String)
