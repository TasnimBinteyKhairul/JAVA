package Classes;
import Interfaces.*;
public  class Account implements ITransactions {
    protected int accountNumber;
    protected double balance;
	public double addedBalance = 0;
	public double subbedBalance = 0;
    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }
    public void setBalance(double bal) {
        this.balance = bal;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
     public void showInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + this.getBalance());
    }
    @Override
    public void deposit(double amount) {
        
        if (amount > 0) {
            addedBalance = this.getBalance() + amount;
            this.setBalance(addedBalance);
            System.out.println("Successfully Deposited");
			System.out.println("New Balance = "+addedBalance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
    @Override
    public void withdraw(double amount) {
       
        if (amount <= this.getBalance() && amount > 0) {
            subbedBalance = this.getBalance() - amount;
            this.setBalance(subbedBalance);
            System.out.println("Successfully Withdrawn");
			System.out.println("New Balance = "+subbedBalance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
    @Override
    public void transfer(Account a, double amount) {
        System.out.println(this.getBalance());
        System.out.println(amount);
        if (this.getBalance() >= amount) {
            this.withdraw(amount);
            a.deposit(amount);
            System.out.println("Transfer Succesfull");
        }
    }
}