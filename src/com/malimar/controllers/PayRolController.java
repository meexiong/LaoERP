package com.malimar.controllers;

import com.malimar.models.PayRoll;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.HeaderCheckBoxHandler;
import com.malimar.utils.HeaderRenderer;
import com.malimar.utils.HorizontalAlignmentHeaderRenderer;
import com.malimar.utils.ManageTable;
import com.malimar.utils.Variable;
import com.malimar.views.FrmAddDeduction;
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

    public PayRolController(FrmPayRoll view) {
        this.view = view;
        PayRoll pr = new PayRoll();
        this.model = pr;
        Variable.bomG = SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate());
        Variable.eomG = SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate());
        Variable.ymG = SalaryCalc.convertDToYM(SalaryCalc.getPayrollEndDate());
        this.setInitial();
        this.setEvent();
        this.model.insertPayrollAll();
        this.model.loadPayroll(this.view.getTable(), tableModel, 0);
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
        this.view.getBtnLoad().addActionListener(this);
        this.view.getBtnLoad().addMouseListener(this);
        this.view.getBtnLoad().addMouseMotionListener(this);
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
            double asTax = SalaryCalc.getAddOrSubtract(empID, 1);
            double asNoTax = SalaryCalc.getAddOrSubtract(empID, 0);
            double totalSalary = taxSalar - abSalary - insur + asTax + ot;
            double payTax = SalaryCalc.getPayTax(empID, totalSalary);
            double netSalary = totalSalary - payTax + asNoTax + excludeTax;
            Object[] obj = new Object[]{empID, empNbr, empName, "", df.format(grossSalar), df.format(taxSalar), df.format(excludeTax), df.format(abSalary), df.format(insur), df.format(asTax), df.format(ot), df.format(payTax), df.format(asNoTax), df.format(netSalary)};
            tableModel.addRow(obj);
        });
        this.view.getTable().setModel(tableModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getBtnLoad()) {
//            this.model.insertPayrollAll();
//            this.model.loadPayroll(this.view.getTable(), tableModel);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTableDept()) {
            int row = this.view.getTableDept().getSelectedRow();
            int id = Integer.parseInt(this.view.getTableDept().getValueAt(row, 1).toString());
            this.model.setDepartmentID(id);
            this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID());
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
                switch (col) {
                    case 8:
                        FrmNewAbsent ab = new FrmNewAbsent(null, true, emid, emnbr, emName);
                        ab.setVisible(true);
                        this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID());
                        break;
                    case 11:
                        FrmOvertime ot = new FrmOvertime(null, true, emid, emnbr, emName);
                        ot.setVisible(true);
                        this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID());
                        break;
                    case 10:
                    case 14:
                        FrmAddDeduction add = new FrmAddDeduction(null, true, emid, emnbr, emName);
                        add.setVisible(true);
                        this.model.loadPayroll(this.view.getTable(), tableModel, this.model.getDepartmentID());
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
        if (e.getSource() == this.view.getBtnLoad()) {
            this.view.getPanelLoadHover().setVisible(false);
            this.view.getPanelLoad().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnLoad()) {
            this.view.getPanelLoadHover().setVisible(true);
            this.view.getPanelLoad().setVisible(false);
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
