@main
def tupleFunctions():Unit = {
  val conn = (80, "www", "google.com", true)
  println(conn.toString())

  val conn2 = conn.copy(_2="ftp")
  println(conn2)

  println(conn.productArity)

  val conn3 = ("abc", 123)
  println(conn3.swap)

  val info = ("auth", "cache")
  println(conn ++ info)
}