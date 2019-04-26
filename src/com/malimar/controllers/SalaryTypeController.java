package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.SalaryType;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmSalaryType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class SalaryTypeController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmSalaryType view;
    private final SalaryType model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;

    public SalaryTypeController(FrmSalaryType view) {
        this.view = view;
        SalaryType st = new SalaryType();
        this.model = st;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
    }

    private void setEvent(){
        this.view.getLblSalaryTypeInfo().addMouseListener(this);
        this.view.getLblSalaryTypeInfo().addMouseMotionListener(this);
        this.view.getLblSalaryTypeID().addMouseListener(this);
        this.view.getLblSalaryType_L1().addMouseListener(this);
        this.view.getLblSalaryType_L2().addMouseListener(this);
        this.view.getLblAmount().addMouseListener(this);
        this.view.getLblActive().addMouseListener(this);
        this.view.getTxtSalaryTypeID().addMouseListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getChActive().addActionListener(this);
    }
    
    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblSalaryTypeInfo().setText(hmapLang.get("lblSalaryTypeInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryTypeID().setText(hmapLang.get("lblSalaryTypeID".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryType_L1().setText(hmapLang.get("lblSalaryType_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryType_L2().setText(hmapLang.get("lblSalaryType_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getLblAmount().setText(hmapLang.get("lblAmount".concat(frm).toUpperCase())[LN]);
        this.view.getLblActive().setText(hmapLang.get("lblActive".concat(frm).toUpperCase())[LN]);
    }
    
    private void clearText() {
        this.view.getTxtSalaryTypeID().setText("New");
        this.view.getTxtSalaryType_L1().setText("");
        this.view.getTxtSalaryType_L2().setText("");
        this.view.getTxtAmount().setText("0");
        this.view.getChActive().setSelected(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.view.getMenuExit()){
            this.view.dispose();
        }else if(e.getSource() == this.view.getBtnSave()){
            this.model.setSalaryType_L1(this.view.getTxtSalaryType_L1().getText());
            this.model.setSalaryType_L2(this.view.getTxtSalaryType_L2().getText());
            this.model.setAmount(Double.parseDouble(this.view.getTxtAmount().getText().replace(",", "")));
            this.model.setActive(this.view.getChActive().isSelected());
            if(this.view.getTxtSalaryTypeID().getText().equals("New")){
                if(this.model.insert() != true){
                    MessageBox.msgError();
                }else{
                    MessageBox.msgSuccess();
                }
            }else{
                this.model.setSalaryTypeID(Integer.parseInt(this.view.getTxtSalaryTypeID().getText()));
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
        if (e.getSource() == this.view.getTxtSalaryTypeID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtSalaryTypeID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtSalaryType_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtSalaryType_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtAmount().setText(this.view.getTable().getValueAt(row, 3).toString());
            this.view.getChActive().setSelected((boolean) this.view.getTable().getValueAt(row, 4));
        }else if (e.getSource() == this.view.getLblSalaryTypeInfo()) {
            Label.WindowChangeLabel("lblSalaryTypeInfo", frm, e);
        } else if (e.getSource() == this.view.getLblSalaryTypeID()) {
            Label.WindowChangeLabel("lblSalaryTypeID", frm, e);
        } else if (e.getSource() == this.view.getLblSalaryType_L1()) {
            Label.WindowChangeLabel("lblSalaryType_L1", frm, e);
        } else if (e.getSource() == this.view.getLblSalaryType_L2()) {
            Label.WindowChangeLabel("lblSalaryType_L2", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getLblAmount()) {
            Label.WindowChangeLabel("lblAmount", frm, e);
        }else if (e.getSource() == this.view.getLblActive()) {
            Label.WindowChangeLabel("lblActive", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblSalaryTypeInfo()) {
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
        if (e.getSource() == this.view.getLblSalaryTypeInfo()) {
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
