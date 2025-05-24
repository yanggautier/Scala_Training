@main
def traitsExercise():Unit =  {
  val myCar: Car7 = CarFactory.provideCar()
  myCar.drive()
  myCar.park()
}


trait Car7:
  def drive(): Unit
  def park(): Unit
  val speed: Int


class BMW extends Car7:
  override val speed: Int = 250

  override def drive(): Unit = println(s"BMW is drive at speed $speed")
  override def park(): Unit = println(s"BMW is parking")

object CarFactory:
  def provideCar():Car7 = BMW()