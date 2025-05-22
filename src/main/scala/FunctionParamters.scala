@main
def FunctionParameters():Unit = {
  sayHello(List("Alley", "Tom"))
  double(5, "5 * 2 = ")
}

def sayHello(people: List[String]): Unit = {
  for (person <- people)
    println(s"Hi $person")
}

def double(number:Int, message:String="Double is"):Unit = {
  println(s"$message ${number * 2}")
}

def calculateCircleArea(radius:Int):Double = {
  val pi = 3.14159
  pi * radius * radius
}

def personalisedGreeting(person: String):String = {
  person(0) match {
    case 'A' => s"Are you ok $person"
    case 'W' => s"What's up $person"
    case _ => s"Hi $person"
  }
}

