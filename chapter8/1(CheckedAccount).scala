class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = { super.deposit(amount); super.withdraw(1) }
  override def withdraw(amount: Double) = { super.withdraw(amount); super.withdraw(1) }
}