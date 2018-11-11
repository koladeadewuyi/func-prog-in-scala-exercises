package solutions

import Exercise6._

class Exercise6Spec extends TestFixture {

  private def square(a: Int): Int = Math.pow(a, 2).toInt
  private def cube(a: Int): Int = Math.pow(a, 3).toInt

  describe("Exercise6Spec") {

    it("should compose") {
      compose(square, cube)(2) shouldBe 64
    }

  }
}
