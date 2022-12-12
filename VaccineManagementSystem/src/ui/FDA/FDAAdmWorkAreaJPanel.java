/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FDA;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author charanpatnaik
 */
public class FDAAdmWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form FDAAdmWorkAreaJPanel
     */
    public FDAAdmWorkAreaJPanel(JPanel userJPanel, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        this.userProcessContainer = userJPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        initComponents();
        valueLabel.setText(enterprise.getName());
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
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnBuyProducts = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Food and Drug Administration");
        add(jLabel1);
        jLabel1.setBounds(300, 30, 403, 29);

        userJButton.setText("Raise Delivery request");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton);
        userJButton.setBounds(420, 330, 180, 24);

        manageEmployeeJButton.setText("Manage Requests");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton);
        manageEmployeeJButton.setBounds(420, 280, 180, 24);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(70, 90, 120, 30);

        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(210, 100, 130, 14);

        btnBuyProducts.setText("Manage products");
        btnBuyProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyProductsActionPerformed(evt);
            }
        });
        add(btnBuyProducts);
        btnBuyProducts.setBounds(420, 380, 180, 24);

        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        RaiseManufacturerRequest muajp = new RaiseManufacturerRequest(userProcessContainer, enterprise, userAccount,ecoSystem);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
 
        ManageHospitalRequests manageEmployeeJPanel = new ManageHospitalRequests(userProcessContainer, enterprise, userAccount, ecoSystem);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void btnBuyProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyProductsActionPerformed
        ManageProduct buyProductsFromFDAJPanel = new ManageProduct(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", buyProductsFromFDAJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyProductsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyProducts;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
