@main
def highOrderFunctions():Unit = {
  val names = List("Mary", "Kate", "Mike")
  val myLambda = (name:String) => println(s"Hello $name")

  sayHello1(names, myLambda)
}

def sayHello1(names:List[String], doSomething:String => Unit):Unit = {
  for (name <- names)
    doSomething(name)
}