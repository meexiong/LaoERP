package com.malimar.controllers;

import com.malimar.models.Ethnic;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmEthnic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class EthnicController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmEthnic view;
    private final Ethnic model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public EthnicController(FrmEthnic view) {
        this.view = view;
        Ethnic et = new Ethnic();
        this.model = et;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent() {
        this.view.getLblEthnicInfo().addMouseListener(this);
        this.view.getLblEthnicInfo().addMouseMotionListener(this);
        this.view.getLblEthnicID().addMouseListener(this);
        this.view.getLblEthnic_L1().addMouseListener(this);
        this.view.getLblEthnic_L2().addMouseListener(this);
        this.view.getTxtEthnicID().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getMenuExit().addActionListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblEthnicInfo().setText(hmapLang.get("lblEthnicInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblEthnicID().setText(hmapLang.get("lblEthnicID".concat(frm).toUpperCase())[LN]);
        this.view.getLblEthnic_L1().setText(hmapLang.get("lblEthnic_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblEthnic_L2().setText(hmapLang.get("lblEthnic_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtEthnicID().setText("New");
        this.view.getTxtEthnic_L1().setText("");
        this.view.getTxtEthnic_L2().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setEthnicName_L1(this.view.getTxtEthnic_L1().getText());
            this.model.setEthnicName_L2(this.view.getTxtEthnic_L2().getText());
            if (this.view.getTxtEthnicID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setEthnicID(Integer.parseInt(this.view.getTxtEthnicID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setEthnicID(Integer.parseInt(this.view.getTxtEthnicID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getTxtEthnicID()){
            if(e.getClickCount()==2){
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtEthnicID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtEthnic_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtEthnic_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
        }else if (e.getSource() == this.view.getLblEthnicInfo()) {
            Label.WindowChangeLabel("lblEthnicInfo", frm, e);
        }else if (e.getSource() == this.view.getLblEthnicID()) {
            Label.WindowChangeLabel("lblEthnicID", frm, e);
        }else if (e.getSource() == this.view.getLblEthnic_L1()) {
            Label.WindowChangeLabel("lblEthnic_L1", frm, e);
        }else if (e.getSource() == this.view.getLblEthnic_L2()) {
            Label.WindowChangeLabel("lblEthnic_L2", frm, e);
        }else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblEthnicInfo()) {
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
        if (e.getSource() == this.view.getLblEthnicInfo()) {
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
