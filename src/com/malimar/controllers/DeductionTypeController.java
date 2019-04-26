
package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmDeductionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class DeductionTypeController implements ActionListener, MouseListener, MouseMotionListener{
    private final FrmDeductionType view;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;
    public DeductionTypeController(FrmDeductionType view){
        this.view = view;
        this.frm = this.view.getClass().getSimpleName();
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
    }

    private void setEvent() {
        this.view.getLblDeductionType().addMouseListener(this);
        this.view.getLblDeductionType().addMouseMotionListener(this);
        this.view.getLblDeductionTypeID().addMouseListener(this);
        this.view.getLblDeductionType_L1().addMouseListener(this);
        this.view.getLblDeductionType_L2().addMouseListener(this);
        this.view.getTxtDeductionID().addMouseListener(this);
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
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblDeductionType().setText(hmapLang.get("lblDeductionType".concat(frm).toUpperCase())[LN]);
        this.view.getLblDeductionTypeID().setText(hmapLang.get("lblDeductionTypeID".concat(frm).toUpperCase())[LN]);
        this.view.getLblDeductionType_L1().setText(hmapLang.get("lblDeductionType_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblDeductionType_L2().setText(hmapLang.get("lblDeductionType_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtDeductionID().setText("New");
        this.view.getTxtDeduction_L1().setText("");
        this.view.getTxtDeduction_L2().setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTxtDeductionID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        }else if(e.getSource() == this.view.getTable()){
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtDeductionID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtDeduction_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtDeduction_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
        }else if (e.getSource() == this.view.getLblDeductionType()) {
            Label.WindowChangeLabel("lblDeductionType", frm, e);
        } else if (e.getSource() == this.view.getLblDeductionTypeID()) {
            Label.WindowChangeLabel("lblDeductionTypeID", frm, e);
        } else if (e.getSource() == this.view.getLblDeductionType_L1()) {
            Label.WindowChangeLabel("lblDeductionType_L1", frm, e);
        } else if (e.getSource() == this.view.getLblDeductionType_L2()) {
            Label.WindowChangeLabel("lblDeductionType_L2", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblDeductionType()) {
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
        if (e.getSource() == this.view.getLblDeductionType()) {
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
