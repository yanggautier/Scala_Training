@main
def oopObjectsChallenge():Unit = {
  val math = SimpleMath()
  println(s"3 + 7 = ${math.add(3,7)}")
  println(s"2 - 8 = ${math.sub(2,8)}")
  println(s"7 * 5 = ${math.mul(7,5)}")
  println(s"7 / é = ${math.div(7,2)}")
}

class SimpleMath:
  def add(a:Int, b:Int):Int = a + b
  def sub(a:Int, b:Int):Int = a - b
  def mul(a:Int, b:Int):Int = a * b
  def div(a: Int, b: Int): Double = a.toDouble / b