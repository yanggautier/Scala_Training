import java.util.Calendar
import scala.io.StdIn

@main
def differenceYear(): Unit = {

  val cal = Calendar.getInstance()
  val currentYear = cal.get(Calendar.YEAR)
  println(currentYear)

  println("Input your birthday year!")
  val birthYear = StdIn.readLine().toInt
  println(s"your age is ${currentYear - birthYear}")
}