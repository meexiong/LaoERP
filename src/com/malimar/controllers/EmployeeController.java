package com.malimar.controllers;

import com.malimar.models.Employee;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
import com.malimar.views.FrmDashboard;
import com.malimar.views.FrmEmployee;
import com.malimar.views.FrmEmployeeDetails;
import com.malimar.views.FrmHR;
import com.malimar.views.FrmMainMenu;
import com.malimar.views.FrmSetting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EmployeeController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final FrmEmployee view;
    private final Employee model;
    String frm;
    HashMap<String, Object[]> mapDivision = null;
    HashMap<String, Object[]> mapDepartment = null;
    HashMap<String, Object[]> mapLocation = null;
    DefaultTableModel tableEmpModel = new DefaultTableModel();
    double totalTax = 0;

    public EmployeeController(FrmEmployee view) {
        this.view = view;
        Employee em = new Employee();
        this.model = em;
        this.setInitial();
    }

    private void setInitial() {
        frm = this.view.getClass().getSimpleName();
        this.tableEmpModel = (DefaultTableModel) this.view.getTableEmpList().getModel();
        this.setEvent();
        this.setComboBoxBaseUI();
        this.changeLabel();
        this.model.load(this.view.getTableEmpList(), this.tableEmpModel);
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    private void setComboBoxBaseUI() {
        this.view.getCmbFindDepartment().setUI(new BasicComboBoxUI());
        this.view.getCmbFindLocation().setUI(new BasicComboBoxUI());
    }

    private void setEvent() {
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.view.getLblEmployeeInfo().addMouseListener((MouseListener) this);
        this.view.getTableEmpList().addMouseListener((MouseListener) this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTableEmpList(), this.view.getTableEmpListScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTableEmpList(), frm);
        this.view.getLblSearchEmp().setText(hmapLang.get("lblSearchEmp".concat(frm).toUpperCase())[LN]);
        this.view.getLblFindbyDept().setText(hmapLang.get("lblFindbyDept".concat(frm).toUpperCase())[LN]);
        this.view.getLblFindbyLoc().setText(hmapLang.get("lblFindbyLoc".concat(frm).toUpperCase())[LN]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
            if (FrmMainMenu.menuDashboard.isSelected()) {
                FrmDashboard obj = new FrmDashboard();
                FrmMainMenu.deskTopControll.add(obj);
                obj.setVisible(true);
            } else if (FrmMainMenu.menuHR.isSelected()) {
                FrmHR obj = new FrmHR();
                FrmMainMenu.deskTopControll.add(obj);
                obj.setVisible(true);
            } else {
                FrmSetting obj = new FrmSetting();
                FrmMainMenu.deskTopControll.add(obj);
                obj.setVisible(true);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTableEmpList()) {
            if (e.getClickCount() == 2) {
                int row = this.view.getTableEmpList().getSelectedRow();
                int emid = Integer.parseInt(this.view.getTableEmpList().getValueAt(row, 0).toString());
                FrmEmployeeDetails ed = new FrmEmployeeDetails(null, true, emid);
                ed.setVisible(true);
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
