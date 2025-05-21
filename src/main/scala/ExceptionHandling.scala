import scala.io.StdIn

@main
def exceptionHandling():Unit = {
  val input=StdIn.readLine()

  throw IllegalStateException("I dont like this input")

  try {
    val number = input.toInt
  } catch {
    case f: NumberFormatException => {
      println("Number format Exception occurred")
      f.printStackTrace()
    }
    case e: Exception => {
      println(s"Cannot convert input into a number \n ${e.getLocalizedMessage}")
    }
  }
  finally {
    println("Resource utilisation has completed, free up all resources")
  }
  println("Continuing exiting")
}