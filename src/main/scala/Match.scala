import scala.io.StdIn

@main
def matchPractice():Unit = {
  println("Type an animal")
  val input = StdIn.readLine()

  var action = ""
  input match
    case "dog" => action = "pet it"
    case "cat" => action = "feed it"
    case "crocodile" => action = "run away"
    case _ => action = "google it"

  println(s"When you see a $input you $action")
}