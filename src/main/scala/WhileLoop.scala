@main
def whileLoop():Unit = {
  val puzzlePieces = 20
  var piecesPlaced = 0
  while (piecesPlaced < puzzlePieces)
    piecesPlaced += 1
    println(s"Place piece #$piecesPlaced")
  println("Puzzle complete, exited while loop")

  var i = 0
  while(i < 10)
    i += 1
    println(s"#$i: Hello how are you")

  val cats = List("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
  var j = 0
  while (j < cats.length)
    println(s"Hello ${cats(j)}")
    j += 1

  var m = 1
  var n = 1
  while (m < 10)
    while (n < 10)
      print(s"$m * $n = ${m * n}\t")
      n += 1
    m += 1
    n = 1
    println()
}