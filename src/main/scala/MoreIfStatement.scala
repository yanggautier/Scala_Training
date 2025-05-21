import scala.io.StdIn

@main
def moreIfStatement():Unit = {
  val petStore = List("cat", "dog", "rabbit")
  val hasCatFood = true

  if (petStore.contains("cat"))
    if (hasCatFood)
      println("Buy cat and cat food")
    else
      println("Buy cat")
  else
      println("Ask pet store to get cat")

  println("Do you want eggs?")
  val hasEggs = StdIn.readLine().toBoolean
  println("Do you want bacon?")
  val hasBacon = StdIn.readLine().toBoolean
  var total = 0

  if (hasEggs)
    total += 12 * 5
  if (hasBacon)
    total += 2

  println(s"The man spend $total at market")


}