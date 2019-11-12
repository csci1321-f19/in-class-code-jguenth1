package basics

/*object Recursion extends App {
  def factorial(x: Int): Int = if(x < 2) 1 else x*factorial(x-1)
  def fib(x: Int): Int = if(x<2) 1 else fib(x-1) + fib(x-2)
  def packBins(bins: Array[Double], objs: Array[Double]): Boolean = {
    helper(o: Int): Boolean = {
      if(o >= objs.length) true
      else {
        var ret = false
        for(b <- bins.indices) {
          if(objs(0) <= bins(b)) {
            bins(b) -= objs(0)
            ret ||= helper(0+1)
            bins(b) += objs(0) 
          }
        }
        ret
      }
      
    }
    helper(0)
  }
}*/