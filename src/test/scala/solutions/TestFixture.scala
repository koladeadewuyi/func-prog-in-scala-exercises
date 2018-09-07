package solutions

import org.scalatest.{FunSpec, Matchers}
import org.scalatest.prop.TableDrivenPropertyChecks

trait TestFixture extends FunSpec with Matchers with TableDrivenPropertyChecks
