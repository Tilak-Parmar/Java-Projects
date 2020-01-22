/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author TILAK PARMAR
 */
public class FirstScreenJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FirstScreenJPanel
     */
    private JPanel userProcessContainer;
    private CarCatalog carlist;
    public FirstScreenJPanel(JPanel userProcessContainer, CarCatalog carlist) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.carlist=carlist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateCar = new javax.swing.JButton();
        btnViewAllCars = new javax.swing.JButton();
        btnRequirements = new javax.swing.JButton();

        btnCreateCar.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateCar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCreateCar.setText("Create a New Uber Car");
        btnCreateCar.setVerifyInputWhenFocusTarget(false);
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        btnViewAllCars.setBackground(new java.awt.Color(255, 255, 255));
        btnViewAllCars.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnViewAllCars.setText("View All Uber Cars");
        btnViewAllCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllCarsActionPerformed(evt);
            }
        });

        btnRequirements.setBackground(new java.awt.Color(255, 255, 255));
        btnRequirements.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnRequirements.setText("Search Uber Cars As Per Requirement");
        btnRequirements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequirementsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRequirements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateCar, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAllCars, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAllCars, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequirementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequirementsActionPerformed
        // TODO add your handling code here:
        SearchOptionsJPanel panel = new SearchOptionsJPanel(userProcessContainer, carlist);
        userProcessContainer.add("SearchOptionsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequirementsActionPerformed

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        // TODO add your handling code here:
        CreateCarJPanel panel = new CreateCarJPanel(userProcessContainer, carlist);
        userProcessContainer.add("CreateCarJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCarActionPerformed

    private void btnViewAllCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllCarsActionPerformed
        // TODO add your handling code here:
        ViewAllCarsJPanel panel = new ViewAllCarsJPanel(userProcessContainer, carlist);
        userProcessContainer.add("ViewAllCarsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAllCarsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCar;
    private javax.swing.JButton btnRequirements;
    private javax.swing.JButton btnViewAllCars;
    // End of variables declaration//GEN-END:variables
}