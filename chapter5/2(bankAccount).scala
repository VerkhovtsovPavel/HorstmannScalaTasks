object Main extends App {
  val account = new BankAccount(200);
  
  account.deposit(100);
  println(account.seeBalance)
  
  account.withdraw(200);
  println(account.seeBalance)
}

class BankAccount(private[this] var balance : Int){
  def deposit(sum : Int) {balance+=sum}
  def withdraw(sum : Int) {balance-=sum}
  
  def seeBalance = this.balance;
}

