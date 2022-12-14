/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AirTransportation;

import model.WorkQueue.Order;
import model.WorkQueue.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author charanpatnaik
 */
public class ProcessAirTransportRequests extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Order order;
    /**
     * Creates new form ProcessLightRequests
     */
    public ProcessAirTransportRequests(JPanel userProcessContainer, Order order) {
        initComponents();
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

        txtStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);
        add(txtStatus);
        txtStatus.setBounds(190, 280, 1028, 23);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Complete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(580, 430, 150, 50);

        backJButton.setBackground(new java.awt.Color(0, 102, 204));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(0, 6, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(order.getStatus().toLowerCase().contains("success") || order.getStatus().toLowerCase().contains("fail")){
           JOptionPane.showMessageDialog(this, "Cannot complete this order");
           return; 
        }
        if(txtStatus.getText().contains("success")){
            order.setStatus("delivered successfully");
            for(Product product:order.getProductList()){
                boolean check = true;
                for(Product product1:order.getSenderEnterprise().getProductList()){
                    if(product.getName().equals(product1.getName())){
                        product1.setQuantity(product1.getQuantity()+product.getQuantity());
                        check = false;
                    }
                }
                if(check){
                    Product prod = new Product(product.getName(),product.getDescription());
                    prod.setHospitalPrice(product.getHospitalPrice());
                    prod.setFDAPrice(prod.getHospitalPrice());
                    prod.setQuantity(product.getQuantity());
                    order.getSenderEnterprise().getProductList().add(prod);
                }
            }
            JOptionPane.showMessageDialog(this, "Order processed");
            back();
        } else{
            JOptionPane.showMessageDialog(this, "Please enter correct status");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        back();
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
    private void back(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
}
