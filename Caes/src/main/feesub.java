

package main;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class feesub extends javax.swing.JPanel {

    
    db obj= new db();
    String UserName;

    public feesub(String name,int prvlg) {
        initComponents();
        UserName = name;
        if (prvlg==1){bankUpdate.setEnabled(false);bankUpdate.setVisible(false);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feesub = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        ARN = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        issueChallan = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        bankUpdate = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1282, 600));
        setMinimumSize(new java.awt.Dimension(1282, 600));
        setPreferredSize(new java.awt.Dimension(1282, 600));

        feesub.setBackground(new java.awt.Color(183, 230, 255));
        feesub.setPreferredSize(new java.awt.Dimension(1262, 1008));
        feesub.setLayout(null);

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel58.setText("ARN");
        feesub.add(jLabel58);
        jLabel58.setBounds(70, 48, 29, 17);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel59.setText("Name");
        feesub.add(jLabel59);
        jLabel59.setBounds(70, 88, 35, 17);

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel60.setText("Campuses Applied");
        feesub.add(jLabel60);
        jLabel60.setBounds(70, 163, 113, 17);

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel61.setText("1.");
        feesub.add(jLabel61);
        jLabel61.setBounds(188, 191, 11, 17);

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel62.setText("2.");
        feesub.add(jLabel62);
        jLabel62.setBounds(188, 214, 11, 17);

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel63.setText("3.");
        feesub.add(jLabel63);
        jLabel63.setBounds(188, 237, 11, 17);

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel64.setText("Disciplines Applied");
        feesub.add(jLabel64);
        jLabel64.setBounds(70, 272, 116, 17);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel65.setText("1.");
        feesub.add(jLabel65);
        jLabel65.setBounds(188, 295, 11, 17);

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel66.setText("2.");
        feesub.add(jLabel66);
        jLabel66.setBounds(188, 318, 11, 17);

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel67.setText("3.");
        feesub.add(jLabel67);
        jLabel67.setBounds(188, 341, 11, 17);

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel68.setText("4.");
        feesub.add(jLabel68);
        jLabel68.setBounds(188, 364, 11, 17);

        ARN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARNActionPerformed(evt);
            }
        });
        ARN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ARNKeyPressed(evt);
            }
        });
        feesub.add(ARN);
        ARN.setBounds(117, 47, 177, 20);

        jTextField32.setEditable(false);
        feesub.add(jTextField32);
        jTextField32.setBounds(115, 87, 179, 20);

        jTextField33.setEditable(false);
        jTextField33.setBorder(null);
        feesub.add(jTextField33);
        jTextField33.setBounds(203, 194, 277, 14);

        jTextField34.setEditable(false);
        jTextField34.setBorder(null);
        feesub.add(jTextField34);
        jTextField34.setBounds(203, 214, 277, 14);

        jTextField35.setEditable(false);
        jTextField35.setBorder(null);
        feesub.add(jTextField35);
        jTextField35.setBounds(203, 239, 277, 14);

        jTextField36.setEditable(false);
        jTextField36.setBorder(null);
        feesub.add(jTextField36);
        jTextField36.setBounds(209, 298, 271, 14);

        jTextField37.setEditable(false);
        jTextField37.setBorder(null);
        feesub.add(jTextField37);
        jTextField37.setBounds(203, 318, 0, 14);

        jTextField38.setEditable(false);
        jTextField38.setBorder(null);
        feesub.add(jTextField38);
        jTextField38.setBounds(209, 343, 271, 14);

        jTextField39.setEditable(false);
        jTextField39.setBorder(null);
        feesub.add(jTextField39);
        jTextField39.setBounds(209, 366, 271, 14);

        issueChallan.setFont(new java.awt.Font("Times New Roman", 1, 14));
        issueChallan.setText("Issue Chaalan");
        issueChallan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueChallanActionPerformed(evt);
            }
        });
        feesub.add(issueChallan);
        issueChallan.setBounds(170, 500, 160, 25);

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel69.setText("Fee Amount");
        feesub.add(jLabel69);
        jLabel69.setBounds(70, 435, 76, 17);

        jTextField40.setText("Rs.");
        feesub.add(jTextField40);
        jTextField40.setBounds(164, 434, 130, 20);

        jTextField45.setEditable(false);
        jTextField45.setBorder(null);
        feesub.add(jTextField45);
        jTextField45.setBounds(209, 320, 271, 14);

        bankUpdate.setText("Update Fee Status");
        bankUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankUpdateActionPerformed(evt);
            }
        });
        feesub.add(bankUpdate);
        bankUpdate.setBounds(408, 50, 170, 23);

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("FEE SUBMISSION");
        feesub.add(jLabel95);
        jLabel95.setBounds(10, 0, 202, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        feesub.add(jLabel1);
        jLabel1.setBounds(0, 0, 1282, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(feesub, javax.swing.GroupLayout.PREFERRED_SIZE, 2601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(feesub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ARNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARNActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ARNActionPerformed

    private void ARNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ARNKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyChar() == '\n'){
            try{
                obj.connectToDB("caes");
                if (isARN(Integer.parseInt(ARN.getText().trim()))){
                    //System.out.print("dekhlo dada print hugya");
                    int x =  Integer.parseInt(ARN.getText().trim());
                    int fee=0;

                    java.sql.ResultSet feearn = obj.connection.createStatement().executeQuery("select * from `bba` where `ARN` = " + x +" union select * from `bba/ee` where `ARN` = " + x +" union select * from `ee/cs` where `ARN` = " + x);
                    //System.out.print("dekhlo dada print hugya 2");
                    feearn.next();
                    jTextField32.setText(feearn.getString(2).trim());
                    jTextField33.setText(feearn.getString(22).trim());
                    jTextField34.setText(feearn.getString(23));
                    jTextField35.setText(feearn.getString(24));

                    jTextField37.setText("");
                    jTextField38.setText("");
                    jTextField39.setText("");

                    jTextField36.setText(feearn.getString(18).trim());
                    jTextField45.setText(feearn.getString(19));
                    jTextField38.setText(feearn.getString(20));
                    jTextField39.setText(feearn.getString(21));

                    if (jTextField37.getText().equals("...") && jTextField38.getText().equals("...") && jTextField39.getText().equals("..."))
                        fee = 500;
                    else if (jTextField38.getText().equals("...") && jTextField39.getText().equals("..."))
                        fee = 1000;
                    else if (jTextField39.getText().equals("..."))
                        fee = 1500;
                    else
                        fee = 2000;

                    if (jTextField34.getText().equals("...") && jTextField35.getText().equals("..."))
                        fee += 500;
                    else if (jTextField35.getText().equals("..."))
                        fee += 1000;
                    else
                        fee += 1500;


                    jTextField40.setText("Rs."+fee);
                    fees = fee;
                    obj.DisconnectFromDB();
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(null,"This ARN does not exist","Error!!",JOptionPane.ERROR_MESSAGE);
                //obj.displaySQLErrors(e);System.out.print("dekhlo dada print hugya the erroorr");
            }
        }
}//GEN-LAST:event_ARNKeyPressed

    private void issueChallanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueChallanActionPerformed
        challanIssuer();
        challanPageReseter();



    }//GEN-LAST:event_issueChallanActionPerformed

    private void bankUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankUpdateActionPerformed
        //JOptionPane.show
        feeStatusUpdater();
}//GEN-LAST:event_bankUpdateActionPerformed

private static int fees;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ARN;
    private javax.swing.JButton bankUpdate;
    private javax.swing.JPanel feesub;
    private javax.swing.JButton issueChallan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField45;
    // End of variables declaration//GEN-END:variables

    public boolean isARN(int arn){

        try{
            java.sql.ResultSet Latest_arn = obj.connection.createStatement().executeQuery("select * from `bba` where `ARN` = " + arn+" union select * from `bba/ee` where `ARN` = " + arn+" union select * from `ee/cs` where `ARN` = " + arn);
            if(Latest_arn !=null)Latest_arn.next();
            else System.out.println("ERrOR in arn");
                return true;
            }catch (java.sql.SQLException e)
                    {
                     e.getSQLState();
                     return false;
                    }
    }
    public void feeStatusUpdater(){
        int isn = 0;
        try {
            CSVRead object = new CSVRead();
            int[] ok = object.reader();
            obj.connectToDB("caes");
            for (int x : ok)
                {
                 isn = x;
                 
                 obj.connection.createStatement().execute("update `caes`.`fee_status` set `status` = '1' where `issnum` = " + x+ " and `status` = 0");
                }
            JOptionPane.showMessageDialog(null, "Fee Status updated successfully!", "Update Complete", JOptionPane.INFORMATION_MESSAGE);
            object = null;
            obj.DisconnectFromDB();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "File Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "the issue number " + isn + " is not found!\nPlease report to admin immediatly", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void challanIssuer() throws HeadlessException, NumberFormatException {
        try {
            obj.connectToDB("caes");
            java.sql.ResultSet Latest_issnum = obj.connection.createStatement().executeQuery("select issnum from `caes`.`fee_status` order by 'issnum' desc");
            Latest_issnum.last();
            double value = Latest_issnum.getDouble(1);
            obj.connection.createStatement().execute("insert into `caes`.`fee_status`(`ARN`,`issnum`,`status`,`Fee amount`) values('" + Integer.parseInt(ARN.getText()) + "','" + (int) (++value) + "','" + 0 + "','" + fees + "')");
         
               ResultSet r = obj.connection.createStatement().executeQuery("select NAME from `caes`.`bba` where `ARN` = \"" + Integer.parseInt(ARN.getText().trim())+ "\" union select NAME from `caes`.`bba/ee` where `ARN` = \"" + Integer.parseInt(ARN.getText().trim()) + "\" union select NAME from `caes`.`ee/cs` where `ARN` =\"" + Integer.parseInt(ARN.getText().trim()) + "\"");
               r.next();
               String Student = r.getString(1);
               voucherClass vobj = new voucherClass(Student,Integer.parseInt(ARN.getText()), (int) value ,fees);
               JFrame f = new JFrame(vobj);
               


               trackKeeper("Issued Challan to "+Integer.parseInt(ARN.getText().trim())+" with chalan number "+value);
             obj.DisconnectFromDB();
             fees = 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Challan already issued against this ARN", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void challanPageReseter() {
        //--------------------here reset the boXes
        ARN.setText(null);
        ARN.setText(null);
        jTextField32.setText(null);
        jTextField33.setText(null);
        jTextField34.setText(null);
        jTextField35.setText(null);
        jTextField36.setText(null);
        jTextField37.setText(null);
        jTextField38.setText(null);
        jTextField39.setText(null);
        jTextField40.setText(null);
        jTextField45.setText(null);
    }
private void trackKeeper(String did) {

     obj.connectToDB("caes");
     obj.insert("INSERT INTO `caes`.`keeptrack` (`User`, `record`, `Date`) VALUES ('"+UserName+"', '"+did+"', '"+date()+"')");
     obj.DisconnectFromDB();
    }
    public String date (){
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String currentTime = sdf.format(dt);

    return currentTime;
    }
}
