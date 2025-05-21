import scala.io.StdIn

@main
def IfStatement():Unit = {
  val night = true

  if(night)
    println("Sleep, it's time")
  else
    println("So active, it's day")

  println("Please input the fonds amount")
  var clientFunds = StdIn.readLine().toInt
  var price = 50
  var clientProducts = 0

  if (clientFunds >= price)
    clientFunds -= price
    clientProducts += 1
    println(s"You have purchased $clientProducts products")
    println(s"You have $$$clientFunds")
  else
    println("You have insufficient funds")
}