/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author srikr
 */
public class DeliveryManDirectory {
 
    private ArrayList<DeliveryMan> deliveryManDirectory;
    private DeliveryMan deliveryMan;
    
    public DeliveryManDirectory(){
        this.deliveryManDirectory =  new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    public DeliveryMan createUserAccount(String username){
        deliveryMan = new DeliveryMan(username);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    
    public void deleteDeliveryMan(String username){
        for(int i=0;i<deliveryManDirectory.size();i++){
            if(deliveryManDirectory.get(i).getUserName()==username){
                deliveryManDirectory.remove(i);
            }
        }
    
    }
    
}
