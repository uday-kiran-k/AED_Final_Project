/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FDA;

import ui.Doctor.*;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.WorkQueue.Order;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author charanpatnaik
 */
public class HospitalAdminDetails extends javax.swing.JPanel {
    Enterprise enterprise;
    Order order;
    JPanel userProcessContainer;
    /**
     * Creates new form CustomerDetails
     */
    public HospitalAdminDetails(JPanel userProcessContainer, Order order, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.order = order;
        this.userProcessContainer = userProcessContainer;
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCard = new javax.swing.JTextField();
        btnCompletePayment = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(156, 131, 30, 14);

        jLabel2.setText("CardNumber");
        add(jLabel2);
        jLabel2.setBounds(113, 175, 69, 14);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(255, 126, 146, 18);
        add(txtCard);
        txtCard.setBounds(255, 170, 146, 18);

        btnCompletePayment.setText("Complete payment");
        btnCompletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletePaymentActionPerformed(evt);
            }
        });
        add(btnCompletePayment);
        btnCompletePayment.setBounds(432, 241, 134, 24);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(17, 9, 76, 24);

        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1140, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnCompletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletePaymentActionPerformed
        if(txtCard.getText().isEmpty() || txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields are mandatory");
            return;
        }
        Employee customer = new Employee(txtName.getText(), txtCard.getText());
        enterprise.getWorkQueue().getWorkRequestList().add(order);
    }//GEN-LAST:event_btnCompletePaymentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorTransactionHome dwjp = (DoctorTransactionHome) component;
        dwjp.populateProductList();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompletePayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
