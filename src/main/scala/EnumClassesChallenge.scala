@main
def enumClassesChallenge():Unit = {
  println(Olympics.getMedal(1))
  println(Olympics.getMedal(3))
  println(Olympics.getMedal(9))
  println(Metal.SILVER.position)
}

enum Metal(val position: Int):
  case GOLD extends Metal(1)
  case SILVER extends Metal(2)
  case BRONZE extends Metal(3)
  case NONE extends Metal(4)

object Olympics:
  def getMedal(position: Int): Metal =
    position match
      case 1 => Metal.GOLD
      case 2 => Metal.SILVER
      case 3 => Metal.BRONZE
      case _ => Metal.NONE