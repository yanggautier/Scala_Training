@main
def calculatorChallenge():Unit = {
  val calculator = Calculator()
  calculator.add(534)
  calculator.sub(342)
  calculator.mul(2)
  calculator.div(4)
  calculator.reset()
}

class Calculator:
  private var total:Double = 0
  def add(a: Double): Unit =
    total += a
    displayTotal()

  def sub(a: Double): Unit =
    total -= a
    displayTotal()

  def mul(a: Double): Unit =
    total *= a
    displayTotal()

  def div(a: Double): Unit =
    total /= a
    displayTotal()

  def reset():Unit =
    total = 0
    displayTotal()

  private def displayTotal():Unit = println(s"Actual total is $total")