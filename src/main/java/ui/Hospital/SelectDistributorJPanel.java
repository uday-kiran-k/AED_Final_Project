/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital;

import ui.Hospital.BuyProductsFromDistributorJPanel;
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
public class SelectDistributorJPanel extends javax.swing.JPanel {
    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    /**
     * Creates new form SelectDistributor
     */
    public SelectDistributorJPanel(JPanel userProcessContainer,EcoSystem ecoSystem, UserAccount userAccount, Enterprise enterprise) {
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
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Select a Distributor");
        add(jLabel1);
        jLabel1.setBounds(430, 100, 166, 22);

        jLabel2.setText("Supplier: ");
        add(jLabel2);
        jLabel2.setBounds(410, 350, 71, 16);

        jLabel3.setText("Network");
        add(jLabel3);
        jLabel3.setBounds(410, 300, 71, 16);

        cboxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxNetworkActionPerformed(evt);
            }
        });
        add(cboxNetwork);
        cboxNetwork.setBounds(500, 300, 96, 27);

        btnRequest1.setText("Select Network");
        btnRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequest1ActionPerformed(evt);
            }
        });
        add(btnRequest1);
        btnRequest1.setBounds(610, 300, 160, 29);

        cboxDistributor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxDistributor);
        cboxDistributor.setBounds(500, 350, 96, 27);

        btnRequest.setText("Select Distributor");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest);
        btnRequest.setBounds(610, 350, 160, 29);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(60, 73, 93, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/supermarket.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 20, 1210, 630);
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
        System.out.println(cboxNetwork.getSelectedItem().toString());
        for(Network network:ecoSystem.getNetworkList()){
            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                req = network;
            }
        }
        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            System.out.println(supplierEnterprise.getEnterpriseType().getValue());
            System.out.println(Enterprise.EnterpriseType.ColdStorage.getValue());
            if(supplierEnterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.ColdStorage.getValue())){
                System.out.println("inside if condition");
                cboxDistributor.addItem(supplierEnterprise.getName());
            }
        }
    }//GEN-LAST:event_btnRequest1ActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        
        Network req=null;
        System.out.println(cboxNetwork.getSelectedItem().toString());
        for(Network network:ecoSystem.getNetworkList()){
            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                req = network;
            }
        }

        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            System.out.println(supplierEnterprise.getName());
            System.out.println(cboxDistributor.getSelectedItem());
            if(supplierEnterprise.getName().equals(cboxDistributor.getSelectedItem().toString())){
                BuyProductsFromDistributorJPanel buyProductsFromDistributorJPanel = new BuyProductsFromDistributorJPanel(userProcessContainer, userAccount, supplierEnterprise, enterprise,ecoSystem);
                userProcessContainer.add("manageEmployeeJPanel", buyProductsFromDistributorJPanel);
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
        SalesSupervisorWorkAreaJPanel dwjp = (SalesSupervisorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnRequest1;
    private javax.swing.JComboBox<String> cboxDistributor;
    private javax.swing.JComboBox<String> cboxNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkCombo(){
        cboxDistributor.removeAllItems();
        cboxNetwork.removeAllItems();
        for(Network network:ecoSystem.getNetworkList()){
            cboxNetwork.addItem(network.getName());
        }
    }
}
