
package main;
import java.awt.Color;
import java.awt.event.ActionEvent;

import java.io.File;

import javax.swing.JOptionPane;
import java.sql.SQLException;


public class new_app extends javax.swing.JPanel {

    /** Creates new form new_app */
    caes masterobj;
    db obj = new db();
    String UserName;
    public new_app(caes object,String name) {
        initComponents();
        bg.add(jButton1);
        bg.add(jButton2);
        masterobj=object;
        UserName = name;
        picture.setVisible(false);
        setSize(845,1000);

        bg.add(male);
        bg.add(female);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new_app = new javax.swing.JPanel();
        picture = new javax.swing.JFileChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cnic = new javax.swing.JTextField();
        mmo = new javax.swing.JTextField();
        mmm = new javax.swing.JTextField();
        my = new javax.swing.JTextField();
        imo = new javax.swing.JTextField();
        i2mo = new javax.swing.JTextField();
        iy = new javax.swing.JTextField();
        imm = new javax.swing.JTextField();
        i2mm = new javax.swing.JTextField();
        i2y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1282, 800));
        setMinimumSize(new java.awt.Dimension(1282, 800));
        setPreferredSize(new java.awt.Dimension(1282, 800));

        new_app.setBackground(new java.awt.Color(183, 230, 255));
        new_app.setMaximumSize(new java.awt.Dimension(845, 1000));
        new_app.setMinimumSize(new java.awt.Dimension(845, 1000));
        new_app.setPreferredSize(new java.awt.Dimension(845, 1000));
        new_app.setLayout(null);

        picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureActionPerformed(evt);
            }
        });
        new_app.add(picture);
        picture.setBounds(60, 50, 582, 397);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel13.setText("Enter Name");
        new_app.add(jLabel13);
        jLabel13.setBounds(58, 41, 73, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel14.setText("Father's name");
        new_app.add(jLabel14);
        jLabel14.setBounds(58, 135, 89, 17);

        fname.setPreferredSize(new java.awt.Dimension(60, 20));
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        new_app.add(fname);
        fname.setBounds(175, 134, 221, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel15.setText("Enter CNIC");
        new_app.add(jLabel15);
        jLabel15.setBounds(58, 72, 73, 17);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel16.setText("Contact #");
        new_app.add(jLabel16);
        jLabel16.setBounds(58, 104, 59, 17);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel17.setText("Mailing Address");
        new_app.add(jLabel17);
        jLabel17.setBounds(58, 219, 99, 17);
        new_app.add(jTextField1);
        jTextField1.setBounds(175, 210, 578, 26);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel18.setText("E-mail Address");
        new_app.add(jLabel18);
        jLabel18.setBounds(58, 173, 93, 17);

        jTextField6.setPreferredSize(new java.awt.Dimension(60, 20));
        new_app.add(jTextField6);
        jTextField6.setBounds(175, 172, 221, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel19.setText("Matriclulation");
        new_app.add(jLabel19);
        jLabel19.setBounds(58, 364, 87, 17);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel20.setText("Marks Obt.");
        new_app.add(jLabel20);
        jLabel20.setBounds(163, 328, 71, 17);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel21.setText("  Marks Max.");
        new_app.add(jLabel21);
        jLabel21.setBounds(252, 328, 82, 17);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel22.setText("Year");
        new_app.add(jLabel22);
        jLabel22.setBounds(383, 328, 30, 17);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel23.setText("Inter I");
        new_app.add(jLabel23);
        jLabel23.setBounds(60, 400, 42, 20);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel24.setText("Inter II");
        new_app.add(jLabel24);
        jLabel24.setBounds(58, 436, 48, 17);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel25.setText("Select Discipline Preferences");
        new_app.add(jLabel25);
        jLabel25.setBounds(58, 510, 178, 17);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel26.setText("Preference 1");
        new_app.add(jLabel26);
        jLabel26.setBounds(58, 536, 66, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical", "Aeronautical", "BBA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        new_app.add(jComboBox1);
        jComboBox1.setBounds(142, 533, 136, 20);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel27.setText("Preference 2");
        jLabel27.setName(""); // NOI18N
        new_app.add(jLabel27);
        jLabel27.setBounds(311, 536, 66, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical", "Aeronautical", "BBA" }));
        new_app.add(jComboBox2);
        jComboBox2.setBounds(395, 533, 133, 20);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel28.setText("Preference 3");
        new_app.add(jLabel28);
        jLabel28.setBounds(58, 567, 66, 14);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical", "Aeronautical", "BBA" }));
        new_app.add(jComboBox3);
        jComboBox3.setBounds(142, 564, 136, 20);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel29.setText("Preference 4");
        new_app.add(jLabel29);
        jLabel29.setBounds(311, 567, 66, 14);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Computer Science", "Electrical", "Aeronautical", "BBA" }));
        new_app.add(jComboBox4);
        jComboBox4.setBounds(395, 564, 133, 20);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel30.setText("Select Campus Preferences");
        new_app.add(jLabel30);
        jLabel30.setBounds(58, 616, 168, 17);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel31.setText("Preference 1");
        new_app.add(jLabel31);
        jLabel31.setBounds(58, 654, 66, 14);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Karachi", "Islamabad", "Lahore", "Quetta" }));
        jComboBox5.setPreferredSize(new java.awt.Dimension(144, 20));
        new_app.add(jComboBox5);
        jComboBox5.setBounds(142, 651, 136, 20);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel32.setText("Preference 2");
        new_app.add(jLabel32);
        jLabel32.setBounds(327, 654, 66, 14);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Karachi", "Islamabad", "Lahore", "Quetta" }));
        jComboBox6.setPreferredSize(new java.awt.Dimension(144, 20));
        new_app.add(jComboBox6);
        jComboBox6.setBounds(411, 651, 144, 20);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel33.setText("Preference 3");
        new_app.add(jLabel33);
        jLabel33.setBounds(58, 682, 66, 14);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Karachi", "Islamabad", "Lahore", "Quetta" }));
        jComboBox7.setPreferredSize(new java.awt.Dimension(144, 20));
        new_app.add(jComboBox7);
        jComboBox7.setBounds(142, 682, 136, 20);

        male.setBackground(new java.awt.Color(85, 179, 248));
        male.setFont(new java.awt.Font("Times New Roman", 1, 14));
        male.setSelected(true);
        male.setText("Male");
        male.setOpaque(false);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        new_app.add(male);
        male.setBounds(58, 266, 55, 25);

        female.setBackground(new java.awt.Color(85, 179, 248));
        female.setFont(new java.awt.Font("Serif", 1, 14));
        female.setText("Female");
        female.setOpaque(false);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        new_app.add(female);
        female.setBounds(58, 291, 71, 27);

        jButton1.setText("Submit Application");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        new_app.add(jButton1);
        jButton1.setBounds(210, 740, 160, 23);

        jButton2.setText("Reset Application");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        new_app.add(jButton2);
        jButton2.setBounds(390, 740, 170, 23);

        num.setPreferredSize(new java.awt.Dimension(60, 20));
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numKeyReleased(evt);
            }
        });
        new_app.add(num);
        num.setBounds(175, 103, 221, 20);

        name.setPreferredSize(new java.awt.Dimension(60, 20));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        new_app.add(name);
        name.setBounds(175, 40, 221, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Admission Application Form");
        new_app.add(jLabel12);
        jLabel12.setBounds(0, 0, 295, 28);

        cnic.setPreferredSize(new java.awt.Dimension(60, 20));
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
        new_app.add(cnic);
        cnic.setBounds(175, 72, 221, 20);

        mmo.setPreferredSize(new java.awt.Dimension(25, 20));
        mmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mmoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mmoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mmoKeyTyped(evt);
            }
        });
        new_app.add(mmo);
        mmo.setBounds(163, 367, 71, 20);

        mmm.setPreferredSize(new java.awt.Dimension(25, 20));
        mmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mmmKeyReleased(evt);
            }
        });
        new_app.add(mmm);
        mmm.setBounds(257, 366, 69, 20);

        my.setPreferredSize(new java.awt.Dimension(25, 20));
        my.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                myKeyReleased(evt);
            }
        });
        new_app.add(my);
        my.setBounds(356, 366, 70, 20);

        imo.setPreferredSize(new java.awt.Dimension(25, 20));
        imo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imoKeyReleased(evt);
            }
        });
        new_app.add(imo);
        imo.setBounds(163, 404, 71, 20);

        i2mo.setPreferredSize(new java.awt.Dimension(25, 20));
        i2mo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i2moKeyReleased(evt);
            }
        });
        new_app.add(i2mo);
        i2mo.setBounds(163, 440, 71, 20);

        iy.setPreferredSize(new java.awt.Dimension(25, 20));
        iy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iyKeyReleased(evt);
            }
        });
        new_app.add(iy);
        iy.setBounds(356, 400, 70, 20);

        imm.setPreferredSize(new java.awt.Dimension(25, 20));
        imm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immActionPerformed(evt);
            }
        });
        imm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                immKeyReleased(evt);
            }
        });
        new_app.add(imm);
        imm.setBounds(256, 400, 70, 20);

        i2mm.setPreferredSize(new java.awt.Dimension(25, 20));
        i2mm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i2mmKeyReleased(evt);
            }
        });
        new_app.add(i2mm);
        i2mm.setBounds(256, 440, 70, 20);

        i2y.setPreferredSize(new java.awt.Dimension(25, 20));
        i2y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i2yKeyReleased(evt);
            }
        });
        new_app.add(i2y);
        i2y.setBounds(356, 440, 70, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(ok)));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jLabel2.setMaximumSize(new java.awt.Dimension(184, 153));
        jLabel2.setMinimumSize(new java.awt.Dimension(184, 153));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(184, 153));
        new_app.add(jLabel2);
        jLabel2.setBounds(624, 20, 184, 153);

        jButton3.setText("Browse");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        new_app.add(jButton3);
        jButton3.setBounds(620, 180, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 20));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        new_app.add(jLabel1);
        jLabel1.setBounds(0, 0, 1282, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(new_app, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(new_app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_femaleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (TrueorFalse()) {

            if (colorchecker()){
                JOptionPane.showMessageDialog(null, "You have requested an invalid submission!", "Error", JOptionPane.ERROR_MESSAGE);
            }else{

            try{
                InsertToDB();
                masterobj.remover();

            }catch(Exception e){e.printStackTrace();}
        }
        } else
            JOptionPane.showMessageDialog(null, "Required field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             reseter();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void mmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmoKeyTyped

        if (textchecker(mmo.getText())){
            mmo.setBackground(Color.red);
        }
        else{
            mmo.setBackground(Color.white);
        }
    }//GEN-LAST:event_mmoKeyTyped

    private void mmoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmoKeyPressed

        if (textchecker(mmo.getText())){
            mmo.setBackground(Color.red);
        }
        else{
            mmo.setBackground(Color.white);
        }
    }//GEN-LAST:event_mmoKeyPressed

    private void mmoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmoKeyReleased
        colorsettertext(mmo);
    }//GEN-LAST:event_mmoKeyReleased

    private void mmmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmmKeyReleased
colorsettertext(mmm);        // TODO add your handling code here:
    }//GEN-LAST:event_mmmKeyReleased

    private void myKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myKeyReleased
colorsettertext(my);        // TODO add your handling code here:
    }//GEN-LAST:event_myKeyReleased

    private void immActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_immActionPerformed

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

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
colorsetternum(name);
    }//GEN-LAST:event_nameKeyReleased

    private void numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyReleased
    colorsettertext(num);        // TODO add your handling code here:
    }//GEN-LAST:event_numKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
    colorsetternum(fname);        // TODO add your handling code here:
    }//GEN-LAST:event_fnameKeyReleased

    private void cnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicKeyReleased
    colorsettertext(cnic);        // TODO add your handling code here:
    }//GEN-LAST:event_cnicKeyReleased

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:


            picture.setVisible(true);
            picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureActionPerformed(evt);
            }

            @SuppressWarnings("static-access")
            private void pictureActionPerformed(ActionEvent evt) {

                if (picture.APPROVE_SELECTION.equals(evt.getActionCommand())){
                    ok = picture.getSelectedFile().getAbsolutePath();
                    //ImageIcon icon = new ImageIcon(x.getName());
                    System.out.println(ok);

                    jLabel2.setIcon(new javax.swing.ImageIcon(ok));
                    remove(picture);
                    picture.setVisible(false);

                    image.insert(0, ok.substring(0,2)+"\\\\"+ok.substring(3,9)+"\\\\"+ok.substring(10, ok.length()) );

                }
                else if (picture.CANCEL_SELECTION.equals(evt.getActionCommand())){
                    picture.setVisible(false);
                   }

            }
        });

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cnicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnicFocusLost
        // TODO add your handling code here:
       if(cnic.getText().trim().length() != 13)cnic.setBackground(Color.red);
    }//GEN-LAST:event_cnicFocusLost

    private void pictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pictureActionPerformed

// "/main/filename.extension"
         javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
         String ok= "/main/banda.png";
         StringBuilder image = new StringBuilder();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnic;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField i2mm;
    private javax.swing.JTextField i2mo;
    private javax.swing.JTextField i2y;
    private javax.swing.JTextField imm;
    private javax.swing.JTextField imo;
    private javax.swing.JTextField iy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mmm;
    private javax.swing.JTextField mmo;
    private javax.swing.JTextField my;
    private javax.swing.JTextField name;
    private javax.swing.JPanel new_app;
    private javax.swing.JTextField num;
    private javax.swing.JFileChooser picture;
    // End of variables declaration//GEN-END:variables
    private File x;


public boolean TrueorFalse() //throws HeadlessException {
    {if (name.getText().isEmpty() || cnic.getText().isEmpty() || num.getText().isEmpty() || fname.getText().isEmpty() || jTextField1.getText().isEmpty() || mmm.getText().isEmpty() || mmo.getText().isEmpty() || my.getText().isEmpty() || imo.getText().isEmpty() || imm.getText().isEmpty() || iy.getText().isEmpty() || i2y.getText().isEmpty() || jComboBox1.getSelectedItem().equals("...") || jComboBox5.getSelectedItem().equals("...") ) {
      JOptionPane.showMessageDialog(null, "Required field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            }
        else {
             return true;
             }
    }
    public String TableName(){

        String stingy = null;
        Object[] dcheck = new Object[4];

                 dcheck[0] = jComboBox1.getSelectedItem();
                 dcheck[1] = jComboBox2.getSelectedItem();
                 dcheck[2] = jComboBox3.getSelectedItem();
                 dcheck[3] = jComboBox4.getSelectedItem();

                 if (dcheck[0].equals("BBA"))
                    {
                    if (dcheck[1].equals("..."))
                       stingy = "bba";
                    else
                       stingy = "bba/ee";

                    }
                 else if (dcheck[1].equals("BBA") || dcheck[2].equals("BBA") || dcheck[3].equals("BBA"))
                       stingy = "bba/ee";
                 else
                       stingy = "ee/cs";

        return stingy;
                        }

public void InsertToDB() throws SQLException {


        obj.connectToDB("caes");
        String gend;
        if (male.isSelected())
            gend = "male";
         else
            gend = "female";

        java.sql.ResultSet Latest_arn = obj.connection.createStatement().executeQuery("select ARN from `caes`.`" + TableName() + "` order by 'ARN' desc");
        Latest_arn.last();

        int x = Latest_arn.getInt(1);
       
        obj.insert("insert into `caes`.`" + TableName() + "` (`ARN`, `NAME`, `FATHER`, `CNIC`, `CONTACT`, `EMAIL`, `MAIL`, `GENDER`, `MOMAT`, `MMMAT`, `YEARMAT`, `MOINT1`, `MMINT1`, `YEARINT1`, `MOINT2`, `MMINT2`, `YEARINT2`, `DPREF1`, `DPREF2`, `DPREF3`, `DPREF4`, `CPREF1`, `CPREF2`, `CPREF3`, `DATESUB`, `DATEUPP`,`image`)  values ('" + (++x) + "','" + name.getText().trim() + "', '" + fname.getText() + "', '" + cnic.getText() + "', '" + num.getText() + "','" + jTextField6.getText() + "','" + jTextField1.getText() + "','" + gend + "','" + mmm.getText() + "','" + mmo.getText() + "','" + my.getText() + "','" + imo.getText() + "','" + imm.getText() + "','" + iy.getText() + "','" + i2mo.getText() + "','" + i2mm.getText() + "','" + i2y.getText() + "','" + jComboBox1.getSelectedItem() + "','" + jComboBox2.getSelectedItem() + "','" + jComboBox3.getSelectedItem() + "','" + jComboBox4.getSelectedItem() + "',' " + jComboBox5.getSelectedItem() + "','" + jComboBox6.getSelectedItem() + "','" + jComboBox7.getSelectedItem() + "','" + date() + "','" + null + "','"+(image.toString())+"')");
        reseter();
        JOptionPane.showMessageDialog(null, "Your ARN is "+x, "Successfully Registered", JOptionPane.INFORMATION_MESSAGE);
        obj.DisconnectFromDB();
        trackKeeper("Filled a new form for arn "+x);
    }
public void reseter() {
        // TODO add your handling code here:
        name.setText("");
        cnic.setText("");
        num.setText("");
        fname.setText("");
        jTextField1.setText("");
        mmm.setText("");
        mmo.setText("");
        my.setText("");
        imo.setText("");
        imm.setText("");
        iy.setText("");
        i2mo.setText("");
        jTextField6.setText("");
        i2mm.setText("");
        i2y.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jLabel2.setIcon(new javax.swing.ImageIcon("/main/banda.png"));
      
        
    }

 public String date (){
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String currentTime = sdf.format(dt);

    return currentTime;
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

public boolean colorchecker(){

    return (name.getBackground().equals(Color.red) || cnic.getBackground().equals(Color.red) || num.getBackground().equals(Color.red) ||
        fname.getBackground().equals(Color.red) || mmo.getBackground().equals(Color.red) || mmm.getBackground().equals(Color.red) ||
        my.getBackground().equals(Color.red) || imo.getBackground().equals(Color.red) || imm.getBackground().equals(Color.red) ||
        iy.getBackground().equals(Color.red) || i2mo.getBackground().equals(Color.red) || i2mm.getBackground().equals(Color.red) ||
        i2y.getBackground().equals(Color.red));
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

     obj.connectToDB("caes");
     obj.insert("INSERT INTO `caes`.`keeptrack` (`User`, `record`, `Date`) VALUES ('"+UserName+"', '"+did+"', '"+date()+"')");
     obj.DisconnectFromDB();
    }

   

}
