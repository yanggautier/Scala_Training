@main
def stringMethod(): Unit = {
  val myPet = "Crocodile"
  println(myPet.length)
  // Get character at specific index
  println(myPet(3))
  println(myPet.charAt(3))
  // Substring
  println(myPet.substring(3))
  println(myPet.substring(3, 6))

  val myName = "michelle"
  println(myName.capitalize)
  val myAnimal = "Giraffe"
  println(myAnimal.toLowerCase)
  println(myAnimal.toUpperCase)
  val myText = "   there are too many    space       "
  println(myText.trim)

  println(myText.repeat(2))


}