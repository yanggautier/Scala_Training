@main
def moreFunctionsPractice():Unit = {
  for (i <- 1 to 3)
    println(addition(i * 5, i * 9))

  val products = Map("Shoes" -> 9.99, "Socks" -> 5.99, "Jeans" -> 39.99)
  for (item <- products.keys)
    val finalPrice = addTax(products(item))
    println(s"$item cost $finalPrice")
}

def addition(p1: Int, p2: Int): Int = p1 + p2

def addTax(price: Double): Double = price * 1.2
