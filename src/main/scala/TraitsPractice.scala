@main
def traitsPractice():Unit = {
  val localRes = LocalRestaurant()
  localRes.provideFood()
  localRes.provideBill()
  println()

  val fancyRes = FancyRestaurant()
  fancyRes.provideFood()
  fancyRes.provideBill()
  println()
}


trait Restaurant:
  def provideFood(): Unit
  def provideBill(): Unit


class LocalRestaurant extends Restaurant:
  override def provideFood(): Unit = println("Your local restaurant provides food and drinks")

  override def provideBill(): Unit = println("Please pay $25")

class FancyRestaurant extends Restaurant:
  override def provideFood(): Unit = println("The most delicious food you've ever tried")

  override def provideBill(): Unit = println("Please pay $100")