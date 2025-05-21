@main
def ranges(): Unit = {
  val l1 = 1 to 10
  println(l1.toList)
  val l2 = 'a' to 'z'
  println(l2.toList)
  val l3 = 1 until 10
  println(l3.toList)
  val l4 = 'a' until 'z'
  println(l4.toList)

  val l5 = 1 to 10 by 2
  println(l5.toList)
  val l6 = Range(1, 10)
  println(l6.toList)

  val l7 = Range.inclusive(1, 10)
  println(l7.toList)

  val l8 = Range(1, 10, 3)
  println(l8.toList)

  val l9 = 10 to 1 by -1
  println(l9.toList)

  val l10 = (1 to 10).reverse
  println(l10.toList)

  val r = 1 to 10 by 2
  println(s"Step: ${r.step}")
  println(s"Head: ${r.head}")
  println(s"Tail: ${r.tail}")
  println(s"Last: ${r.last}")
  println(s"End: ${r.end}")
  println(s"Index of 3: ${r.indexOf(3)}")
  println(s"Index of 4: ${r.indexOf(4)}")
  println(s"Length: ${r.length}")
}