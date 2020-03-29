package chapter3

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _ *))

  // Exercise 3.2
  def tail[A](l: List[A]): List[A] = {
    l match {
      case Cons(x, y) => y
      case Nil => Nil
    }
  }

  // Exercise 3.3
  def setHead[A](l: List[A], h: A): List[A] = {
    l match {
      case Cons(x, y) => Cons(h, y)
      case Nil => Cons(h, Nil)
    }
  }

  // Exercise 3.4
  def drop[A](l: List[A], n: Int): List[A] = {

    (l, n) match {
      case (Cons(x, y), m) if m > 0 => drop(y, n - 1)
      case (Cons(x, y), 0) => l
      case (Nil, m) => Nil
    }
  }
  // Exercise 3.5
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {

    l match {
      case Cons(x, y) if f(x) => y
      case Cons(x, y) => Cons(x, dropWhile(y, f))
    }
  }

  // Exercise 3.6
  def init[A](l: List[A]): List[A] = {

    ???
  }
}

object Solution extends App {

  // Exercise 3.1
  val x = List(1, 2, 3, 4, 5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case _ => 101
  }

  println(x) // 3
  val r = List.drop(List(1, 2, 3), 0)
  println(r)
  // Exercise 3.2
  val ex3_5 = List.dropWhile(List(1, 2, 3), (n: Int) => n == 2)
  print(ex3_5)


}
