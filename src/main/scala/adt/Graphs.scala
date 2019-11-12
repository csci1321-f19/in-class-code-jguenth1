/*package adt

object Graphs extends App {
  val g = Array(
    Array(0,1,1,0,0,0),
    Array(0,0,1,0,0,0),
    Array(0,0,0,1,1,0),
    Array(1,0,0,0,0,0),
    Array(0,1,0,1,1,0),
    Array(1,0,1,0,0,0)
  )
  //nodes in mud would be passed around as keyword strings
  def reachable(node1: Int, node2: Int, connect: Array[Array[Int]]): Boolean = {
    def helper(n1: Int, visited: Set[Int]): Boolean = {
      if(node1 == node2) true
      var ret = false
      val newVisited = visited + n1
      for(i <- 0 until connect.length if connect(node1)(i) == 1 && !visisted(n)) {
        ret ||= helper(i, newVisited)
      }
      ret
    }
    helper(node1, Set.empty)
  }


  /*def shortestPath(node1: Int, node2: Int, connect: Array[Array[Int]]): Int = {
    def helper(n1: Int, visited: Set[Int]): Boolean = {
      if(node1 == node2) 0
      var ret = 1000000000
      val newVisited = visited + n1
      for(i <- 0 until connect.length if connect(node1)(i) == 1 && !visisted(n)) {
        ret = ret min helper(n, newVisited)
      }
      ret
    }
    helper(node1, Set.empty)
  }*/
}*/