/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import model.EcoSystem;
import model.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author udaykk
 */
public class SelectNetwork extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    /**
     * Creates new form SelectNetwork
     */
    public SelectNetwork(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxNetwork = new javax.swing.JComboBox<>();
        btnSelectNetwork = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        cboxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxNetwork);
        cboxNetwork.setBounds(95, 86, 96, 27);

        btnSelectNetwork.setText("Select Network");
        btnSelectNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectNetworkActionPerformed(evt);
            }
        });
        add(btnSelectNetwork);
        btnSelectNetwork.setBounds(228, 85, 138, 29);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 30, 93, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/what-system-administrator-do.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(10, 0, 970, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectNetworkActionPerformed
        // TODO add your handling code here:
        for(Network network:ecoSystem.getNetworkList()){
            if(cboxNetwork.getSelectedItem().toString().equals(network.getName())){
////                VaccineAnalyticsJPanel manageEnterpriseAdminJPanel=new VaccineAnalyticsJPanel(userProcessContainer, ecoSystem, network.getName());
//                userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnSelectNetworkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectNetwork;
    private javax.swing.JComboBox<String> cboxNetwork;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void populateCombo() {
        cboxNetwork.removeAllItems();
        for(Network network:ecoSystem.getNetworkList()){
            cboxNetwork.addItem(network.getName());
        }
    }
}