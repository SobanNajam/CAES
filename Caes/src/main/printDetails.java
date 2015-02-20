package main;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable.PrintMode;
import java.awt.print.*;


public class printDetails extends javax.swing.JFrame {

    public printDetails() {
        initComponents();
        try {
            tabler();
        } catch (SQLException ex) {
            Logger.getLogger(printDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.Dimension d = new java.awt.Dimension();
        d.setSize(640, 480);
        this.setTitle("Print Details");
       
        setSize(d);
        setMaximumSize(d);
        setPreferredSize(d);
        setResizable(false);
        pack();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ARN", "Name", "Test Date", "Test Time", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(22, 42, 410, 340);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 400, 120, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            java.text.MessageFormat hdr = new java.text.MessageFormat("Contact Details");
            java.text.MessageFormat footer = new java.text.MessageFormat("Page{0,number,integer}");
            jTable1.print(PrintMode.NORMAL, hdr, footer);
        } catch (PrinterException ex) {
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 public void tabler() throws SQLException
  {
   db obj = new db();
   obj.connectToDB("caes");
   ResultSet master = obj.connection.createStatement().executeQuery("select * from `caes`.`testdetails` ");
   ResultSet slave = null;
   int i=0;

   javax.swing.table.DefaultTableModel tb = new javax.swing.table.DefaultTableModel();
   master.last();
   tb.setNumRows(master.getRow());
   tb.addColumn("ARN");
   tb.addColumn("Name");
   tb.addColumn("Test Date");
   tb.addColumn("Test Time");
   tb.addColumn("Contact ");
   master.first();
   do
    {
      slave = obj.connection.createStatement().executeQuery("select NAME,CONTACT from `caes`.`bba` where `ARN` = " + master.getString("arn") + " union select NAME,CONTACT from `caes`.`ee/cs` where `ARN` = " + master.getString("arn")+ " union select NAME,CONTACT from `caes`.`bba/ee` where `ARN` = " + master.getString("arn"));
      slave.next();
      tb.setValueAt(master.getString("ARN"),i , 0);
      tb.setValueAt(slave.getString("NAME"),i , 1);
      tb.setValueAt(master.getString("test_date"),i , 2);
      tb.setValueAt(master.getString("test_time"),i , 3);
      tb.setValueAt(slave.getString("CONTACT"),i , 4);

      slave = null;
     i++;
    }while(master.next());
  
   jTable1.setModel(tb);

   obj.DisconnectFromDB();
 }



}
