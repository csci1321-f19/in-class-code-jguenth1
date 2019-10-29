package adt

class SinglyLinkedList[A] extends collection.mutable.Buffer[A] {
  import SinglyLinkedList._
  private var numElems: Int = 0
  private var hd: Node[A] = null
  private var tail: Node[A] = null
  
  def +=(a: A)
  def +=:(a: A)
  def apply(index: Int):A = {
    //require(index >= 0 && index < numElems)
    hd.contents
  }
  def update(index: Int, a: A)
  def remove(index:Int): A
  def clear():Unit
  def iterator = new Iterator[A] {
    private var rover = hd
    def hasNext: Boolean = rover != null
    def next(): A = {
      val ret = rover.contents
      rover = rover.next
      ret
    }
  }
}
object SinglyLinkedList {
  private class Node[A](var contents:A, var next:Node[A])
}