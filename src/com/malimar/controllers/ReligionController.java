package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.Religion;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmReligion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class ReligionController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmReligion view;
    private final Religion model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public ReligionController(FrmReligion view) {
        this.view = view;
        Religion rg = new Religion();
        this.model = rg;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblReligionInfo().setText(hmapLang.get("lblReligionInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblReligionID().setText(hmapLang.get("lblReligionID".concat(frm).toUpperCase())[LN]);
        this.view.getLblReligion_L1().setText(hmapLang.get("lblReligion_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblReligion_L2().setText(hmapLang.get("lblReligion_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtReligionID().setText("New");
        this.view.getTxtReligion_L1().setText("");
        this.view.getTxtReligion_L2().setText("");
    }

    private void setEvent() {
        this.view.getLblReligionInfo().addMouseListener(this);
        this.view.getLblReligionInfo().addMouseMotionListener(this);
        this.view.getLblReligionID().addMouseListener(this);
        this.view.getLblReligion_L1().addMouseListener(this);
        this.view.getLblReligion_L2().addMouseListener(this);
        this.view.getTxtReligionID().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getMenuExit().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        }else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setReligionName_L1(this.view.getTxtReligion_L1().getText());
            this.model.setReligionName_L2(this.view.getTxtReligion_L2().getText());
            if (this.view.getTxtReligionID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setReligionID(Integer.parseInt(this.view.getTxtReligionID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setReligionID(Integer.parseInt(this.view.getTxtReligionID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getTxtReligionID()){
            if(e.getClickCount()==2){
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtReligionID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtReligion_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtReligion_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
        }else if (e.getSource() == this.view.getLblReligionInfo()) {
            Label.WindowChangeLabel("lblReligionInfo", frm, e);
        }else if (e.getSource() == this.view.getLblReligionID()) {
            Label.WindowChangeLabel("lblReligionID", frm, e);
        }else if (e.getSource() == this.view.getLblReligion_L1()) {
            Label.WindowChangeLabel("lblReligion_L1", frm, e);
        }else if (e.getSource() == this.view.getLblReligion_L2()) {
            Label.WindowChangeLabel("lblReligion_L2", frm, e);
        }else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblReligionInfo()) {
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
        if (e.getSource() == this.view.getLblReligionInfo()) {
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
