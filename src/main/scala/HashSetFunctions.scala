import scala.collection.mutable

@main
def hashSetFunctions():Unit = {
  val numbers = mutable.HashSet(3, 4, 83, 36)
  println(numbers)

  numbers.addOne(22)
  println(numbers)

  numbers.addAll(List(5,4, 65))
  println(numbers)

  numbers.remove(5)
  println(numbers)

  numbers.subtractOne(36)
  println(numbers)

  val n2 = mutable.HashSet(4, 5, 6, 7, 8)
  println(numbers.intersect(n2))
  println(numbers.union(n2))
  println(numbers.diff(n2))


  val acceptedColors = mutable.HashSet("white", "black", "gray")
  val myColors = Set("blue", "red", "black", "green")

  println(acceptedColors.intersect(myColors))
  acceptedColors.diff(myColors)
}