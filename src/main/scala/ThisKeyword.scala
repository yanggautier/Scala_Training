@main
def thisKeyword():Unit = {
  val postIt = PostItNote()
  println(postIt.message)
  postIt.updateMessage("Meeting at 5")
  // println(postIt.message)
  postIt.printMessage()
}

class PostItNote:
  var message:String = "No message"

  def updateMessage(message:String): Unit = this.message = message

  def printMessage():Unit = println(this.message)