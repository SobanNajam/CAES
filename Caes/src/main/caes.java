package main;

 import javax.swing.text.*;


public class caes extends javax.swing.JFrame {

    String username="alad";
    int prvlg;
    public caes(String ok,int prvillage) {
        initComponents();
        setResizable(false);
        setSize(1030,600);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setSize(845,435);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       
        username=ok;
        prvlg=prvillage;
        homepage();
        userDetector();
    }

    public void homepage() {
        remover();
        jScrollPane1.setVisible(true);
        homepg = new home(username);
        jScrollPane1.setViewportView(homepg);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statbutton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sessionbutton = new javax.swing.JLabel();
        shedulebutton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adminbutton = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        byarn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        byname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 20));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("      Apply");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 10, 80, 30);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 845, 580);

        statbutton.setFont(new java.awt.Font("Agency FB", 1, 20));
        statbutton.setForeground(new java.awt.Color(255, 255, 255));
        statbutton.setText(" Statistics");
        statbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(statbutton);
        statbutton.setBounds(670, 10, 60, 30);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 20));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Home");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 10, 70, 30);

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 20));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Fee submit");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 10, 80, 30);

        sessionbutton.setFont(new java.awt.Font("Agency FB", 1, 20));
        sessionbutton.setForeground(new java.awt.Color(255, 255, 255));
        sessionbutton.setText("  Sessions");
        sessionbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sessionbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(sessionbutton);
        sessionbutton.setBounds(510, 10, 70, 30);

        shedulebutton.setFont(new java.awt.Font("Agency FB", 1, 20));
        shedulebutton.setForeground(new java.awt.Color(255, 255, 255));
        shedulebutton.setText("  Schedule");
        shedulebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shedulebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shedulebuttonMouseClicked(evt);
            }
        });
        getContentPane().add(shedulebutton);
        shedulebutton.setBounds(590, 10, 70, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 10, 0, 0);

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 20));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("      Update");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 10, 90, 30);

        adminbutton.setFont(new java.awt.Font("Agency FB", 1, 20));
        adminbutton.setForeground(new java.awt.Color(255, 255, 255));
        adminbutton.setText("Adminstrator Priveleges");
        adminbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(adminbutton);
        adminbutton.setBounds(800, 50, 150, 30);

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 20));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(970, 50, 38, 30);

        byarn.setForeground(new java.awt.Color(153, 153, 153));
        byarn.setText("by ARN");
        byarn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byarnActionPerformed(evt);
            }
        });
        byarn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                byarnKeyPressed(evt);
            }
        });
        getContentPane().add(byarn);
        byarn.setBounds(230, 80, 100, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("  or");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 80, 30, 20);

        byname.setForeground(new java.awt.Color(153, 153, 153));
        byname.setText("by Name");
        byname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bynameActionPerformed(evt);
            }
        });
        byname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bynameKeyPressed(evt);
            }
        });
        getContentPane().add(byname);
        byname.setBounds(100, 80, 100, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel4.setText("Quick Search");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 80, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/doc2_1.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 555);

        fileMenu.setText("File");

        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setText("Save As ...");
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setText("Help");

        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    new_app newap =null;
    statistics stats=null;
    feesub feesubo=null;
    test_sessions sessioner =null;
    test_sheduling sheduler =null;
    upp_app updater = null;
    home homepg  =null;
    adminPanel admin =null;
    searchresult srl = null;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        remover();
        jScrollPane1.setVisible(true);
        newap = new new_app(this,username);
        jScrollPane1.setViewportView(newap);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        homepage();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void statbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statbuttonMouseClicked
        remover();
        stats = new statistics();
        jScrollPane1.setVisible(true);
        jScrollPane1.setViewportView(stats);
        
    }//GEN-LAST:event_statbuttonMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        remover();
        feesubo= new feesub(username,prvlg);
        jScrollPane1.setVisible(true);
        jScrollPane1.setViewportView(feesubo);

    }//GEN-LAST:event_jLabel5MouseClicked

    private void sessionbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessionbuttonMouseClicked
        remover();
        sessioner= new test_sessions();
        jScrollPane1.setVisible(true);
        jScrollPane1.setViewportView(sessioner);
    }//GEN-LAST:event_sessionbuttonMouseClicked

    private void shedulebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shedulebuttonMouseClicked
        remover();
        sheduler= new test_sheduling(username);
        jScrollPane1.setVisible(true);
        jScrollPane1.setViewportView(sheduler);
    }//GEN-LAST:event_shedulebuttonMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        updateButton();

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
        new baap.login().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void adminbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminbuttonMouseClicked
        remover();
        admin = new adminPanel(this);
        jScrollPane1.setVisible(true);
        jScrollPane1.setViewportView(admin);
    }//GEN-LAST:event_adminbuttonMouseClicked

    private void byarnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byarnActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_byarnActionPerformed

    private void byarnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_byarnKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n'){
            remover();
            srl = new searchresult(Integer.parseInt(byarn.getText()));
            jScrollPane1.setViewportView(srl);
        }
}//GEN-LAST:event_byarnKeyPressed

    private void bynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bynameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_bynameActionPerformed

    private void bynameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bynameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n'){
            remover();
            srl = new searchresult(byname.getText());
            jScrollPane1.setViewportView(srl);
        }
}//GEN-LAST:event_bynameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel adminbutton;
    private javax.swing.JTextField byarn;
    private javax.swing.JTextField byname;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel sessionbutton;
    private javax.swing.JLabel shedulebutton;
    private javax.swing.JLabel statbutton;
    // End of variables declaration//GEN-END:variables


    //All my shitty functions are here


    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.out.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }
    public void remover()
        {

        if (newap!=null)remove(newap);
        if (stats!=null)remove(stats);
        if (feesubo!=null)remove(feesubo);
        if (sessioner!=null)remove(sessioner);
        if (sheduler!=null)remove(sheduler);
        if (updater!=null)remove(updater);
        if (homepg!=null)remove(homepg);
        if (admin!=null)remove(admin);
        if (srl!=null)remove(srl);
        }

    //up button

    public void updateButton() {
        int x = 0;
        String sn = javax.swing.JOptionPane.showInputDialog("Please enter the ARN to update : ");
        x = Integer.parseInt(sn);
        if (isARN(x)) {
            remover();
            updater= new upp_app(x,this,username);
            jScrollPane1.setVisible(true);
            jScrollPane1.setViewportView(updater);

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Error", "ARN Not found", javax.swing.JOptionPane.ERROR_MESSAGE);
            remover();
        }
        sn = null;
        x = 0;
    }
    public boolean isARN(int arn){

        try{
            db obj = new db();
            obj.connectToDB("caes");
            java.sql.ResultSet Latest_arn = obj.connection.createStatement().executeQuery("select * from `bba` where `ARN` = " + arn+" union select * from `bba/ee` where `ARN` = " + arn+" union select * from `ee/cs` where `ARN` = " + arn);
            Latest_arn.next();
            obj.DisconnectFromDB();
                return true;
            }catch (java.sql.SQLException e)
                    {
                     e.getSQLState();
                     return false;
                    }


       }

    private void userDetector() {
     if (prvlg != 0)
        {
         db obj=new db();
         obj.connectToDB("caes");
         try{
             java.sql.ResultSet rs = obj.connection.createStatement().executeQuery("select `dets` from `caes`.`account_info` where `Name` = '"+username.trim()+"'");
             rs.next();
             String[] prvlgs = rs.getString(1).split(" ");
             

             if(prvlgs[0].trim().equals("1"))
                 sessionbutton.setVisible(true);
             else
                 sessionbutton.setVisible(false);
             if(prvlgs[1].trim().equals("1"))
                 shedulebutton.setVisible(true);
             else
                 shedulebutton.setVisible(false);
             if(prvlgs[2].trim().equals("1"))
                 statbutton.setVisible(true);
             else
                 statbutton.setVisible(false);

         }catch(java.sql.SQLException e){System.out.print("error in userdetctor funciton");}

         finally{adminbutton.setVisible(false);
         }
     }



    }

    

}
