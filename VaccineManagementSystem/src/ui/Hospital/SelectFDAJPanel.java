/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author pawan
 */
public class SelectFDAJPanel extends javax.swing.JPanel {
    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    /**
     * Creates new form SelectFDA
     */
    public SelectFDAJPanel(JPanel userProcessContainer,EcoSystem ecoSystem, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateNetworkCombo();
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
        jLabel3 = new javax.swing.JLabel();
        cboxNetwork = new javax.swing.JComboBox<>();
        btnRequest1 = new javax.swing.JButton();
        cboxDistributor = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Select FDA Branch");
        add(jLabel1);
        jLabel1.setBounds(530, 122, 290, 70);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2);
        jLabel2.setBounds(410, 350, 71, 18);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Network");
        add(jLabel3);
        jLabel3.setBounds(410, 300, 71, 18);

        cboxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxNetworkActionPerformed(evt);
            }
        });
        add(cboxNetwork);
        cboxNetwork.setBounds(500, 293, 200, 30);

        btnRequest1.setBackground(new java.awt.Color(102, 0, 102));
        btnRequest1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRequest1.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest1.setText("Select Network");
        btnRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequest1ActionPerformed(evt);
            }
        });
        add(btnRequest1);
        btnRequest1.setBounds(750, 293, 170, 30);

        cboxDistributor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDistributorActionPerformed(evt);
            }
        });
        add(cboxDistributor);
        cboxDistributor.setBounds(500, 343, 200, 30);

        btnRequest.setBackground(new java.awt.Color(102, 0, 102));
        btnRequest.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("Go");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest);
        btnRequest.setBounds(750, 343, 170, 30);

        btnBack.setBackground(new java.awt.Color(0, 102, 204));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(30, 30, 120, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void cboxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxNetworkActionPerformed
        // TODO add your handling code here:
        //        Network req=null;
        //        System.out.println(cboxNetwork.getSelectedItem().toString());
        //        for(Network network:ecoSystem.getNetworkList()){
            //            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                //                req = network;
                //            }
            //        }
        //        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            //            if(supplierEnterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Supplier)){
                //                cboxSupplier.addItem(supplierEnterprise.getName());
                //            }
            //        }

    }//GEN-LAST:event_cboxNetworkActionPerformed

    private void btnRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequest1ActionPerformed
        // TODO add your handling code here:
        
        Network req=null;
        for(Network network:ecoSystem.getNetworkList()){
            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                req = network;
            }
        }
        cboxDistributor.removeAllItems();
        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            if(supplierEnterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.FDA.getValue())){
                cboxDistributor.addItem(supplierEnterprise.getName());
            }
        }
    }//GEN-LAST:event_btnRequest1ActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        
        Network req=null;
        for(Network network:ecoSystem.getNetworkList()){
            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                req = network;
            }
        }

        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            if(supplierEnterprise.getName().equals(cboxDistributor.getSelectedItem().toString())){
                BuyProductsFromFDA buyProductsFromFDAJPanel = new BuyProductsFromFDA(userProcessContainer, userAccount, supplierEnterprise, enterprise,ecoSystem);
                userProcessContainer.add("manageEmployeeJPanel", buyProductsFromFDAJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }

    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorSupervisorWorkAreaJPanel dwjp = (DoctorSupervisorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cboxDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDistributorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnRequest1;
    private javax.swing.JComboBox<String> cboxDistributor;
    private javax.swing.JComboBox<String> cboxNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkCombo(){
        cboxDistributor.removeAllItems();
        cboxNetwork.removeAllItems();
        for(Network network:ecoSystem.getNetworkList()){
            cboxNetwork.addItem(network.getName());
        }
    }
}
