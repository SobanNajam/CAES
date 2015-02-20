

package main;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class Sessions extends javax.swing.JPanel {

    
    public Sessions() {
        initComponents();
        bba();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bba = new javax.swing.JButton();
        bba_ee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ses = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setText("EE/CS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(510, 10, 140, 23);

        bba.setText("BBA");
        bba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaActionPerformed(evt);
            }
        });
        add(bba);
        bba.setBounds(42, 11, 140, 23);

        bba_ee.setText("BBA/EE");
        bba_ee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bba_eeActionPerformed(evt);
            }
        });
        add(bba_ee);
        bba_ee.setBounds(270, 10, 140, 23);

        ses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ses);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 90, 500, 190);
        add(jLabel2);
        jLabel2.setBounds(270, 44, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(690, 330));
        jLabel1.setMinimumSize(new java.awt.Dimension(690, 330));
        jLabel1.setPreferredSize(new java.awt.Dimension(690, 330));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void bbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaActionPerformed
        bba();
    }//GEN-LAST:event_bbaActionPerformed

    private void bba_eeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bba_eeActionPerformed
        bba_ee();
    }//GEN-LAST:event_bba_eeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ee();
    }//GEN-LAST:event_jButton1ActionPerformed

    db obj;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bba;
    private javax.swing.JButton bba_ee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ses;
    // End of variables declaration//GEN-END:variables

    private void bba() {

        obj = new db();
        obj.connectToDB("caes");
        jLabel2.setText("BBA Sessions");
        jLabel2.setVisible(true);
        try {
            ses.setModel(DbUtils.resultSetToTableModel(obj.connection.createStatement().executeQuery("Select * from `caes`.`tablebba`")));
        } catch (SQLException ex) {
        }

        obj.DisconnectFromDB();
        obj=null;
    }

    private void ee() {

        obj = new db();
        obj.connectToDB("caes");
        jLabel2.setText("EE Sessions");
        jLabel2.setVisible(true);
        try {
            ses.setModel(DbUtils.resultSetToTableModel(obj.connection.createStatement().executeQuery("Select * from `caes`.`tableee`")));
        } catch (SQLException ex) {
        }

        obj.DisconnectFromDB();
        obj=null;
    }

    private void bba_ee() {

        obj = new db();
        obj.connectToDB("caes");
        jLabel2.setText("BBA/EE Sessions");
        jLabel2.setVisible(true);
        try {
            ses.setModel(DbUtils.resultSetToTableModel(obj.connection.createStatement().executeQuery("Select * from `caes`.`tablebba/ee`")));
        } catch (SQLException ex) {
        }

        obj.DisconnectFromDB();
        obj=null;
    }

}
