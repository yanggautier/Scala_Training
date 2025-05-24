import scala.util.Random

@main
def SealedClassPractice():Unit = {
  for (i <- 1 to 10)
    val myVehicule = getVehicle()
    myVehicule match {
      case x: Car9 => println(s"$x is faster")
      case x: Bicycle => println(s"$x is healthy")
    }
}

sealed class Vehicle

sealed class Car9 extends Vehicle

sealed class Bicycle extends Vehicle

class BMW2 extends Car9

class Pegasus extends Bicycle

def getVehicle():Vehicle =
  if (Random.nextInt(100) % 2 == 0) BMW2() else Pegasus()