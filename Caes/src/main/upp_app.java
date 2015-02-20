
package main;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.SQLException;
public class upp_app extends javax.swing.JPanel {

    int arnToUpdate;
    caes masterobj;
    String UserName;
    public upp_app(int arn,caes object,String Name) {
        initComponents();
        arnToUpdate=arn;
        updater(arnToUpdate);
        masterobj=object;
        UserName = Name;
        picture.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upp_app = new javax.swing.JPanel();
        picture = new javax.swing.JFileChooser();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        up_mail = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        up_email = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        up_p1 = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        up_p2 = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        up_p3 = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        up_p4 = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        up_cp1 = new javax.swing.JComboBox();
        jLabel54 = new javax.swing.JLabel();
        up_cp2 = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        up_cp3 = new javax.swing.JComboBox();
        up_mal = new javax.swing.JRadioButton();
        up_female = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        imm = new javax.swing.JTextField();
        imo = new javax.swing.JTextField();
        mmo = new javax.swing.JTextField();
        my = new javax.swing.JTextField();
        i2mm = new javax.swing.JTextField();
        iy = new javax.swing.JTextField();
        mmm = new javax.swing.JTextField();
        i2y = new javax.swing.JTextField();
        i2mo = new javax.swing.JTextField();
        cnic = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1282, 800));
        setMinimumSize(new java.awt.Dimension(1282, 800));
        setPreferredSize(new java.awt.Dimension(1282, 800));

        upp_app.setBackground(new java.awt.Color(183, 230, 255));
        upp_app.setPreferredSize(new java.awt.Dimension(1262, 1008));
        upp_app.setLayout(null);

        picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureActionPerformed(evt);
            }
        });
        upp_app.add(picture);
        picture.setBounds(80, 10, 582, 397);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel35.setText("Enter Name");
        upp_app.add(jLabel35);
        jLabel35.setBounds(51, 48, 73, 17);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel36.setText("Father's name");
        upp_app.add(jLabel36);
        jLabel36.setBounds(51, 143, 89, 17);

        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        upp_app.add(fname);
        fname.setBounds(168, 142, 221, 20);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel37.setText("Enter CNIC");
        upp_app.add(jLabel37);
        jLabel37.setBounds(51, 79, 73, 17);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel38.setText("Contact #");
        upp_app.add(jLabel38);
        jLabel38.setBounds(51, 112, 59, 17);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel39.setText("Mailing Address");
        upp_app.add(jLabel39);
        jLabel39.setBounds(51, 208, 99, 17);
        upp_app.add(up_mail);
        up_mail.setBounds(170, 210, 640, 20);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel40.setText("E-mail Address");
        upp_app.add(jLabel40);
        jLabel40.setBounds(51, 174, 93, 17);
        upp_app.add(up_email);
        up_email.setBounds(168, 173, 221, 20);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel41.setText("Matriclulation");
        upp_app.add(jLabel41);
        jLabel41.setBounds(51, 345, 87, 17);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel42.setText("Marks Obt.");
        upp_app.add(jLabel42);
        jLabel42.setBounds(156, 309, 71, 17);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel43.setText("  Marks Max.");
        upp_app.add(jLabel43);
        jLabel43.setBounds(245, 309, 82, 17);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel44.setText("Year");
        upp_app.add(jLabel44);
        jLabel44.setBounds(376, 309, 30, 17);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel45.setText("Inter I");
        upp_app.add(jLabel45);
        jLabel45.setBounds(50, 370, 42, 17);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel46.setText("Inter II");
        upp_app.add(jLabel46);
        jLabel46.setBounds(50, 400, 48, 17);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel47.setText("Select Discipline Preferences");
        upp_app.add(jLabel47);
        jLabel47.setBounds(51, 463, 178, 17);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel48.setText("Preference 1");
        upp_app.add(jLabel48);
        jLabel48.setBounds(51, 489, 66, 14);

        up_p1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical Engineering", "Aeronautical Engineering", "BBA" }));
        up_p1.setEnabled(false);
        upp_app.add(up_p1);
        up_p1.setBounds(135, 486, 136, 20);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel49.setText("Preference 2");
        jLabel49.setName(""); // NOI18N
        upp_app.add(jLabel49);
        jLabel49.setBounds(284, 489, 66, 14);

        up_p2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical Engineering", "Aeronautical Engineering", "Busines Adminstration" }));
        up_p2.setEnabled(false);
        upp_app.add(up_p2);
        up_p2.setBounds(368, 486, 144, 20);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel50.setText("Preference 3");
        upp_app.add(jLabel50);
        jLabel50.setBounds(51, 520, 66, 14);

        up_p3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical Engineering", "Aeronautical Engineering", "Busines Adminstration" }));
        up_p3.setEnabled(false);
        upp_app.add(up_p3);
        up_p3.setBounds(135, 517, 136, 20);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel51.setText("Preference 4");
        upp_app.add(jLabel51);
        jLabel51.setBounds(284, 520, 66, 14);

        up_p4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical Engineering", "Aeronautical Engineering", "Busines Adminstration" }));
        up_p4.setEnabled(false);
        upp_app.add(up_p4);
        up_p4.setBounds(368, 517, 144, 20);

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel52.setText("Select Campus Preferences");
        upp_app.add(jLabel52);
        jLabel52.setBounds(51, 569, 168, 17);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel53.setText("Preference 1");
        upp_app.add(jLabel53);
        jLabel53.setBounds(51, 607, 66, 14);

        up_cp1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Karachi", "Islamabad", "Lahore", "Quetta" }));
        up_cp1.setPreferredSize(new java.awt.Dimension(144, 20));
        upp_app.add(up_cp1);
        up_cp1.setBounds(135, 604, 136, 20);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel54.setText("Preference 2");
        upp_app.add(jLabel54);
        jLabel54.setBounds(284, 607, 66, 14);

        up_cp2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Karachi", "Islamabad", "Lahore", "Quetta" }));
        up_cp2.setPreferredSize(new java.awt.Dimension(144, 20));
        upp_app.add(up_cp2);
        up_cp2.setBounds(368, 604, 144, 20);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel55.setText("Preference 3");
        upp_app.add(jLabel55);
        jLabel55.setBounds(51, 635, 66, 14);

        up_cp3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Karachi", "Islamabad", "Lahore", "Quetta" }));
        up_cp3.setPreferredSize(new java.awt.Dimension(144, 20));
        upp_app.add(up_cp3);
        up_cp3.setBounds(135, 635, 136, 20);

        up_mal.setBackground(new java.awt.Color(183, 230, 255));
        up_mal.setFont(new java.awt.Font("Times New Roman", 1, 14));
        up_mal.setSelected(true);
        up_mal.setText("Male");
        up_mal.setOpaque(false);
        up_mal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_malActionPerformed(evt);
            }
        });
        upp_app.add(up_mal);
        up_mal.setBounds(51, 255, 55, 25);

        up_female.setBackground(new java.awt.Color(183, 230, 255));
        up_female.setFont(new java.awt.Font("Serif", 1, 14));
        up_female.setText("Female");
        up_female.setOpaque(false);
        up_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_femaleActionPerformed(evt);
            }
        });
        upp_app.add(up_female);
        up_female.setBounds(51, 280, 71, 27);

        jButton3.setText("Update Application");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        upp_app.add(jButton3);
        jButton3.setBounds(284, 696, 123, 23);

        jButton4.setText("Reset Application");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        upp_app.add(jButton4);
        jButton4.setBounds(417, 696, 115, 23);

        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numKeyReleased(evt);
            }
        });
        upp_app.add(num);
        num.setBounds(168, 111, 221, 20);

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        upp_app.add(name);
        name.setBounds(168, 47, 221, 20);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Application Update Form");
        upp_app.add(jLabel34);
        jLabel34.setBounds(0, 0, 263, 28);

        imm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                immKeyReleased(evt);
            }
        });
        upp_app.add(imm);
        imm.setBounds(260, 370, 70, 20);

        imo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imoKeyReleased(evt);
            }
        });
        upp_app.add(imo);
        imo.setBounds(160, 370, 70, 20);

        mmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mmoKeyReleased(evt);
            }
        });
        upp_app.add(mmo);
        mmo.setBounds(160, 340, 70, 20);

        my.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                myKeyReleased(evt);
            }
        });
        upp_app.add(my);
        my.setBounds(360, 340, 70, 20);

        i2mm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i2mmKeyReleased(evt);
            }
        });
        upp_app.add(i2mm);
        i2mm.setBounds(260, 400, 70, 20);

        iy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iyKeyReleased(evt);
            }
        });
        upp_app.add(iy);
        iy.setBounds(360, 370, 70, 20);

        mmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mmmKeyReleased(evt);
            }
        });
        upp_app.add(mmm);
        mmm.setBounds(260, 340, 70, 20);

        i2y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i2yKeyReleased(evt);
            }
        });
        upp_app.add(i2y);
        i2y.setBounds(360, 400, 70, 20);

        i2mo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i2moKeyReleased(evt);
            }
        });
        upp_app.add(i2mo);
        i2mo.setBounds(160, 400, 70, 20);

        cnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicActionPerformed(evt);
            }
        });
        cnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnicFocusLost(evt);
            }
        });
        cnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnicKeyReleased(evt);
            }
        });
        upp_app.add(cnic);
        cnic.setBounds(170, 80, 220, 20);

        jButton5.setText("Browse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        upp_app.add(jButton5);
        jButton5.setBounds(620, 180, 90, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/banda.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jLabel2.setMaximumSize(new java.awt.Dimension(184, 153));
        jLabel2.setMinimumSize(new java.awt.Dimension(184, 153));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(184, 153));
        upp_app.add(jLabel2);
        jLabel2.setBounds(624, 20, 180, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        upp_app.add(jLabel1);
        jLabel1.setBounds(0, 0, 1282, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(upp_app, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(upp_app, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void up_malActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_malActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_up_malActionPerformed

    private void up_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_femaleActionPerformed
}//GEN-LAST:event_up_femaleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(UP_TrueorFalse()) {

            if (colorchecker()){JOptionPane.showMessageDialog(null, "You have requested an invalid submission", "Error", JOptionPane.ERROR_MESSAGE);}
            else{
            try{
                updateTheDb();
                javax.swing.JOptionPane.showMessageDialog(null,"Update Complete","Succesfully Updated",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                trackKeeper("Updated form with arn "+arnToUpdate);
                masterobj.remover();
             }catch(SQLException ex){System.out.println(ex.getMessage()); JOptionPane.showMessageDialog(null, "There is an error in submission request", "Error", JOptionPane.ERROR_MESSAGE);}
            }
        }
        // javax.swing.JOptionPane.showMessageDialog(null,"Registration Successful", "Application Saved",javax.swing.JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       up_reseter();
}//GEN-LAST:event_jButton4ActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
colorsetternum(name);          // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyReleased
colorsettertext(num);          // TODO add your handling code here:
    }//GEN-LAST:event_numKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
colorsetternum(fname);          // TODO add your handling code here:
    }//GEN-LAST:event_fnameKeyReleased

    private void cnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

}//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:


        picture.setVisible(true);
        picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureActionPerformed(evt);
            }

            @SuppressWarnings("static-access")
            private void pictureActionPerformed(java.awt.event.ActionEvent evt) {

                if (picture.APPROVE_SELECTION.equals(evt.getActionCommand())){
                    pic = picture.getSelectedFile().getAbsolutePath();
                    jLabel2.setIcon(new javax.swing.ImageIcon(pic));
                    remove(picture);
                    picture.setVisible(false);


                    image.insert(0, pic.substring(0,2)+"\\\\"+pic.substring(3,9)+"\\\\"+pic.substring(10, pic.length()) );
                } else if (picture.CANCEL_SELECTION.equals(evt.getActionCommand())){
                    picture.setVisible(false);
                }

            }
        });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pictureActionPerformed

    private void cnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicKeyReleased
        colorsettertext(cnic);           // TODO add your handling code here:
    }//GEN-LAST:event_cnicKeyReleased

    private void cnicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnicFocusLost
        if(cnic.getText().trim().length() != 13)cnic.setBackground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_cnicFocusLost

    private void mmoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmoKeyReleased
       colorsettertext(mmo); // TODO add your handling code here:
    }//GEN-LAST:event_mmoKeyReleased

    private void mmmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmmKeyReleased
       colorsettertext(mmm);        // TODO add your handling code here:
    }//GEN-LAST:event_mmmKeyReleased

    private void myKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myKeyReleased
        colorsettertext(my);        // TODO add your handling code here:
    }//GEN-LAST:event_myKeyReleased

    private void imoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imoKeyReleased
        colorsettertext(imo);        // TODO add your handling code here:
    }//GEN-LAST:event_imoKeyReleased

    private void immKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_immKeyReleased
        colorsettertext(imm);        // TODO add your handling code here:
    }//GEN-LAST:event_immKeyReleased

    private void iyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iyKeyReleased
        colorsettertext(iy);        // TODO add your handling code here:
    }//GEN-LAST:event_iyKeyReleased

    private void i2moKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_i2moKeyReleased
        colorsettertext(i2mo);        // TODO add your handling code here:
    }//GEN-LAST:event_i2moKeyReleased

    private void i2mmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_i2mmKeyReleased
        colorsettertext(i2mm);        // TODO add your handling code here:
    }//GEN-LAST:event_i2mmKeyReleased

    private void i2yKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_i2yKeyReleased
        colorsettertext(i2y);        // TODO add your handling code here:
    }//GEN-LAST:event_i2yKeyReleased


    String pic = null;
    javax.swing.ButtonGroup ok = new javax.swing.ButtonGroup();
    StringBuilder image = new StringBuilder();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField i2mm;
    private javax.swing.JTextField i2mo;
    private javax.swing.JTextField i2y;
    private javax.swing.JTextField imm;
    private javax.swing.JTextField imo;
    private javax.swing.JTextField iy;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JTextField mmm;
    private javax.swing.JTextField mmo;
    private javax.swing.JTextField my;
    private javax.swing.JTextField name;
    private javax.swing.JTextField num;
    private javax.swing.JFileChooser picture;
    private javax.swing.JComboBox up_cp1;
    private javax.swing.JComboBox up_cp2;
    private javax.swing.JComboBox up_cp3;
    private javax.swing.JTextField up_email;
    private javax.swing.JRadioButton up_female;
    private javax.swing.JTextField up_mail;
    private javax.swing.JRadioButton up_mal;
    private javax.swing.JComboBox up_p1;
    private javax.swing.JComboBox up_p2;
    private javax.swing.JComboBox up_p3;
    private javax.swing.JComboBox up_p4;
    private javax.swing.JPanel upp_app;
    // End of variables declaration//GEN-END:variables

    public boolean UP_TrueorFalse() {
     if (name.getText().isEmpty() || cnic.getText().isEmpty() || fname.getText().isEmpty() || up_mail.getText().isEmpty() || imm.getText().isEmpty() || mmm.getText().isEmpty() || my.getText().isEmpty() || imo.getText().isEmpty() || imm.getText().isEmpty() || iy.getText().isEmpty() ||  i2y.getText().isEmpty() || up_cp1.getSelectedItem().equals("...") ) {
      JOptionPane.showMessageDialog(null, "Required field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            }
        else {
             return true;
             }

    }


private void updateTheDb() throws SQLException {

        String gender;
        db obj = new db();
        obj.connectToDB("caes");
        if(up_mal.isSelected())gender="Male";
        else gender = "Female";

        obj.connection.createStatement().
             executeUpdate("UPDATE `caes`.`"+ UP_TableName().trim()+"` SET `NAME` = ' "+ name.getText() +"', `CNIC` = '"+ cnic.getText()+"', `CONTACT` = '"+num.getText()
                            +"', `FATHER` = '"+fname.getText() +"', `EMAIL` = '"+ up_email.getText()+"', "+"`MAIL` = '"+ up_mail.getText()
                            +"', `MOMAT` = '"+ Integer.parseInt(imm.getText())+"', `MMMAT` = '"+Integer.parseInt(mmm.getText() )+"', `YEARMAT` = '"+Integer.parseInt(my.getText())
                            +"', `MOINT1` = '"+ Integer.parseInt(imo.getText())+"', `MMINT1`='"+ Integer.parseInt(imm.getText())+"', `YEARINT1` = '"+Integer.parseInt(iy.getText())
                            +"', `MOINT2` = '"+ Integer.parseInt(i2mo.getText())+"', `MMINT2` = '"+ Integer.parseInt(i2mm.getText())+"', `YEARINT2` = '"+Integer.parseInt(i2y.getText())
                            +"', `DPREF1` ='"+up_p1.getSelectedItem()+"', `DPREF2` ='"+up_p2.getSelectedItem()+"', `DPREF3` = '"+up_p3.getSelectedItem()
                            +"', `DPREF4` ='"+up_p4.getSelectedItem()+"', `CPREF1` = '"+up_cp1.getSelectedItem()+"', `CPREF2` = '"+up_cp2.getSelectedItem()
                            +"', `CPREF3` ='"+up_cp3.getSelectedItem()+ "' , `DATEUPP` = '"+ date()+"',`GENDER`='"+gender+"',`image`='"+image.toString()
                            +"' WHERE `"+UP_TableName().trim()+"`.`ARN` ="+arnToUpdate);
       obj.DisconnectFromDB();
    }
public String UP_TableName(){

        if(arnToUpdate/100000 == 3)
            return "bba";
        else if(arnToUpdate/100000 == 2)
            return "bba/ee";
        else
            return "ee/cs";

}
public String date (){
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(dt);

    return currentTime;
    }


public void up_reseter()
{
name.setText("");
cnic.setText("");
fname.setText("");
num.setText("");
up_email.setText("");
up_mail.setText("");
imm.setText("");
mmm.setText("");
my.setText("");
imo.setText("");
imm.setText("");
iy.setText("");
i2mo.setText("");
i2mm.setText("");
i2y.setText("");
jLabel2.setIcon(new javax.swing.ImageIcon("/main/banda.png"));


up_p1.setSelectedItem(0);
up_p2.setSelectedItem(0);
up_p3.setSelectedItem(0);
up_p4.setSelectedItem(0);


up_cp1.setSelectedItem(0);
up_cp2.setSelectedItem(0);
up_cp3.setSelectedItem(0);
}


private void updater(int arn) {

       
       db obj= new db();
       obj.connectToDB("caes");
       ok.add(up_mal);
       ok.add(up_female);
       try{ java.sql.ResultSet rs = obj.connection.createStatement().executeQuery("select * from `bba` where `ARN` = " + arn+" union select * from `bba/ee` where `ARN` = " + arn+" union select * from `ee/cs` where `ARN` = " + arn);
            rs.next();

        name.setText( rs.getString(2) );
        cnic.setText(rs.getString(4));
        fname.setText(rs.getString(3));
        num.setText(rs.getString(5));
        up_email.setText(rs.getString(6));
        up_mail.setText(rs.getString(7));
        pic= rs.getString("image");
        jLabel2.setIcon(new javax.swing.ImageIcon(pic));
        //gend .setText(rs.getString(8));
        if (rs.getString(8).startsWith("M"))
            up_mal.setSelected(true);
        else
            up_female.setSelected(true);

        mmo.setText(rs.getString(9));
        mmm.setText(rs.getString(10));
        my.setText(rs.getString(11));

        imo.setText(rs.getString(12));
        imm.setText(rs.getString(13));
        iy.setText(rs.getString(14));

        i2mo.setText(rs.getString(15));
        i2mm.setText(rs.getString(16));
        i2y.setText(rs.getString(17));

        int cslctn[] = new int[4];
             CourseSelection(cslctn,rs);


        up_p1.setSelectedIndex(cslctn[0]);
        up_p2.setSelectedIndex(cslctn[1]);
        up_p3.setSelectedIndex(cslctn[2]);
        up_p4.setSelectedIndex(cslctn[3]);

        int campus[] = new int[3];
            CampusSelection(campus,rs);

        up_cp1.setSelectedIndex(campus[0]);
        up_cp2.setSelectedIndex(campus[1]);
        up_cp3.setSelectedIndex(campus[2]);
        obj.DisconnectFromDB();
       }catch (SQLException ex)
              {
                ex.getSQLState();

                }
    }

private int[] CampusSelection(int[] slctn,java.sql.ResultSet rs)
 {
        try {
            if (rs.getString(22).trim().startsWith("K")) {
                slctn[0] = 1;
            } else if (rs.getString(22).trim().startsWith("I")) {
                slctn[0] = 2;
            } else if (rs.getString(22).trim().startsWith("L")) {
                slctn[0] = 3;
            } else if (rs.getString(22).trim().startsWith("Q")) {
                slctn[0] = 4;
            }

         if( !(rs.getString(23).trim().equals(null))  )
             if (rs.getString(23).trim().startsWith("K")) {
                slctn[1] = 1;
            } else if (rs.getString(23).trim().startsWith("I")) {
                slctn[1] = 2;
            } else if (rs.getString(23).trim().startsWith("L")) {
                slctn[1] = 3;
            } else if (rs.getString(23).trim().startsWith("Q")) {
                slctn[1] = 4;
            }

         if( !(rs.getString(24).trim().equals(null))  )
            if (rs.getString(24).trim().startsWith("K")) {
                slctn[2] = 1;
            } else if (rs.getString(24).trim().startsWith("I")) {
                slctn[2] = 2;
            } else if (rs.getString(24).trim().startsWith("L")) {
                slctn[2] = 3;
            } else if (rs.getString(24).trim().startsWith("Q")) {
                slctn[2] = 4;
            }


        } catch (SQLException ex) {
            ex.getMessage();
        }



    finally{return slctn;}
}

private int[] CourseSelection(int[] slctn,java.sql.ResultSet rs)
 {

    try{
        if (rs.getString(18).startsWith("C"))
            slctn[0]=1;
        else if (rs.getString(18).startsWith("E"))
            slctn[0]=2;
        else if (rs.getString(18).startsWith("A"))
            slctn[0]=3;
        else if (rs.getString(18).startsWith("B"))
            slctn[0]=4;

        System.out.println("in campus1 = "+slctn[0]);
     if( !(rs.getString(19).equals(null)) )
        if (rs.getString(19).startsWith("C"))
            slctn[1]=1;
        else if (rs.getString(19).startsWith("E"))
            slctn[1]=2;
        else if (rs.getString(19).startsWith("A"))
            slctn[1]=3;
        else if (rs.getString(19).startsWith("B"))
            slctn[1]=4;


     if( !(rs.getString(20).equals(null)) )
        if (rs.getString(20).startsWith("C"))
            slctn[2]=1;
        else if (rs.getString(20).startsWith("E"))
            slctn[2]=2;
        else if (rs.getString(20).startsWith("A"))
            slctn[2]=3;
        else if (rs.getString(20).startsWith("B"))
            slctn[2]=4;

      if( !(rs.getString(21).equals(null)) )
        if (rs.getString(21).startsWith("C"))
            slctn[3]=1;
        else if (rs.getString(21).startsWith("E"))
            slctn[3]=2;
        else if (rs.getString(21).startsWith("A"))
            slctn[3]=3;
        else if (rs.getString(21).startsWith("B"))
            slctn[3]=4;

        }catch(SQLException e){e.getMessage();}

    finally{
            return slctn;
             }
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

public boolean numchecker(String x2){

        int n=0;
        char[] x = x2.toCharArray();
        for (n=0;n<x.length;n++)
            {
             if ((x[n] >= 48 && x[n] <= 57))
                return true;
            }

 return false;
}

public void colorsettertext(javax.swing.JTextField a) {
        if (textchecker(a.getText())) {
            a.setBackground(Color.red);
        } else {
            a.setBackground(Color.white);
        }
    }
public void colorsetternum(javax.swing.JTextField a) {
        if (numchecker(a.getText())) {
            a.setBackground(Color.red);
        } else {
            a.setBackground(Color.white);
        }
    }

 private void trackKeeper(String did) {
     db obj = new db();

     obj.connectToDB("caes");
     obj.insert("INSERT INTO `caes`.`keeptrack` (`User`, `record`, `Date`) VALUES ('"+UserName+"', '"+did+"', '"+date()+"')");
     obj.DisconnectFromDB();
    }

public boolean colorchecker(){

    return (name.getBackground().equals(Color.red) || cnic.getBackground().equals(Color.red) || num.getBackground().equals(Color.red) ||
        fname.getBackground().equals(Color.red) || mmo.getBackground().equals(Color.red) || mmm.getBackground().equals(Color.red) ||
        my.getBackground().equals(Color.red) || imo.getBackground().equals(Color.red) || imm.getBackground().equals(Color.red) ||
        iy.getBackground().equals(Color.red) || i2mo.getBackground().equals(Color.red) || i2mm.getBackground().equals(Color.red) ||
        i2y.getBackground().equals(Color.red));
}

}
