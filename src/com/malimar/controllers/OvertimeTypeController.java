package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.OvertimeType;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmOverTimeType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class OvertimeTypeController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmOverTimeType view;
    private final OvertimeType model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public OvertimeTypeController(FrmOverTimeType view) {
        this.view = view;
        OvertimeType ot = new OvertimeType();
        this.model = ot;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent() {
        this.view.getLblOvertimeTypeInfo().addMouseListener(this);
        this.view.getLblOvertimeTypeInfo().addMouseMotionListener(this);
        this.view.getLblOvertimeTypeID().addMouseListener(this);
        this.view.getLblOvertimeType_L1().addMouseListener(this);
        this.view.getLblOvertimeType_L2().addMouseListener(this);
        this.view.getLblOvertimeTypeRate().addMouseListener(this);
        this.view.getTxtOvertimeTypeID().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getMenuExit().addActionListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblOvertimeTypeInfo().setText(hmapLang.get("lblOvertimeTypeInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimeTypeID().setText(hmapLang.get("lblOvertimeTypeID".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimeType_L1().setText(hmapLang.get("lblOvertimeType_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimeType_L2().setText(hmapLang.get("lblOvertimeType_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimeTypeRate().setText(hmapLang.get("lblOvertimeTypeRate".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtOvertimeTypeID().setText("New");
        this.view.getTxtOvertimeType_L1().setText("");
        this.view.getTxtOvertimeType_L2().setText("");
        this.view.getTxtOvertimeTypeRate().setText("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setOvertimeType_L1(this.view.getTxtOvertimeType_L1().getText());
            this.model.setOvertimeType_L2(this.view.getTxtOvertimeType_L2().getText());
            this.model.setOvertimeRate(Integer.parseInt(this.view.getTxtOvertimeTypeRate().getText()));
            if (this.view.getTxtOvertimeTypeID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setOvertimeTypeID(Integer.parseInt(this.view.getTxtOvertimeTypeID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setOvertimeTypeID(Integer.parseInt(this.view.getTxtOvertimeTypeID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTxtOvertimeTypeID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        } else if (e.getSource() == this.view.getTable()) {
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtOvertimeTypeID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtOvertimeType_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtOvertimeType_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtOvertimeTypeRate().setText(this.view.getTable().getValueAt(row, 3).toString());
        } else if (e.getSource() == this.view.getLblOvertimeTypeInfo()) {
            Label.WindowChangeLabel("lblOvertimeTypeInfo", frm, e);
        } else if (e.getSource() == this.view.getLblOvertimeTypeID()) {
            Label.WindowChangeLabel("lblOvertimeTypeID", frm, e);
        } else if (e.getSource() == this.view.getLblOvertimeType_L1()) {
            Label.WindowChangeLabel("lblOvertimeType_L1", frm, e);
        } else if (e.getSource() == this.view.getLblOvertimeType_L2()) {
            Label.WindowChangeLabel("lblOvertimeType_L2", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        } else if (e.getSource() == this.view.getLblOvertimeTypeRate()) {
            Label.WindowChangeLabel("lblOvertimeTypeRate", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblOvertimeTypeInfo()) {
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
        if (e.getSource() == this.view.getLblOvertimeTypeInfo()) {
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
