import scala.io.StdIn

@main
def rangePractice():Unit ={
  println("How many cats do you have?")
  val nbCats = StdIn.readLine().toInt

  val howMay = if(nbCats == 0)
    "no"
  else if (1 to 3 contains nbCats)
    "few"
  else if (4 to 6 contains nbCats)
    "several"
  else
    "many"

  println(s"This person has $howMay cats! ")
}