package solutions

import scala.annotation.tailrec

object Exercise2 {

  trait Sortable[A] {
    def lessThan(a: A, b: A): Boolean
  }

  object Sortable {

    implicit object SortableChar extends Sortable[Char] {
      override def lessThan(a: Char, b: Char): Boolean = a < b
    }

    implicit object SortableInt extends Sortable[Int] {
      override def lessThan(a: Int, b: Int): Boolean = a < b
    }

    implicit object SortableDouble extends Sortable[Double] {
      override def lessThan(a: Double, b: Double): Boolean = a < b
    }

    implicit object SortableFloat extends Sortable[Float] {
      override def lessThan(a: Float, b: Float): Boolean = a < b
    }

    implicit object SortableString extends Sortable[String] {
      override def lessThan(a: String, b: String): Boolean = {
        a.zip(b).exists {
          case (x, y) => x < y
        }
      }
    }

  }

  def isSorted[A: Sortable](array: Vector[A]): Boolean = {
    checkIfSorted(array.tail, array.head)
  }

  @tailrec
  private def checkIfSorted[A: Sortable](array: Vector[A], prev: A): Boolean = {
    array.headOption match {
      case Some(elem) =>
        if (implicitly[Sortable[A]].lessThan(prev, elem)) checkIfSorted(array.tail, elem)
        else false
      case None =>
        true
    }
  }

}
