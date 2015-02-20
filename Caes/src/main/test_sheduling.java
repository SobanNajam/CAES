
package main;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class test_sheduling extends javax.swing.JPanel {

   db obj = new db();
   String UserName=null;
    public test_sheduling(String us) {
        initComponents();
        autoShedulelEnabler();
        UserName = us;
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        test_sheduling = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        arn = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        dc = new javax.swing.JComboBox();
        jLabel81 = new javax.swing.JLabel();
        ses = new javax.swing.JComboBox();
        jLabel82 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        feeaccepted = new javax.swing.JCheckBox();
        manualbutton = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        autobutton = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        unsheds = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        sheds = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1282, 700));
        setMinimumSize(new java.awt.Dimension(1282, 700));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1282, 700));

        test_sheduling.setBackground(new java.awt.Color(183, 230, 255));
        test_sheduling.setToolTipText("");
        test_sheduling.setMaximumSize(new java.awt.Dimension(881, 763));
        test_sheduling.setMinimumSize(new java.awt.Dimension(881, 763));
        test_sheduling.setPreferredSize(new java.awt.Dimension(1262, 1008));
        test_sheduling.setLayout(null);

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel78.setText("ARN");
        test_sheduling.add(jLabel78);
        jLabel78.setBounds(60, 370, 29, 17);

        arn.setEditable(false);
        arn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arnActionPerformed(evt);
            }
        });
        arn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                arnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arnKeyReleased(evt);
            }
        });
        test_sheduling.add(arn);
        arn.setBounds(120, 370, 160, 20);

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel80.setText("Select Discipline");
        test_sheduling.add(jLabel80);
        jLabel80.setBounds(60, 500, 101, 17);

        test_sheduling.add(dc);
        dc.setBounds(240, 500, 180, 20);

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel81.setText("Select Session");
        test_sheduling.add(jLabel81);
        jLabel81.setBounds(60, 540, 87, 17);

        test_sheduling.add(ses);
        ses.setBounds(240, 540, 180, 20);

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel82.setText("Fee Amount of Rs.");
        test_sheduling.add(jLabel82);
        jLabel82.setBounds(60, 430, 108, 17);

        fee.setEditable(false);
        test_sheduling.add(fee);
        fee.setBounds(170, 430, 57, 20);

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel83.setText("is collected");
        test_sheduling.add(jLabel83);
        jLabel83.setBounds(240, 430, 63, 17);

        feeaccepted.setBackground(new java.awt.Color(-1512462,true));
        feeaccepted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feeaccepted.setOpaque(false);
        test_sheduling.add(feeaccepted);
        feeaccepted.setBounds(320, 430, 21, 21);

        manualbutton.setFont(new java.awt.Font("Times New Roman", 1, 14));
        manualbutton.setText("Schedule Test");
        manualbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualbuttonActionPerformed(evt);
            }
        });
        test_sheduling.add(manualbutton);
        manualbutton.setBounds(230, 600, 190, 25);

        jCheckBox2.setBackground(new java.awt.Color(232, 235, 242));
        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jCheckBox2.setText("Schedule test manually");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        test_sheduling.add(jCheckBox2);
        jCheckBox2.setBounds(63, 307, 169, 25);

        jCheckBox3.setBackground(new java.awt.Color(63, 172, 247));
        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Automated Test Scheduling");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        test_sheduling.add(jCheckBox3);
        jCheckBox3.setBounds(63, 106, 195, 25);

        autobutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        autobutton.setText("Start scheduling!");
        autobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autobuttonActionPerformed(evt);
            }
        });
        test_sheduling.add(autobutton);
        autobutton.setBounds(63, 217, 215, 25);

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel57.setText("Total no. of unscheduled applicants");
        test_sheduling.add(jLabel57);
        jLabel57.setBounds(63, 150, 201, 17);

        unsheds.setEditable(false);
        test_sheduling.add(unsheds);
        unsheds.setBounds(268, 149, 65, 20);

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel93.setText("Total no. of scheduled applicants");
        test_sheduling.add(jLabel93);
        jLabel93.setBounds(63, 176, 187, 17);

        sheds.setEditable(false);
        test_sheduling.add(sheds);
        sheds.setBounds(268, 175, 65, 20);

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel96.setText("TEST SCHEDULING");
        test_sheduling.add(jLabel96);
        jLabel96.setBounds(10, 0, 224, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        test_sheduling.add(jLabel1);
        jLabel1.setBounds(-450, -10, 1520, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(test_sheduling, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(test_sheduling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arnActionPerformed

}//GEN-LAST:event_arnActionPerformed

    private void arnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arnKeyPressed

        if (evt.getKeyChar() == '\n')
            {
            try {
                obj.connectToDB("caes");
                java.sql.ResultSet objy = obj.connection.createStatement().executeQuery("select * from `caes`.`fee_status` where `ARN` = "+Integer.parseInt(arn.getText()));
                objy.next();
                fee.setText(objy.getString(4));
                if (objy.getInt(3) == 0){
                    feeaccepted.setSelected(false);
                }else if (objy.getInt(3) == 1)
                    feeaccepted.setSelected(true);
                
                if (jCheckBox2.isSelected() )
                {
                 int   type = SesType(Integer.parseInt(arn.getText()));
                 switch (type) {
                    case 1:thebaapsetter("EE","tableee");
                        break;
                    case 2:thebaapsetter("BBA","EE","tablebba/ee");
                        break;
                    case 3:thebaapsetter("BBA","tablebba");
                        break;
                     default:
                          JOptionPane.showMessageDialog(null, "","Error",JOptionPane.ERROR_MESSAGE);
                }
                }
                }
               catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "This arn has not being issued challan yet!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }



}//GEN-LAST:event_arnKeyPressed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        arn.setEditable(true);
        jCheckBox3.setSelected(false);
        autobutton.setEnabled(false);
        manualbutton.setEnabled(true);




}//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        autoShedulelEnabler();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void autobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autobuttonActionPerformed
        if (unsheds.getText().trim().equals("0"))
            JOptionPane.showMessageDialog(null,"All applicants have been scheduled","Error",JOptionPane.ERROR_MESSAGE);
        else{
                autoSheduler();
                autoShedulelEnabler();
            }
    }//GEN-LAST:event_autobuttonActionPerformed

    private void arnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arnKeyReleased

        if (textchecker(arn.getText())) {
            arn.setBackground(Color.red);
        } else {
            arn.setBackground(Color.white);
        }

        


            
    }//GEN-LAST:event_arnKeyReleased

    private void manualbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualbuttonActionPerformed
        if( !(arn.getText().isEmpty()) && feeaccepted.isSelected())
         {
         String[] ok2 = java.util.Arrays.toString(ses.getSelectedObjects()).split(" ");
         StringBuffer s = new StringBuffer(ok2[0]).deleteCharAt(0);
         StringBuffer s2 = new StringBuffer(ok2[1]+" "+ok2[2]);
         s2.deleteCharAt(s2.length()-1);

         try{
             obj.connection.createStatement().execute("insert into `caes`.`testdetails` (`arn`,`test_date`,`test_time`) values('"+Integer.parseInt(arn.getText())+"','"+s+"','"+s2+"')");
            }catch(SQLException e)
                    {JOptionPane.showMessageDialog(null, "Already Scheduled!","Error",JOptionPane.ERROR_MESSAGE);}
         try{
             String table =  new String();
             if (SesType(Integer.parseInt(arn.getText())) == 1){table="tableee";}
             else if (SesType(Integer.parseInt(arn.getText())) == 2){table="tablebba/ee";}
             else if (SesType(Integer.parseInt(arn.getText())) == 3){table="tablebba";}

             java.sql.ResultSet rs2 = obj.connection.createStatement().executeQuery("select `avb_seats` from `caes`.`tableee` where date ='"+s+"' and time = '"+s2+"'");
             rs2.next();
             int sts = rs2.getInt("avb_seats");
             obj.connection.createStatement().execute("update `caes`.`"+table+"` set `avb_seats` = '"+(--sts)+"' where `"+table+"`.`date` = '"+s+"' and `"+table+"`.`time`='"+s2+"'");



         }catch(SQLException e)
                    {System.out.println(e.getMessage());}



         try{
             obj.connection.createStatement().execute("update `caes`.`fee_status` set `status` = '"+2+"' where `ARN` = '"+Integer.parseInt(arn.getText())+"'");
            }catch(SQLException e)
                {JOptionPane.showMessageDialog(null, "Challan Not issued against this arn!","Error",JOptionPane.ERROR_MESSAGE);}

         new admit(Integer.parseInt(arn.getText()));
         trackKeeper("Scheduled "+Integer.parseInt(arn.getText()));
         reseter();
         JOptionPane.showMessageDialog(null, "Scheduled Successfully!","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Required Field is Empty!","Error",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_manualbuttonActionPerformed

    admit card;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arn;
    private javax.swing.JButton autobutton;
    private javax.swing.JComboBox dc;
    private javax.swing.JTextField fee;
    private javax.swing.JCheckBox feeaccepted;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JButton manualbutton;
    private javax.swing.JComboBox ses;
    private javax.swing.JTextField sheds;
    private javax.swing.JPanel test_sheduling;
    private javax.swing.JTextField unsheds;
    // End of variables declaration//GEN-END:variables

     public void autoShedulelEnabler() {
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
            jCheckBox2.setSelected(false);
            arn.setEditable(false);
            autobutton.setEnabled(true);
            manualbutton.setEnabled(false);
            try {
                obj.connectToDB("caes");
                java.sql.ResultSet objx = obj.connection.createStatement().executeQuery("select * from `caes`.`fee_status` where `fee_status`.`status` != 2");
                objx.last();
                unsheds.setText("" + objx.getRow());
                objx = obj.connection.createStatement().executeQuery("select * from `caes`.`fee_status` where `fee_status`.`status` = 2");
                objx.last();
                sheds.setText("" + objx.getRow());
                obj.DisconnectFromDB();
            } catch (SQLException ex) {
                obj.displaySQLErrors(ex);
            }
        }
    }

    public void autoSheduler() {
        try {
            obj.connectToDB("caes");
            java.sql.ResultSet objx = obj.connection.createStatement().executeQuery("select * from `caes`.`fee_status` where `fee_status`.`status` = 1");
            int type;
            //if (objx.isBeforeFirst()){}
            while (objx.next()) {
                type = SesType(objx.getInt(1));
                switch (type) {
                    case 1:
                        theSetter(objx.getInt(1), "tableee");
                        break;
                    case 2:
                        theSetter(objx.getInt(1), "tablebba/ee");
                        break;
                    case 3:
                        theSetter(objx.getInt(1), "tablebba");
                        break;
                    default:
                        System.out.println("alaad");
                }
                
            }
            obj.DisconnectFromDB();

        } catch (SQLException ex) {
            obj.displaySQLErrors(ex);
            //JOptionPane.showMessageDialog(null, "There are no more students to schedule !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int SesType(int arn) {
        return arn/100000;
    }

    private void theSetter(int arn, String tablename) throws SQLException{

        db obj2 = new db();
        obj2.connectToDB("caes");
        java.sql.ResultSet rs = obj2.connection.createStatement().executeQuery("select * from `caes`.`"+tablename+"`");
        int seats;
        while (rs.next())
             {
             if (rs.getInt("avb_seats") >0)
                {
                 seats = rs.getInt("avb_seats");
                 obj2.connection.createStatement().execute("insert into `caes`.`testdetails` (`arn`,`test_date`,`test_time`) values('"+arn+"','"+rs.getString("date")+"','"+rs.getString("time")+"')");
                 obj2.connection.createStatement().execute("UPDATE  `caes`.`"+tablename+"` SET  `avb_seats` =  '"+(--seats)+"' WHERE  `"+tablename+"`.`id` = "+ rs.getInt("id")+" ");
                 obj2.connection.createStatement().execute("update `caes`.`fee_status` set `status` =2 where `fee_status`.`ARN` = '"+arn+"'");

                 new admit(arn);
                 trackKeeper("Scheduled "+arn+" [automated]");
                }
            }
        obj2.DisconnectFromDB();

        }


public boolean textchecker(String x2){

        int n=0;
        char[] x = x2.toCharArray();
        for (n=0;n<x.length;n++)
            {
             if ((x[n] >= 65 && x[n] <= 90) || (x[n] >= 97 && x[n] <= 122))
                return true;
            }

 return false;
}

    private void thebaapsetter(String name1,String name2,String tablename){
        dc.addItem(name1);
        dc.addItem(name2);
        try {
            java.sql.ResultSet objx = obj.connection.createStatement().executeQuery("select * from `caes`.`"+tablename+"` where `avb_seats` != 0");
            while (objx.next())
            {ses.addItem(objx.getString(2)+" "+objx.getString(3));}

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Seats full!","Error",JOptionPane.ERROR_MESSAGE);

        }


}

    private void thebaapsetter(String name1,String tablename){
        dc.addItem(name1);
       try {
            java.sql.ResultSet objx = obj.connection.createStatement().executeQuery("select * from `caes`.`"+tablename+"` where `avb_seats` != 0");
            while (objx.next())
            {ses.addItem(objx.getString(2)+" "+objx.getString(3));}

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Seats full!","Error",JOptionPane.ERROR_MESSAGE);

        }
}

public void reseter(){

    arn.setText(null); fee.setText(null); feeaccepted.setSelected(false);
    dc.removeAllItems(); ses.removeAllItems();

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
