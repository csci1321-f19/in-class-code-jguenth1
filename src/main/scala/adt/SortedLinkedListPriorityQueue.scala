package adt

class SortedLinkedListPriorityQueue[A](comp: (A,A) => Int) {
  import SortedLinkedListPriorityQueue._
  var front: Node[A] = null
  
  def enqueue(value: A): Unit = {
    
    /*if(comp(value, front) > 0) {
      val hold = front
      front = new Node(value, hold)
    }
    else { 
    var rover = front
    while( comp(value, rover.next.data) < 0) rover = rover.next
    */
    //rover.next.next = new Node(value, rover.next.next.next)  
    //}
  }
  
  def dequeue():A = {
    val ret = front.data
    front = front.next
    ret
  }
  
  def peek(): A = front.data
  
  def isEmpty: Boolean = front == null
}
object SortedLinkedListPriorityQueue {
  class Node[A](val data: A,var next: Node[A])
}