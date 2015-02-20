package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

public class PrintUIWindow implements Printable, ActionListener {

    JPanel frameToPrint;

    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {

        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }

        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        
        /* Now print the window and its visible contents */
        frameToPrint.print(g2d);
        

        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }

    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
            
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
             System.out.print(ex.getCause());
             }
         }
    }

    public PrintUIWindow(JPanel f) {
        frameToPrint = f;
    System.out.println("asade");
    }

    
}