import scala.util.Random

@main
def packages():Unit = {
  val abc = List("a", "b", "c")
  val randNb = Random.nextInt()

  admin.doAdmin()
  admin.management.doMgmt()
  hr.doHr()
}

package admin:
  def doAdmin():Unit =
    println("Doing admin")

  package management:
    def doMgmt():Unit =
      println("Doing admin management")

package hr:
  def doHr():Unit =
    println("Doing HR")