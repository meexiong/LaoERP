package com.malimar.controllers;

import com.malimar.models.AddOrSubtract;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmAddDeduction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class AddOrSubtractController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {
    
    private final FrmAddDeduction view;
    private final AddOrSubtract model;
    DefaultTableModel tableModel = new DefaultTableModel();
    int column;
    public AddOrSubtractController(FrmAddDeduction view, int emid, String emNbr, String emName, int col) {
        this.view = view;
        AddOrSubtract aos = new AddOrSubtract();
        this.model = aos;
        this.column=col;
        this.setEvent();
        this.setInitial();
        this.model.setEmpID(emid);
        this.view.getTxtEmployee().setText(String.valueOf(emNbr) + " " + emName);
        this.model.load(this.view.getTable(), tableModel);
    }
    
    private void setEvent() {
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getLblAddOrSubtract().addMouseListener(this);
        this.view.getLblAddOrSubtract().addMouseMotionListener(this);
        this.view.getTxtAmount().addKeyListener(this);
    }
    
    private void setInitial() {
        this.view.getTxtASID().setVisible(false);
        this.view.getChTax().setEnabled(false);
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        this.view.getTxtAddDate().setDate(new Date());
        if(column==10){
            this.view.getChTax().setSelected(true);
        }else{
            this.view.getChTax().setSelected(false);
        }
        this.model.setColumn(column);
    }
    
    private void clear() {
        this.view.getTxtASID().setText("New");
        this.view.getTxtAmount().setText("0");
        this.view.getTxtNote().setText("");
        this.view.getChTax().setSelected(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            try {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                this.model.setAsDate(this.view.getTxtAddDate().getDate());
                this.model.setAmount(Double.parseDouble(this.view.getTxtAmount().getText().replace(",", "")));
                this.model.setAsNote(this.view.getTxtNote().getText());
                this.model.setTax(this.view.getChTax().isSelected());
                Date bom = format.parse(SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()));
                Date eom = format.parse(SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()));
                String otd = format.format(this.model.getAsDate());
                Date otDate = format.parse(otd);
                if ((otDate.after(bom) && otDate.before(eom)) || (otDate.compareTo(bom) == 0 || otDate.compareTo(eom) == 0)) {
                    if (this.view.getTxtAmount().getText().equals("0")) {
                        MessageBox.msgAddSubtractZero();
                        return;
                    }
                    if (this.view.getTxtASID().getText().equals("New")) {
                        if (this.model.insert() == true) {
                            this.clear();
                        } else {
                            MessageBox.msgError();
                        }
                    } else {
                        this.model.setAsID(Integer.parseInt(this.view.getTxtASID().getText()));
                        if (this.model.update() == true) {
                            this.clear();
                        } else {
                            MessageBox.msgError();
                        }
                    }
                    this.model.load(this.view.getTable(), tableModel);
                } else {
                    MessageBox.msgOTDate();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setAsID(Integer.parseInt(this.view.getTxtASID().getText()));
            if (this.model.delete() == true) {
                this.clear();
                this.model.load(this.view.getTable(), tableModel);
            } else {
                MessageBox.msgError();
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTable()) {
            try {
                int row = this.view.getTable().getSelectedRow();
                this.view.getTxtASID().setText(this.view.getTable().getValueAt(row, 0).toString());
                java.util.Date stdate = new SimpleDateFormat("dd-MM-yyyy").parse(this.view.getTable().getValueAt(row, 1).toString());
                this.view.getTxtAddDate().setDate(stdate);
                this.view.getTxtAmount().setText(this.view.getTable().getValueAt(row, 2).toString());
                this.view.getChTax().setSelected((Boolean) this.view.getTable().getValueAt(row, 3));
                this.view.getTxtNote().setText(this.view.getTable().getValueAt(row, 4).toString());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblAddOrSubtract()) {
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
            this.view.getPanelDeleteHover().setVisible(false);
            this.view.getPanelDelete().setVisible(true);
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLblAddOrSubtract()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelDeleteHover().setVisible(true);
            this.view.getPanelDelete().setVisible(false);
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == this.view.getTxtAmount()){
            double amount = Double.parseDouble(this.view.getTxtAmount().getText().replace(",", ""));
            this.view.getTxtAmount().setText(String.format("%,.0f", amount));
        }
    }
    
}
