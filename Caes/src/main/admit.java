

package main;
import java.sql.*;


public class admit extends javax.swing.JFrame {

    db obj = new db();
    int ARN;
    public admit(int arn) {
        initComponents();

        java.awt.Dimension d = new java.awt.Dimension(450,600);
        setSize(d);
        setPreferredSize(d);
        setMaximumSize(d);
        setMinimumSize(d);
        ARN= arn;
        this.setTitle("Admit Card");
        printButton.addActionListener(new PrintUIWindow(toPrint));
        setter();
        
        pack();
        setVisible(true);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toPrint = new javax.swing.JPanel();
        arn = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nic = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        toPrint.setLayout(null);
        toPrint.add(arn);
        arn.setBounds(130, 150, 110, 20);
        toPrint.add(name);
        name.setBounds(60, 120, 180, 20);
        toPrint.add(nic);
        nic.setBounds(80, 180, 160, 20);
        toPrint.add(date);
        date.setBounds(80, 240, 160, 20);
        toPrint.add(time);
        time.setBounds(80, 274, 160, 20);
        toPrint.add(type);
        type.setBounds(80, 310, 160, 20);
        toPrint.add(pic);
        pic.setBounds(250, 110, 170, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/admit card.png"))); // NOI18N
        toPrint.add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 507);

        getContentPane().add(toPrint);
        toPrint.setBounds(0, 0, 430, 510);

        printButton.setText("PRINT");
        getContentPane().add(printButton);
        printButton.setBounds(120, 520, 150, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nic;
    private javax.swing.JLabel pic;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel time;
    private javax.swing.JPanel toPrint;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

    private void setter() {
        arn.setText(String.valueOf(ARN));

        try{
         obj.connectToDB("caes");

          ResultSet r = obj.connection.createStatement().executeQuery("select NAME,CNIC,image from `caes`.`bba` where `ARN` = \"" + ARN+ "\" union select NAME,CNIC,image from `caes`.`bba/ee` where `ARN` = \""+ ARN + "\" union select NAME,CNIC,image from `caes`.`ee/cs` where `ARN` =\"" + ARN+ "\"");
          r.next();

        name.setText(r.getString("NAME"));
        nic.setText(r.getString("CNIC"));
        
        pic.setIcon(new javax.swing.ImageIcon(r.getString("image").trim()));

        r = null;
        
        r= obj.connection.createStatement().executeQuery("select test_date,test_time from `caes`.`testdetails` where `arn` = '"+ARN+"'");
        r.next();
        time.setText(r.getString("test_time"));
        date.setText(r.getString("test_date"));
        type.setText(typeReturner(ARN) );




        obj.DisconnectFromDB();
        }catch(SQLException e){}


    }

    private String typeReturner(int arn)
        {
         switch(SesType(arn))
          {
             case 1: return "EE/CS";
             case 2: return "BBA/CS/EE";
             case 3: return "BBA";
             default: return null;
          }


        }

    private int SesType(int arn) {
        return arn/100000;
    }
}
