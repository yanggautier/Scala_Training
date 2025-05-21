import scala.collection.mutable

@main
def mapTraining():Unit = {
  val count = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
  val count2 = Map((1, "one"), (2, "two"), (3, "three"))
  val count3: Map[Int, String] = Map(1 -> "One", 2 -> "Two")

  println(count3(2))

  println(count2.keys)
  println(count2.values)

  val newCount = mutable.HashMap(1 -> "one", 2 -> "two", 3 -> "three")
  newCount += (4 -> "four")
  newCount.addOne(5 -> "five")
  println(newCount)

  newCount ++= Map(6 -> "Six", 7 -> "Seven")
  println(newCount)

  newCount.addAll( Map(8 -> "Eight", 9 -> "Nine"))
  println(newCount)

  newCount -= 4
  println(newCount)

  newCount.remove(5)
  println(newCount)

  newCount --= Set(7,1)
  println(newCount)

  newCount(11) = "hello"
  println(newCount)

  newCount.clear()
  println(newCount)

  println(newCount.size)
  println(newCount.contains(1))
  println(newCount.contains(5))

  val attendance = mutable.HashMap("23/09" -> 3726, "24/09" -> 4735, "25/09" -> 2836)
  attendance.addOne("26/09" -> 4843)

  println(s"Total attendance at 25/09 and 26/09 is ${attendance("25/09") + attendance("26/09")}")
  println(s"The availability at 22/09 is ${attendance.contains("22/09")}")
}