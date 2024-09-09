class Account1(val accountId:String, private var balance:Double) {

  def applyInterest():Unit={
    if(balance > 0){
      balance += balance * 0.05;
    } 
    else{
      balance += balance * 0.1;
    }
  }

  def getBalance: Double = balance;

  override def toString: String = f"Account($accountId, Balance: $balance%.2f)";
}

object Bank1 {

  def accountsWithNegativeBalance(accounts:List[Account1]):List[Account1]={
    accounts.filter(_.getBalance < 0);
  }

  def totalBalance(accounts:List[Account1]):Double={
    accounts.map(_.getBalance).sum;
  }

  def applyInterestToAll(accounts:List[Account1]):Unit={
    accounts.foreach(_.applyInterest());
  }

  def main(args: Array[String]):Unit={

    val acc1 = new Account1("A123", 1000.00);
    val acc2 = new Account1("B456", -2000.00);
    val acc3 = new Account1("C789", 3000.00);
    val acc4 = new Account1("D012", -1000.00);
    
    val accounts = List(acc1, acc2, acc3, acc4);

    println("\nBalances before applying interest:");
    accounts.foreach(println);

    println("\nAccounts with negative balances:");
    accountsWithNegativeBalance(accounts).foreach(println);

    println(f"\nTotal balance of all accounts: ${totalBalance(accounts)}%.2f");

    applyInterestToAll(accounts);
    println("\nFinal balances after applying interest:");
    accounts.foreach(println);
  }
}
