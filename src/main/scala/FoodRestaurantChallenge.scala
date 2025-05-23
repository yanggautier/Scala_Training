@main
def foodRestaurantChallenge():Unit = {

}

open class OriginalRestaurant:
  protected def appleFormula():Unit = println("Prepare burgers with love and care")

class Franchise extends OriginalRestaurant:
  def prepareBurger():Unit = {
    println("Preparing burgers according to the secret formula")
    appleFormula()
  }

