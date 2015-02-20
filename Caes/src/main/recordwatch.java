
package main;
import net.proteanit.sql.DbUtils;

public class recordwatch extends javax.swing.JPanel {

    
    
    public recordwatch() {
        initComponents();
       
        refresh();
        setSize(540,290);
        }

    public void refresh() {
        db database = new db();
        database.connectToDB("caes");
        try {
            java.sql.ResultSet rs = database.connection.createStatement().executeQuery("select * from `caes`.`keeptrack`");
            //rs.next();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setCellSelectionEnabled(false);
            database.DisconnectFromDB();
        } catch (java.sql.SQLException e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(690, 330));
        setMinimumSize(new java.awt.Dimension(690, 330));
        setLayout(null);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(180, 250, 130, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 660, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(690, 330));
        jLabel1.setMinimumSize(new java.awt.Dimension(690, 330));
        jLabel1.setPreferredSize(new java.awt.Dimension(690, 330));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
