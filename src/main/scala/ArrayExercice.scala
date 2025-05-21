import scala.collection.mutable.ArrayBuffer

@main

def arrayExercise():Unit = {
  val items = ArrayBuffer("laptop", "mouse", "pen", "paper", "mug", "phone")
  val removedItems = ArrayBuffer("pen", "paper", "mug", "phone")
  println(items --= removedItems)
}