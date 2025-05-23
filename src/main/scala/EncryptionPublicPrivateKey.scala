@main
def encryptionPublicPrivateKey():Unit = {
  val  myLock = EncryptionLock(40)

  println(s"Does the key 70 unlock my lock? ${myLock.unlock(70)}")
}


class EncryptionLock(private val privateKey: Int):
  private def formula(publicKey: Int) = publicKey / 2 + 5

  def unlock(publicKey: Int): Boolean =
    println(privateKey)
    formula(publicKey) == privateKey



