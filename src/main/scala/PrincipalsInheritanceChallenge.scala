@main
def principalsInheritanceChallenge():Unit = {
  val son = Son()
  son.message()
}

open class Father:
  def firstname = "Tom"
  val lastname = "Green"

  def message():Unit = println(s"My name is $firstname $lastname")


class Son extends Father:
  override def firstname: String = "Jemmy"
  override def message(): Unit = {
    super.message()
    println(s"My father's name is ${super.firstname} $lastname")
  }

