@main
def commonHigherFunctions():Unit = {
  val clients = List("Carol", "David", "Alice", "Bob", "Anna")
  clients.foreach(client => println(s"Hi, $client"))

  clients.filter(_.length < 4).foreach(client => println(s"Hi, $client"))

  println(clients.filter(_.length <= 4))

  val size = clients.map(_.length)
  println(size)

  val sorted = clients.sortBy(_.length)
  println(sorted)

  val max = clients.maxBy(_.length)
  println(max)

  val min = clients.minBy(_.length)
  println(min)
}