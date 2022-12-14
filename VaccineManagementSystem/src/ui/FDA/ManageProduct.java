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
import static util.UtilClass.isOnlyTextWithWhiteSpaces;
import static util.UtilClass.isValidTextString;

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

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Price");
        add(jLabel3);
        jLabel3.setBounds(500, 620, 34, 18);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        add(jLabel4);
        jLabel4.setBounds(480, 660, 56, 18);
        add(txtPrice);
        txtPrice.setBounds(560, 620, 195, 30);
        add(txtDescription);
        txtDescription.setBounds(560, 570, 195, 30);
        add(txtQuantity);
        txtQuantity.setBounds(560, 660, 195, 30);

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
        jScrollPane1.setBounds(290, 200, 790, 210);

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(492, 733, 90, 30);
        add(txtSearch);
        txtSearch.setBounds(290, 150, 210, 30);

        btnSearch.setBackground(new java.awt.Color(0, 153, 0));
        btnSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(520, 150, 90, 30);
        add(txtName);
        txtName.setBounds(560, 518, 195, 30);

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(590, 733, 90, 30);

        btnModifySelected.setBackground(new java.awt.Color(102, 0, 102));
        btnModifySelected.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnModifySelected.setForeground(new java.awt.Color(255, 255, 255));
        btnModifySelected.setText("Edit");
        btnModifySelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifySelectedActionPerformed(evt);
            }
        });
        add(btnModifySelected);
        btnModifySelected.setBounds(490, 420, 210, 50);

        btnAddNew.setBackground(new java.awt.Color(102, 0, 102));
        btnAddNew.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("Add");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        add(btnAddNew);
        btnAddNew.setBounds(290, 420, 170, 50);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Product Name");
        add(jLabel1);
        jLabel1.setBounds(440, 530, 110, 18);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Description");
        add(jLabel2);
        jLabel2.setBounds(460, 570, 78, 18);

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(700, 730, 90, 30);

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
        jButton1.setBounds(20, 20, 100, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            if (!isValidTextString(txtName.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter valid name");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid name");
        }

        try {
            if (!isValidTextString(txtDescription.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter valid description");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid description");
        }

        if (!UtilClass.isOnlyNumber(txtPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Enter a valid Integer for Price");
            return;
        }
        if (!UtilClass.isOnlyNumber(txtQuantity.getText())) {
            JOptionPane.showMessageDialog(this, "Enter a valid Integer for Quantity");
            return;
        }

        for (Product product : enterprise.getProductList()) {
            if (product.getName().equals(txtName.getText())) {
                JOptionPane.showMessageDialog(this, "Product already exists");
                return;
            }
        }

        Product product = new Product(txtName.getText(), txtDescription.getText());
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
        int selectedRow = tblProductList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        try {
            if (!isValidTextString(txtName.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter valid name");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid name");
        }

        try {   
            if (!isValidTextString(txtDescription.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter valid description");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid description");
        }

        if (!UtilClass.isOnlyNumber(txtPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Enter a valid Integer for Price");
            return;
        }
        if (!UtilClass.isOnlyNumber(txtQuantity.getText())) {
            JOptionPane.showMessageDialog(this, "Enter a valid Integer for Quantity");
            return;
        }

        for (Product product : enterprise.getProductList()) {
            if (product.getName().equals(((Product) tblProductList.getValueAt(selectedRow, 0)).getName())) {
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
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        for (Product product : enterprise.getProductList()) {
            if (product.getName().equals(((Product) tblProductList.getValueAt(selectedRow, 0)).getName())) {
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
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        for (Product product : enterprise.getProductList()) {
            if (product.getName().equals(((Product) tblProductList.getValueAt(selectedRow, 0)).getName())) {
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
        for (Product product : enterprise.getProductList()) {
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            row[2] = product.getFDAPrice();
            row[3] = product.getQuantity();
            model.addRow(row);
        }
    }

    public void populateSearchProductList() {
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        model.setRowCount(0);
        for (Product product : enterprise.getProductList()) {
            if (product.getName().equals(txtSearch.getText()) || txtSearch.getText().equals("")) {
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
