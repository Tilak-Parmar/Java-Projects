/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinancialCheckerRole;

import Business.EcoSystem;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinancialCheckWorkRequest;
import Business.WorkQueue.HousingOptionsWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class FinancialCheckWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    FinancialCheckWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public FinancialCheckWorkRequestJPanel(JPanel userProcessContainer, FinancialCheckWorkRequest request, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model1 = (DefaultTableModel) tblHomelessPersonRecords1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblHomelessPersonRecords2.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        if(request.getHomelessPerson()!=null){
            Object[] row = new Object[8];
            row[0] = request.getHomelessPerson().getName();
            row[1] = request.getHomelessPerson().getDob();
            row[2] = request.getHomelessPerson().getCity();
            row[3] = request.getHomelessPerson().getCurrentAddress();
            row[4] = request.getHomelessPerson().getSSNNo();
            row[5] = request.getHomelessPerson().getContactNo();
            row[6] = request.getHomelessPerson().getEmailAddress();
            row[7] = request.getHomelessPerson().getDependents();
            model1.addRow(row);
            Object[] rowSecond = new Object[9];
            rowSecond[0] = request.getHomelessPerson().getQualifications();
            rowSecond[1] = request.getHomelessPerson().getAccomplishments();
            rowSecond[2] = request.getHomelessPerson().getIncome();
            rowSecond[3] = request.getHomelessPerson().getEmploymentStatus();
            rowSecond[4] = request.getHomelessPerson().getGender();
            rowSecond[5] = request.getHomelessPerson().isHasCriminalRecord()?"Yes" :"No";
            rowSecond[6] = request.getHomelessPerson().isMajorIllness()?"Yes" :"No";
            rowSecond[7] = request.getHomelessPerson().isCarrierDisease()?"Yes" :"No";
            rowSecond[8] = request.getHomelessPerson().isGeneticDisease()?"Yes" :"No";
            model2.addRow(rowSecond);
            
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

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords2 = new javax.swing.JTable();
        btnPassCheck = new javax.swing.JButton();
        btnFailCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setBackground(new java.awt.Color(0, 102, 255));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        tblHomelessPersonRecords1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecords1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "DOB", "City", "current address", "SSNNo", "Contact No", "Email Address", "Dependents"
            }
        ));
        tblHomelessPersonRecords1.setRowHeight(20);
        jScrollPane1.setViewportView(tblHomelessPersonRecords1);

        tblHomelessPersonRecords2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecords2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qualifications", "Accomplishments", "Income", "Employ Status", "Gender", "Criminal Record?", "Major Illness??", "Carrier Illness??", "Genetic Illness??"
            }
        ));
        jScrollPane2.setViewportView(tblHomelessPersonRecords2);

        btnPassCheck.setBackground(new java.awt.Color(0, 102, 255));
        btnPassCheck.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnPassCheck.setText("Pass Financial Check");
        btnPassCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassCheckActionPerformed(evt);
            }
        });

        btnFailCheck.setBackground(new java.awt.Color(0, 102, 255));
        btnFailCheck.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnFailCheck.setText("Fail Financial Check");
        btnFailCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFailCheckActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FINANCIAL CHECK WORK AREA");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Person Details:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1061, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPassCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFailCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFailCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPassCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(256, 256, 256))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FinancialCheckWorkAreaJPanel dwjp = (FinancialCheckWorkAreaJPanel) component;
        dwjp.populateReceiveTable();
        dwjp.populateSentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnPassCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassCheckActionPerformed
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null,"This request has already been completed by you!");
            return;
        }
        request.setStatus("Completed");
        request.setTestResult("Sent to HO");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getShelterAllocWorkReq().setReceiver(account);
        request.getShelterAllocWorkReq().setTestResult("Completed by Financial Checker and and sent to Housing Option");
        HousingOptionsWorkRequest fcRequest = new HousingOptionsWorkRequest();
        fcRequest.setMessage("Provide Housing Options");
        fcRequest.setSender(userAccount);
        fcRequest.setStatus("Sent");
        fcRequest.setHomelessPerson(request.getHomelessPerson());
        fcRequest.setShelterAllocWorkReq(request.getShelterAllocWorkReq());
        Date d = new Date();
        fcRequest.setRequestDate(d);
        Organization org = null;

        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HouseAllocationEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof HousingOptionsOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(fcRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(fcRequest);
            JOptionPane.showMessageDialog(this, "Request Sent to Housing Options Organization");
        }
    }//GEN-LAST:event_btnPassCheckActionPerformed

    private void btnFailCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFailCheckActionPerformed
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null,"This request has already been completed by you!");
            return;
        }
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getShelterAllocWorkReq().setReceiver(account);
        request.getShelterAllocWorkReq().setTestResult("The request has been denied by Financial Checker!");
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(this, "Volunteer has been updated abt failure!");
    }//GEN-LAST:event_btnFailCheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnFailCheck;
    private javax.swing.JButton btnPassCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHomelessPersonRecords1;
    private javax.swing.JTable tblHomelessPersonRecords2;
    // End of variables declaration//GEN-END:variables
}
