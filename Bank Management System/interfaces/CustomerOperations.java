package Interfaces;
import Classes.*;
public interface CustomerOperations {

    public void insertCustomer(Customer c);

    public void removeCustomer(Customer c);

    public Customer getCustomer(int nid);

    public void showAllCustomers();
}