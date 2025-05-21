@main
def multiParameters():Unit = {
  for (row <- 1 to 5; column <- 3 to 9)
    println(s"x = $row y = $column")

  for (row <- 1 to 5)
    for (column <- 3 to 6)
      print(s"$row, $column \n")

  val clients = List("Alice", "Bob", "Carol", "Britney", "Tom")
  for (client <- clients if client.length > 4)
    println(s"Hello $client")

  for (client <- clients if client.length > 4; if client.toLowerCase.contains('a'))
    println(s"Hello $client")

  println()
  val output = for (client <- clients if client.length > 4)
    yield client
  println(s"Hello $output")
}