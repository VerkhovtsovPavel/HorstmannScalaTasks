class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var operationCounter = 0; 
  private var operationSum = 0.0;
  
  override def deposit(amount: Double) = {
    if (operationCounter > 3) {
      super.withdraw(1)
    }
    operationCounter += 1
    operationSum += amount
    super.deposit(amount);
  }
  
  override def withdraw(amount: Double) = {
    if (operationCounter > 3) {
      super.withdraw(1)
    }
    operationCounter += 1
    operationSum += amount
    super.withdraw(amount);
  }
  
  def earnMonthlyInterest() { operationCounter =0; super.deposit(operationSum*0.03) ; operationSum = 0 }
}