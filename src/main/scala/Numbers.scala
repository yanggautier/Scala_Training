@main
def numberTypes(): Unit = {
  val item = 5
  println(item.getClass)

  val item2 = 5.20
  println(item2.getClass)

  val item3 = 80000000000l
  println(item3.getClass)

  val item4 = 5.20F
  println(item4.getClass)

  val item5 = 5_000_000
  println(item5.getClass)

  val item6: Float = 3_000
  println(item6.getClass)

  val item7: Short = 3_000
  println(item7.getClass)

  val item8 = 3 // Int
  val longItem = item8.toLong
  println(longItem.getClass)
}