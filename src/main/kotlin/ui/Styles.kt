package ui

import javafx.geometry.Pos
import javafx.scene.paint.Paint
import javafx.scene.text.TextAlignment
import tornadofx.*
import ui.view.TrafficLightContainer

private const val CONTAINER_WIDTH = 250.0
private const val CONTAINER_HEIGHT = 500.0
private const val LABEL_DIMENSION = 100.0

class Styles : Stylesheet() {

    companion object {
        val trafficLightContainer by cssclass()
    }

    init {
        trafficLightContainer {
            minHeight = CONTAINER_HEIGHT.px
            maxHeight = CONTAINER_HEIGHT.px
            minWidth = CONTAINER_WIDTH.px
            maxWidth = CONTAINER_WIDTH.px
            backgroundColor += Paint.valueOf("black")
        }
        label {
            minHeight = LABEL_DIMENSION.px
            maxHeight = LABEL_DIMENSION.px
            minWidth = LABEL_DIMENSION.px
            maxWidth = LABEL_DIMENSION.px
            alignment = Pos.CENTER
        }
    }
}