import scala.collection.mutable.ArrayBuffer

@main
def caseClassPractice():Unit = {
  val customers = ArrayBuffer[Customer]()
  customers.addOne(Customer("Alice", "alice@gmail.com", 7))
  customers.addOne(Customer("Bob", "bob@gmail.com", 3))
  customers.addOne(Customer("Carol", "carol@gmail.com", 4))
  println(customers)

  val newCustomer = customers(1).copy(email =  "bobnewemail@gmail.com")
  customers.addOne(newCustomer)
  println(customers)

  sendEmail(customers.toList)
}

case class Customer(
                   name: String,
                   email: String,
                   productsBought: Int
                   )

def sendEmail(customers: List[Customer]):Unit =
  customers.foreach { customer => println() }