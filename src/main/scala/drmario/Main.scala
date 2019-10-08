package drmario

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import scalafx.scene.paint.Color

object Main extends JFXApp {
    val canvas = new Canvas(800,800)
    val renderer = new Renderer(canvas)
    val board = new Board
    stage = new JFXApp.PrimaryStage {
        title = "Dr. Mario"
        scene = new Scene(800,800) {
        //color the background
        content = canvas
        renderer.render(board)
        

        }   
    }
}