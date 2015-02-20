package main;
import java.sql.SQLException;

public class statistics extends javax.swing.JPanel {

    db obj = new db();
    public statistics() {
        initComponents();
        setSize(845,200);
        try{statupdate();}catch(SQLException e){obj.displaySQLErrors(e);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stats = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(845, 440));
        setMinimumSize(new java.awt.Dimension(845, 440));
        setPreferredSize(new java.awt.Dimension(845, 440));

        stats.setBackground(new java.awt.Color(183, 230, 255));
        stats.setPreferredSize(new java.awt.Dimension(1262, 1008));
        stats.setLayout(null);

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel85.setText("Applications recieved overall:");
        stats.add(jLabel85);
        jLabel85.setBounds(16, 79, 181, 17);

        jTextField16.setEditable(false);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        stats.add(jTextField16);
        jTextField16.setBounds(207, 78, 131, 20);

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel86.setText("Fee charged overall:");
        stats.add(jLabel86);
        jLabel86.setBounds(16, 328, 125, 17);

        jTextField17.setEditable(false);
        stats.add(jTextField17);
        jTextField17.setBounds(151, 327, 131, 20);

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel87.setText("Applicants BBA:");
        stats.add(jLabel87);
        jLabel87.setBounds(16, 147, 101, 17);

        jTextField18.setEditable(false);
        stats.add(jTextField18);
        jTextField18.setBounds(127, 146, 131, 20);

        jTextField19.setEditable(false);
        stats.add(jTextField19);
        jTextField19.setBounds(127, 172, 131, 20);

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel88.setText("Applicants EE:");
        stats.add(jLabel88);
        jLabel88.setBounds(16, 173, 89, 17);

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel89.setText("Applicants CS:");
        stats.add(jLabel89);
        jLabel89.setBounds(16, 199, 91, 17);

        jTextField20.setEditable(false);
        stats.add(jTextField20);
        jTextField20.setBounds(127, 198, 131, 20);

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel90.setToolTipText("");
        stats.add(jLabel90);
        jLabel90.setBounds(10, 203, 0, 0);

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel91.setText("Fee recieved so far:");
        stats.add(jLabel91);
        jLabel91.setBounds(16, 354, 121, 17);

        jTextField21.setEditable(false);
        stats.add(jTextField21);
        jTextField21.setBounds(151, 353, 131, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        stats.add(jLabel1);
        jLabel1.setBounds(0, 0, 1282, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed

}//GEN-LAST:event_jTextField16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JPanel stats;
    // End of variables declaration//GEN-END:variables

    private void statupdate() throws SQLException {

        obj.connectToDB("caes");
        java.sql.ResultSet counter = obj.connection.createStatement().executeQuery("select * from `caes`.`bba` union select * from `caes`.`bba/ee` union select * from `caes`.`ee/cs`");
        counter.last();

        int bba=0,ee=0,cs=0;

        int x;
        x = counter.getRow();
        String n;
        n = Integer.toString(x);

        jTextField16.setText(n); x=0; n = null;

        counter = obj.connection.createStatement().executeQuery("select * from `caes`.`bba`");
        counter.last();
        x = counter.getRow();
        bba = x;
        x=0;

        counter = obj.connection.createStatement().executeQuery("select * from `caes`.`bba/ee` where `DPREF1` = \"BBA\" union select * from `caes`.`bba/ee` where `DPREF2` = \"BBA\" union select * from `caes`.`bba/ee` where `DPREF3` = \"BBA\" union select * from `caes`.`bba/ee` where `DPREF4` = \"BBA\"");
        counter.last();
        x = counter.getRow();
        bba = bba+x;
        n = Integer.toString(bba);
        jTextField18.setText(n);
        x=0; n = null;bba = 0;

        counter = obj.connection.createStatement().executeQuery("select * from `caes`.`ee/cs` where `DPREF1` = \"Electrical\" union select * from `caes`.`ee/cs` where `DPREF2` = \"Electrical\" union select * from `caes`.`ee/cs` where `DPREF3` = \"Electrical\" union select * from `caes`.`ee/cs` where `DPREF4` = \"Electrical\"");
        counter.last();
        x = counter.getRow();
        ee = x;
        x=0; n = null;

        counter = obj.connection.createStatement().executeQuery("select * from `caes`.`bba/ee` where `DPREF1` = \"Electrical\" union select * from `caes`.`bba/ee` where `DPREF2` = \"Electrical\" union select * from `caes`.`bba/ee` where `DPREF3` = \"Electrical\" union select * from `caes`.`bba/ee` where `DPREF4` = \"Electrical\"");
        counter.last();
        x = counter.getRow();
        ee = ee+x;
        n = Integer.toString(ee);
        jTextField19.setText(n);
        x=0; n = null;ee = 0;

        counter = obj.connection.createStatement().executeQuery("select * from `caes`.`ee/cs` where `DPREF1` = \"Computer Science\" union select * from `caes`.`ee/cs` where `DPREF2` = \"Computer Science\" union select * from `caes`.`ee/cs` where `DPREF3` = \"Computer Science\" union select * from `caes`.`ee/cs` where `DPREF4` = \"Computer Science\"");
        counter.last();
        x = counter.getRow();
        cs = x;
        x=0; n = null;

        counter = obj.connection.createStatement().executeQuery("select * from `caes`.`bba/ee` where `DPREF1` = \"Computer Science\" union select * from `caes`.`bba/ee` where `DPREF2` = \"Computer Science\" union select * from `caes`.`bba/ee` where `DPREF3` = \"Computer Science\" union select * from `caes`.`bba/ee` where `DPREF4` = \"Computer Science\"");
        counter.last();
        x = counter.getRow();
        cs = cs+x;
        n = Integer.toString(cs);
        jTextField20.setText(n);
        x=0; n = null;ee = 0;

        counter = obj.connection.createStatement().executeQuery("SELECT SUM(  `Fee amount` ) FROM  `caes`.`fee_status`");
        counter.next();
        x = counter.getInt(1);
        n = Integer.toString(x);
        jTextField17.setText("Rs."+n);
        n = null; x=0;

        counter = obj.connection.createStatement().executeQuery("SELECT SUM(  `Fee amount` ) FROM  `caes`.`fee_status` where `caes`.`fee_status`.`status` != 0");
        counter.next();
        x = counter.getInt(1);
        n = Integer.toString(x);
        jTextField21.setText("Rs."+n);
        n = null; x=0;

        obj.DisconnectFromDB();
    }
}
