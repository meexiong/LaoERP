package com.malimar.controllers;

import com.malimar.models.PayRoll;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.HeaderCheckBoxHandler;
import com.malimar.utils.HeaderRenderer;
import com.malimar.utils.HorizontalAlignmentHeaderRenderer;
import com.malimar.utils.ManageTable;
import com.malimar.utils.Variable;
import com.malimar.views.FrmAddDeduction;
import com.malimar.views.FrmEmpHourly;
import com.malimar.views.FrmNewAbsent;
import com.malimar.views.FrmOvertime;
import com.malimar.views.FrmPayRoll;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class PayRolController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final FrmPayRoll view;
    private final PayRoll model;
    HashMap<String, Object[]> mapTable = null;
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultTableModel tableDeptModel = new DefaultTableModel();
    int workType;
    int payrollStatus;

    public PayRolController(FrmPayRoll view) {
        this.view = view;
        PayRoll pr = new PayRoll();
        this.model = pr;
        Variable.bomG = SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate());
        Variable.eomG = SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate());
        Variable.ymG = SalaryCalc.convertDToYM(SalaryCalc.getPayrollEndDate());
        this.setInitial();
        this.setEvent();
        this.view.getRadViewAll().setSelected(true);
        this.view.getRadTotal().setSelected(true);
        workType = 3;
        payrollStatus = 3;
        this.model.insertPayrollAll();
        this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
        this.setPayrollStatusInfo();
        this.countEmpWorkType();
    }

    private void countEmpWorkType() {
        this.model.getPayrollWorkTypeInfo();
        this.view.getRadFullTime().setText("FullTime(" + this.model.getCountFull() + ")");
        this.view.getRadPartTime().setText("PartTime(" + this.model.getCountPart() + ")");
        int empAll = this.model.getCountFull() + this.model.getCountPart();
        this.view.getRadViewAll().setText("All(" + empAll + ")");
    }

    private void setPayrollStatusInfo() {
        this.model.getPayrollStatusInfo();
        this.view.getRadCompleted().setText("Completed(" + String.valueOf(this.model.getCountProcess()) + ")");
        this.view.getRadPending().setText("Pending(" + String.valueOf(this.model.getCountNotProcess()) + ")");
        this.view.getRadTotal().setText("All(" + String.valueOf(this.model.getCountNotProcess() + this.model.getCountProcess()) + ")");
    }

    private void setInitial() {

        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTableDept(), this.view.getTableDeptScrollPane());
        tableDeptModel = (DefaultTableModel) this.view.getTableDept().getModel();
        tableModel.addTableModelListener(new HeaderCheckBoxHandler(this.view.getTable()));
        TableCellRenderer r = new HeaderRenderer(this.view.getTable().getTableHeader(), 1);
        this.view.getTable().getColumnModel().getColumn(1).setHeaderRenderer(r);
        this.model.loadDepartment(this.view.getTableDept(), tableDeptModel);
        this.view.getTxtStartDate().setText(Variable.bomG + " - " + Variable.eomG);
        this.view.getTable().getColumnModel().getColumn(0).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        //this.view.getTable().getColumnModel().getColumn(1).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        this.view.getTable().getColumnModel().getColumn(2).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTable().getColumnModel().getColumn(3).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTable().getColumnModel().getColumn(4).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTable().getColumnModel().getColumn(5).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(6).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(7).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(8).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(9).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(10).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(11).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(12).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(13).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(14).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(15).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        this.view.getTable().getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(8).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(9).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(10).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(11).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(12).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(13).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(14).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(15).setCellRenderer(rightRenderer);
    }

    private void setEvent() {
        this.view.getTableDept().addMouseListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getBtnProcess().addActionListener(this);
        this.view.getBtnProcess().addMouseListener(this);
        this.view.getBtnProcess().addMouseMotionListener(this);
        this.view.getRadTotal().addActionListener(this);
        this.view.getRadPending().addActionListener(this);
        this.view.getRadCompleted().addActionListener(this);
        this.view.getRadFullTime().addActionListener(this);
        this.view.getRadPartTime().addActionListener(this);
        this.view.getRadViewAll().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
        this.view.setCursor(cur);
        if (e.getSource() == this.view.getBtnProcess()) {
            int rowCnt = this.view.getTable().getRowCount() - 1;
            for (int i = 0; i <= rowCnt; i++) {
                Boolean check = (Boolean) this.view.getTable().getValueAt(i, 1);
                if (check == true) {
                    this.model.setPayrollID(Integer.parseInt(this.view.getTable().getValueAt(i, 0).toString()));
                    this.model.setEmpID(Integer.parseInt(this.view.getTable().getValueAt(i, 2).toString()));
                    this.model.setPayrollStatus(Integer.parseInt(this.view.getTable().getValueAt(i, 16).toString()));
                    this.model.setEmpFullTime(Integer.parseInt(this.view.getTable().getValueAt(i, 17).toString()));
                    this.model.updatePayrollSelected();
                }
            }
            if (this.model.getDepartmentID() == 0) {
                this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
            } else {
                this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID(), payrollStatus, workType);
            }
            this.setPayrollStatusInfo();
        } else if (e.getSource() == this.view.getRadTotal()) {
            this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
            this.setPayrollStatusInfo();
        } else if (e.getSource() == this.view.getRadPending()) {
            payrollStatus = 0;
            this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
            this.setPayrollStatusInfo();
        } else if (e.getSource() == this.view.getRadCompleted()) {
            payrollStatus = 1;
            this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
            this.setPayrollStatusInfo();
        } else if (e.getSource() == this.view.getRadViewAll()) {
            workType = 3;
            this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
        } else if (e.getSource() == this.view.getRadFullTime()) {
            workType = 1;
            this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
        } else if (e.getSource() == this.view.getRadPartTime()) {
            workType = 0;
            this.model.loadPayroll(this.view.getTable(), tableModel, 0, payrollStatus, workType);
        }
        Cursor cur1 = new Cursor(Cursor.DEFAULT_CURSOR);
        this.view.setCursor(cur1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTableDept()) {
            int row = this.view.getTableDept().getSelectedRow();
            int id = Integer.parseInt(this.view.getTableDept().getValueAt(row, 1).toString());
            this.model.setDepartmentID(id);
            this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID(), payrollStatus, workType);
            this.setPayrollStatusInfo();
        } else if (e.getSource() == this.view.getTable()) {
            int row = this.view.getTable().getSelectedRow();
            int col = this.view.getTable().getSelectedColumn();
            int a = this.view.getTable().getRowCount() - 1;
            if (col == 1) {
                if (a == row) {
                    this.view.getTable().setValueAt(false, row, 1);
                } else {
                    if ((Boolean) this.view.getTable().getValueAt(row, 1) == true) {
                        this.view.getTable().setValueAt(false, row, 1);
                    } else {
                        this.view.getTable().setValueAt(true, row, 1);
                    }
                }
            }
            if (e.getClickCount() == 2 && row < a) {
                int emid = Integer.parseInt(this.view.getTable().getValueAt(row, 2).toString());
                String emnbr = this.view.getTable().getValueAt(row, 3).toString();
                String emName = this.view.getTable().getValueAt(row, 4).toString();
                int full = Integer.parseInt(this.view.getTable().getValueAt(row, 17).toString());
                switch (col) {
                    case 5:
                        if (full == 0) {
                            FrmEmpHourly emhrs = new FrmEmpHourly(null, true, emid, emnbr, emName);
                            emhrs.setVisible(true);
                            this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID(), payrollStatus, workType);
                        }
                        break;
                    case 8:
                        FrmNewAbsent ab = new FrmNewAbsent(null, true, emid, emnbr, emName);
                        ab.setVisible(true);
                        this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID(), payrollStatus, workType);
                        break;
                    case 11:
                        FrmOvertime ot = new FrmOvertime(null, true, emid, emnbr, emName);
                        ot.setVisible(true);
                        this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID(), payrollStatus, workType);
                        break;
                    case 10:
                    case 14:
                        FrmAddDeduction add = new FrmAddDeduction(null, true, emid, emnbr, emName);
                        add.setVisible(true);
                        this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID(), payrollStatus, workType);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == this.view.getBtnProcess()) {
            this.view.getPanelProcessHover().setVisible(false);
            this.view.getPanelProcess().setVisible(true);
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnProcess()) {
            this.view.getPanelProcessHover().setVisible(true);
            this.view.getPanelProcess().setVisible(false);
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

    }

}
