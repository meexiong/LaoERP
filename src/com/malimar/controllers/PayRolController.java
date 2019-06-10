package com.malimar.controllers;

import com.malimar.models.PayRoll;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.ManageTable;
import com.malimar.views.FrmNewAbsent;
import com.malimar.views.FrmOvertime;
import com.malimar.views.FrmPayRoll;
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
import javax.swing.table.DefaultTableModel;

public class PayRolController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final FrmPayRoll view;
    private final PayRoll model;
    HashMap<String, Object[]> mapTable = null;
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultTableModel tableDeptModel = new DefaultTableModel();

    public PayRolController(FrmPayRoll view) {
        this.view = view;
        PayRoll pr = new PayRoll();
        this.model = pr;
        this.setInitial();
        this.setEvent();
    }

    private void setInitial() {

        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTableDept(), this.view.getTableDeptScrollPane());
        tableDeptModel = (DefaultTableModel) this.view.getTableDept().getModel();
        this.model.loadDepartment(this.view.getTableDept(), tableDeptModel);
        this.view.getTxtStartDate().setText(SalaryCalc.getPayrollStartDate() + " - " + SalaryCalc.getPayrollEndDate());
    }

    private void setEvent() {
        this.view.getBtnLoad().addActionListener(this);
        this.view.getTableDept().addMouseListener(this);
        this.view.getTable().addMouseListener(this);
    }

    private void setTableValues() {
        ManageTable.clearTable(this.view.getTable(), tableModel);
        DecimalFormat df = new DecimalFormat("#,##0");
        mapTable = this.model.loadEmpDetails();
        Map<String, Object[]> treeMap = new TreeMap<>(mapTable);
        treeMap.keySet().forEach((s) -> {
            int empID = Integer.parseInt(mapTable.get(s)[0].toString());
            String empNbr = mapTable.get(s)[1].toString();
            String empName = mapTable.get(s)[2].toString();
            String empDept = mapTable.get(s)[4].toString();
            String empWorkStatus = mapTable.get(s)[6].toString();
            double grossSalar = SalaryCalc.getSalary(empID, "G");
            double taxSalar = SalaryCalc.getSalary(empID, "T");
            double excludeTax = SalaryCalc.getSalary(empID, "X");
            double abSalary = (SalaryCalc.getSalary(empID, "G") / (SalaryCalc.getAbsentDayInMonth() * SalaryCalc.getDayWorkHours() * 60)) * SalaryCalc.getABMinutes(empID, SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()), SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()));
            double insur = SalaryCalc.getInsurance(empID, SalaryCalc.getSalary(empID, "G") - abSalary);
            double ot = SalaryCalc.getOverTime(empID, SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()), SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()));
            Object[] obj = new Object[]{empID, empNbr, empName, "", empDept, df.format(grossSalar), df.format(taxSalar), df.format(excludeTax), df.format(abSalary), df.format(ot), 0, df.format(insur), 0};
            tableModel.addRow(obj);
        });
        this.view.getTable().setModel(tableModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getBtnLoad()) {
//            this.setTableValues();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTableDept()) {
            int row = this.view.getTableDept().getSelectedRow();
            int id = Integer.parseInt(this.view.getTableDept().getValueAt(row, 1).toString());
            this.model.setDepartmentID(id);
            this.setTableValues();
        } else if (e.getSource() == this.view.getTable()) {
            if (e.getClickCount() == 2) {
                int row = this.view.getTable().getSelectedRow();
                int col = this.view.getTable().getSelectedColumn();
                int emid = Integer.parseInt(this.view.getTable().getValueAt(row, 0).toString());
                String emnbr = this.view.getTable().getValueAt(row, 1).toString();
                String emName = this.view.getTable().getValueAt(row, 2).toString();
                if (col == 8) {
                    FrmNewAbsent ab = new FrmNewAbsent(null, true, emid, emnbr, emName);
                    ab.setVisible(true);
                    this.setTableValues();
                } else if (col == 9) {
                    FrmOvertime ot = new FrmOvertime(null, true, emid, emnbr, emName);
                    ot.setVisible(true);
                    this.setTableValues();
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

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

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
