package ui.view

import javafx.geometry.Pos
import tornadofx.View
import tornadofx.addClass
import tornadofx.vbox
import ui.Styles
import ui.view.eventbutton.GreenEventButton
import ui.view.eventbutton.YellowEventButton
import ui.view.eventbutton.RedEventButton

class TrafficLightContainer : View() {

    override val root = vbox {
        spacing = 25.0
        alignment = Pos.CENTER
        addClass(Styles.trafficLightContainer)
        add<TrafficLight>()
        add<RedEventButton>()
        add<YellowEventButton>()
        add<GreenEventButton>()
    }
}