package drmario
import scalafx.scene.canvas.Canvas
import scalafx.scene.paint.Color

class Renderer(canvas: Canvas) {
  def render(board:Board):Unit = {
    val gc = canvas.graphicsContext2D
    gc.fill = Color.Black
    gc.fillRect(0,0,800,800) 
  }

}