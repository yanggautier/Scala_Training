import scala.collection.mutable.ArrayBuffer

@main
def listExercise():Unit = {
  val animals = ArrayBuffer("lion", "zebra", "chimp", "elephant")
  animals.addOne("panda")
  println(animals)
  animals.remove(animals.indexOf("lion"))
  println(animals)
  println(animals.contains("elephant") && animals.contains("giraffes"))
}