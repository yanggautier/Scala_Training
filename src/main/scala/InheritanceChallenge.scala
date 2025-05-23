@main
def inheritanceChallenge():Unit = {
  val b747 = Boeing()
  val a380 = Airbus()

  b747.speed = 700
  a380.speed = 800

  b747.name = "Boeing 747"
  a380.name = "Airbus A380"
  
  b747.ascend()
  a380.descend()
  b747.ascend()
  a380.descend()
  a380.descend()
  b747.descend()
  a380.ascend()
  a380.ascend()
  
  
}


open class Airplane:
  var name = "Generic airplane"
  var speed = 1000
  private var altitude = 20_000

  def ascend():Unit = {
    altitude += speed
    display()
  }

  def descend():Unit = {
    altitude -= speed
    display()
  }

  private def display():Unit = println(s"$name has an altitude of $altitude and speed $speed")


class Boeing extends  Airplane

class Airbus extends  Airplane