package drmario

class Board {
  private var _elements: List[BoardElement] = List.fill[BoardElement](10)(new Virus(util.Random.nextInt(8),util.Random.nextInt(16), DMColor.randomColor))
  private var _current: Pill = new Pill(List(
    new PillPiece(3,4,DMColor.Red),
    new PillPiece(3,5,DMColor.Red)
  ))

  def elements = _elements
}