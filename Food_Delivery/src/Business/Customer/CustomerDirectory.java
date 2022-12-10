/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author srikr
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    private Customer customer;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer createUserAccount(String username){
        customer = new Customer(username);
        customerDirectory.add(customer);
        return customer;
    }
    
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerDirectory.size();i++){
            if(customerDirectory.get(i).getUserName()==username){
                customerDirectory.remove(i);
            }
        }
    }
    
}
