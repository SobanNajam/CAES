

package main;
import javax.swing.JOptionPane;


public class paschange extends javax.swing.JPanel {

  db obj = new db();
    public paschange() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel111 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        newPass = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        newPass2 = new javax.swing.JTextField();
        oldPass = new javax.swing.JPasswordField();
        jLabel110 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(690, 330));
        setMinimumSize(new java.awt.Dimension(690, 330));
        setLayout(null);

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel111.setText("New Password ");
        add(jLabel111);
        jLabel111.setBounds(30, 120, 121, 17);

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel109.setText("User Name");
        add(jLabel109);
        jLabel109.setBounds(30, 40, 91, 17);

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel112.setText("Confirm Password");
        add(jLabel112);
        jLabel112.setBounds(30, 160, 112, 17);
        add(newPass);
        newPass.setBounds(150, 120, 148, 20);

        jButton9.setText("Change Password");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9);
        jButton9.setBounds(150, 230, 150, 23);
        add(newPass2);
        newPass2.setBounds(150, 160, 148, 20);
        add(oldPass);
        oldPass.setBounds(150, 80, 148, 20);

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel110.setText("Old Password");
        add(jLabel110);
        jLabel110.setBounds(30, 80, 91, 17);
        add(username);
        username.setBounds(150, 40, 150, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(690, 330));
        jLabel1.setMinimumSize(new java.awt.Dimension(690, 330));
        jLabel1.setPreferredSize(new java.awt.Dimension(690, 330));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try{
              obj.connectToDB("caes");
            isCorrect(oldPass.getPassword());
            System.out.println("no sql errors");
            obj.DisconnectFromDB();
        }catch(java.sql.SQLException e){obj.displaySQLErrors(e); JOptionPane.showMessageDialog(null, "Username incorrect!", "Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JTextField newPass;
    private javax.swing.JTextField newPass2;
    private javax.swing.JPasswordField oldPass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void isCorrect(char[] password) throws java.sql.SQLException{

        java.sql.ResultSet rsobj = obj.connection.createStatement().executeQuery("select password from `caes`.`account_info` where username=\"" + username.getText().trim() + "\"");
            rsobj.next();
            String pas = rsobj.getString(1);
            if (java.util.Arrays.equals(pas.toCharArray(), password))
                {
                 if (bothAreEqual(newPass.getText(),newPass2.getText()))
                     {
                      obj.insert("UPDATE  `caes`.`account_info` SET  `password` =  '"+ newPass.getText()+"' WHERE  `account_info`.`username` =  '"+username.getText().trim()+"'");
                      JOptionPane.showMessageDialog(null, "Password changed Succesfully!", "",JOptionPane.INFORMATION_MESSAGE);
                      newPass.setText("");newPass2.setText("");oldPass.setText(null);
                    }
                 else
                    {
                     JOptionPane.showMessageDialog(null, "Password do not match!", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                 }
            else{
                JOptionPane.showMessageDialog(null, "Password is incorrect!", "Error",JOptionPane.ERROR_MESSAGE);
                }


    }

    private boolean bothAreEqual(String password, String passwordb) {

        return password.equals( passwordb);
    }

}
