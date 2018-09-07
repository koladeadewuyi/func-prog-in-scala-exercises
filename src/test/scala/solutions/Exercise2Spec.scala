package solutions

import Exercise2._

class Exercise2Spec extends TestFixture {

  describe("Sorting array of generic type") {

    describe("array of integers") {
      val integers = Table(
        ("array", "sorted"),
        (Vector(1, 2, 3), true),
        (Vector(3, 2, 1), false)
      )

      forAll(integers) { (array, sorted) =>
        it(s"should return $sorted when given ${array.mkString(",")}") {
          isSorted(array) shouldBe sorted
        }
      }
    }

    describe("array of floats") {
      val floats = Table(
        ("array", "sorted"),
        (Vector(1.2F, 2.2F, 3.2F), true),
        (Vector(3.2F, 2.2F, 1.2F), false)
      )

      forAll(floats) { (array, sorted) =>
        it(s"should return $sorted when given ${array.mkString(",")}") {
          isSorted(array) shouldBe sorted
        }
      }
    }

    describe("array of doubles") {
      val doubles = Table(
        ("array", "sorted"),
        (Vector(1.2D, 2.2D, 3.2D), true),
        (Vector(3.2D, 2.2D, 1.2D), false)
      )

      forAll(doubles) { (array, sorted) =>
        it(s"should return $sorted when given ${array.mkString(",")}") {
          isSorted(array) shouldBe sorted
        }
      }
    }

    describe("array of characters") {
      val doubles = Table(
        ("array", "sorted"),
        (Vector('A', 'B', 'C'), true),
        (Vector('C', 'A', 'B'), false)
      )

      forAll(doubles) { (array, sorted) =>
        it(s"should return $sorted when given ${array.mkString(",")}") {
          isSorted(array) shouldBe sorted
        }
      }
    }

    describe("array of strings") {
      val strings = Table(
        ("array", "sorted"),
        (Vector("abc", "def", "ghi"), true),
        (Vector("abc", "ghi", "def"), false)
      )

      forAll(strings) { (array, sorted) =>
        it(s"should return $sorted when given ${array.mkString(",")}") {
          isSorted(array) shouldBe sorted
        }
      }
    }
  }

}
