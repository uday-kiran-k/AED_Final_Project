/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Role.PatientAdmin;
import model.Role.ColdStorageAdminRole;
import model.Role.DoctorSupervisor;
import model.Role.ManufacturingManager;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udaykk
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(226, 151, 638, 95);

        jLabel1.setText("Network");
        add(jLabel1);
        jLabel1.setBounds(302, 291, 136, 27);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(490, 292, 136, 27);

        jLabel2.setText("Username");
        add(jLabel2);
        jLabel2.setBounds(300, 396, 136, 27);
        add(usernameJTextField);
        usernameJTextField.setBounds(488, 396, 136, 27);

        jLabel3.setText("Enterprise");
        add(jLabel3);
        jLabel3.setBounds(302, 350, 136, 27);

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(490, 351, 136, 27);

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(830, 450, 88, 29);

        jLabel4.setText("Password");
        add(jLabel4);
        jLabel4.setBounds(300, 441, 136, 27);
        add(nameJTextField);
        nameJTextField.setBounds(488, 486, 136, 27);

        jLabel5.setText("Name");
        add(jLabel5);
        jLabel5.setBounds(300, 486, 136, 27);
        add(passwordJPasswordField);
        passwordJPasswordField.setBounds(490, 441, 136, 27);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(6, 19, 97, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/what-system-administrator-do.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 970, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        boolean userAccount =true;
        for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
            for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList()){
                userAccount=ent.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                if(userAccount==true){
                   //Step 3:check against each organization for each enterprise
                   for(Organization organization:ent.getOrganizationDirectory().getOrganizationList()){
                       userAccount=organization.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                       if(userAccount!=true){
                           inEnterprise=ent;
                           inOrganization=organization;
                           break;
                       }
                   }

                }
                else{
                   inEnterprise=ent;
                   break;
                }
                if(inOrganization!=null){
                    break;
                }  
            }
            if(inEnterprise!=null){
                break;
            }
        }
        if(userAccount!=true){
            JOptionPane.showMessageDialog(this, "username already exists");
            return;
        }
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.Hospital){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DoctorSupervisor());
        }else if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.ColdStorage){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new ColdStorageAdminRole());
        }else if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.Manufacturer){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new ManufacturingManager());
        }else if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.Patient){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PatientAdmin());
        }
        
        populateTable();
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
