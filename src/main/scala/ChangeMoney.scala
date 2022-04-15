object ChangeMoney {

  val units = Seq(500, 100, 25, 10, 5, 1)

  def biggestCoin(n: Int, coins: Seq[Int]): Int = coins.head match {
    case c if c <= n => c
    case _ => biggestCoin(n, coins.tail)
  }

  def coins(cost: Int): Int = {
    //    var n = cost
    //    var counter = 0
    //
    //    while (n != 0) {
    //      n -= biggestCoin(n, units)
    //      counter += 1
    //    }
    //    counter

    def count(n: Int, counter: Int): Int = n match {
      case 0 => counter
      case _ => count(n - biggestCoin(n, units), counter + 1)
    }

    count(cost, 0)
  }
}