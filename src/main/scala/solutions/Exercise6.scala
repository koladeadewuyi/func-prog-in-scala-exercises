package solutions

object Exercise6 {

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
//    f.compose(g)
//    g.andThen(f)
    (a: A) => f(g(a))
  }
}
