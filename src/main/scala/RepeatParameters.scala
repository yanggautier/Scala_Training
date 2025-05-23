@main
def repeatedParameters():Unit = {
  sayHello4("Mary", "John", "Alex")
  val users = List("Alice", "Bob", "Carol")
  sayHello4(users:_*)
  println(sumOfInteger(7,3,4,5,6))
  println(sumOfInteger(1,3,5,9,3,4,5,6))
}

def sayHello4(names: String*):Unit = {
  for (name <- names)
    println(s"Hi $name")
}

def sumOfInteger(numbers: Int*): Int = {
  var sum = 0
  for (number <- numbers)
    sum += number
  sum
}