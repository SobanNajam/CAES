
package main;
import java.sql.*;

/**
 *
 * @author NUCES-Soban11-2051
 */
public class searchresult extends javax.swing.JPanel {

    public searchresult(String n) {
        initComponents();
        jTextField3.setText(null);
        resultanswer(n.trim());
        
        
 }

    public searchresult(int m) {
        initComponents();
        jTextField3.setText(null);
        resultanswer(m);
        

 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(845, 580));
        setMinimumSize(new java.awt.Dimension(845, 580));
        setPreferredSize(new java.awt.Dimension(845, 580));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(10, 111, 39, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel2.setText("ARN");
        add(jLabel2);
        jLabel2.setBounds(10, 140, 28, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel3.setText("Fee Status");
        add(jLabel3);
        jLabel3.setBounds(10, 166, 59, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel4.setText("Scheduled");
        add(jLabel4);
        jLabel4.setBounds(10, 192, 58, 17);

        jTextField1.setEditable(false);
        add(jTextField1);
        jTextField1.setBounds(91, 108, 133, 20);

        jTextField2.setEditable(false);
        add(jTextField2);
        jTextField2.setBounds(91, 139, 133, 20);

        jTextField3.setEditable(false);
        add(jTextField3);
        jTextField3.setBounds(91, 165, 133, 20);

        jTextField4.setEditable(false);
        add(jTextField4);
        jTextField4.setBounds(91, 191, 260, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel5.setText("Search Result:");
        add(jLabel5);
        jLabel5.setBounds(10, 59, 247, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 850, 580);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables


public void resultanswer(String n) {
        db obj = new db();
        ResultSet ans = null;
        try {
            obj.connectToDB("caes");
            ans = obj.connection.createStatement().executeQuery("select ARN,NAME from `caes`.`bba` where `name` like '%" + n + "%' union select ARN,NAME from `caes`.`bba/ee` where `name` like '%" + n.toUpperCase() + "%' union select ARN,NAME from `caes`.`ee/cs` where `name` like '%" + n.toUpperCase() + "%'");
            ans.last();
        try{
            if (ans.getRow() > 1) {
                
                manyName tablewindow = new manyName(ans);
                
                
            } else{
                
                jTextField1.setText(ans.getString(2));
                jTextField2.setText(ans.getString(1));

                ResultSet ans1 = obj.connection.createStatement().executeQuery("select status from `caes`.`fee_status` where `ARN` ="+Integer.parseInt(ans.getString(1)));
                ans1.next();

                if(ans1.getString(1).equals("2")){jTextField3.setText("Fee Paid");}
                else if(ans1.getString(1).equals("1")){jTextField3.setText("Fee Paid but not scheduled");}
                else {jTextField3.setText("Fee not paid");}
                
                if (ans1.getString(1).trim().equals("2"))
                    {
                    ResultSet ans2 =  obj.connection.createStatement().executeQuery("select test_date,test_time from `caes`.`testdetails` where `arn` ="+Integer.parseInt(ans.getString(1)));
                    ans2.next();
                    jTextField4.setText(ans2.getString(1)+" "+ans2.getString(2));
                    }
                }
            
        } catch (SQLException ex) {
            jTextField3.setText("Challan Not Issued");}
        }   catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null,"There is no such record","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
    obj.DisconnectFromDB();

        }

public void resultanswer(int n) {
        db obj = new db();
        ResultSet ans = null;
        try {
            obj.connectToDB("caes");
            ans = obj.connection.createStatement().executeQuery("select * from `caes`.`bba` where `ARN` = \"" + n + "\" union select * from `caes`.`bba/ee` where `ARN` = \"" + n + "\" union select * from `caes`.`ee/cs` where `ARN` =\"" + n + "\"");
            ans.last();

             jTextField1.setText(ans.getString(2));
             jTextField2.setText(Integer.toString(n));
        try{
                ResultSet ans1 = obj.connection.createStatement().executeQuery("select status from `caes`.`fee_status` where `ARN` ="+n);
                ans1.next();

                
                if(ans1.getString(1).equals("2")){jTextField3.setText("Fee Paid");}
                else if(ans1.getString(1).equals("1")){jTextField3.setText("Fee Paid but not scheduled");}
                else {jTextField3.setText("Fee not paid");}

                if (ans1.getString(1).trim().equals("2"))
                    {
                    ResultSet ans2 =  obj.connection.createStatement().executeQuery("select test_date,test_time from `caes`.`testdetails` where `arn` ="+n);
                    ans2.next();
                    jTextField4.setText(ans2.getString(1)+" "+ans2.getString(2));
                    }
          }catch(SQLException e)
                {
                 jTextField3.setText("Challan Not Issued");
                 }


        }catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null,"There is no such record","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }

           
          
                
            obj.DisconnectFromDB();
         
    }



}
