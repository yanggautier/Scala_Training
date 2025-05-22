@main
def highOrderFunctions():Unit = {
  val names = List("Mary", "Kate", "Mike")
  val myLambda = (name:String) => println(s"Hello $name")

  sayHello(names, myLambda)
}

def sayHello(names:List[String], doSomething:String => Unit):Unit = {
  for (name <- names)
    doSomething(name)
}