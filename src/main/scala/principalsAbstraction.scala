import scala.util.Random

@main
def principalsAbstraction():Unit = {
  def getContainer():Container =
    if (Random.nextInt(2) % 2 == 0)
      Bottle()
    else
      Jug()
  for (i <- 1 to 10)
    println(s"$i . ")
    val container: Container = getContainer()
    container.pour()
}

abstract class Container:
  def pour():Unit = println("pouring liquid")

class Bottle extends Container:
  override def pour():Unit = println("pouring bottle")

class Jug extends Container:
  override def pour():Unit = println("pouring jug")