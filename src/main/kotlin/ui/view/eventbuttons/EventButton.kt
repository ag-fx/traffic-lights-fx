package ui.view.eventbuttons

import javafx.beans.property.SimpleStringProperty
import tornadofx.View
import tornadofx.bind
import tornadofx.button

abstract class EventButton: View() {
    private val buttonText = SimpleStringProperty()

    override val root = button {
        bind(buttonText)
        setOnAction {
            fireTrafficLightEvent()
        }
    }

    open fun fireTrafficLightEvent() {}

    fun setButtonText(text: String) = buttonText.set(text)
}