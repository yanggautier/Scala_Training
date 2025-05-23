@main
def constructors():Unit = {
  val c1 = BCar("BMW", 150)
  c1.show()

  val c2 = BCar("Audi")
  c2.show()

  val c3 = BCar()
  c3.show()
}

class BCar(brand:String, topSpeed:Int):

  def this(brand:String) = this(brand, 150)

  def this() = this("No model", 150)

  def show():Unit = println(s"Brand of car is $brand and top speed is $topSpeed")

