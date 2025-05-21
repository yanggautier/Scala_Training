@main
def booleanExamples():Unit = {
  val isDay = true
  val isNight = false
  println(isDay)
  println(isNight)
  println(isDay.getClass)

  println(s"true && false ${true && false}")
  println(s"true && false ${true || false}")
}