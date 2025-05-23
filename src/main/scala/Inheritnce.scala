@main
def inheritance():Unit = {
  val myDog = Corgi()
  println(myDog.size)
  myDog.bark()
  myDog.play()
}

open class Dog:
  var size:Int = 0

  def bark():Unit = println("Bark")

  def play():Unit = println("Play")

class Corgi extends Dog