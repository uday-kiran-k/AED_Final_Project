/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;
import model.WorkQueue.Order;
import model.WorkQueue.Product;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pawan
 */
public class ManagePatientRequests extends javax.swing.JPanel {
    JPanel userProcessConatiner;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form ManageHospitalRequests
     */
    public ManagePatientRequests(JPanel userProcessConatiner, Enterprise enterprise, UserAccount userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessConatiner = userProcessConatiner;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateRequests();
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
        tblRequest = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnOrderDetails = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "SenderEnterprise", "Receiver Enterprise", "Sender Network", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 200, 810, 230);

        btnAccept.setBackground(new java.awt.Color(0, 153, 0));
        btnAccept.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(320, 450, 90, 30);

        btnReject.setBackground(new java.awt.Color(204, 0, 0));
        btnReject.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(420, 450, 80, 30);

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Description", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblDetails);

        add(jScrollPane2);
        jScrollPane2.setBounds(320, 540, 800, 230);

        btnOrderDetails.setBackground(new java.awt.Color(102, 0, 102));
        btnOrderDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnOrderDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });
        add(btnOrderDetails);
        btnOrderDetails.setBounds(1000, 450, 130, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(50, 30, 100, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        if(order.getReceiver()!=null){
            JOptionPane.showMessageDialog(this, "This order has been already picked");
            return;
        }
        order.setReceiver(userAccount);
        if(!order.getStatus().contains("Rejected")){
            order.setStatus("Accepted by FDA");
            JOptionPane.showMessageDialog(this, "This order has been accepted");
        }else{
            JOptionPane.showMessageDialog(this, "This order was rejected earlier");
        }
        populateRequests();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        if(order.getReceiver()!=null){
            JOptionPane.showMessageDialog(this, "This order has been already picked");
            return;
        }
        order.setReceiver(userAccount);
        if(!order.getStatus().contains("Accepted")){
            order.setStatus("Rejected by FDA");
            JOptionPane.showMessageDialog(this, "This order has been rejected");
        }else{
            JOptionPane.showMessageDialog(this, "This order was accepted earlier");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0); 
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        for(Product product:order.getProductList()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            row[2] = product.getHospitalPrice();
            row[3] = product.getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessConatiner.remove(this);
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest workRequest:ecoSystem.getWorkQueue().getWorkRequestList()){
            if(workRequest.getReceiverEnterprise()!=null && workRequest.getReceiverEnterprise().getName().equals(enterprise.getName())){
                Object[] row = new Object[6];
                row[0] = workRequest;
                row[1] = workRequest.getReceiver();
                row[2] = workRequest.getSenderEnterprise();
                row[3] = workRequest.getReceiverEnterprise();
                row[4] = workRequest.getNetworkName();
                row[5] = workRequest.getStatus();
                model.addRow(row);
            }
        }
    }
}
