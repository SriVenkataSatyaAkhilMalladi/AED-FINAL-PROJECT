/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author srikr
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    private JPanel userProcessContainer;
    private Restaurant restaurant;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    ArrayList<Dishes> items=new ArrayList<Dishes>();
    int sum = 0;
    public MenuPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.restaurant = restaurant;
        
        populateMenuTable();
    }

    public void populateMenuTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblMenu1.getModel();
        
            tablemodel.setRowCount(0);
                Object[] row = new Object[3];
                for(Dishes dish:restaurant.getMenu()){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     tablemodel.addRow(row);
                } 
    }
    
    public void populateCart(Dishes dishitem){
        DefaultTableModel tablemodel = (DefaultTableModel) tblCart1.getModel();
        tablemodel.setRowCount(0);
        
         items.add(dishitem);
         Object[] row = new Object[3];
                for(Dishes dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     sum=sum+Integer.parseInt(dish.getPrice());
                     tablemodel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMenu1 = new javax.swing.JTable();
        btnRemoveFromCart1 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        txtSearchM1 = new javax.swing.JTextField();
        btnAddToCart1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCart1 = new javax.swing.JTable();
        txtAddress1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchM1btn = new javax.swing.JButton();
        btnOrder1 = new javax.swing.JButton();
        SearchM2btn = new javax.swing.JButton();
        txtSearchM2 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 153));

        enterpriseLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enterpriseLabel1.setText("Your Cart :");

        tblMenu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMenu1);

        btnRemoveFromCart1.setBackground(new java.awt.Color(0, 0, 0));
        btnRemoveFromCart1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemoveFromCart1.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveFromCart1.setText("Remove Item");
        btnRemoveFromCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromCart1ActionPerformed(evt);
            }
        });

        backJButton1.setBackground(new java.awt.Color(0, 0, 0));
        backJButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(255, 255, 255));
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton1.setText("<<Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        valueLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valueLabel1.setText("<value>");

        btnAddToCart1.setBackground(new java.awt.Color(0, 0, 0));
        btnAddToCart1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddToCart1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart1.setText("Add To Cart");
        btnAddToCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCart1ActionPerformed(evt);
            }
        });

        tblCart1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblCart1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Location:");

        SearchM1btn.setBackground(new java.awt.Color(0, 0, 0));
        SearchM1btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchM1btn.setForeground(new java.awt.Color(255, 255, 255));
        SearchM1btn.setText("Search");
        SearchM1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchM1btnActionPerformed(evt);
            }
        });

        btnOrder1.setBackground(new java.awt.Color(0, 0, 0));
        btnOrder1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrder1.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder1.setText("Order");
        btnOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder1ActionPerformed(evt);
            }
        });

        SearchM2btn.setBackground(new java.awt.Color(0, 0, 0));
        SearchM2btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchM2btn.setForeground(new java.awt.Color(255, 255, 255));
        SearchM2btn.setText("Search");
        SearchM2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchM2btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchM1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSearchM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SearchM2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveFromCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchM1btn)
                    .addComponent(btnAddToCart1))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchM2btn)
                    .addComponent(btnRemoveFromCart1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnOrder1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveFromCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromCart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveFromCart1ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void btnAddToCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToCart1ActionPerformed

    private void SearchM1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchM1btnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblMenu1.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblMenu1.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchM1.getText().trim()));
    }//GEN-LAST:event_SearchM1btnActionPerformed

    private void btnOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrder1ActionPerformed

    private void SearchM2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchM2btnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCart1.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblCart1.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchM2.getText().trim()));
    }//GEN-LAST:event_SearchM2btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchM1btn;
    private javax.swing.JButton SearchM2btn;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnAddToCart1;
    private javax.swing.JButton btnOrder1;
    private javax.swing.JButton btnRemoveFromCart1;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCart1;
    private javax.swing.JTable tblMenu1;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtSearchM1;
    private javax.swing.JTextField txtSearchM2;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
