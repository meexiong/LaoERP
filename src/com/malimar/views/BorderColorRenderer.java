/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malimar.views;

import java.awt.Component;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Component;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 *
 * @author Bart Cremers
 * @date Feb 6, 2006
 */
//public class TableBorders extends JFrame {

//    private JTable table;

//    protected void frameInit() {
//        super.frameInit();
//
//        table = new JTable(5, 6);
//        table.setShowVerticalLines(false);
//        table

//        add(table);
//    }

//    public static void main(String[] args) {
//        JFrame f = new TableBorders();
//        f.pack();
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        f.setVisible(true);
//    }

    public class BorderColorRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
            Border border;
            switch (column) {
                case 12:
                    border = BorderFactory.createMatteBorder(2, 2, 2,2, Color.GREEN);
                    break;
                
                default:
                    border = BorderFactory.createEmptyBorder(0, 0, 0,
                            0);
                    break;
            }
            JComponent comp = (JComponent) super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                    row, column);
            comp.setBorder(border);
            return comp;
        }
    }
//}
