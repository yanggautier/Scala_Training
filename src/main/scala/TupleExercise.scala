@main
def tupleExercise():Unit = {
  val userInfo = ("Alex", "alex@gmail.com", 273615)
  println(s"User ${userInfo._1} has account number ${userInfo._3}")

  val moreUserInfo = userInfo ++ Tuple1(1200)
  println(moreUserInfo)

  val stores = (("Downtown", 36253), ("West side", 27362), ("East side", 29483))
  val total = stores._1._2 + stores._2._2 + stores._3._2
  println(s"The total revenue of the store is $total")

}