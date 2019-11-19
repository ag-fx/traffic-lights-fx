package ui.view.eventbutton

import ui.model.TrafficLightColour
import ui.event.TrafficLightEvent

const val RED_BUTTON_TEXT = "STOP"

class RedEventButton: EventButton() {
    override fun fireTrafficLightEvent() = fire(TrafficLightEvent(TrafficLightColour.RED))

    init { setButtonText(RED_BUTTON_TEXT) }
}