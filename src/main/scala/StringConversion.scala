@main
def stringConversion(): Unit = {
  val name = "John"
  val newName: String = "Alice"
  println(newName.getClass)

  val cats = 3
  val catString = cats.toString
  println(catString.getClass)

  val pi = 3.1415926
  val piString = pi.toString
  println(piString.getClass)
}