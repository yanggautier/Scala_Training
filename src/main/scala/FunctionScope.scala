@main
def functionScope():Unit = {
  example()
  // println(s"I have $flowers  flower")
}

def example():Unit = {
  val flowers = 5
  test()
  def test():Unit = println(println(s"I have $flowers  flower"))
}