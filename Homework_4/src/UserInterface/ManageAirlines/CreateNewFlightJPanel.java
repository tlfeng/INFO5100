/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJPanel
     */
    JPanel userProcessContainer;
    public CreateNewFlightJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        int arrayListSize = travelAgency.getAirlinerDir().getAirlinerList().size();
        airlinerNameTxt.setText(travelAgency.getAirlinerDir().getAirlinerList().get(arrayListSize-1).getAirlinerName());
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
        jLabel4 = new javax.swing.JLabel();
        arrivalTimeTxt = new javax.swing.JTextField();
        saveNewFlight = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        airlinerNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flightNumberTxt = new javax.swing.JTextField();
        departAirportTxt = new javax.swing.JTextField();
        departTimeTxt = new javax.swing.JTextField();
        arrivalAirportTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create New Flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 23, -1, -1));

        jLabel2.setText("Airliner:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel4.setText("Flight Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        add(arrivalTimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 80, -1));

        saveNewFlight.setText("Create New Flight");
        saveNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewFlightActionPerformed(evt);
            }
        });
        add(saveNewFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        airlinerNameTxt.setEnabled(false);
        add(airlinerNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 80, -1));

        jLabel3.setText("Arrival Time:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel6.setText("Departure Airport:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel7.setText("Arrival Airport:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel8.setText("Departure Time:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        add(flightNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, -1));
        add(departAirportTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 80, -1));
        add(departTimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 80, -1));
        add(arrivalAirportTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewFlightActionPerformed
        // TODO add your handling code here:
        if (flightNumberTxt.getText().equals("") || departAirportTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (Airliner airliner: travelAgency.getAirlinerDir())
        //Airliner airliner = travelAgency.getAirlinerDir().addAirliner();
        flight.setFlightNum(airlinerNameTxt.getText());
            flight.setDepartTime;
    flight.setArrivalTime;
    flight.setDepartAirport;
    flight.setArrivalAirport;
        
        JOptionPane.showMessageDialog(null, "Airliner Successfully created.");
    }//GEN-LAST:event_saveNewFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JTextField arrivalAirportTxt;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField departAirportTxt;
    private javax.swing.JTextField departTimeTxt;
    private javax.swing.JTextField flightNumberTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton saveNewFlight;
    // End of variables declaration//GEN-END:variables
}