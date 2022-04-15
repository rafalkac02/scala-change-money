import org.scalatest._
import flatspec._
import matchers._
import ChangeMoney._

class ChangeMoneySpec extends AnyFlatSpec with should.Matchers {

  it should "return the number of coins for a given price" in {

    coins(0) shouldBe 0
    coins(1) shouldBe 1
    coins(12) shouldBe 3
    coins(50) shouldBe 2
    coins(500) shouldBe 1
    coins(468) shouldBe 11
    coins(123456) shouldBe 254
  }
}