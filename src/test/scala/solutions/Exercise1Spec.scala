package solutions

import Exercise1._

class Exercise1Spec extends TestFixture {

  describe("nth Fibonacci Number") {

    val scenarios = Table(
      ("n", "fibonacciNumber"),
      (1, 0),
      (2, 1),
      (3, 1),
      (4, 2),
      (5, 3),
      (6, 5),
      (7, 8),
      (8, 13),
      (9, 21),
      (10, 34)
    )

    forAll(scenarios) { (n, fibonacciNumber) =>
      it(s"should return $fibonacciNumber as the ${n}th Fibonacci number") {
        fib(n) shouldBe fibonacciNumber
      }
    }

  }

}
