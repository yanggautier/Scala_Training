@main
def functionsOverloading():Unit = {
  println(multiply(3))
  println(multiply(4,5))
  sayHello3("John")
  sayHello3(List("Bob", "July"))
}

def multiply(number:Int):Int = number * 2

def multiply(number1:Int, number2:Int):Int = number1 * number2


def sayHello3(person: String):Unit = println(s"Hi $person")
def sayHello3(people: Iterable[String]):Unit = {
  for (person <- people)
    println(s"Hi $person")
}