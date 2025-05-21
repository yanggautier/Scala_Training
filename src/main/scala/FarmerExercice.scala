@main
def cowChallenge():Unit = {
  val nbCow = 3
  val nbProduct = 1
  val children = 2
  val eval = !(nbCow > 5) && (nbProduct > 0) || (children + 1 >= 3)
  println(eval)
}