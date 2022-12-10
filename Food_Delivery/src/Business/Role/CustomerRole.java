/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class CustomerRole extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        return new CustomerAreaPanel(userProcessContainer, account,ecosystem);
    }
    
    
}
