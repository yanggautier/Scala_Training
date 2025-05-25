@main
def oopClasses():Unit = {
  val myCar = Car()
  val yourCar = Car()

  println(myCar)
  println(yourCar)

  myCar.brand = "BMW"
  yourCar.brand = "Audi"
  println(myCar.brand)
  println(yourCar.brand)

  yourCar.start()
  yourCar.drive(50)
}

class Car:
  var brand :String = "Toyota"
  var topSpeed = 100

  def start():Unit = println(s"Starting the $brand")

  def drive(speed:Int):Unit = println(s"Driving at a speed of $speed")