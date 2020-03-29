package chapter2

import scala.annotation.tailrec

object Exercise01 extends App {


  def fib(n: Int): Int = {
    //    @tailrec
    //    def _fib(n: Int = 1): Int = {
    //      n match {
    //        case i if i < 0 => 0
    //        case 2 => 1
    //        case i if  i > 2 => _fib(n - 2) + _fib(n - 1)
    //      }
    //    }
    //    _fib(n)


    def _fib(prev: Int = 0, n: Int = 0, cur: Int): Int = {
      if (n == 0) prev
      else _fib(cur, n - 1, prev + cur)
    }
    _fib(0, n, 1)
  }


  println(s"1번째 : ${fib(1)}")
  println(s"2번째 : ${fib(2)}")
  println(s"3번째 : ${fib(3)}")
  println(s"4번째 : ${fib(4)}")
  println(s"4번째 : ${fib(5)}")

}
