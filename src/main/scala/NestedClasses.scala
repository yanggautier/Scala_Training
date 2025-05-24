@main
def nestedClasses():Unit = {
  val myCar = Car10()
  myCar.drive()
}

class Car10:
  val engine = Engine()
  var speed = 100
  def drive(): Unit =
    engine.run()
    println(s"Driving at $speed kph")

  class Engine:
    val rpm = 300
    def run(): Unit =
      Car10.this.speed = 150
      println("Engine running")