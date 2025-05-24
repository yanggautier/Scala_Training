@main
def caseClasses():Unit = {
//  val u1 = User("Alex", "alex@gmail.com", "1234")
//  println(u1.toString)
//
//  val u2 = RegularUser("Bob", "bob@gmail.com", "5678")
//  println(u2.toString)

//  val u1 = User("Alex", "alex@gmail.com", "1234")
//  val u2 = User("Alex", "alex@gmail.com", "1234")
//  println(u1 == u2)
//
//  val r1 = RegularUser("Alex", "alex@gmail.com", "1234")
//  val r2 = RegularUser("Alex", "alex@gmail.com", "1234")
//  println(r1 == r2)

  val u1 = User("Alex", "alex@gmail.com", "1234")
  val u2 = u1.copy(email = "smith@email.com")
  println(u1)
  println(u2)
}

case class User(
               name: String,
               email: String,
               password: String
               )

class RegularUser (
                    name: String,
                    email: String,
                    password: String
                  )

