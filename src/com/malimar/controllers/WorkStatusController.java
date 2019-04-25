package com.malimar.controllers;

import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
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
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public WorkStatusController(FrmWorkStatus view) {
        this.view = view;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
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
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTxtWorkStatusID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
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
