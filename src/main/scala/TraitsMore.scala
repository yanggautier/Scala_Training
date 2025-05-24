@main
def traitsMore():Unit = {
  val myCouch = Couch()
  myCouch.sit()
  myCouch.sleep()

  println()

  val myLab = Labrador()
  myLab.beCute()
  myLab.liveBirth()
  myLab.moveAround()
}

trait PlaceToSit:
  def sit(): Unit

trait PlaceToSleep:
  def sleep(): Unit

class Couch extends PlaceToSit, PlaceToSleep:
  override def sit(): Unit = println("Sit on the couch and watch some TV")
  override def sleep(): Unit = println("Take a nap on the couch")


trait Animal:
  def moveAround(): Unit

trait Mammal extends Animal:
  def liveBirth(): Unit

trait Dog3 extends Mammal:
  def beCute(): Unit

class Labrador extends Dog3:
  override def beCute():Unit = println("Running jumping barking")
  override def liveBirth():Unit = println("Make new puppies")
  override def moveAround(): Unit = println("Smell and pee on stuff")