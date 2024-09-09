class Account(val accountId: String, private var balance: Double){

  def deposit(amount: Double):Unit={
    if(amount > 0){
      balance += amount;
      println(f"Deposited $amount%.2f to account $accountId");
    } 
    else{
      println("Deposit amount must be positive");
    }
  }

  def withdraw(amount: Double):Unit={
    if(amount > 0 && amount <= balance){
      balance -= amount;
      println(f"Withdrew $amount%.2f from account $accountId");
    } 
    else if(amount > balance){
      println("Insufficient funds");
    }
    else{
      println("Withdraw amount must be positive");
    }
  }

  def transfer(toAccount: Account, amount: Double):Unit={
    if(amount > 0 && amount <= balance){
      this.withdraw(amount);
      toAccount.deposit(amount);
      println(f"Transferred $amount%.2f from account $accountId to account ${toAccount.accountId}");
    } 
    else{
      println("Transfer failed: Check amount and balance");
    }
  }

  def getBalance: Double = balance;

  override def toString: String = f"Account($accountId, Balance: $balance%.2f)";
}

object Bank extends App{
  val acc1 = new Account("Acc1", 2000.00);
  val acc2 = new Account("Acc2", 4000.00);

  println(acc1);
  println(acc2);

  acc1.deposit(1000.00);
  acc1.withdraw(200.00);
  acc1.transfer(acc2, 300.00);

  println(acc1);
  println(acc2);
}