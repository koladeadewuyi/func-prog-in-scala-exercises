package solutions

import Exercise3._

class Exercise3Spec extends TestFixture {

  describe("Exercise3Spec") {

    val scenarios = Table(
      ("a", "b", "c"),
      (1, 2, "1 and 2")
    )

    forAll(scenarios) { (a, b, c) =>
      it(s"should return $c when given $a and $b") {
        partial1(a, (a: Int, b: Int) => s"$a and $b")
      }
    }
  }

}
