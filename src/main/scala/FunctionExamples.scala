import scala.collection.mutable.ArrayBuffer

@main
def listFunctions(): Unit = {
  val colors = Array("blue", "red", "blue", "green")

  println(colors.isEmpty)
  println(colors.length)

  println(colors.contains("red"))
  println(colors.contains("pink"))

  println(colors.indexOf("red"))
  println(colors.indexOf("blue"))
  println(colors.lastIndexOf("blue"))

  println(colors.toList)
  colors(1) = "pink"
  println(colors.toList)
  colors.update(2, "bluer")
  println(colors.toList)

  val colors2 = ArrayBuffer("blue", "red", "blue", "green")
  colors2.addOne("yellow")

  colors2.insert(0, "black")
  println(colors2)

  colors2.clear()
  println(colors2)
}