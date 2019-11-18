package ui.controller

import tornadofx.Controller
import ui.model.TrafficLightColour
import ui.model.TrafficLightColour.*
import ui.view.eventbuttons.GREEN_BUTTON_TEXT
import ui.view.eventbuttons.RED_BUTTON_TEXT
import ui.view.eventbuttons.YELLOW_BUTTON_TEXT

const val RED_COLOUR_CODE = "#FF4C4C"
const val YELLOW_COLOUR_CODE = "#FFFF00"
const val GREEN_COLOUR_CODE = "#019A01"

class TrafficLightController : Controller() {

    fun getTextForState(trafficLightColour: TrafficLightColour) = when(trafficLightColour){
        RED -> RED_BUTTON_TEXT
        YELLOW -> YELLOW_BUTTON_TEXT
        GREEN -> GREEN_BUTTON_TEXT
    }

    fun getColourCodeForState(trafficLightColour: TrafficLightColour) = when(trafficLightColour){
        RED -> RED_COLOUR_CODE
        YELLOW -> YELLOW_COLOUR_CODE
        GREEN -> GREEN_COLOUR_CODE
    }
}