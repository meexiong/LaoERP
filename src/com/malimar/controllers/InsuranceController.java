package com.malimar.controllers;

import com.malimar.models.Insurance;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmInsurance;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class InsuranceController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmInsurance view;
    private final Insurance model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public InsuranceController(FrmInsurance view) {
        this.view = view;
        Insurance in = new Insurance();
        this.model = in;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.changeLabel();
        this.setEvent();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent() {
        this.view.getLblInsuranceInfo().addMouseListener(this);
        this.view.getLblInsuranceInfo().addMouseMotionListener(this);
        this.view.getLblInsuranceID().addMouseListener(this);
        this.view.getLblInsurance_L1().addMouseListener(this);
        this.view.getLblInsurance_L2().addMouseListener(this);
        this.view.getTxtInsuranceID().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getLblEmpPercent().addMouseListener(this);
        this.view.getLblComPercent().addMouseListener(this);
        this.view.getLblMaxMoney().addMouseListener(this);
    }
    
    private void clearText() {
        this.view.getTxtInsuranceID().setText("New");
        this.view.getTxtInsurance_L1().setText("");
        this.view.getTxtInsurance_L2().setText("");
        this.view.getTxtEmpPercentage().setText("");
        this.view.getTxtComPercentage().setText("");
        this.view.getTxtMaxMoney().setText("0");
    }
    
    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblInsuranceInfo().setText(hmapLang.get("lblInsuranceInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsuranceID().setText(hmapLang.get("lblInsuranceID".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsurance_L1().setText(hmapLang.get("lblInsurance_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsurance_L2().setText(hmapLang.get("lblInsurance_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpPercent().setText(hmapLang.get("lblEmpPercent".concat(frm).toUpperCase())[LN]);
        this.view.getLblComPercent().setText(hmapLang.get("lblComPercent".concat(frm).toUpperCase())[LN]);
        this.view.getLblMaxMoney().setText(hmapLang.get("lblMaxMoney".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        }else if(e.getSource() == this.view.getBtnSave()){
            this.model.setInsurance_L1(this.view.getTxtInsurance_L1().getText());
            this.model.setInsurance_L2(this.view.getTxtInsurance_L2().getText());
            this.model.setInsuranceActive(0);
            this.model.setEmpPercentage(Float.parseFloat(this.view.getTxtEmpPercentage().getText()));
            this.model.setComPercentage(Float.parseFloat(this.view.getTxtComPercentage().getText()));
            this.model.setMaxMoney(Double.parseDouble(this.view.getTxtMaxMoney().getText().replace(",", "")));
            if(this.view.getTxtInsuranceID().getText().equals("New")){
                if(this.model.insert() != true){
                    MessageBox.msgError();
                }else{
                    MessageBox.msgSuccess();
                }
            }else{
                this.model.setInsuranceID(Integer.parseInt(this.view.getTxtInsuranceID().getText()));
                if(this.model.update() != true){
                    MessageBox.msgError();
                }else{
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getTxtInsuranceID()){
            if(e.getClickCount()==2){
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtInsuranceID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtInsurance_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtInsurance_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtEmpPercentage().setText(this.view.getTable().getValueAt(row, 3).toString());
            this.view.getTxtComPercentage().setText(this.view.getTable().getValueAt(row, 4).toString());
            this.view.getTxtMaxMoney().setText(this.view.getTable().getValueAt(row, 5).toString());
        }else if (e.getSource() == this.view.getLblInsuranceInfo()) {
            Label.WindowChangeLabel("lblInsuranceInfo", frm, e);
        }else if (e.getSource() == this.view.getLblInsuranceID()) {
            Label.WindowChangeLabel("lblInsuranceID", frm, e);
        }else if (e.getSource() == this.view.getLblInsurance_L1()) {
            Label.WindowChangeLabel("lblInsurance_L1", frm, e);
        }else if (e.getSource() == this.view.getLblInsurance_L2()) {
            Label.WindowChangeLabel("lblInsurance_L2", frm, e);
        }else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getLblEmpPercent()) {
            Label.WindowChangeLabel("lblEmpPercent", frm, e);
        }else if (e.getSource() == this.view.getLblComPercent()) {
            Label.WindowChangeLabel("lblComPercent", frm, e);
        }else if (e.getSource() == this.view.getLblMaxMoney()) {
            Label.WindowChangeLabel("lblMaxMoney", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblInsuranceInfo()) {
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
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLblInsuranceInfo()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        }
    }
}
