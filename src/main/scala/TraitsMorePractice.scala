@main
def traitsMorePractice():Unit = {
  var myFood = FastFoodRestaurant().buyFood()
  myFood.eat()

  myFood = FastFoodRestaurant().buyFood()
  myFood.eat()

}

trait Food:
  def eat(): Unit

class FastFood extends Food:
  override def eat():Unit =  println("Fast food will feed you")

class FrenchFood extends Food:
  override def eat():Unit =  println("French food will feed you AND delight you")

trait Restaurant2:
  def buyFood(): Food

class FastFoodRestaurant extends Restaurant2:
  override def buyFood(): Food = FastFood()

class FrenchRestaurant extends Restaurant2:
  override def buyFood(): Food = FrenchFood()