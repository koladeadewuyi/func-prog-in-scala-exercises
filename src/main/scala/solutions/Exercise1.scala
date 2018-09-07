package solutions

import scala.annotation.tailrec

object Exercise1 {

  private val FirstFibNumber = 0
  private val SecondFibNumber = 1

  def fib(n: Int): Int = {
    require(n > 0, "n should be a positive integer")
    if (n == 1) FirstFibNumber
    else nthFibonacciNum(n - 2, FirstFibNumber, SecondFibNumber)
  }

  @tailrec
  private def nthFibonacciNum(n: Int, prev: Int, current: Int): Int = {
    if (n <= 0) current
    else nthFibonacciNum(n - 1, current, prev + current)
  }

}
