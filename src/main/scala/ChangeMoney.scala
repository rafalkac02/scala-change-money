import scala.annotation.tailrec

object ChangeMoney {

  val units = Seq(500, 100, 25, 10, 5, 1)

  def biggestCoin(money: Int): Int = {
    @tailrec
    def pick(n: Int, coins: Seq[Int]): Int = coins.head match {
      case c if c <= n => c
      case _ => pick(n, coins.tail)
    }

    pick(money, units)
  }

  def coins(cost: Int): Int = {
    @tailrec
    def count(n: Int, counter: Int): Int = n match {
      case 0 => counter
      case _ => count(n - biggestCoin(n), counter + 1)
    }

    count(cost, 0)
  }
}