/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.table.DefaultTableModel;
import Business.Airplanes;
import Business.Fleet;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ftl
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    Fleet flt;
    public ViewJPanel(Fleet flt) {
        initComponents();
        this.flt = flt;
        populateTable();
    }
    
    public void populateTable() {
         DefaultTableModel dtm = (DefaultTableModel)fleetTable.getModel();
         dtm.setRowCount(0);
         
         for (Airplanes ap : flt.getFleet()) {
             Object row[] = new Object[2];
             row[0] = ap;
             row[1] = ap.getModelNum();
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

        ResultJFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        fleetTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        airportTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        availMonthCBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        expireMonthCBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        serialNumTxt = new javax.swing.JTextField();
        menufactureTxt = new javax.swing.JTextField();
        modelNumTxt = new javax.swing.JTextField();
        seatCapacityTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        saveModBtn = new javax.swing.JButton();
        menufYearTxt = new javax.swing.JFormattedTextField();
        availYearTxt = new javax.swing.JFormattedTextField(NumberFormat.getIntegerInstance());
        expireYearTxt = new javax.swing.JFormattedTextField(NumberFormat.getIntegerInstance());

        javax.swing.GroupLayout ResultJFrameLayout = new javax.swing.GroupLayout(ResultJFrame.getContentPane());
        ResultJFrame.getContentPane().setLayout(ResultJFrameLayout);
        ResultJFrameLayout.setHorizontalGroup(
            ResultJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ResultJFrameLayout.setVerticalGroup(
            ResultJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        fleetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menufacutre", "Model Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(fleetTable);

        jLabel5.setText("Menufacturing Year:");

        jLabel6.setText("Availability Date:");

        availMonthCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"}));

jLabel7.setText("Maintenance Expiration:");

expireMonthCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Jan", "Feb", "Mar", "Apr",
    "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"}));

    jLabel8.setText("Airport:");

    jLabel1.setText("Serial Number:");

    jLabel2.setText("Model Number:");

    jLabel3.setText("Menufacture:");

    jLabel4.setText("Seat Capacity:");

    viewBtn.setText("View");
    viewBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewBtnActionPerformed(evt);
        }
    });

    deleteBtn.setText("Delete");
    deleteBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteBtnActionPerformed(evt);
        }
    });

    saveModBtn.setText("Save modification");
    saveModBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveModBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(31, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(33, 33, 33))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(serialNumTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menufactureTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatCapacityTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menufYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(availMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(expireMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(availYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(expireYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(saveModBtn)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewBtn)
                    .addGap(18, 18, 18)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(48, 48, 48))
        .addGroup(layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(deleteBtn)
                .addComponent(viewBtn))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menufactureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(modelNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(serialNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(seatCapacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menufYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(availYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(availMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(expireYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(expireMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
            .addGap(8, 8, 8)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
            .addGap(18, 18, 18)
            .addComponent(saveModBtn)
            .addContainerGap(16, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // View details of selected table item
        int selectedRow = fleetTable.getSelectedRow();
        
        if (selectedRow >= 0 ) {
            Airplanes ap = (Airplanes)fleetTable.getValueAt(selectedRow, 0);
            menufactureTxt.setText(ap.getMenufacture());
            modelNumTxt.setText(ap.getModelNum());
            serialNumTxt.setText(ap.getSerialNum());
            seatCapacityTxt.setText(String.valueOf(ap.getSeatCapacity()));  
            menufYearTxt.setText(String.valueOf(ap.getMenufYear()));  
            availMonthCBox.setSelectedItem(String.valueOf(ap.getAvailMonth()));
            availYearTxt.setText(String.valueOf(ap.getAvailYear())); 
            expireMonthCBox.setSelectedItem(String.valueOf(ap.getExpireMonth()));
            expireYearTxt.setText(String.valueOf(ap.getExpireYear())); 
            airportTxt.setText(ap.getAirport());
        }
        else
            JOptionPane.showMessageDialog(null,"Please select any row");
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // Delete the selected airplane object
        int selectedRow = fleetTable.getSelectedRow();
        
        if (selectedRow >= 0 ) {
            Airplanes ap = (Airplanes)fleetTable.getValueAt(selectedRow, 0);
            flt.deleteAirplanes(ap);
            JOptionPane.showMessageDialog(null,"Airplane has been deleted. ");
            populateTable();
        }
        else
            JOptionPane.showMessageDialog(null,"Please select any row");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveModBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveModBtnActionPerformed
        // Read the Textfield, and save the value
        String menufacture = menufactureTxt.getText();
        String modelNum = modelNumTxt.getText();
        String serialNum = serialNumTxt.getText();
        int seatCapacity = Integer.parseInt(seatCapacityTxt.getText());
        int menufYear = Integer.parseInt(menufYearTxt.getText());
        String availMonth = (String) availMonthCBox.getSelectedItem();
        int availYear = Integer.parseInt(availYearTxt.getText());
        String expireMonth = (String) expireMonthCBox.getSelectedItem();
        int expireYear = Integer.parseInt(expireYearTxt.getText());
        String airport = airportTxt.getText();
        
        Airplanes ap = flt.addAirplanes();
        ap.setMenufacture(menufacture);
        ap.setModelNum(modelNum);
        ap.setSerialNum(serialNum);
        ap.setSeatCapacity(seatCapacity);  
        ap.setMenufYear(menufYear);
        ap.setAvailMonth(availMonth);
        ap.setAvailYear(availYear);
        ap.setExpireMonth(expireMonth);
        ap.setExpireYear(expireYear);
        ap.setAirport(airport);
        JOptionPane.showMessageDialog(null, "Airplane Modified Successfully");
    }//GEN-LAST:event_saveModBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ResultJFrame;
    private javax.swing.JTextField airportTxt;
    private javax.swing.JComboBox<String> availMonthCBox;
    private javax.swing.JFormattedTextField availYearTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> expireMonthCBox;
    private javax.swing.JFormattedTextField expireYearTxt;
    private javax.swing.JTable fleetTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField menufYearTxt;
    private javax.swing.JTextField menufactureTxt;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JButton saveModBtn;
    private javax.swing.JTextField seatCapacityTxt;
    private javax.swing.JTextField serialNumTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
