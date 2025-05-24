import scala.util.Random

@main
def traitsChallenge():Unit = {
  val myCoffee = CoffeeShop.getCoffee()
  myCoffee.wakeup()
  myCoffee.quench()
  println()

  val mySecondCoffee = CoffeeShop.getCoffee()
  mySecondCoffee.wakeup()
  mySecondCoffee.quench()
  println()
}

trait Coffee:
  def wakeup(): Unit
  def quench(): Unit

class Arabica extends Coffee:
  override def wakeup(): Unit = println("The Arabica coffee wake me up")
  override def quench(): Unit = println("The Arabica coffee quench my thirst")

class Robusta extends Coffee:
  override def wakeup(): Unit = println("The Robusta coffee wake me up")
  override def quench(): Unit = println("The Robusta coffee quench my thirst")


object CoffeeShop:
  def getCoffee(): Coffee =
    if (Random.nextInt(2)%2==0)
      Arabica()
    else
      Robusta()