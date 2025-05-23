@main
def initialisations():Unit = {
  val myCar = Car5("Ferrari", 350)
}


class Car5(brand:String, topSpeed:Int):
  println(s"Brand $brand, top speed $topSpeed")
  canFly()

  private def canFly():Unit =
    if (topSpeed > 300)
      println("This car can fly")


