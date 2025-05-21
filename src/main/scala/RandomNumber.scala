import scala.util.Random
import java.util.Calendar

@main
def randomNumber(): Unit = {
  println(Random.nextInt(100))
  println(Random.nextString(20))
  println(Random.nextPrintableChar())
  println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString)
}