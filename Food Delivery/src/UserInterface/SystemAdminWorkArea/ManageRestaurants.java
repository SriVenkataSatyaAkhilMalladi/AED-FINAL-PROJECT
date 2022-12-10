/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author srikr
 */
public class ManageRestaurants extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurants
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount user;
    
    public ManageRestaurants(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateRestrauntTable();
    }
    
    

    public void populateRestrauntTable(){
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblRestrauntAdmin.getModel();
        System.out.println("1");
        tablemodel.setRowCount(0);
        for(UserAccount user: ecosystem.getUserAccountDirectory().getUserAccountList()){
            
            if(user.getRole().getClass().getName().equals("Business.Role.AdminRole")){
                Object [] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                System.out.println("2");
                tablemodel.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestrauntAdmin = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnRestrauntAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("UserName:");

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblRestrauntAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UserName", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblRestrauntAdmin);

        jLabel3.setText("Password:");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRestrauntAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnRestrauntAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnRestrauntAdmin.setText("Restraunt registration");
        btnRestrauntAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestrauntAdminActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnUpdate)
                                .addGap(56, 56, 56)
                                .addComponent(btnDelete)
                                .addGap(76, 76, 76)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(btnRestrauntAdmin)))))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRestrauntAdmin)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnSave))
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestrauntAdmin.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblRestrauntAdmin.getValueAt(selectedRow, 1);
                String pwd= (String) tblRestrauntAdmin.getValueAt(selectedRow, 2);
                UserAccount user=ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ecosystem.getUserAccountDirectory().deleteUserAccount(user);
                ecosystem.getRestaurantDirectory().deleteRestaurant(user.getUsername());
                populateRestrauntTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ecosystem.getUserAccountDirectory().updateUserAccount(user, txtName.getText(), txtUserName.getText(), txtPassword.getText());
        populateRestrauntTable();

        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblRestrauntAdmin.getSelectedRow();

        if(selectRow>=0){
            String name = (String) tblRestrauntAdmin.getValueAt(selectRow, 0);
            String username= (String) tblRestrauntAdmin.getValueAt(selectRow, 1);
            String password= (String) tblRestrauntAdmin.getValueAt(selectRow, 2);
            user=ecosystem.getUserAccountDirectory().authenticateUser(username, password);

            txtName.setText(name+"");
            txtUserName.setText(username+"");
            txtPassword.setText(password+"");

            JOptionPane.showMessageDialog(null,"Please press save button to save the profile after updating the text field");

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row to update a profile");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRestrauntAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestrauntAdminActionPerformed
        // TODO add your handling code here:
        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
            UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(txtName.getText(), txtUserName.getText(), txtPassword.getText(), null, new AdminRole());
            Restaurant restaurant = ecosystem.getRestaurantDirectory().createUserAccount(txtUserName.getText());
            populateRestrauntTable();
            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
    }//GEN-LAST:event_btnRestrauntAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRestrauntAdmin;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestrauntAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
