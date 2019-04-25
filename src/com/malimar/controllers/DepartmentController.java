package com.malimar.controllers;

import com.malimar.models.Department;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.CheckField;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmDepartment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class DepartmentController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmDepartment view;
    private final Department model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;
    HashMap<String, Object[]> mapLocation = null;

    public DepartmentController(FrmDepartment view) {
        this.view = view;
        Department d = new Department();
        this.model = d;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.view.getCmbLocation().setUI(new BasicComboBoxUI());
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
        this.setLocationCombox();
    }

    private void setEvent() {
        this.view.getMenuExit().addActionListener(this);
        this.view.getLblDepartmentInfo().addMouseListener(this);
        this.view.getLblDepartmentInfo().addMouseMotionListener(this);
        this.view.getLblDepartmentID().addMouseListener(this);
        this.view.getLblDepartment_L1().addMouseListener(this);
        this.view.getLblDepartment_L2().addMouseListener(this);
        this.view.getLblSortBy().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTxtDepartmentID().addMouseListener(this);
        this.view.getLblLocation().addMouseListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getCmbLocation().addActionListener(this);
        this.view.getMenuExit().addActionListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblDepartmentInfo().setText(hmapLang.get("lblDepartmentInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblDepartmentID().setText(hmapLang.get("lblDepartmentID".concat(frm).toUpperCase())[LN]);
        this.view.getLblDepartment_L1().setText(hmapLang.get("lblDepartment_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblDepartment_L2().setText(hmapLang.get("lblDepartment_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblSortBy().setText(hmapLang.get("lblSortBy".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocation().setText(hmapLang.get("lblLocation".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtDepartmentID().setText("New");
        this.view.getTxtDepartment_L1().setText("");
        this.view.getTxtDepartment_L2().setText("");
        this.view.getCmbLocation().setSelectedIndex(-1);
        this.view.getTxtSortBy().setText("");
    }

    private void setLocationCombox() {
        try {
            mapLocation = this.model.getLocationInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocation);
            this.view.getCmbLocation().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbLocation().addItem(s);
            });
            this.view.getCmbLocation().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbLocation());
        } catch (Exception e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            if (CheckField.comboBox(this.view.getCmbLocation()) == false) {
                return;
            }
            this.model.setDepartmentName_L1(this.view.getTxtDepartment_L1().getText());
            this.model.setDepartmentName_L2(this.view.getTxtDepartment_L2().getText());
            this.model.setSortBy(Integer.parseInt(this.view.getTxtSortBy().getText()));
            String loc = this.view.getCmbLocation().getSelectedItem().toString();
            this.model.setLocationID(Integer.parseInt(mapLocation.get(loc)[0].toString()));
            if (this.view.getTxtDepartmentID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setDepartmentID(Integer.parseInt(this.view.getTxtDepartmentID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setDepartmentID(Integer.parseInt(this.view.getTxtDepartmentID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }else if (e.getSource() == this.view.getCmbLocation()) {
            this.view.getCmbLocation().setBorder(new EmptyBorder(0, 0, 0, 0));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getTxtDepartmentID()){
            if(e.getClickCount() == 2){
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtDepartmentID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtSortBy().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtDepartment_L1().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtDepartment_L2().setText(this.view.getTable().getValueAt(row, 3).toString());
            this.view.getCmbLocation().setSelectedItem(this.view.getTable().getValueAt(row, 4).toString());
        }else if (e.getSource() == this.view.getLblDepartmentInfo()) {
            Label.WindowChangeLabel("lblDepartmentInfo", frm, e);
        }else if (e.getSource() == this.view.getLblDepartmentID()) {
            Label.WindowChangeLabel("lblDepartmentID", frm, e);
        }else if (e.getSource() == this.view.getLblDepartment_L1()) {
            Label.WindowChangeLabel("lblDepartment_L1", frm, e);
        }else if (e.getSource() == this.view.getLblDepartment_L2()) {
            Label.WindowChangeLabel("lblDepartment_L2", frm, e);
        }else if (e.getSource() == this.view.getLblSortBy()) {
            Label.WindowChangeLabel("lblSortBy", frm, e);
        }else if (e.getSource() == this.view.getLblLocation()) {
            Label.WindowChangeLabel("lblLocation", frm, e);
        }else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblDepartmentInfo()) {
            MoveForm.mousePressed(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(false);
            this.view.getPanelSave().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelHoverDelete().setVisible(false);
            this.view.getPanelDelete().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLblDepartmentInfo()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelHoverDelete().setVisible(true);
            this.view.getPanelDelete().setVisible(false);
        }
    }
}
