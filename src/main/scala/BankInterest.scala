import scala.io.StdIn
import scala.math.pow

@main
def bankInterest(): Unit = {
  println("Type the amount in your bank account ")
  val input = StdIn.readLine().toDouble
  val amountInFiveYears = input * pow(1.05, 5)
  println(s"Your money will be $amountInFiveYears in 5 years !")
}