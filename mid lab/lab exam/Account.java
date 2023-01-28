class Account
{
	
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	 Account()
	{
		
		System.out.println("Empty constructor Account");
	}

	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}


public void depositMoney(double amount)
{

	if(amount>0)
	{
	balance=balance+amount;
	System.out.println("Balance After Deposit: "+balance);	
	}

}	

public void withdrawMoney(double amount)
{
	if(balance>=amount)
	{
	balance=balance-amount;
	System.out.println("Balance After Widthdraw: "+balance);
	}

}
	
}
	
