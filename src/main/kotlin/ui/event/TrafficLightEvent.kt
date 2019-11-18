package ui.event

import tornadofx.FXEvent
import ui.model.TrafficLightColour

class TrafficLightEvent(val colour: TrafficLightColour) : FXEvent()