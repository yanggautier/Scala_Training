import scala.io.StdIn

@main
def userInput(): Unit = {
  println("Type something")
  val input = StdIn.readLine()
  println(input)

  println("Type an integer")
  val intInput = StdIn.readLine()
  val number = intInput.toInt
  println(number * 2)
}