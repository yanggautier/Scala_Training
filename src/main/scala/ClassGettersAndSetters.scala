@main
def classGettersAndSetters():Unit = {
  val myCar = Car6()
  myCar.setSpeed(125)
  println(myCar.getSpeed())
}

class Car6:
  private var speed = 50

  def getSpeed() = this.speed
  def setSpeed(speed:Int):Unit = this.speed = speed