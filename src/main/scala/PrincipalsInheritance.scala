@main
def principalsInheritance(): Unit = {
  val carol = Daughter("English")
  println(carol.hairColor)
  println(carol.eyeColor)
  carol.say("Hi")

}

open class Mom(nativeTongue: String):
  def hairColor = "brown"
  val eyeColor = "blue"

  def say(message:String):Unit = println(s"Mom says '$message' in $nativeTongue")

class Daughter(nativeTongue: String) extends  Mom(nativeTongue):
  override val eyeColor: String = "blonde"

  override def say(message: String): Unit = {
    println(s"Daughter says '$message' in $nativeTongue")
    println(s"Mom's hair color is ${super.hairColor} daughter's hair color is $hairColor")
    super.say(message)
  }
