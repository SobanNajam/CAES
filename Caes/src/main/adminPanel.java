
package main;

import java.io.IOException;
import javax.swing.JOptionPane;

public class adminPanel extends javax.swing.JPanel {

    caes masterobject;
    public adminPanel(caes object) {
        initComponents();
        masterobject = object;
        jScrollPane1.setSize(690, 330);
        watchershow();
    }


    public void watchershow() {
        watcher = new recordwatch();
        jScrollPane1.setViewportView(watcher);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        sessions = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setText("See records");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(250, 10, 130, 23);

        jButton2.setText("change password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(170, 50, 140, 23);

        jScrollPane1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(690, 320));
        jLabel2.setMinimumSize(new java.awt.Dimension(690, 320));
        jLabel2.setPreferredSize(new java.awt.Dimension(690, 320));
        jScrollPane1.setViewportView(jLabel2);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 820, 330);

        jButton3.setText("priveleges");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(320, 50, 140, 23);

        jButton4.setText("create new user");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(480, 50, 140, 23);

        jButton5.setText("Print Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(630, 50, 170, 23);

        sessions.setText("Sessions");
        sessions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionsActionPerformed(evt);
            }
        });
        add(sessions);
        sessions.setBounds(30, 50, 130, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(845, 440));
        jLabel1.setMinimumSize(new java.awt.Dimension(845, 440));
        jLabel1.setPreferredSize(new java.awt.Dimension(845, 440));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 450);

        jPanel1.setLayout(null);

        jScrollPane2.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(690, 320));
        jLabel3.setMinimumSize(new java.awt.Dimension(690, 320));
        jLabel3.setPreferredSize(new java.awt.Dimension(690, 320));
        jScrollPane2.setViewportView(jLabel3);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 90, 820, 330);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(845, 440));
        jLabel4.setMinimumSize(new java.awt.Dimension(845, 440));
        jLabel4.setPreferredSize(new java.awt.Dimension(845, 440));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 880, 450);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        watchershow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jScrollPane1.setVisible(true);
        paschng= new paschange();
        jScrollPane1.setViewportView(paschng);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jScrollPane1.setVisible(true);
        prv= new prvsetter();
        jScrollPane1.setViewportView(prv);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jScrollPane1.setVisible(true);
        crt= new createuser();
        jScrollPane1.setViewportView(crt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        printDetails win = new printDetails();
}//GEN-LAST:event_jButton5ActionPerformed

    private void sessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionsActionPerformed
        jScrollPane1.setVisible(true);
        ses= new Sessions();
        jScrollPane1.setViewportView(ses);
    }//GEN-LAST:event_sessionsActionPerformed

    createuser crt=null;
    prvsetter prv =null;
    recordwatch watcher=null;
    paschange paschng =null;
    Sessions ses = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sessions;
    // End of variables declaration//GEN-END:variables

}
