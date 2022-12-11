/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FDA;

import model.Enterprise.Enterprise;
import model.WorkQueue.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import util.UtilClass;

/**
 *
 * @author charanpatnaik
 */
public class ManageProduct extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageProduct
     */
    public ManageProduct(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnModifySelected = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel3.setText("Price");
        add(jLabel3);
        jLabel3.setBounds(416, 479, 26, 14);

        jLabel4.setText("Quantity");
        add(jLabel4);
        jLabel4.setBounds(392, 523, 46, 14);
        add(txtPrice);
        txtPrice.setBounds(498, 474, 195, 18);
        add(txtDescription);
        txtDescription.setBounds(498, 430, 195, 18);
        add(txtQuantity);
        txtQuantity.setBounds(498, 518, 195, 18);

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductList);

        add(jScrollPane1);
        jScrollPane1.setBounds(296, 95, 463, 195);

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(432, 562, 56, 24);
        add(txtSearch);
        txtSearch.setBounds(411, 48, 74, 18);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(523, 48, 70, 24);
        add(txtName);
        txtName.setBounds(498, 386, 195, 18);

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(513, 562, 72, 24);

        btnModifySelected.setText("Modify Selected Product");
        btnModifySelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifySelectedActionPerformed(evt);
            }
        });
        add(btnModifySelected);
        btnModifySelected.setBounds(498, 308, 162, 24);

        btnAddNew.setText("Add New Product");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        add(btnAddNew);
        btnAddNew.setBounds(296, 308, 126, 24);

        jLabel1.setText("Product Name");
        add(jLabel1);
        jLabel1.setBounds(358, 391, 75, 14);

        jLabel2.setText("Description");
        add(jLabel2);
        jLabel2.setBounds(373, 435, 62, 14);

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(607, 562, 67, 24);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(50, 40, 76, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/fDA.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(10, 10, 1010, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        for(Product product:enterprise.getProductList()){
            if(product.getName().equals(txtName.getText())){
                JOptionPane.showMessageDialog(this, "Product already exists");
                return;
            }
        }
        if(!UtilClass.isOnlyNumber(txtPrice.getText())){
            JOptionPane.showMessageDialog(this, "Enter a valid Integer for Price");
            return;
        }
         if(!UtilClass.isOnlyNumber(txtQuantity.getText())){
            JOptionPane.showMessageDialog(this, "Enter a valid Integer for Quantity");
            return;
        }
        Product product = new Product(txtName.getText(),txtDescription.getText());
        product.setFDAPrice(Integer.parseInt(txtPrice.getText()));
        product.setQuantity(Integer.parseInt(txtQuantity.getText()));
        enterprise.getProductList().add(product);
        populateProducts();
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populateSearchProductList();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductList.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        for(Product product:enterprise.getProductList()){
            if(product.getName().equals(((Product)tblProductList.getValueAt(selectedRow, 0)).getName())){
                product.setName(txtName.getText());
                product.setDescription(txtDescription.getText());
                product.setFDAPrice(Integer.parseInt(txtPrice.getText()));
                product.setQuantity(Integer.parseInt(txtQuantity.getText()));
                break;
            }
        }
        populateProducts();
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnModifySelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifySelectedActionPerformed
        // TODO add your handling code here:
        btnUpdate.setEnabled(true);
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(true);
        int selectedRow = tblProductList.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        for(Product product:enterprise.getProductList()){
            if(product.getName().equals(((Product)tblProductList.getValueAt(selectedRow, 0)).getName())){
                txtName.setText(product.getName());
                txtDescription.setText(product.getDescription());
                txtPrice.setText(String.valueOf(product.getFDAPrice()));
                txtQuantity.setText(String.valueOf(product.getQuantity()));
                break;
            }
        }
    }//GEN-LAST:event_btnModifySelectedActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductList.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        for(Product product:enterprise.getProductList()){
            if(product.getName().equals(((Product)tblProductList.getValueAt(selectedRow, 0)).getName())){
                enterprise.getProductList().remove(product);
                break;
            }
        }
        populateProducts();
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FDAAdmWorkAreaJPanel dwjp = (FDAAdmWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModifySelected;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateProducts() {
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        
        model.setRowCount(0);
        for(Product product:enterprise.getProductList()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            row[2] = product.getFDAPrice();
            row[3] = product.getQuantity();
            model.addRow(row);
        }
    }
    
    public void populateSearchProductList(){
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        model.setRowCount(0);
        for(Product product:enterprise.getProductList()){
            if(product.getName().equals(txtSearch.getText()) || txtSearch.getText().equals("")){
                Object[] row = new Object[4];
                row[0] = product;
                row[1] = product.getDescription();
                row[2] = product.getFDAPrice();
                row[3] = product.getQuantity();
                model.addRow(row);
            }
        }
    }
}
