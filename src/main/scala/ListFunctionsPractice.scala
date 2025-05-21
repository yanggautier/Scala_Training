@main
def listFunctionsPractice(): Unit = {
  val winners = List("Usain", "Join", "Michael", "Alex", "Bob")
  val position = winners.indexOf("Michael") + 1
  println(s"Micheal finished at position $position")
}