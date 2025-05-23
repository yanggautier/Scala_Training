@main
def OopObjectsPractice():Unit = {
  val myJet = Jetpack()
  myJet.burn(60)
  myJet.stop(10)
}


class Jetpack:
  private var userHeight:Int = 0

  def burn(seconds: Int):Unit =
    userHeight += seconds
    showHeight()

  def stop(seconds: Int):Unit = {
    if (userHeight - 3 * seconds < 0)
      userHeight = 0
    else
      userHeight -= 3 * seconds
    showHeight()
  }

  private def showHeight():Unit = println(s"The current user Height is ${userHeight} meter(s)")