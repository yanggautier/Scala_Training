@main
def nestedClassPractice():Unit = {
  val myComputer = Computer()
  myComputer.bootUp()
}

class Computer:
  def bootUp():Unit = println("Booting up computer")
  private val os: OperatingSystem = OperatingSystem()
  os.startOs()
  println("Computer ready")

  private class OperatingSystem:
    def startOs():Unit = println("Starting OS")