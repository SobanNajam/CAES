/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * manyName.java
 *
 * Created on Aug 26, 2012, 12:45:15 AM
 */

package main;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author NUCES-Soban11-2051
 */
public class manyName extends javax.swing.JFrame {

    ResultSet rsobj;
    public manyName(ResultSet rs) {
        initComponents();
        rsobj= rs;
        this.setAlwaysOnTop(true);
        this.setVisible(true);
        tableUpdater();
            }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        theTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        theTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(theTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUpdater() {
        
       try{ 

           rsobj.beforeFirst();
           theTable.setModel(DbUtils.resultSetToTableModel(rsobj));
           if (!(rsobj.last()))System.out.println("fuck that person who wrote the querry");
       }catch(SQLException e){}
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable theTable;
    // End of variables declaration//GEN-END:variables

}
