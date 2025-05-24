@main
def enumClasses():Unit = {
  decide(Color.RED)
  decide(Color.GREEN)

  println(Color.valueOf("RED"))
  println(Color.GREEN.ordinal)
  println(Color.values.toList)
  println(Color.fromOrdinal(2))

  Color.RED.drawColor()
  println(Color.BLUE.hex)
}

enum Color(val hex: String):
  case RED extends Color("0xff0000")
  case GREEN extends Color("0x00ff00")
  case BLUE extends Color("0x0000ff")

  def drawColor(): Unit = println(s"Drawing color $hex")

def decide(color: Color):Unit =
  color match
    case Color.RED => println("You chose red")
    case Color.GREEN => println("You chose green")
    case Color.BLUE => println("You chose blue")