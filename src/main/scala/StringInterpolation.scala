@main
def stringInterpolation(): Unit = {
  val dogName = "Teddy"
  println(s"My dog's name is $dogName")
  println(s"How much ${1 + 1} cats")
  println(raw"This is a new \n \\line")

  val str2 ="""
      This is a
      multiline
      string
    """
  println(str2)

  val str3 =
    """
      |This is a
      |multiline
      |string
      |""".stripMargin
  println(str3)
}