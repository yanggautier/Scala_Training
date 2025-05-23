@main
def companionObjectPractice1():Unit = {
  ScalaCourse.getCourseMetaInfo()
  println()
  val course = ScalaCourse()
  course.getCourseInfo()
}

class ScalaCourse:
  import ScalaCourse.*
  def getCourseInfo() =
    println("Scala is a software development language")
    getCourseMetaInfo()

object ScalaCourse:
  def getCourseMetaInfo() = println("Scala is not a difficult language to learn")