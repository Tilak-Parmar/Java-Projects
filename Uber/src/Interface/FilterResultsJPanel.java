/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarCatalog;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TILAK PARMAR
 */
public class FilterResultsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FilterResultsJPanel
     */
    private JPanel userProcessContainer;
    private CarCatalog carList;
    private String text;
    private String text1;
    private String text2;
    private int i;
    private ArrayList<Car> tempAvCars;
    
    FilterResultsJPanel(JPanel userProcessContainer, CarCatalog carslist, String text, int i) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carList = carslist;
        this.text=text;
        this.i=i;
        tempAvCars = new ArrayList<>();
        
        if (i==3)
            populate3Table();
        else if(i==4)
            populate4Table();
        else if(i==5)
            populate5Table();
        else if(i==7)
            populate7Table();
        else if(i==10)
            populate10Table();
        else if(i==11)
            populate11Table();
    }
    
    FilterResultsJPanel(JPanel userProcessContainer, CarCatalog carslist, String text1, String text2, int i) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carList = carslist;
        this.text1=text1;
        this.text2=text2;
        this.i=i;
        tempAvCars = new ArrayList<>();
        
        populate5Table();
    }
    
    public void populate3Table(){
        for(Car c : CarCatalog.getCarList())
        {
            if(c.getBrand().equalsIgnoreCase(text))
                tempAvCars.add(c);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars){
            Object[] row = new Object[6];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
                row[2]="Yes";
            else
                row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            dtm.addRow(row);
        }
    }
    
    public void populate4Table(){
        for(Car c : CarCatalog.getCarList())
        {
            if(c.getManufactured_year()==Integer.parseInt(text))
                tempAvCars.add(c);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars){
            Object[] row = new Object[6];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
                row[2]="Yes";
            else
                row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            dtm.addRow(row);
        }
    }
    
    public void populate5Table(){
        for(Car c : CarCatalog.getCarList())
        {
            if(c.isAvailable() && (c.getMin_seats()==Integer.parseInt(text1) && c.getMax_seats()==Integer.parseInt(text2)))
                tempAvCars.add(c);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars)
        {
            Object[] row = new Object[6];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
                row[2]="Yes";
            else
                row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            dtm.addRow(row);
        }
    }
    
    public void populate7Table(){
        for(Car c : CarCatalog.getCarList())
        {
            if(c.getModel_num().equalsIgnoreCase(text))
                tempAvCars.add(c);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars){
            Object[] row = new Object[6];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
                row[2]="Yes";
            else
                row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            dtm.addRow(row);
        }
    }
    public void populate10Table(){
        for(Car c : CarCatalog.getCarList())
        {
            if(c.isAvailable() && c.getAvailble_city().equalsIgnoreCase(text))
                tempAvCars.add(c);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars){
            Object[] row = new Object[6];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
                row[2]="Yes";
            else
                row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            dtm.addRow(row);
        }
    }
    
    public void populate11Table(){
        for(Car c : CarCatalog.getCarList())
        {
            if(c.isMaintenance_certificate()==false)
                tempAvCars.add(c);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars){
            Object[] row = new Object[6];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
                row[2]="Yes";
            else
                row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            
                dtm.addRow(row);
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextFieldSeatSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblCars.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Brand", "Available", "Model No.", "Year", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnViewDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Search Available Cars by City:");

        TextFieldSeatSearch.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TextFieldSeatSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSeatSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldSeatSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextFieldSeatSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCars.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Car first!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Car car = (Car)tblCars.getValueAt(selectedRow, 0);
            ViewCarDetailsJPanel panel = new ViewCarDetailsJPanel(userProcessContainer, carList, car);
            userProcessContainer.add("ViewCarDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void TextFieldSeatSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSeatSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSeatSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car car: tempAvCars){
            Object[] row = new Object[8];
            row[0]=car;
            row[1]=car.getBrand();
            if(car.isAvailable())
            row[2]="Yes";
            else
            row[2]="No";
            row[3]=car.getModel_num();
            row[4]=car.getManufactured_year();
            row[5]=car.getAvailble_city();
            row[6]=car.getMin_seats();
            row[7]=car.getMax_seats();
            if (car.getAvailble_city().equalsIgnoreCase(TextFieldSeatSearch.getText()))
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldSeatSearch;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCars;
    // End of variables declaration//GEN-END:variables
}
