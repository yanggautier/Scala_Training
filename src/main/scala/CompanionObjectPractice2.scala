import javax.crypto.SecretKey
import scala.util.Random

@main
def CompanionObjectPractice2():Unit = {
  val correctKey = Lock.createKey()
  val myLock = Lock(correctKey)
  myLock.unlock(correctKey)

  val randomKey = Lock.createKey()
  myLock.unlock(randomKey)
}

class Lock(key: Key):
  private val secretCode = generateSecret()
  key.setSecretCode(secretCode)

  def generateSecret() = Random.nextInt().toString

  def unlock(key:Key) =
    if (key.getSecretCode() == secretCode)
      println("Lock is open")
    else
      println("Key is not correct")

class Key:
  private var secretCode =""

  def getSecretCode() = secretCode

  def setSecretCode(secretCode: String):Unit =
    if (this.secretCode == "")
      this.secretCode = secretCode

object Lock:
  def createKey() = Key()