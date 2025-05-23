@main
def principalsInheritancePractice():Unit = {
  val myParakeet = Parakeet()
  myParakeet.fly()
}

open class Bird:
  def color = "grey"
  def speed = 50

  def fly(): Unit = println(s"A $color bird can fly up to $speed kph")

class Parakeet extends Bird:
  override def color: String = "green"
  override def speed: Int = 65

  override def fly(): Unit = {
    super.fly()
    println(s"A ${super.color} bird can fly up to${super.speed} kph")
  }
