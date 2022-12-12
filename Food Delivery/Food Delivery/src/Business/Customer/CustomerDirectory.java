/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import Business.Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author srikr
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    private Customer customer;
    int cid;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }
    
    

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer createUserAccount(String name,String userName, String address, String phoneno){
        Customer c = new Customer();
                c.setName(name);
                c.setUserName(userName);
                c.setAddress(address);
                c.setNumber(phoneno);
                customerDirectory.add(c);
                return c;
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
                try{
                    Connection con = DatabaseConnection.getCon();
                    Statement st = con.createStatement();
                    String query = "USE fooddeliver";
                    st.executeQuery(query);
                    query = "DELETE FROM customerorders WHERE Customerid ="
                            + "(Select Customerid from customer where userName='"+username+"')";
                    st.executeUpdate(query);
                    query = "DELETE FROM customer WHERE userName = '"+username+"'";
                    st.executeUpdate(query);
                }catch(Exception e){
                    System.out.print(e.getMessage());
                }
            }
        }
    }
    
    public ArrayList<Customer> getCustomerDatafromDB(){
        ArrayList<Customer> CustomerData = new ArrayList();
        try{
            Connection con = DatabaseConnection.getCon();
            String sql = " SELECT * FROM customer";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sql = " SELECT * FROM customerorders where Customerid ="
                                + "(Select Customerid from customer where name='"+rs.getString("name")+"')";
                PreparedStatement ps1 = con.prepareStatement(sql);
                ResultSet rs1 = ps1.executeQuery();
                Customer c = new Customer();
                c.setName(rs.getString("name"));
                c.setUserName(rs.getString("userName"));
                c.setAddress(rs.getString("address"));
                c.setNumber(rs.getString("phoneno"));
                CustomerData.add(c);
                }
            }catch(Exception e){
                    System.out.print(e.getMessage());
            }
            return CustomerData;
    }
    
    public Customer addCustomer(Customer c){
        customerDirectory.add(c);
        try{
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            String query = "USE fooddeliver";
            st.executeUpdate(query);
            query = "INSERT INTO customer (name,userName,address,phoneno)"
                    + "VALUES (?,?,?,?))";
            PreparedStatement ps = null;
            ps=con.prepareStatement(query);
            ps.setString(1, c.getName());
            ps.setString(2,c.getUserName());
            ps.setString(3, c.getAddress());
            ps.setString(4,c.getNumber());
            ps.execute();
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        return c;
    }
    
    public void updateCustomerInfo(Customer c, String name,String number,String address ){
         c.setName(name);
         c.setAddress(address);
         c.setNumber(number);
     }
}
