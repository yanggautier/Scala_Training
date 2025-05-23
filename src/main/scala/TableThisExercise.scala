@main
def tableThisExercise():Unit = {
  val table = TTable()
  table.printDimension()
  table.updateHeight(130)
  table.updateSize(220)
  table.printDimension()

}

class TTable:
  var height = 120
  var size = 200

  def updateHeight(height:Int): Unit = this.height = height
  def updateSize(size:Int): Unit = this.size = size

  def printDimension():Unit = println(s"Table's height is $height and size is $size")