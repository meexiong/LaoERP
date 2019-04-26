package com.malimar.controllers;

import com.malimar.models.AbsentType;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmAbsentType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class AbsentTypeController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmAbsentType view;
    private final AbsentType model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public AbsentTypeController(FrmAbsentType view) {
        this.view = view;
        AbsentType at = new AbsentType();
        this.model = at;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent() {
        this.view.getLblAbsentType().addMouseListener(this);
        this.view.getLblAbsentType().addMouseMotionListener(this);
        this.view.getLblAbsentTypeID().addMouseListener(this);
        this.view.getLblAbsentType_L1().addMouseListener(this);
        this.view.getLblAbsentType_L2().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getTxtAbsentTypeID().addMouseListener(this);
        this.view.getTable().addMouseListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblAbsentType().setText(hmapLang.get("lblAbsentType".concat(frm).toUpperCase())[LN]);
        this.view.getLblAbsentTypeID().setText(hmapLang.get("lblAbsentTypeID".concat(frm).toUpperCase())[LN]);
        this.view.getLblAbsentType_L1().setText(hmapLang.get("lblAbsentType_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblAbsentType_L2().setText(hmapLang.get("lblAbsentType_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtAbsentTypeID().setText("New");
        this.view.getTxtAbsentType_L1().setText("");
        this.view.getTxtAbsentType_L2().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setAbsentType_L1(this.view.getTxtAbsentType_L1().getText());
            this.model.setAbsentType_L2(this.view.getTxtAbsentType_L2().getText());
            if (this.view.getTxtAbsentTypeID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setAbsentTypeID(Integer.parseInt(this.view.getTxtAbsentTypeID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setAbsentTypeID(Integer.parseInt(this.view.getTxtAbsentTypeID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTxtAbsentTypeID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        } else if (e.getSource() == this.view.getTable()) {
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtAbsentTypeID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtAbsentType_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtAbsentType_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
        } else if (e.getSource() == this.view.getLblAbsentType()) {
            Label.WindowChangeLabel("lblAbsentType", frm, e);
        } else if (e.getSource() == this.view.getLblAbsentTypeID()) {
            Label.WindowChangeLabel("lblAbsentTypeID", frm, e);
        } else if (e.getSource() == this.view.getLblAbsentType_L1()) {
            Label.WindowChangeLabel("lblAbsentType_L1", frm, e);
        } else if (e.getSource() == this.view.getLblAbsentType_L2()) {
            Label.WindowChangeLabel("lblAbsentType_L2", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblAbsentType()) {
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
        if (e.getSource() == this.view.getLblAbsentType()) {
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
