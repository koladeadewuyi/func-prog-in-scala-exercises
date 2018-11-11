package solutions

import Exercise4and5._

class Exercise4and5Spec extends TestFixture {

  private def sum(a: Int, b: Int): Int = a + b
  private def multiply(a: Int)(b: Int): Int = a * b

  describe("Exercise") {

    it("should curry arguments") {
      curry[Int, Int, Int](sum)(1)(2) shouldBe 3
    }

    it("should uncurry arguments") {
      uncurry(multiply)(2, 3) shouldBe 6
    }
  }

}
