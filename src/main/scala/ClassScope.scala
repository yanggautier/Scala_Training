@main
def classScope():Unit = {
  val myObject = MyClass()
  // println(myObject.myVariable)

  myObject.myMethod()
  myObject.MtInnerClass().myInnerMethod()
}

class MyClass:
  protected val myVariable = 5

  def myMethod() = println("myMethod called")

  class MtInnerClass:
    def myInnerMethod() = println("myInnerMethod")
