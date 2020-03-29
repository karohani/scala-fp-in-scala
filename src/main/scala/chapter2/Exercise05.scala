package chapter2

object Exercise05 {

  /*
  g => f를 구현하면 됨

  f compose g
   */
  def compose[A, B, C](f: B => C, g: A => B): A => C =
    a => f(g(a))
}
