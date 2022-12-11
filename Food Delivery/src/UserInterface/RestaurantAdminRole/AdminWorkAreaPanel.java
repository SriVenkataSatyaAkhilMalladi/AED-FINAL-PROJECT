/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author srikr
 */
public class AdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaPanel
     */
    JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    public AdminWorkAreaPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
      
        lblRestName.setText(account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        lblRestName = new javax.swing.JLabel();
        btnManageOrder = new javax.swing.JButton();
        btnManageMenu = new javax.swing.JButton();
        btnManageRestroInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");

        lblRestName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRestName.setText("<value>");

        btnManageOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setText("Manage Orders");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });

        btnManageMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnManageMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnManageMenu.setText("Manage menu");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });

        btnManageRestroInfo.setBackground(new java.awt.Color(0, 0, 0));
        btnManageRestroInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRestroInfo.setText("Manage Restaurant Info");
        btnManageRestroInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestroInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblRestName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRestroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRestName)))
                .addGap(42, 42, 42)
                .addComponent(btnManageOrder)
                .addGap(27, 27, 27)
                .addComponent(btnManageMenu)
                .addGap(27, 27, 27)
                .addComponent(btnManageRestroInfo)
                .addContainerGap(317, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
        ManageOrders manageorderJPanel = new ManageOrders(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ManageOrders", manageorderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrderActionPerformed

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        ManageMenu managemenuJPanel = new ManageMenu(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ManageMenu", managemenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageRestroInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestroInfoActionPerformed
        // TODO add your handling code here:
        ManageRestroInfo manageRestroJPanel = new ManageRestroInfo(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ManageRestroInfo", manageRestroJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestroInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnManageRestroInfo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRestName;
    // End of variables declaration//GEN-END:variables
}
