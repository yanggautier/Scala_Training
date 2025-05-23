@main
def thisKeywordPractice():Unit = {
  val myBox = Box()
  println(s"The box contains ${myBox.contents}")
  myBox.updateContents("jewellery")
  println(s"The box contains ${myBox.contents}")
}

class Box:
  var contents = ""

  def updateContents(contents:String):Unit = this.contents = contents