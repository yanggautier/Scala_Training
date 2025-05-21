
@main
def typeOfCollections(): Unit = {
  val  l = List(1, 2, 3, 4)
  println(l)

  val l2 =  List(1, true, "my text")
  println(l2)

  val l3 = List()
  println(l3)

  val l4 = Nil
  println(l4)

  val matrix = List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
  println(matrix)
  println(matrix(0)(1))

  val colors = List("red", "green", "blue")
  println(colors.head)
  println(colors.tail)
  println(colors.length)

  val array1 = Array(1, 2, true)
  array1(2)  = 3
  println(array1)
  array1.foreach(println)
  println(array1.mkString)
  println(array1.toList)

  val b = 0 +: array1 :+ 4 :+ 6
  println(b.mkString)

  val c = Array(1, 2, 3)
  val d = Array(4, 5, 6)
  val e = c ++ d
  println(e.mkString)

  import scala.collection.mutable.ArrayBuffer
  val f = ArrayBuffer(1, 2, 3)
  println(f)
  f.addOne(4)
  f.addAll(List(5, 6, 7))
  println(f)
  println(f(1))

  f.remove(1)
  println(f)

  f.remove(1, 3)
  println(f)

  f --= List(1, 6, 7)
  println(f)
}