
package main;

import javax.swing.*;
public class JFrame extends javax.swing.JFrame {

    voucherClass object ;
    public JFrame(voucherClass vc) {
        initComponents();
        this.setTitle("Challan");
        object =vc;
        java.awt.Dimension d = new java.awt.Dimension(600,444);
        java.awt.Dimension d2 = new java.awt.Dimension(600,500);
        setSize(d2);
        setMaximumSize(d2);
        setPreferredSize(d2);
        toPrint.setPreferredSize(d);
        toPrint.setSize(d);
        toPrint.setMaximumSize(d);
        this.setResizable(false);
        
        printButton.setVerticalAlignment(SwingConstants.BOTTOM);
        printButton.addActionListener(new PrintUIWindow(toPrint));
        setter();


        pack();
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printButton = new javax.swing.JButton();
        toPrint = new javax.swing.JPanel();
        date1 = new javax.swing.JLabel();
        issueNum1 = new javax.swing.JLabel();
        arn1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        fee1 = new javax.swing.JLabel();
        fee2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        arn2 = new javax.swing.JLabel();
        issueNum2 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        voucher = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(739, 528));
        getContentPane().setLayout(null);

        printButton.setText("print");
        getContentPane().add(printButton);
        printButton.setBounds(210, 480, 200, 23);

        toPrint.setMaximumSize(new java.awt.Dimension(600, 444));
        toPrint.setMinimumSize(new java.awt.Dimension(600, 444));
        toPrint.setOpaque(false);
        toPrint.setPreferredSize(new java.awt.Dimension(600, 444));
        toPrint.setLayout(null);
        toPrint.add(date1);
        date1.setBounds(130, 190, 130, 20);
        toPrint.add(issueNum1);
        issueNum1.setBounds(130, 100, 130, 20);
        toPrint.add(arn1);
        arn1.setBounds(130, 120, 130, 20);
        toPrint.add(name1);
        name1.setBounds(130, 140, 130, 20);
        toPrint.add(fee1);
        fee1.setBounds(130, 160, 130, 20);
        toPrint.add(fee2);
        fee2.setBounds(440, 160, 130, 20);
        toPrint.add(name2);
        name2.setBounds(440, 140, 130, 20);
        toPrint.add(arn2);
        arn2.setBounds(440, 120, 130, 20);
        toPrint.add(issueNum2);
        issueNum2.setBounds(440, 100, 130, 20);
        toPrint.add(date2);
        date2.setBounds(440, 190, 130, 20);

        voucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/chaalan2.PNG"))); // NOI18N
        toPrint.add(voucher);
        voucher.setBounds(0, 0, 600, 450);

        getContentPane().add(toPrint);
        toPrint.setBounds(10, 10, 600, 452);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backgndbig.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 520);
        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arn1;
    private javax.swing.JLabel arn2;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel fee1;
    private javax.swing.JLabel fee2;
    private javax.swing.JLabel issueNum1;
    private javax.swing.JLabel issueNum2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JButton printButton;
    private javax.swing.JPanel toPrint;
    private javax.swing.JLabel voucher;
    // End of variables declaration//GEN-END:variables

    private void setter() {
        arn1.setText(String.valueOf(object.arn));
        name1.setText(String.valueOf(object.name));
        issueNum1.setText(String.valueOf(object.issuenum));
        fee1.setText(String.valueOf(object.fee));
        arn2.setText(String.valueOf(object.arn));
        name2.setText(String.valueOf(object.name));
        issueNum2.setText(String.valueOf(object.issuenum));
        fee2.setText(String.valueOf(object.fee));
        date1.setText(date());
        date2.setText(date());
    }
public String date (){
        java.util.Date dt = new java.util.Date();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd");

        String currentTime = sdf.format(dt);

    return currentTime;
    }


}
