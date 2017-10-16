/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageUserAccount;

import Business.Business;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ftl
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    private UserAccount ua;
    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) accountTbl.getModel();
        dtm.setRowCount(0);
        for (UserAccount ua: business.getUaDir().getUserAccountList()) {
            Object[] row = new Object[3];
            row[0] = ua;
            row[1] = ua.getPassword();
            row[2] = ua.getAccountType();
            
            dtm.addRow(row);
        }
    }
    
    public UserAccount selectedUA() {
        int row = accountTbl.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        UserAccount ua = (UserAccount)accountTbl.getValueAt(row, 0);
        return ua;
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
        accountTbl = new javax.swing.JTable();
        findAccountBtn = new javax.swing.JButton();
        newAccountbtn = new javax.swing.JButton();
        updateAccountBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        deleteAccountBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        accountTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password MD5", "Account Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accountTbl);

        findAccountBtn.setText("Find User Account >");
        findAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAccountBtnActionPerformed(evt);
            }
        });

        newAccountbtn.setText("New User Account >");
        newAccountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountbtnActionPerformed(evt);
            }
        });

        updateAccountBtn.setText("Update User Account >");
        updateAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Manage User Account");

        deleteAccountBtn.setText("DELETE User Account");
        deleteAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteAccountBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newAccountbtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(updateAccountBtn)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(findAccountBtn))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findAccountBtn)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAccountbtn)
                    .addComponent(deleteAccountBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateAccountBtn)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void findAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findAccountBtnActionPerformed
        // TODO add your handling code here:
        SearchAccountJPanel panel = new SearchAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("SearchAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_findAccountBtnActionPerformed

    private void newAccountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountbtnActionPerformed
        // TODO add your handling code here:
        NewUserAccountJPanel panel = new NewUserAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("NewAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_newAccountbtnActionPerformed

    private void updateAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAccountBtnActionPerformed
        // TODO add your handling code here:
        if (selectedUA() == null)
            return;
        else
            ua = selectedUA();
        UpdateUserAccountJPanel panel = new UpdateUserAccountJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("UpdateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateAccountBtnActionPerformed

    private void deleteAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountBtnActionPerformed
        // TODO add your handling code here:
        if (selectedUA() == null)
            return;
        else
            ua = selectedUA();
        
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure to DELETE this account?", null, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
          business.getUaDir().deleteUserAccount(ua);
        else
           return;
        accountTbl.removeAll();
        populateTable();
    }//GEN-LAST:event_deleteAccountBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteAccountBtn;
    private javax.swing.JButton findAccountBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newAccountbtn;
    private javax.swing.JButton updateAccountBtn;
    // End of variables declaration//GEN-END:variables
}
