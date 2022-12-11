/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Patient;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;
import model.WorkQueue.Order;
import model.WorkQueue.Product;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udaykk
 */
public class PreviousOrders extends javax.swing.JPanel {
    JPanel userProcessConatiner;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form PreviousOrders
     */
    public PreviousOrders(JPanel userProcessConatiner, Enterprise enterprise,UserAccount userAccount, EcoSystem ecoSystem) {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnOrderDetails = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "SenderEnterprise", "Receiver Enterprise", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1);
        jScrollPane1.setBounds(440, 120, 770, 182);

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
        jScrollPane2.setBounds(430, 420, 780, 160);

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
        btnOrderDetails.setBounds(760, 340, 130, 40);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 30, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        order.setReceiver(userAccount);
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        for(Product product:order.getProductList()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            row[2] = product.getSuperMarketPrice();
            row[3] = product.getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessConatiner.remove(this);
        Component[] componentArray = userProcessConatiner.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientMain dwjp = (PatientMain) component;
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetails;
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
            if(workRequest.getSender()!=null && workRequest.getSender().equals(userAccount)){
                Object[] row = new Object[5];
                row[0] = workRequest;
                row[1] = workRequest.getReceiver();
                row[2] = workRequest.getSenderEnterprise();
                row[3] = workRequest.getReceiverEnterprise();
                row[4] = workRequest.getStatus();
                model.addRow(row);
            }
        }
    }

}
