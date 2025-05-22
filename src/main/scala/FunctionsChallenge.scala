import scala.io.StdIn

@main
def functionsChallenge():Unit = {
  askDetails()
}

def askDetails():Unit = {
  println("Please enter your name")
  val name = StdIn.readLine()
  println("Please enter your birth year")
  val year = StdIn.readLine().toInt
  println(s"$name is ${2023 - year - 1} or  ${2023 - year} years old")
}