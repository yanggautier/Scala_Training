@main
def oopClassesAndObjects():Unit = {
  val l: Iterable[String] = List("abc")

  val animals = List("cat", "dog", "horse")
  println(animals.size)
  println(animals.isEmpty)

  val table = Table()
  println(table.color)

  val garbage = Garage()

  garbage.bike.drive()
}

class Table:
  val color: String = "white"

class MBike:
  def drive():Unit = println("Driving my motor bike")

class Garage:
  val bike = MBike()