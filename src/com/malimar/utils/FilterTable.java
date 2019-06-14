package com.malimar.utils;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class FilterTable {

    public static void filterTable(JTable table, DefaultTableModel model, int col, int value, int on) {
        try {
            RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {
                @Override
                public boolean include(RowFilter.Entry<? extends Object, ? extends Object> entry) {
                    Integer population = (Integer) entry.getValue(col);
                    return population.intValue() == value;
                }
            };
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
            sorter.setRowFilter(null);
            if(on==1){
                sorter.setRowFilter(filter);
            }else{
                sorter.setRowFilter(null);
            }
            table.setRowSorter(sorter);
        } catch (Exception e) {
        }
    }
}
