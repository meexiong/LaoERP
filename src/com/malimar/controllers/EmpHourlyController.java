package com.malimar.controllers;

import com.malimar.models.EmpHourly;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Variable;
import com.malimar.views.FrmEmpHourly;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class EmpHourlyController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final FrmEmpHourly view;
    private final EmpHourly model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;
    public EmpHourlyController(FrmEmpHourly view, int emid, String emNbr, String emName) {
        this.view = view;
        EmpHourly eh = new EmpHourly();
        this.model = eh;
        this.model.setEmpID(emid);
        this.frm = this.view.getClass().getSimpleName();
        this.setEvent();
        this.setInitial();
        this.language();
        this.view.getTxtEmployee().setText(String.valueOf(emNbr) + " " + emName);
    }

    private void setEvent() {
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getLblHourlyInfo().addMouseListener(this);
        this.view.getLblHourlyInfo().addMouseMotionListener(this);
        this.view.getTxtHours().addKeyListener(this);
        this.view.getTxtMinute().addKeyListener(this);
        
    }

    private void setInitial() {
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        this.model.load(this.view.getTable(), tableModel);
        double hrsm = SalaryCalc.getSalary(this.model.getEmpID(), "O") / SalaryCalc.getDayHour(this.model.getEmpID());
        this.view.getTxtHourlyAmount().setText(String.format("%,.0f", hrsm));
        this.view.getTxtDate().setDate(new Date());
        this.view.getTxtHourlyID().setVisible(false);
    }
    
    private void language(){
        this.view.getLblHourlyInfo().setText(hmapLang.get("lblHourlyInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblDate().setText(hmapLang.get("lblDate".concat(frm).toUpperCase())[LN]);
        this.view.getLblHrsAmount().setText(hmapLang.get("lblHrsAmount".concat(frm).toUpperCase())[LN]);
        this.view.getLblHours().setText(hmapLang.get("lblHours".concat(frm).toUpperCase())[LN]);
        this.view.getLblMinute().setText(hmapLang.get("lblMinute".concat(frm).toUpperCase())[LN]);
        this.view.getLblTotal().setText(hmapLang.get("lblTotal".concat(frm).toUpperCase())[LN]);
        this.view.getLblMgr().setText(hmapLang.get("lblMgr".concat(frm).toUpperCase())[LN]);
        this.view.getLblHR().setText(hmapLang.get("lblHR".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
    }

    private void clear() {
        this.view.getTxtHourlyID().setText("New");
        this.view.getTxtHours().setText("0");
        this.view.getTxtMinute().setText("0");
        this.view.getTxtTotal().setText("0");
        this.view.getChHRApprove().setSelected(false);
        this.view.getChMgrApprove().setSelected(false);
    }

    private void calculate() {
        double hrm = Double.parseDouble(this.view.getTxtHourlyAmount().getText().replace(",", ""));
        int hour = Integer.parseInt(this.view.getTxtHours().getText());
        int mnt = Integer.parseInt(this.view.getTxtMinute().getText());
        int totalMnt = (hour * 60) + mnt;
        double total = (hrm / 60) * totalMnt;
        this.view.getTxtTotal().setText(String.format("%,.0f", total));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setHrsDate(this.view.getTxtDate().getDate());
            this.model.setHrsAmount(Double.parseDouble(this.view.getTxtHourlyAmount().getText().replace(",", "")));
            this.model.setHrs(Integer.parseInt(this.view.getTxtHours().getText()));
            this.model.setMnt(Integer.parseInt(this.view.getTxtMinute().getText()));
            this.model.setTotal(Double.parseDouble(this.view.getTxtTotal().getText().replace(",", "")));
            this.model.setHr(this.view.getChHRApprove().isSelected());
            this.model.setMgr(this.view.getChMgrApprove().isSelected());
            if (this.view.getTxtHourlyID().getText().equals("New")) {
                if (this.model.insert() == true) {
                    this.model.load(this.view.getTable(), tableModel);
                    this.clear();
                    Variable.reQuery=1;
                } else {
                    MessageBox.msgError();
                }
            } else {
                this.model.setHrsID(Integer.parseInt(this.view.getTxtHourlyID().getText()));
                if (this.model.update() == true) {
                    this.model.load(this.view.getTable(), tableModel);
                    this.clear();
                    Variable.reQuery=1;
                } else {
                    MessageBox.msgError();
                }
            }
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setHrsID(Integer.parseInt(this.view.getTxtHourlyID().getText()));
            if (this.model.delete() == true) {
                this.model.load(this.view.getTable(), tableModel);
                this.clear();
                Variable.reQuery=1;
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
                this.view.getTxtHourlyID().setText(this.view.getTable().getValueAt(row, 0).toString());
                java.util.Date stdate = new SimpleDateFormat("dd-MM-yyyy").parse(this.view.getTable().getValueAt(row, 1).toString());
                this.view.getTxtDate().setDate(stdate);
                this.view.getTxtHourlyAmount().setText(this.view.getTable().getValueAt(row, 2).toString());
                this.view.getTxtHours().setText(this.view.getTable().getValueAt(row, 3).toString());
                this.view.getTxtMinute().setText(this.view.getTable().getValueAt(row, 4).toString());
                this.view.getTxtTotal().setText(this.view.getTable().getValueAt(row, 5).toString());
                this.view.getChMgrApprove().setSelected((Boolean) this.view.getTable().getValueAt(row, 6));
                this.view.getChHRApprove().setSelected((Boolean) this.view.getTable().getValueAt(row, 7));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblHourlyInfo()) {
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
        if (e.getSource() == this.view.getLblHourlyInfo()) {
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
        if(e.getSource() == this.view.getTxtHours()){
            this.calculate();
        }else if(e.getSource() == this.view.getTxtMinute()){
            this.calculate();
        }
    }

}
