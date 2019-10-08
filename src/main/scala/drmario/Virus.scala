package drmario

class Virus(val x:Int, val y: Int, val color: DMColor.Value) extends BoardElement with Cell {
  def cells: List[Cell] = List(this)
}