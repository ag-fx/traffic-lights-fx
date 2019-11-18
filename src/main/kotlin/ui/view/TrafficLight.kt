package ui.view

import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import tornadofx.*
import ui.controller.TrafficLightController
import ui.event.TrafficLightEvent
import ui.model.TrafficLightColour
import ui.model.TrafficLightColour.RED

const val BORDER_RADIUS = 100.0

class TrafficLight : View() {
    private val trafficLightController: TrafficLightController by inject()
    private val eventRegistration: FXEventRegistration
    private val labelBackground = SimpleObjectProperty<Background>()
    private val labelText = SimpleStringProperty()
    private var state: TrafficLightColour = RED

    override val root = label {
        backgroundProperty().bind(labelBackground)
        textProperty().bind(labelText)
    }

    init {
        eventRegistration = subscribeToButtonEvents()
        setUiFromState(state)
    }

    override fun onDelete() {
        eventRegistration.unsubscribe()
        super.onDelete()
    }

    private fun subscribeToButtonEvents() = subscribe<TrafficLightEvent> {
            trafficLightEvent -> if (trafficLightEvent.colour != state) setUiFromState(trafficLightEvent.colour)
    }

    private fun setUiFromState(trafficLightColour: TrafficLightColour) {
        state = trafficLightColour
        val newBackground = getBackground(trafficLightController.getColourCodeForState(state))
        val newText = trafficLightController.getTextForState(state)
        labelBackground.set(newBackground)
        labelText.set(newText)
    }

    private fun getBackground(colourCode: String) =
        Background(BackgroundFill(c(colourCode), CornerRadii(BORDER_RADIUS), insets()))
}