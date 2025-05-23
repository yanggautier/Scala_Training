@main
def classGettersSettersExercise():Unit = {
  val account = BanKAccount2()
  account.getAmount()
  account.updateAmount(20000)
  account.getAmount()
  account.updateAmount(500)
  account.getAmount()
}

class BanKAccount2:
  private var amount = 0
  private var interest = 0d

  def getAmount(): Unit = println(s"Amount in the account is ${this.amount} and interest is ${this.interest}")
  def updateAmount(amount:Int): Unit =
    this.amount = amount
    if (amount > 10000)
      this.interest = 0.2
    else if (amount <= 1000)
      this.interest = 0.5
    else
      this.interest = 1

