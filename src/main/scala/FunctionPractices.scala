@main
def functions():Unit = {
  for (i <- 1 to 10)
    sayHello2()
}

def sayHello2():Unit = 
  println("Hello everyone")


