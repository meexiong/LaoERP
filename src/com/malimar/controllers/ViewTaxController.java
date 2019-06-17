package com.malimar.controllers;

import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.HorizontalAlignmentHeaderRenderer;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Variable;
import com.malimar.views.FrmViewTax;
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

public class ViewTaxController implements MouseListener, MouseMotionListener{

    private final FrmViewTax view;
    String frm;
    HashMap<Integer, Object[]> mapTax = null;
    int empid;
    double totalTax = 0;
    double ns = 0;
    DefaultTableModel tableModel = new DefaultTableModel();

    public ViewTaxController(FrmViewTax view, int emid, String emNbr, String emName, double netSalary) {
        this.view = view;
        this.frm = this.view.getClass().getSimpleName();
        this.tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.view.getLblTaxInfo().addMouseListener(this);
        this.view.getLblTaxInfo().addMouseMotionListener(this);
        this.empid = emid;
        this.view.getTxtEmployee().setText(emNbr + " " + emName);
        this.language();
        this.loadTaxTable(netSalary);
        this.view.getTable().getColumnModel().getColumn(0).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTable().getColumnModel().getColumn(1).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(2).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(3).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(4).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        this.view.getTable().getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
    }

    private void language() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        this.view.getLblTaxInfo().setText(hmapLang.get("lblTaxInfo".concat(frm).toUpperCase())[LN]);
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
    }

    private void loadTaxTable(double netSalary) {
        totalTax = 0;
        DecimalFormat df = new DecimalFormat("#,##0");
        ManageTable.clearTable(this.view.getTable(), tableModel);
        mapTax = SalaryCalc.getTax(empid);
        Map<Integer, Object[]> treeMap = new TreeMap<>(mapTax);
        treeMap.keySet().forEach((s) -> {
            double netTax = 0;
            //    netTax = SalaryCalc.getSalary(empid, "T") - SalaryCalc.getInsurance(empid, SalaryCalc.getSalary(empid, "I"));
            double pct = Double.parseDouble(mapTax.get(s)[3].toString());
            double min = Double.parseDouble(mapTax.get(s)[4].toString());
            double max = Double.parseDouble(mapTax.get(s)[5].toString());
            double deduction = Double.parseDouble(mapTax.get(s)[6].toString());
            ns = netSalary + deduction;
            totalTax += SalaryCalc.fuctionTax(ns, pct, min, max, deduction);
            Object[] obj = new Object[]{mapTax.get(s)[2].toString(), df.format(mapTax.get(s)[4]), df.format(mapTax.get(s)[5]), df.format(mapTax.get(s)[6]), df.format(SalaryCalc.fuctionTax(ns, pct, min, max, deduction)), 0};
            tableModel.addRow(obj);
        });
        String total = "Tax Salary";
        if (Variable.langType.equals("L1")) {
            total = "ເງິນເດືອນທີ່ໄລາອາກອນ";
        }
        Object[] obj = new Object[]{null, total, String.format("%,.0f", ns), "Total Tax", df.format(totalTax), 1};
        tableModel.addRow(obj);
        this.view.getTable().setModel(tableModel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        MoveForm.mousePressed(e);
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
        MoveForm.mouseDragded(e, view);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
