import scala.util.Random

@main
def sealedClasses():Unit = {
  val somePlant = getPlant()
  somePlant match {
    case x: Fruit => println(s"$x is sweet")
    case x: Vegetable => println(s"$x is tasty")
  }
}

abstract class Plant

sealed class Fruit extends Plant

sealed class Vegetable extends Plant

class Apple2 extends Fruit

class Potato extends Vegetable

def getPlant():Plant =
  if (Random.nextInt(100)%2==0) Apple2() else Potato()