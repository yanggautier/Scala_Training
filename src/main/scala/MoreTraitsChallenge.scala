import scala.util.Random

@main
def moreTraitsChallenge():Unit = {
  for (i <- 1 to 10)
    val rentalCar = CarRentalPlace.rentalCar()
    rentalCar.rent()
}


trait Car8:
  def rent(): Unit
  val price: Int

class LuxuryCar extends Car8:
  override def rent(): Unit = println(s"Limousine drive me there in comfort with price $price")
  override val price = 1000

class UtilityCar extends Car8:
  override val price = 500
  override def rent(): Unit = println(s"This utility car is cheaper it costs $price per day")


/**
 * This object provides a method to rent a car from a car rental place.
 * The rental car is randomly selected between a LuxuryCar and a UtilityCar.
 *
 * @return A Car8 instance representing the rented car.
 */
object CarRentalPlace:
  def rentalCar(): Car8 =
    if (Random.nextBoolean())
      LuxuryCar()
    else
      UtilityCar()
