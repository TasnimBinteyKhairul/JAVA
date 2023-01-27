import Interfaces.*;
import Classes.*;
import java.io.*;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Customer c = new Customer();
        Employee e = new Employee();
		Account a = new Account();
        Bank Ab = new Bank();
		File FILE=new File("History.txt");
		String NewLine=System.getProperty("line.separator");
		boolean con=true;
		try{
while (con=true)
{	
        FileWriter writer;
	    con=true;
        System.out.println("----WELCOME TO XYZ BANK LIMITED----");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Account Transactions");
        System.out.println("4.--------Exit----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Option you want to do : ");
        int digit = input.nextInt();
        switch (digit) {
            case 1:
                double salary;
                String name,id;
                System.out.println("1. Insert New Employee");
                System.out.println("2. Remove Existing Employee");
				System.out.println("3. Show All Employees");
				System.out.println("4. Go Back");
                System.out.println("Enter any Option you want to do : ");
				int Number = input.nextInt();
				switch (Number) {
                    case 1:
                        System.out.println("Employee Name:");
                        name = input.next();
                        e.setName(name);

                        System.out.println("Employee ID:");
                        id = input.next();
                        e.setId(id);
                        System.out.println("Employee Salary:");
                        salary = (double) input.nextInt();
                        e.setSalary(salary);
                        Ab.insertEmployee(e);
                        break;
                    case 2:
                        if (Ab.totalEmployee == 0) {
                            System.out.println("There are no Employees inside Bank");
                        }
                        System.out.println("Employee ID:");
                        id = input.next();
                        e = Ab.getEmployee(id);
                        if (e.getId().equals(id)) {
						Ab.removeEmployee(e);
                        } 
						else {
                            System.out.println("Employee not found\n");
                        }
                        break;
                    case 3:
                        Ab.showAllEmployees();
                        break;
					case 4: break;
                    default:
                        System.out.println("Wrong Selection");
                        System.out.println(" Thank You ");
                }
                break;
            case 2:
                int nid;
				int num;
				double balance;
                System.out.println("1. Insert New Customer  ");
                System.out.println("2. Remove Existing Customer");
                System.out.println("3. Show All Customer");
				System.out.println("4. Go Back");
                System.out.println("Enter any Option you want to do : ");
                int Num = input.nextInt();
                switch (Num) {
                    case 1:
                        System.out.println("Customer Name:");
                        name = input.next();
                        c.setName(name);
                        System.out.println("Customer NID:");
                        nid = input.nextInt();
                        c.setNid(nid);
                        Ab.insertCustomer(c);
                        Ab.insertCustomer(c);
						System.out.println("Account No:");
						num=input.nextInt();
						a.setAccountNumber(num);
						System.out.println("Account Balance:");
						balance=input.nextDouble();
						a.setBalance(balance);
						c.insertAccount(a);
                        System.out.println("Customer  Successfully Inserted");
                        break;
                    case 2:
                        if (Ab.totalCustomers == 0) {
                            System.out.println("There are no Customers inside Bank");
                        }
                        System.out.println("Customer NID:");
                        nid = input.nextInt();
                        c = Ab.getCustomer(nid);
                        if (c.getNid() != nid) {
                            System.out.println("Customer not found\n");
                        } else {
                            Ab.removeCustomer(c);
                        }
                        System.out.println("Customer Successfully Removed");
                        break;
                    case 3:
                        Ab.showAllCustomers();
                        System.out.println("Show all Customer ");
                        break;
					case 4: break;
                    default:
                        System.out.println("Wrong Selection");
                }
                System.out.println(" Thank You ");
                break;
            case 3:
			    writer = new FileWriter(FILE,true);
                int accountNumber;
                double amount;
				int Nid;
                        System.out.println("1.Deposit Money");
                        System.out.println("2.Withdraw Money ");
						System.out.println("4. Go Back");
                        System.out.println("Enter any Option you want to do : ");
                        int Noo = input.nextInt();
                        switch (Noo) {
                            case 1:
                                if (Ab.totalCustomers == 0) {
                                    System.out.println("There are No Customers In Bank");
                                    break;
                                }
                                System.out.println("Customer NID:");
                                Nid = input.nextInt();
                                c = Ab.getCustomer(Nid);
								
								if (c.totalAccounts == 0) {
                                    System.out.println("Customer Has No Accounts");
                                    break;
                                }
                                System.out.println("Customer Account Number:");
                                accountNumber = input.nextInt();
                                a = c.getAccount(accountNumber);
                                System.out.println("Deposit Amount:");
                                amount = input.nextDouble();
                                try {
                                    double kk=a.addedBalance;
									String MM=String.valueOf(kk);
									writer.write("Diposit: "+MM);
                                    writer.write("    "+NewLine);
									writer.close();
                                }
								catch (NullPointerException x) {
                                    System.out.println("Customer Does Not Own This Account" +x);
                                }
                                System.out.println("Money Successfully Deposit ");
                                break;
                            case 2:
                                if (Ab.totalCustomers == 0) {
                                    System.out.println("There are No Customers In Bank");
                                    break;
                                }
                                System.out.println("Customer NID:");
                                nid = input.nextInt();
                                c = Ab.getCustomer(nid);
                                if (c.totalAccounts == 0) {
                                    System.out.println("Customer Has No Accounts");
                                }
                                System.out.println("Customer Account Number:");
                                accountNumber = input.nextInt();
                                a = c.getAccount(accountNumber);
                                System.out.println("Withdraw Amount:");
                                amount = input.nextDouble();
                                double LL= a.subbedBalance;
								String FF=String.valueOf(LL);
								writer.write(" Withdrawn "+FF);
                                writer.write("    "+NewLine);
								writer.close();
                                System.out.println("Money Successfully Withdraw ");
                                break;
								case 3: break;
                            default:
                                System.out.println("Wrong Selection");
                                System.out.println(" Thank You ");
                        }
                    case 4:
                        System.out.println(" Thank You For your Visit To Our Bank ");
						con=false;
                        break;
                    default:
                        System.out.println("Wrong Selection Of Digit ");
                }
		}
		}
		catch(Exception rr){
			System.out.println("The Exception is "+rr);
		}
	}
}