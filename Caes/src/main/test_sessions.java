
package main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class test_sessions extends javax.swing.JPanel {

    db obj = new db();
    public test_sessions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        test_sessions = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox();
        jLabel75 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jLabel76 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(881, 350));
        setMinimumSize(new java.awt.Dimension(881, 350));
        setPreferredSize(new java.awt.Dimension(881, 350));

        test_sessions.setBackground(new java.awt.Color(-4724993,true));
        test_sessions.setMaximumSize(new java.awt.Dimension(881, 763));
        test_sessions.setMinimumSize(new java.awt.Dimension(881, 763));
        test_sessions.setName(""); // NOI18N
        test_sessions.setPreferredSize(new java.awt.Dimension(1071, 1008));
        test_sessions.setLayout(null);

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel70.setText("Which session would you like to create?");
        test_sessions.add(jLabel70);
        jLabel70.setBounds(77, 47, 246, 17);

        jComboBox15.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EE", "BBA", "EE/BBA" }));
        test_sessions.add(jComboBox15);
        jComboBox15.setBounds(359, 44, 123, 23);

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel71.setText("Select Time slot");
        test_sessions.add(jLabel71);
        jLabel71.setBounds(77, 88, 98, 17);

        jComboBox16.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00 am", "12:00 pm", "03:00 pm" }));
        jComboBox16.setToolTipText("");
        test_sessions.add(jComboBox16);
        jComboBox16.setBounds(359, 85, 123, 23);

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel72.setText("Select date of session creation");
        test_sessions.add(jLabel72);
        jLabel72.setBounds(77, 161, 185, 17);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel74.setText("Date");
        test_sessions.add(jLabel74);
        jLabel74.setBounds(249, 187, 29, 17);

        jComboBox18.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        test_sessions.add(jComboBox18);
        jComboBox18.setBounds(288, 184, 42, 23);

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel75.setText("Month");
        test_sessions.add(jLabel75);
        jLabel75.setBounds(348, 187, 40, 17);

        jComboBox19.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        test_sessions.add(jComboBox19);
        jComboBox19.setBounds(392, 184, 135, 23);

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel76.setText("Year");
        test_sessions.add(jLabel76);
        jLabel76.setBounds(561, 187, 30, 17);

        jComboBox20.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014" }));
        test_sessions.add(jComboBox20);
        jComboBox20.setBounds(609, 184, 77, 23);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("Create Session");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        test_sessions.add(jButton6);
        jButton6.setBounds(288, 360, 190, 25);

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel77.setText("Enter number of seats in session");
        test_sessions.add(jLabel77);
        jLabel77.setBounds(77, 271, 201, 17);
        test_sessions.add(jTextField41);
        jTextField41.setBounds(288, 268, 106, 20);

        jLabel84.setText("(max 90)");
        test_sessions.add(jLabel84);
        jLabel84.setBounds(402, 271, 80, 14);

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel98.setText("SESSIONAL MANAGEMENT");
        test_sessions.add(jLabel98);
        jLabel98.setBounds(10, 5, 318, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        test_sessions.add(jLabel1);
        jLabel1.setBounds(0, 0, 1282, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(test_sessions, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(test_sessions, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int id;
        try{
            obj.connectToDB("caes");
            if (jComboBox15.getSelectedItem().equals("EE")) {
                java.sql.ResultSet Latest_ID = obj.connection.createStatement().executeQuery("select id from `caes`.`tableee` order by 'id' desc");
                Latest_ID.last();
                id=Latest_ID.getInt("id");

                obj.connection.createStatement().execute(
                        "insert into `caes`.`tableee`(`id`,`date`,`time`,`total_seats`,`avb_seats`) " +
                        "values('"+(++id)+"','"+jComboBox18.getSelectedItem()+"/"+jComboBox19.getSelectedItem()+
                        "/"+jComboBox20.getSelectedItem()+"','"+jComboBox16.getSelectedItem()+"','" +Integer.parseInt(jTextField41.getText())+
                        "','"+Integer.parseInt(jTextField41.getText())+"')");
            } else if (jComboBox15.getSelectedItem().equals("BBA")) {
                java.sql.ResultSet Latest_ID = obj.connection.createStatement().executeQuery("select id from `caes`.`tablebba` order by 'id' desc");
                Latest_ID.last();
                id=Latest_ID.getInt("id");

                obj.connection.createStatement().execute(
                        "insert into `caes`.`tablebba`(`id`,`date`,`time`,`total_seats`,`avb_seats`) " +
                        "values('"+(++id)+"','"+jComboBox18.getSelectedItem()+"\\"+jComboBox19.getSelectedItem()+
                        "\\"+jComboBox20.getSelectedItem()+"','"+jComboBox16.getSelectedItem()+"','" +Integer.parseInt(jTextField41.getText())+
                        "','"+Integer.parseInt(jTextField41.getText())+"')");
            } else if (jComboBox15.getSelectedItem().equals("EE/BBA")) {
                java.sql.ResultSet Latest_ID = obj.connection.createStatement().executeQuery("select id from `caes`.`tablebba/ee` order by 'id' desc");
                Latest_ID.last();
                id=Latest_ID.getInt("id");

                obj.connection.createStatement().execute(
                        "insert into `caes`.`tablebba/ee`(`id`,`date`,`time`,`total_seats`,`avb_seats`) " +
                        "values('"+(++id)+"','"+jComboBox18.getSelectedItem()+"\\"+jComboBox19.getSelectedItem()+
                        "\\"+jComboBox20.getSelectedItem()+"','"+jComboBox16.getSelectedItem()+"','" +Integer.parseInt(jTextField41.getText())+
                        "','"+Integer.parseInt(jTextField41.getText())+"')");
            }
            obj.DisconnectFromDB();
        }catch(SQLException ex) {
           }

        JOptionPane.showMessageDialog(null,"Session creation successful","Sucess",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JPanel test_sessions;
    // End of variables declaration//GEN-END:variables

}
