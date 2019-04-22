package com.malimar.utils;

import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ManageTable {

    public static void setTableHeader(JTable table, JScrollPane sp) {
        table.getTableHeader().setFont(new Font("Saysettha OT", Font.PLAIN, 12));
        sp.getViewport().setBackground(Color.WHITE);
        table.setShowGrid(true);
        table.getTableHeader().setBackground(Color.decode("#515763"));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setOpaque(false);
    }

    public static void changeTableHeaderLabel(JTable table, String frm) {
        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        table.getColumnCount();
        for (int i = 0; i < table.getColumnCount(); i++) {
            TableColumn tc = tcm.getColumn(i);
            tc.setHeaderValue(hmapLang.get(table.getModel().getColumnName(i).concat(frm).toUpperCase())[LN]);
        }
        table.setAutoCreateRowSorter(true);
        th.repaint();
    }
    
    public static void clearTable(JTable table, DefaultTableModel model){
        int index = table.getRowCount()-1;
        while(index>-1){
            model.removeRow(index--);
        }
    }
}
