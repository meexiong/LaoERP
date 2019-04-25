package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.Unit;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmUnitWork;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class UnitController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmUnitWork view;
    private final Unit model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public UnitController(FrmUnitWork view) {
        this.view = view;
        Unit u = new Unit();
        this.model = u;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent() {
        this.view.getLblBusinessUnit().addMouseListener(this);
        this.view.getLblBusinessUnit().addMouseMotionListener(this);
        this.view.getLblBusinessID().addMouseListener(this);
        this.view.getLblBusiness_L1().addMouseListener(this);
        this.view.getLblBusiness_L2().addMouseListener(this);
        this.view.getLblSortBy().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTxtBusinessID().addMouseListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getMenuExit().addActionListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblBusinessUnit().setText(hmapLang.get("lblBusinessUnit".concat(frm).toUpperCase())[LN]);
        this.view.getLblBusinessID().setText(hmapLang.get("lblBusinessID".concat(frm).toUpperCase())[LN]);
        this.view.getLblBusiness_L1().setText(hmapLang.get("lblBusiness_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblBusiness_L2().setText(hmapLang.get("lblBusiness_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblSortBy().setText(hmapLang.get("lblSortBy".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtBusinessID().setText("New");
        this.view.getTxtSortBy().setText("");
        this.view.getTxtBusiness_L1().setText("");
        this.view.getTxtBusiness_L2().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setUnitName_L1(this.view.getTxtBusiness_L1().getText());
            this.model.setUnitName_L2(this.view.getTxtBusiness_L2().getText());
            this.model.setUnitSortby(Integer.parseInt(this.view.getTxtSortBy().getText()));
            if (this.view.getTxtBusinessID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setUnitID(Integer.parseInt(this.view.getTxtBusinessID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setUnitID(Integer.parseInt(this.view.getTxtBusinessID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTable()) {
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtBusinessID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtSortBy().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtBusiness_L1().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtBusiness_L2().setText(this.view.getTable().getValueAt(row, 3).toString());
        } else if (e.getSource() == this.view.getTxtBusinessID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        }else if (e.getSource() == this.view.getLblBusinessUnit()) {
            Label.WindowChangeLabel("lblBusinessUnit", frm, e);
        }else if (e.getSource() == this.view.getLblBusinessID()) {
            Label.WindowChangeLabel("lblBusinessID", frm, e);
        }else if (e.getSource() == this.view.getLblSortBy()) {
            Label.WindowChangeLabel("lblSortBy", frm, e);
        }else if (e.getSource() == this.view.getLblBusiness_L1()) {
            Label.WindowChangeLabel("lblBusiness_L1", frm, e);
        }else if (e.getSource() == this.view.getLblBusiness_L2()) {
            Label.WindowChangeLabel("lblBusiness_L2", frm, e);
        }else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblBusinessUnit()) {
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
        if (e.getSource() == this.view.getLblBusinessUnit()) {
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
