@main
def principalsEncapsulation():Unit = {
  val plane = Airplane3()
  plane.fly()
}

open class Airplane3:
  protected var name = "Airbus"
  private def runEngines(): Unit = println("Turn on engines")

  def fly(): Unit =
    runEngines()
    println(s"$name flying")