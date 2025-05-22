@main
def lambdaFunction():Unit = {
  val myLambda = (name:String) => println(s"Hello $name")

  myLambda("Jemmy")
}