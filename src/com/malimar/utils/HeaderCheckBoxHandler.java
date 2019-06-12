
package com.malimar.utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author administrator
 */

//<ins>
class LeftAlignHeaderRenderer implements TableCellRenderer {
  @Override public Component getTableCellRendererComponent(
    JTable t, Object v, boolean isS, boolean hasF, int row, int col) {
    TableCellRenderer r = t.getTableHeader().getDefaultRenderer();
    JLabel l=(JLabel)r.getTableCellRendererComponent(t, v, isS, hasF, row, col);
    l.setHorizontalAlignment(SwingConstants.LEFT);
    return l;
  }
}
//</ins>
enum Status { SELECTED, DESELECTED, INDETERMINATE }
class CheckBoxIcon implements Icon {
  private final JCheckBox check;
  public CheckBoxIcon(JCheckBox check) {
    this.check = check;
  }
  @Override 
  public int getIconWidth() {
    return check.getPreferredSize().width;
  }
  @Override 
  public int getIconHeight() {
    return check.getPreferredSize().height;
  }
  @Override 
  public void paintIcon(Component c, Graphics g, int x, int y) {
    SwingUtilities.paintComponent(
        g, check, (Container)c, x, y, getIconWidth(), getIconHeight());
  }
}
public class HeaderCheckBoxHandler implements TableModelListener {
  private final JTable table;
  public HeaderCheckBoxHandler(JTable table) {
    this.table = table;
  }
  @Override public void tableChanged(TableModelEvent e) {
    if(e.getType()==TableModelEvent.UPDATE && e.getColumn()==0) {
      int mci = 0;
      int vci = table.convertColumnIndexToView(mci);
      TableColumn column = table.getColumnModel().getColumn(vci);
      Object title = column.getHeaderValue();
      if(!Status.INDETERMINATE.equals(title)) {
        column.setHeaderValue(Status.INDETERMINATE);
      } else {
        int selected = 0, deselected = 0;
        TableModel m = table.getModel();
        for(int i=0; i<m.getRowCount(); i++) {
          if(Boolean.TRUE.equals(m.getValueAt(i, mci))) {
            selected++;
          } else {
            deselected++;
          }
        }
        if(selected==0) {
          column.setHeaderValue(Status.DESELECTED);
        } else if(deselected==0) {
          column.setHeaderValue(Status.SELECTED);
        } else {
          return;
        }
      }
      table.getTableHeader().validate();
      table.getTableHeader().repaint();
    }
  }
}
