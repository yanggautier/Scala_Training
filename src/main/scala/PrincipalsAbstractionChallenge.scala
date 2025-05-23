@main
def principalsAbstractionChallenge():Unit = {
  val bosch:Oven = Bosch()
  bosch.cooking()

  val roaster:Oven = Roaster()
  roaster.cooking()
}


abstract class Oven:
  val speed:Int = 20
  val topTemperature = 250
  def cooking():Unit = println(s"Can cook everything with speed $speed and top temperature up to $topTemperature")


class Bosch extends Oven:
  override val topTemperature: Int = 300


class Roaster extends Oven:
  override def cooking(): Unit = println(s"Cannot cook roasts with speed $speed and top temperature up to $topTemperature")
