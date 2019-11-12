package adt

import collection.mutable

class BSTMap[K,V](lt: (K,K) => Boolean) extends mutable.Map[K,V] {
  import BSTMap._

  private var root: Node[K,V] = null

  def get(key: K): Option[V] = {
    var rover = root
    while(rover != null && rover.key != key)
    {
      if(lt(key, rover.key)) rover = rover.left
      else rover = rover.right
    }
    if(rover != null) Some(rover.value) else None
  }

  def iterator: Iterator[(K, V)] = ???

  override def update(key: K, value: V): Unit = {
    var rover = root
    while(rover != null && rover.key != key)
    {
      if(lt(key, rover.key)) rover = rover.left
      else rover = rover.right
    }
    if(rover != null) rover.value = value
  }
  
  def -=(key: K) = ???
  
  def += (kv: (K,V)) = {
    def helper(n: Node[K,V]): Node[K,V] = {
      if (n == null) {
        new Node[K,V](kv._1,kv._2,null,null)
      }
      else if(n.key == kv._1) {
        n.value = kv._2
        n
      }
      else if(lt(n.key, kv._1)) {
        n.left = helper(n.left)
        n
      }
      else {
        n.right = helper(n.left)
        n
      }
    }
    root = helper(root)
    this
  }
  
}

object BSTMap {
  private class Node[K,V](var key: K, var value: V, var left: Node[K,V], var right: Node[K,V])
}