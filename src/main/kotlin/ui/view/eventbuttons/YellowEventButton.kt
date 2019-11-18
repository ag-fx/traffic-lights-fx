package ui.view.eventbuttons

import ui.model.TrafficLightColour
import ui.event.TrafficLightEvent

const val YELLOW_BUTTON_TEXT = "GET READY"

class YellowEventButton: EventButton() {
    override fun fireTrafficLightEvent() = fire(TrafficLightEvent(TrafficLightColour.YELLOW))

    init { setButtonText(YELLOW_BUTTON_TEXT) }
}