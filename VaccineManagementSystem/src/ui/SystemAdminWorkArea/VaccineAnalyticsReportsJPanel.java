/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import model.Analytics.NetworkAnalytics;
import model.EcoSystem;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author pawan
 */
public class VaccineAnalyticsReportsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyticsReportsJPanel
     */
    private EcoSystem system;
    private JPanel userProcessContainer;
    public VaccineAnalyticsReportsJPanel(JPanel userProcessContainer, EcoSystem system, String netowrkName) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateEmployeeCountGraph(netowrkName);
    }
    
    private void populateEmployeeCountGraph(String networkSelected){

        HashMap<String,HashMap<String,Integer>> datamap=(new NetworkAnalytics(system)).getAllUsersInNetWorkByOrganization(networkSelected);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        for(String ent:datamap.keySet()){
            for(String org:datamap.get(ent).keySet()){
                dataset.addValue(datamap.get(ent).get(org),org,ent);
                String top=networkSelected;
                barGraph(dataset,top,"Enterprises","Employee Count");
            }
        }
    }
    
 
    
    private void pieChart(DefaultPieDataset dataset,String tHeader){
        JFreeChart chart = ChartFactory.createPieChart3D(
        tHeader, // Title
        dataset, // Dataset
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
        );
        
        pieplotJPanel.removeAll();
        pieplotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        pieplotJPanel.add(CP,BorderLayout.CENTER);
        pieplotJPanel.validate();
    }
    
    private void barGraph(DefaultCategoryDataset dataset,String tHeader,String bHeader,String lHeader){

        JFreeChart chart = ChartFactory.createBarChart3D(
        tHeader, // Title
        bHeader, // x-axis Label
        lHeader, // y-axis Label
        dataset, // Dataset
        PlotOrientation.VERTICAL, // Plot Orientation
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
     );
        plotJPanel.removeAll();
        plotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        plotJPanel.add(CP,BorderLayout.CENTER);
        plotJPanel.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plotJPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        pieplotJPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout plotJPanelLayout = new javax.swing.GroupLayout(plotJPanel);
        plotJPanel.setLayout(plotJPanelLayout);
        plotJPanelLayout.setHorizontalGroup(
            plotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        plotJPanelLayout.setVerticalGroup(
            plotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setText("<< back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pieplotJPanelLayout = new javax.swing.GroupLayout(pieplotJPanel);
        pieplotJPanel.setLayout(pieplotJPanelLayout);
        pieplotJPanelLayout.setHorizontalGroup(
            pieplotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );
        pieplotJPanelLayout.setVerticalGroup(
            pieplotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pieplotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(plotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(pieplotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel pieplotJPanel;
    private javax.swing.JPanel plotJPanel;
    // End of variables declaration//GEN-END:variables
}
