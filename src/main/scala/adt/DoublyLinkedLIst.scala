package adt

class DoublyLinkedList[A] extends collection.mutable.Buffer[A] {
  import DoublyLinkedList._
  private var numElems: Int = 0
  private val end: Node[A] = new Node(null, null.asInstanceOf[A], null)
  end.prev = end
  end.next = end
  def +=(a: A) = {
    val n = new Node[A](end.prev,a,end)
    end.prev.next = n
    end.prev = n
    numElems += 1
    this
  }
  def +=:(a: A) = {
    val n = new Node[A](end, a, end.next)
    end.next.prev = n
    end.next = n
    numElems += 1
    this
  }
  def apply(index: Int):A = {
    //require(index >= 0 && index < numElems)
    null.asInstanceOf[A]
  }
  def update(index: Int, a: A)
  def remove(index:Int): A = {
    require(index >= 0 && index < numElems)
    numElems -= 1 
    var rover = end.next
    for(i <- 0 until index) rover = rover.next
    val ret = rover.data
    rover.next.prev = rover.prev
    rover.prev.next = rover.next
    ret
  }
  def clear():Unit = {
    end.next = end
    end.prev = end
  }
  def iterator = new Iterator[A] {
    private var rover = end.next
    def hasNext: Boolean = rover != end
    def next(): A = {
      val ret = rover.data
      rover = rover.next
      ret
    }
  }
}
object DoublyLinkedList {
  private class Node[A](var prev: Node[A], var data:A, var next:Node[A])
}
