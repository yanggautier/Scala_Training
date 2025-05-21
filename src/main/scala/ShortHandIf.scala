import scala.io.StdIn

@main
def shorHandIf():Unit = {
  println("Please enter a number")
  val number = StdIn.readLine().toInt
  var isEven: String = null

  isEven = if(number %2 == 0) "Number is even" else "Number if odd"
}