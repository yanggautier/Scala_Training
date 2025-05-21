@main
def arithmeticOperators():Unit = {
  val result = 5 + 2
  println(result)

  val result2 =  9 - 4
  println(result2)

  val result3 = 9 * 4
  println(result3)

  val result4 = 7d / 2
  println(result4)

  val result5 = 16 % 3
  println(result5)

  val a: Short = 6
  val b: Int = 3
  val c = a * b
  println(c.getClass)

  val d = 89534534l
  val e = 232.4535
  val r = d / e
  println(r)
  println(r.getClass)

  val dozen = 12
  val month = dozen
  println(month)

  val products = 3
  val price = 9.99
  val total = s"Your total is $$${products * price}"
  println(total)


  var bikes = 5
  bikes += 1
  println(bikes)

  var lions = 13
  lions -= 7
  println(lions)

  var dogs = 5
  dogs *= 2
  println(dogs)

  var rabbit = 6
  rabbit /= 2
  println(rabbit)

  var mouses = 9
  mouses %= 4
  println(mouses)
}

