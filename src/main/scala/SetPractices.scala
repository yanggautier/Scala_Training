import scala.collection.mutable

@main
def setPractices(): Unit = {
  val numbers = Set(6, 34, 6, 42)
  println(numbers)
  println(numbers(1))

  val values = mutable.HashSet(3, 4, true, "Hello")
  println(values)

  values.add(35)
  println(values)

  values.remove(4)
  println(values)

  values += 1
  println(values)

  values -= 1
  println(values)

  values.addAll(List(1, 2,3, 4, 5, 2))
  println(values)

  values += (10 ,13)
  println(values)

  values -= (4, 5)
  println(values)

  val colors = mutable.HashSet("red", "green")
  colors ++= Set("yellow", "black")
  println(colors)
  colors --= Set("red", "yellow")
  println(colors)

  println(colors.size)
  println(colors.contains("blue"))
  println(colors.isEmpty)
  println(colors.nonEmpty)
  println(colors.head)
  println(colors.tail)

}