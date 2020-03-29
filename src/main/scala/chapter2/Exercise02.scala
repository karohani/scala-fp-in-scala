package chapter2

object Exercise02  extends App {


  // A[i] > A[i+1] false
  // A[i] < A[i+1] -> run next
  // ordered n+1이 크면 true
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean = {
    def run(index: Int): Boolean = {
      if (index >= as.length) true
      else if(! ordered(as(index), as(index+1))) false
      else run(index+1)
    }
    run(0)
  }
}
