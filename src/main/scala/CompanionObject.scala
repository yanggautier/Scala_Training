@main
def companionObject():Unit = {
  Airplane2.checkDescent(4000)
  Airplane2.checkDescent(500)
  println()

  val plane = Airplane2()
  plane.up()
  plane.down()
  plane.down()
}


class Airplane2:
  import Airplane2.*
  private val brand = "Airbus A380"
  private var altitude = 1000

  def up() =
    altitude += 1000
    println(s"$brand ascending to $altitude")

  def down() =
    if (checkDescent(altitude))
      altitude -= 1000
      println(s"$brand descending to $altitude")

object Airplane2:
  def checkDescent(altitude:Int): Boolean =
    if (altitude <= 1000)
      println("Denied: You are about to hit the ground")
      false
    else
      println("Approuved: You can descend")
      true

