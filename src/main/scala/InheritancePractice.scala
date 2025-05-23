@main
def inheritancePractice():Unit = {
  val myLaptop = Laptop()

  val apple = Apple()
  apple.screenSize = 13
  apple.speed = 1400
  apple.name = "Apple mackbook"

  myLaptop.run()
  apple.run()
}

open class Laptop:
  var screenSize = 15
  var speed = 1200
  var name = "Generic laptop"

  def run():Unit =  println(s"Running laptop '$name' with screen size $screenSize and speed $speed")

class Apple extends  Laptop




