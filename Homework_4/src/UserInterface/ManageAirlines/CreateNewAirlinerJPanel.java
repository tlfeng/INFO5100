/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.FlightSchedule;
import Business.MasterTravelSchedule;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    private TravelAgency travelAgency;
    private Airliner airliner;
    /**
     * Creates new form CreateNewAirliners
     */
    JPanel userProcessContainer;

    public CreateNewAirlinerJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travelAgency = travelAgency;
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
        airlinerNameTxt = new javax.swing.JTextField();
        saveNewAirlinerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addFlightBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        iataCodeTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Create New Airliners");

        jLabel2.setText("Airliner Name:");

        saveNewAirlinerBtn.setText("Create Airliners");
        saveNewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewAirlinerBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addFlightBtn.setText("Add Flights");
        addFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("IATA Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(iataCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(saveNewAirlinerBtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(backBtn)
                .addGap(149, 149, 149)
                .addComponent(addFlightBtn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(iataCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(saveNewAirlinerBtn)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(addFlightBtn)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        // refreshTable
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersWorkAreaJPanel manageAirlinersWorkAreaJPanel = (ManageAirlinersWorkAreaJPanel) component;
        manageAirlinersWorkAreaJPanel.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_backBtnActionPerformed

    private void saveNewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewAirlinerBtnActionPerformed
        // TODO add your handling code here:
        if (airlinerNameTxt.getText().equals("") || iataCodeTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Airliner airliner = travelAgency.getAirlinerDir().addAirliner();
        airliner.setAirlinerName(airlinerNameTxt.getText());
        airliner.setIataCode(iataCodeTxt.getText());
        // Create new flightSchedule for the airliner
        FlightSchedule fSCatalog = new FlightSchedule();
        airliner.setFSCatalog(fSCatalog);
        fSCatalog = travelAgency.getMTS().addFlightSchedule();
        // Pass the airliner object to next card
        this.airliner = airliner;
        
        JOptionPane.showMessageDialog(null, "Airliner Successfully created.");
    }//GEN-LAST:event_saveNewAirlinerBtnActionPerformed

    private void addFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightBtnActionPerformed
        // TODO add your handling code here:
        CreateNewFlightJPanel panel = new CreateNewFlightJPanel(userProcessContainer, travelAgency, airliner);
        userProcessContainer.add("AccountMngWorkAreaJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addFlightBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFlightBtn;
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField iataCodeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveNewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
