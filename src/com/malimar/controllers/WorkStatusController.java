package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.WorkStatus;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmWorkStatus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class WorkStatusController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmWorkStatus view;
    private final WorkStatus model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public WorkStatusController(FrmWorkStatus view) {
        this.view = view;
        WorkStatus ws = new WorkStatus();
        this.model = ws;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent() {
        this.view.getLblWorkStatusInfo().addMouseListener(this);
        this.view.getLblWorkStatusInfo().addMouseMotionListener(this);
        this.view.getLblWorkStatusID().addMouseListener(this);
        this.view.getLblWorkStatus_L1().addMouseListener(this);
        this.view.getLblWorkStatus_L2().addMouseListener(this);
        this.view.getLblHour().addMouseListener(this);
        this.view.getTxtWorkStatusID().addMouseListener(this);
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
        ManageTable.setTableHeader(this.view.getTable(), this.view.getScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblWorkStatusInfo().setText(hmapLang.get("lblWorkStatusInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblWorkStatusID().setText(hmapLang.get("lblWorkStatusID".concat(frm).toUpperCase())[LN]);
        this.view.getLblWorkStatus_L1().setText(hmapLang.get("lblWorkStatus_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblWorkStatus_L2().setText(hmapLang.get("lblWorkStatus_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getLblHour().setText(hmapLang.get("lblHour".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtWorkStatusID().setText("New");
        this.view.getTxtWorkStatus_L1().setText("");
        this.view.getTxtWorkStatus_L2().setText("");
        this.view.getTxtHour().setText("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setWorkStatus_L1(this.view.getTxtWorkStatus_L1().getText());
            this.model.setWorkStatus_L2(this.view.getTxtWorkStatus_L2().getText());
            this.model.setHour(Integer.parseInt(this.view.getTxtHour().getText()));
            if (this.view.getTxtWorkStatusID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setWorkStatusID(Integer.parseInt(this.view.getTxtWorkStatusID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setWorkStatusID(Integer.parseInt(this.view.getTxtWorkStatusID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTxtWorkStatusID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtWorkStatusID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtWorkStatus_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtWorkStatus_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtHour().setText(this.view.getTable().getValueAt(row, 3).toString());
        }else if (e.getSource() == this.view.getLblWorkStatusInfo()) {
            Label.WindowChangeLabel("lblWorkStatusInfo", frm, e);
        } else if (e.getSource() == this.view.getLblWorkStatusID()) {
            Label.WindowChangeLabel("lblWorkStatusID", frm, e);
        } else if (e.getSource() == this.view.getLblWorkStatus_L1()) {
            Label.WindowChangeLabel("lblWorkStatus_L1", frm, e);
        } else if (e.getSource() == this.view.getLblWorkStatus_L2()) {
            Label.WindowChangeLabel("lblWorkStatus_L2", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }else if (e.getSource() == this.view.getLblHour()) {
            Label.WindowChangeLabel("lblHour", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblWorkStatusInfo()) {
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
        if (e.getSource() == this.view.getLblWorkStatusInfo()) {
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
