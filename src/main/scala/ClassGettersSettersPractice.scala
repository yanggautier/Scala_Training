@main
def ClassGettersSettersPractice():Unit = {
  val account = BankAccount()
  account.updateAccount(1500)
  account.updateAccount(-1300)
  account.updateAccount(600)
  account.updateAccount(800)

  println(s"Amount in accounts is ${account.getAccount()}")
  println(s"Credit rating is${account.getCreditRating()}")
}

class BankAccount:
  private var creditRating = 500
  private var account = 0

  def getAccount() = account

  def updateAccount(changeAmount:Int) =
    account += changeAmount
    if (changeAmount > 0)
      creditRating += 1
    else
      creditRating -= 1

  def getCreditRating() = creditRating
