@main
def matchList():Unit = {
  val numbers = List(1, 2, 3)
  numbers match
    case List(1, 2, 3) => println("single digits")
    case List(10, 11, 12) => println("double digits")
    case _ => println("unknow")

  val animalFeed = ("cat", "catFood")
  animalFeed match
    case ("cat", _) => println("cat info")
    case ("dog", _) => println("dog info")
    case _ => println("random tuple")
}