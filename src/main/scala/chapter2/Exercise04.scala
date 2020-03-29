package chapter2

object Exercise04 extends App {

  // a, b를 받아서 커링 되어 있는 함수에 적용
  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

}
