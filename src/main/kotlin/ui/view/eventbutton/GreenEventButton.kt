package ui.view.eventbutton

import ui.model.TrafficLightColour
import ui.event.TrafficLightEvent

const val GREEN_BUTTON_TEXT = "GO"

class GreenEventButton: EventButton() {
    override fun fireTrafficLightEvent() = fire(TrafficLightEvent(TrafficLightColour.GREEN))

    init { setButtonText(GREEN_BUTTON_TEXT) }
}
