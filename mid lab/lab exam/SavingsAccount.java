class SavingsAccount extends Account
{
	
private double interestRate;

  SavingsAccount()
{
	System.out.println("Empty constructor of SavingsAccount ");
}
public void setInterestRate(double interestRate)
{
	this.interestRate=interestRate;
}
public double getInterestRate()
{
	return interestRate;
}

}