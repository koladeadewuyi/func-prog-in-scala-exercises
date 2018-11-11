package solutions

object Exercise4and5 {

  def curry[A, B, C](func: (A, B) => C): A => (B => C) = {
//     func.curried
    (a: A) => (b: B) => func(a, b)
  }

  def uncurry[A, B, C](func: A => B => C): (A, B) => C = {
    (a: A, b: B) => func(a)(b)
  }

}
