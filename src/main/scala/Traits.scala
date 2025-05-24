@main
def traits():Unit ={
  // val a:Iterable[String] = List("a")
  val myOven: Oven2 = getOven()
  myOven.turnOn()
  myOven.cook(160)
  myOven.turnOff()
}

trait Oven2:
  val temperature: Int

  def turnOn():Unit
  def turnOff():Unit
  def cook(temp:Int):Unit = println(s"Cooking at $temp degrees")


class LGOven extends Oven2:
  val temperature:Int = 100

  def turnOn(): Unit = println("LG Oven turn on")
  def turnOff(): Unit = println("LG Oven turn off")

def getOven():Oven2 = LGOven()