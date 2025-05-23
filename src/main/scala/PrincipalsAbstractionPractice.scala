@main
def principalsAbstractionPractice():Unit = {
  val pug = Pug()
  pug.bark()
  pug.run()
  pug.play()

  val bassetHound = BassetHound()
  bassetHound.bark()
  bassetHound.run()
  bassetHound.play()

  val chihuahua = Chihuahua()
  chihuahua.bark()
  chihuahua.run()
  chihuahua.play()
}

abstract class Dog2(val name: String):
  def run() = println(s"A $name can run")
  def bark() = println(s"A $name can bark")
  def play() = println(s"A $name can play")


class Pug extends Dog2("pug"):
  override def bark(): Unit = println(s"A $name CANNOT bark")

class BassetHound extends Dog2("basset hound"):
  override def run(): Unit = println(s"A $name CANNOT run")

class Chihuahua extends Dog2("chihuahua"):
  override def play(): Unit = println(s"A $name CANNOT play")