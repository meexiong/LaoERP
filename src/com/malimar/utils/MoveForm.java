
package com.malimar.utils;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class MoveForm {

    static int xx = 0;
    static int yy = 0;
    
    public static void mouseDragded(java.awt.event.MouseEvent evt, JFrame fm) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        fm.setLocation(x - xx, y - yy);
    }
    public static void mouseDragded(java.awt.event.MouseEvent evt, JDialog fm) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        fm.setLocation(x - xx, y - yy);
    }
    public static void mousePressed(java.awt.event.MouseEvent evt) {
        xx = evt.getX();
        yy = evt.getY();
    }
}
