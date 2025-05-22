@main
def functions():Unit = {
  for (i <- 1 to 10)
    sayHello()
}

def sayHello():Unit = {
  println("Hello everyone")
}


