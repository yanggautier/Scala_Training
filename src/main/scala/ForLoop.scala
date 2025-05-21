@main
def forLoop():Unit = {
  val collection = List(1, 2, 3)
  for (x <- collection)
    println(x)

  val animals = List("cat", "dog", "mouse", "horse")
  for (animal <- animals)
    println(animal)

  for (i <- 1 to 12)
    val month = i match
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => ""
    println(s"Month $i is called $month")

  for (i <- 1 to 10)
    println(i)

  val customers = Map("Alice" -> 4, "Judy" -> 5, "Anna" -> 6)
  for (customerName <- customers.keys)
    val name = customers(customerName)
    println(s"$customerName has value $name")
}