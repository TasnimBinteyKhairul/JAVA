class Start 
{
	public static void main(String args[])
	{
		FixedAccount f1=new FixedAccount();
		
		f1.setTenureYear(10);
		f1.setAccountNumber("14235341");
		f1.setAccountHolderName("Tasnim");
		f1.setBalance(10000);
		
		System.out.println("TenureYear - f1: "+f1.getTenureYear());
		System.out.println("Account Number - f1: "+f1.getAccountNumber());
		System.out.println("Account Holder Name - f1: "+f1.getAccountHolderName());
		System.out.println("Account Balance - f1: "+f1.getBalance());
		f1.depositMoney(200);
		
		

		
		SavingsAccount s1=new SavingsAccount();
		
		s1.setInterestRate(199.10);
		s1.setAccountNumber("10082");
		s1.setAccountHolderName("Binte khairul");
		s1.setBalance(1990);
		
		System.out.println("Interest Rate - s1: "+s1.getInterestRate());
		System.out.println("Account Number - s1: "+s1.getAccountNumber());
		System.out.println("Account Holder Name - s1: "+s1.getAccountHolderName());
		System.out.println("Account Balance - s1: "+s1.getBalance());
		s1.withdrawMoney(399);
	}
}