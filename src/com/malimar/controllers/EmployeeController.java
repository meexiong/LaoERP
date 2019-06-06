package com.malimar.controllers;

import com.malimar.models.Employee;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.CheckField;
import com.malimar.utils.HorizontalAlignmentHeaderRenderer;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.ResizeImage;
import com.malimar.utils.Valiables;
import com.malimar.views.FrmDashboard;
import com.malimar.views.FrmEmployee;
import com.malimar.views.FrmHR;
import com.malimar.views.FrmMainMenu;
import com.malimar.views.FrmSetting;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EmployeeController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final FrmEmployee view;
    private final Employee model;
    String frm;
    HashMap<String, Object[]> mapGender = null;
    HashMap<String, Object[]> mapStatus = null;
    HashMap<String, Object[]> mapDivision = null;
    HashMap<String, Object[]> mapDepartment = null;
    HashMap<String, Object[]> mapUnit = null;
    HashMap<String, Object[]> mapNationality = null;
    HashMap<String, Object[]> mapEthnic = null;
    HashMap<String, Object[]> mapReligion = null;
    HashMap<String, Object[]> mapPosition = null;
    HashMap<String, Object[]> mapManager = null;
    HashMap<String, Object[]> mapInsuranceType = null;
    HashMap<String, Object[]> mapWorkStatus = null;
    HashMap<String, Object[]> mapLocation = null;
    HashMap<String, Object[]> mapSalaryType = null;
    HashMap<String, Object[]> mapTax = null;
    HashMap<Integer, Object[]> map = null;
    DefaultTableModel tableEmpModel = new DefaultTableModel();
    DefaultTableModel tableSalarModel = new DefaultTableModel();
    DefaultTableModel tableTaxModel = new DefaultTableModel();
    DefaultTableModel tableInsurModel = new DefaultTableModel();
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
        this.tableSalarModel = (DefaultTableModel) this.view.getTableSalary().getModel();
        this.tableTaxModel = (DefaultTableModel) this.view.getTableTax().getModel();
        this.tableInsurModel = (DefaultTableModel) this.view.getTableInsurance().getModel();
        ManageTable.setTableHeader(this.view.getTableSalary(), this.view.getScrollPaneSalary());
        ManageTable.setTableHeader(this.view.getTableTax(), this.view.getScrollPanelTax());
        ManageTable.setTableHeader(this.view.getTableInsurance(), this.view.getTableInsuranceScrollPane());
        this.setEvent();
        this.setComboBoxBaseUI();
        this.changeLabel();
        this.model.load(this.view.getTableEmpList(), this.tableEmpModel);
        this.view.getTxtEmpID().setVisible(false);
        this.view.getTxtEmpSalaryID().setVisible(false);
        this.view.getTxtInsurEmpID().setVisible(false);
        this.view.getTableTax().getColumnModel().getColumn(0).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableTax().getColumnModel().getColumn(1).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableTax().getColumnModel().getColumn(2).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableTax().getColumnModel().getColumn(3).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTableTax().getColumnModel().getColumn(4).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTableTax().getColumnModel().getColumn(5).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTableTax().getColumnModel().getColumn(6).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTableTax().getColumnModel().getColumn(7).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        this.view.getTableTax().getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        this.view.getTableTax().getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        this.view.getTableTax().getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        this.view.getTableTax().getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        this.view.getTableTax().getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
        this.view.getTableSalary().getColumnModel().getColumn(0).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableSalary().getColumnModel().getColumn(1).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableSalary().getColumnModel().getColumn(2).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTableSalary().getColumnModel().getColumn(3).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        this.view.getTableSalary().getColumnModel().getColumn(4).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        this.view.getTableSalary().getColumnModel().getColumn(5).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        this.view.getTableSalary().getColumnModel().getColumn(6).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTableSalary().getColumnModel().getColumn(7).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        DefaultTableCellRenderer rghtSalary = new DefaultTableCellRenderer();
        rghtSalary.setHorizontalAlignment(SwingConstants.RIGHT);
        this.view.getTableSalary().getColumnModel().getColumn(2).setCellRenderer(rghtSalary);
        this.view.getTableSalary().getColumnModel().getColumn(6).setCellRenderer(rghtSalary);
        DefaultTableCellRenderer centerSalary = new DefaultTableCellRenderer();
        centerSalary.setHorizontalAlignment(SwingConstants.CENTER);
        this.view.getTableSalary().getColumnModel().getColumn(5).setCellRenderer(centerSalary);
        this.view.getTableInsurance().getColumnModel().getColumn(1).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableInsurance().getColumnModel().getColumn(2).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableInsurance().getColumnModel().getColumn(3).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTableInsurance().getColumnModel().getColumn(4).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        DefaultTableCellRenderer rghtInsurance = new DefaultTableCellRenderer();
        rghtInsurance.setHorizontalAlignment(SwingConstants.RIGHT);
        this.view.getTableInsurance().getColumnModel().getColumn(4).setCellRenderer(rghtInsurance);
    }

    private void setComboBoxBaseUI() {
        this.view.getCmbFindDepartment().setUI(new BasicComboBoxUI());
        this.view.getCmbFindLocation().setUI(new BasicComboBoxUI());
        this.view.getCmbGender().setUI(new BasicComboBoxUI());
        this.view.getCmbNational().setUI(new BasicComboBoxUI());
        this.view.getCmbEthnic().setUI(new BasicComboBoxUI());
        this.view.getCmbReligion().setUI(new BasicComboBoxUI());
        this.view.getCmbManager().setUI(new BasicComboBoxUI());
        this.view.getCmbLocation().setUI(new BasicComboBoxUI());
        this.view.getCmbDepartment().setUI(new BasicComboBoxUI());
        this.view.getCmbBusiness().setUI(new BasicComboBoxUI());
        this.view.getCmbTitle().setUI(new BasicComboBoxUI());
        this.view.getCmbLevel().setUI(new BasicComboBoxUI());
        this.view.getCmbWorkStatus().setUI(new BasicComboBoxUI());
        this.view.getCmbInsurance().setUI(new BasicComboBoxUI());
        this.view.getCmbSalaryPeriod().setUI(new BasicComboBoxUI());
        this.view.getCmbEmpStatus().setUI(new BasicComboBoxUI());
        this.view.getCmbBlood().setUI(new BasicComboBoxUI());
        this.view.getCmbDivision().setUI(new BasicComboBoxUI());
        this.view.getCmbSalaryType().setUI(new BasicComboBoxUI());
    }

    private void setEvent() {
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.view.getLblEmployeeInfo().addMouseListener((MouseListener) this);
        this.view.getBtnSave().addActionListener((ActionListener) this);
        this.view.getBtnSave().addMouseListener((MouseListener) this);
        this.view.getBtnSave().addMouseMotionListener((MouseMotionListener) this);
        this.view.getBtnSaveCV().addActionListener((ActionListener) this);
        this.view.getBtnSaveCV().addMouseListener((MouseListener) this);
        this.view.getBtnSaveCV().addMouseMotionListener((MouseMotionListener) this);
        this.view.getTabPane().addMouseListener((MouseListener) this);
        this.view.getCmbDivision().addActionListener((ActionListener) this);
        this.view.getCmbLocation().addActionListener((ActionListener) this);
        this.view.getLblImage().addMouseListener((MouseListener) this);
        this.view.getTableEmpList().addMouseListener((MouseListener) this);
        this.view.getBtnSaveSalary().addActionListener((ActionListener) this);
        this.view.getBtnSaveSalary().addMouseListener((MouseListener) this);
        this.view.getBtnSaveSalary().addMouseMotionListener((MouseMotionListener) this);
        this.view.getTabPaneDetails().addMouseListener((MouseListener) this);
        this.view.getTableSalary().addMouseListener((MouseListener) this);
        this.view.getTableSalary().addKeyListener((KeyListener) this);
        this.view.getBtnSaveTax().addActionListener((ActionListener) this);
        this.view.getBtnSaveTax().addMouseListener((MouseListener) this);
        this.view.getBtnSaveTax().addMouseMotionListener((MouseMotionListener) this);
        this.view.getChStandardTax().addActionListener((ActionListener) this);
        this.view.getBtnDeleteTax().addActionListener((ActionListener) this);
        this.view.getBtnDeleteTax().addMouseListener((MouseListener) this);
        this.view.getBtnDeleteTax().addMouseMotionListener((MouseMotionListener) this);
        this.view.getBtnSaveInsurance().addActionListener((ActionListener) this);
        this.view.getBtnSaveInsurance().addMouseListener((MouseListener) this);
        this.view.getBtnSaveInsurance().addMouseMotionListener((MouseMotionListener) this);
        this.view.getBtnDeleteInsurance().addActionListener((ActionListener) this);
        this.view.getBtnDeleteInsurance().addMouseListener((MouseListener) this);
        this.view.getBtnDeleteInsurance().addMouseMotionListener((MouseMotionListener) this);
        this.view.getTableInsurance().addMouseListener((MouseListener) this);

    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTableEmpList(), this.view.getTableEmpListScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTableEmpList(), frm);
        ManageTable.changeTableHeaderLabel(this.view.getTableInsurance(), frm);
        ManageTable.changeTableHeaderLabel(this.view.getTableSalary(), frm);
        ManageTable.changeTableHeaderLabel(this.view.getTableTax(), frm);
        this.view.getLblEmployeeInfo().setText(hmapLang.get("lblEmployeeInfo".concat(frm).toUpperCase())[LN]);
        this.view.getTabPane().setTitleAt(1, hmapLang.get("tabPane2".concat(frm).toUpperCase())[LN]);
        this.view.getTabPane().setTitleAt(0, hmapLang.get("tabPane1".concat(frm).toUpperCase())[LN]);
        this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpID().setText(hmapLang.get("lblEmpNbr".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpEmail().setText(hmapLang.get("lblEmpEmail".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpName_L1().setText(hmapLang.get("lblEmpName_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpName_L2().setText(hmapLang.get("lblEmpName_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpNickname().setText(hmapLang.get("lblEmpNickname".concat(frm).toUpperCase())[LN]);
        this.view.getLblGender().setText(hmapLang.get("lblGender".concat(frm).toUpperCase())[LN]);
        this.view.getLblDOB().setText(hmapLang.get("lblDOB".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpStatus().setText(hmapLang.get("lblEmpStatus".concat(frm).toUpperCase())[LN]);
        this.view.getChFullTime().setText(hmapLang.get("chFullTime".concat(frm).toUpperCase())[LN]);
        this.view.getChCalculateSalary().setText(hmapLang.get("chCalculateSalary".concat(frm).toUpperCase())[LN]);
        this.view.getChInOffice().setText(hmapLang.get("chInOffice".concat(frm).toUpperCase())[LN]);
        this.view.getChConsultant().setText(hmapLang.get("chConsultant".concat(frm).toUpperCase())[LN]);
        this.view.getLblStartDate().setText(hmapLang.get("lblStartDate".concat(frm).toUpperCase())[LN]);
        this.view.getLblEndDate().setText(hmapLang.get("lblEndDate".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocation().setText(hmapLang.get("lblLocation".concat(frm).toUpperCase())[LN]);
        this.view.getLblDepartment().setText(hmapLang.get("lblDepartment".concat(frm).toUpperCase())[LN]);
        this.view.getLblBusinessUnit().setText(hmapLang.get("lblBusinessUnit".concat(frm).toUpperCase())[LN]);
        this.view.getLblDivision().setText(hmapLang.get("lblDivision".concat(frm).toUpperCase())[LN]);
        this.view.getLblNationality().setText(hmapLang.get("lblNationality".concat(frm).toUpperCase())[LN]);
        this.view.getLblEthnic().setText(hmapLang.get("lblEthnic".concat(frm).toUpperCase())[LN]);
        this.view.getLblReligion().setText(hmapLang.get("lblReligion".concat(frm).toUpperCase())[LN]);
        this.view.getLblTitle().setText(hmapLang.get("lblTitle".concat(frm).toUpperCase())[LN]);
        this.view.getLblLevel().setText(hmapLang.get("lblLevel".concat(frm).toUpperCase())[LN]);
        this.view.getLblManager().setText(hmapLang.get("lblManager".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsurance().setText(hmapLang.get("lblInsurance".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryPeriod().setText(hmapLang.get("lblSalaryPeriod".concat(frm).toUpperCase())[LN]);
        this.view.getLblWorkStatus().setText(hmapLang.get("lblWorkStatus".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(0, hmapLang.get("tabPaneDetails_1".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(1, hmapLang.get("tabPaneDetails_Address".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(2, hmapLang.get("tabPaneDetails_Salary".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(3, hmapLang.get("tabPaneDetails_Insur".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(4, hmapLang.get("tabPaneDetails_Tax".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(5, hmapLang.get("tabPaneDetails_Edu".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(6, hmapLang.get("tabPaneDetails_Note".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(7, hmapLang.get("tabPaneDetails_Equ".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(8, hmapLang.get("tabPaneDetails_Exp".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(9, hmapLang.get("tabPaneDetails_Absent".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(10, hmapLang.get("tabPaneDetails_Bank".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(11, hmapLang.get("tabPaneDetails_Manege".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(12, hmapLang.get("tabPaneDetails_Docu".concat(frm).toUpperCase())[LN]);
        this.view.getLblFacebook().setText(hmapLang.get("lblFacebook".concat(frm).toUpperCase())[LN]);
        this.view.getLblMobilePhone().setText(hmapLang.get("lblMobilePhone".concat(frm).toUpperCase())[LN]);
        this.view.getLblTelephone().setText(hmapLang.get("lblTelephone".concat(frm).toUpperCase())[LN]);
        this.view.getLblPOB().setText(hmapLang.get("lblPOB".concat(frm).toUpperCase())[LN]);
        this.view.getLblIDCard().setText(hmapLang.get("lblIDCard".concat(frm).toUpperCase())[LN]);
        this.view.getLblFamilyBook().setText(hmapLang.get("lblFamilyBook".concat(frm).toUpperCase())[LN]);
        this.view.getLblPassportNo().setText(hmapLang.get("lblPassportNo".concat(frm).toUpperCase())[LN]);
        this.view.getLblBloodGroup().setText(hmapLang.get("lblBloodGroup".concat(frm).toUpperCase())[LN]);
        this.view.getLblDrivingNo().setText(hmapLang.get("lblDrivingNo".concat(frm).toUpperCase())[LN]);
        this.view.getLblHusband_Wife().setText(hmapLang.get("lblHusband_Wife".concat(frm).toUpperCase())[LN]);
        this.view.getLblOccupation().setText(hmapLang.get("lblOccupation".concat(frm).toUpperCase())[LN]);
        this.view.getLblHight().setText(hmapLang.get("lblHight".concat(frm).toUpperCase())[LN]);
        this.view.getLblWeight().setText(hmapLang.get("lblWeight".concat(frm).toUpperCase())[LN]);
        this.view.getChCar().setText(hmapLang.get("chCar".concat(frm).toUpperCase())[LN]);
        this.view.getLblMotocycle().setText(hmapLang.get("lblMotocycle".concat(frm).toUpperCase())[LN]);
        this.view.getLblAge().setText(hmapLang.get("lblAge".concat(frm).toUpperCase())[LN]);
        this.view.getLblWorkPlace().setText(hmapLang.get("lblWorkPlace".concat(frm).toUpperCase())[LN]);
        this.view.getLblHubandTelephone().setText(hmapLang.get("lblHubandTelephone".concat(frm).toUpperCase())[LN]);
        this.view.getLblFatherName().setText(hmapLang.get("lblFatherName".concat(frm).toUpperCase())[LN]);
        this.view.getLblFatherAge().setText(hmapLang.get("lblFatherAge".concat(frm).toUpperCase())[LN]);
        this.view.getLblFatherOccupation().setText(hmapLang.get("lblFatherOccupation".concat(frm).toUpperCase())[LN]);
        this.view.getLblFatherWorkPlace().setText(hmapLang.get("lblFatherWorkPlace".concat(frm).toUpperCase())[LN]);
        this.view.getLblFatherTelephone().setText(hmapLang.get("lblFatherTelephone".concat(frm).toUpperCase())[LN]);
        this.view.getLblMotherName().setText(hmapLang.get("lblMotherName".concat(frm).toUpperCase())[LN]);
        this.view.getLblMotherAge().setText(hmapLang.get("lblMotherAge".concat(frm).toUpperCase())[LN]);
        this.view.getLblMotherOccupation().setText(hmapLang.get("lblMotherOccupation".concat(frm).toUpperCase())[LN]);
        this.view.getLblMotherWorkPlace().setText(hmapLang.get("lblMotherWorkPlace".concat(frm).toUpperCase())[LN]);
        this.view.getLblMotherTelephone().setText(hmapLang.get("lblMotherTelephone".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmergencyContact().setText(hmapLang.get("lblEmergencyContact".concat(frm).toUpperCase())[LN]);
        this.view.getLblSearchEmp().setText(hmapLang.get("lblSearchEmp".concat(frm).toUpperCase())[LN]);
        this.view.getLblFindbyDept().setText(hmapLang.get("lblFindbyDept".concat(frm).toUpperCase())[LN]);
        this.view.getLblFindbyLoc().setText(hmapLang.get("lblFindbyLoc".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsuranceType().setText(hmapLang.get("lblInsuranceType".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsuranceNbr().setText(hmapLang.get("lblInsuranceNbr".concat(frm).toUpperCase())[LN]);
        this.view.getLblInsuranceMaxSalary().setText(hmapLang.get("lblInsuranceMaxSalary".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveInsurance().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDeleteInsurance().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryType().setText(hmapLang.get("lblSalaryType".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryAmount().setText(hmapLang.get("lblSalaryAmount".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryDeduction().setText(hmapLang.get("lblSalaryDeduction".concat(frm).toUpperCase())[LN]);
        this.view.getChSalaryTax().setText(hmapLang.get("lblSalaryTax".concat(frm).toUpperCase())[LN]);
        this.view.getChSalaryOvertime().setText(hmapLang.get("lblSalaryOT".concat(frm).toUpperCase())[LN]);
        this.view.getChSalaryInsurance().setText(hmapLang.get("lblInsurance".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveSalary().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getLblTotalSalary().setText(hmapLang.get("lblTotalSalary".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryInsurance().setText(hmapLang.get("lblInsurance".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryTax().setText(hmapLang.get("lblSalaryTax".concat(frm).toUpperCase())[LN]);
        this.view.getLblNetSalary().setText(hmapLang.get("lblNetSalary".concat(frm).toUpperCase())[LN]);
        this.view.getLblTaxSalary().setText(hmapLang.get("lblTaxSalary".concat(frm).toUpperCase())[LN]);
        this.view.getLblExcludeTax().setText(hmapLang.get("lblExcludeTax".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryPerDay().setText(hmapLang.get("lblSalaryPerDay".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryPerHours().setText(hmapLang.get("lblSalaryPerHours".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalaryOvertime().setText(hmapLang.get("lblSalaryOvertime".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimePerDay().setText(hmapLang.get("lblOvertimePerDay".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimePerHous().setText(hmapLang.get("lblOvertimePerHous".concat(frm).toUpperCase())[LN]);
        this.view.getLblKip().setText(hmapLang.get("lblKip".concat(frm).toUpperCase())[LN]);
        this.view.getLblTaxStandard().setText(hmapLang.get("lblTaxStandard".concat(frm).toUpperCase())[LN]);
        this.view.getLblTaxCustomize().setText(hmapLang.get("lblTaxCustomize".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveTax().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDeleteTax().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveCV().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);

    }

    private void setGenderCombo() {
        try {
            mapGender = this.model.getGenderCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapGender);
            this.view.getCmbGender().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbGender().addItem(s);
            });
            this.view.getCmbGender().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setStatusCombo() {
        try {
            mapStatus = this.model.getEmpStatusCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapStatus);
            this.view.getCmbEmpStatus().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbEmpStatus().addItem(s);
            });
            this.view.getCmbEmpStatus().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setDivisionCombo() {
        try {
            mapDivision = this.model.getDivisionCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapDivision);
            this.view.getCmbDivision().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbDivision().addItem(s);
            });
            this.view.getCmbDivision().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setLocationCombo() {
        try {
            mapLocation = this.model.getLocationCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocation);
            this.view.getCmbLocation().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbLocation().addItem(s);
            });
            this.view.getCmbLocation().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setDepartmentCombo() {
        try {
            mapDepartment = this.model.getDepartmentCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapDepartment);
            this.view.getCmbDepartment().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbDepartment().addItem(s);
            });
            this.view.getCmbDepartment().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setUnitCombo() {
        try {
            mapUnit = this.model.getUnitCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapUnit);
            this.view.getCmbBusiness().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbBusiness().addItem(s);
            });
            this.view.getCmbBusiness().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setNationalityCombo() {
        try {
            mapNationality = this.model.getNationalityCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapNationality);
            this.view.getCmbNational().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbNational().addItem(s);
            });
            this.view.getCmbNational().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setEthnicCombo() {
        try {
            mapEthnic = this.model.getEthnicCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapEthnic);
            this.view.getCmbEthnic().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbEthnic().addItem(s);
            });
            this.view.getCmbEthnic().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setReligionCombo() {
        try {
            mapReligion = this.model.getReligionCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapReligion);
            this.view.getCmbReligion().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbReligion().addItem(s);
            });
            this.view.getCmbReligion().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setPositionCombo() {
        try {
            mapPosition = this.model.getPositionCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapPosition);
            this.view.getCmbTitle().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbTitle().addItem(s);
            });
            this.view.getCmbTitle().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setManagerCombo() {
        try {
            mapManager = this.model.getManagerCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapManager);
            this.view.getCmbManager().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbManager().addItem(s);
            });
            this.view.getCmbManager().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setWorkStatusCombo() {
        try {
            mapWorkStatus = this.model.getWorkStatusCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapWorkStatus);
            this.view.getCmbWorkStatus().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbWorkStatus().addItem(s);
            });
            this.view.getCmbWorkStatus().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setSalaryType() {
        try {
            mapSalaryType = this.model.getSalaryType();
            Map<String, Object[]> SortMap = new TreeMap<>(mapSalaryType);
            this.view.getCmbSalaryType().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbSalaryType().addItem(s);
            });
            this.view.getCmbSalaryType().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void clear() {
        this.view.getTxtEmpNbr().setText("");
        this.view.getTxtEmpMail().setText("");
        this.view.getTxtEmpName_L1().setText("");
        this.view.getTxtEmpName_L2().setText("");
        this.view.getTxtEmpNickname().setText("");
        this.view.getCmbGender().setSelectedIndex(-1);
        this.view.getTxtDOB().setDate(null);
        this.view.getCmbEmpStatus().setSelectedIndex(-1);
        this.view.getTxtStartDate().setDate(null);
        this.view.getTxtEndDate().setDate(null);
        this.view.getCmbDivision().setSelectedIndex(-1);
        this.view.getCmbLocation().setSelectedIndex(-1);
        this.view.getCmbDepartment().setSelectedIndex(-1);
        this.view.getCmbBusiness().setSelectedIndex(-1);
        this.view.getCmbNational().setSelectedIndex(-1);
        this.view.getCmbEthnic().setSelectedIndex(-1);
        this.view.getCmbReligion().setSelectedIndex(-1);
        this.view.getCmbTitle().setSelectedIndex(-1);
        this.view.getCmbLevel().setSelectedIndex(-1);
        this.view.getCmbManager().setSelectedIndex(-1);
        this.view.getCmbSalaryPeriod().setSelectedIndex(-1);
        this.view.getCmbWorkStatus().setSelectedIndex(-1);
        this.view.getChFullTime().setSelected(false);
        this.view.getChCalculateSalary().setSelected(false);
        this.view.getChInOffice().setSelected(false);
        this.view.getChConsultant().setSelected(false);
        this.view.getLblImage().setIcon(null);
        this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase())[LN]);
    }

    private void clearSalarTab() {
        this.view.getCmbSalaryType().setSelectedIndex(-1);
        this.view.getTxtSalaryAmount().setText("0");
        this.view.getTxtSalaryDeduction().setText("0");
        this.view.getChSalaryTax().setSelected(false);
        this.view.getChSalaryOvertime().setSelected(false);
        this.view.getChSalaryInsurance().setSelected(false);
        this.view.getTxtEmpSalaryID().setText("New");
        this.view.getTxtSalaryTotal().setText("0");
        this.view.getTxtIncludeTax().setText("0");
        this.view.getTxtExcludeTax().setText("0");
        this.view.getTxtSalaryRateDay().setText("0");
        this.view.getTxtSalaryRateHour().setText("0");
        this.view.getTxtOvertimeTotal().setText("0");
        this.view.getTxtOvertimeRateDay().setText("0");
        this.view.getTxtOvertimeRateHour().setText("0");
    }

    private void setemployeeDetails() {
        int rowSelect = this.view.getTableEmpList().getSelectedRow();
        this.model.setEmpID(Integer.parseInt(this.view.getTableEmpList().getValueAt(rowSelect, 0).toString()));
        this.model.setEmployeeDetails();
        this.view.getTxtEmpID().setText(this.view.getTableEmpList().getValueAt(rowSelect, 0).toString());
        this.view.getTxtEmpNbr().setText(this.model.getEmpNbr());
        this.view.getTxtEmpMail().setText(this.model.getEmpEmail());
        this.view.getTxtEmpName_L1().setText(this.model.getEmpName_L1());
        this.view.getTxtEmpName_L2().setText(this.model.getEmpName_L2());
        this.view.getTxtEmpNickname().setText(this.model.getEmpNickname());
        this.view.getCmbGender().setSelectedItem(this.model.getEmpGenderDescription());
        this.view.getTxtDOB().setDate(this.model.getEmpDOB());
        this.view.getCmbEmpStatus().setSelectedItem(this.model.getEmpStatusDescription());
        this.view.getTxtStartDate().setDate(this.model.getEmpStartDate());
        this.view.getTxtEndDate().setDate(this.model.getEmpEndDate());
        this.view.getCmbDivision().setSelectedItem(this.model.getEmpDivisionName());
        this.view.getCmbLocation().setSelectedItem(this.model.getEmpLocationName());
        this.view.getCmbDepartment().setSelectedItem(this.model.getEmpDepartmentName());
        this.view.getCmbBusiness().setSelectedItem(this.model.getEmpUnitName());
        this.view.getCmbNational().setSelectedItem(this.model.getEmpNationlityName());
        this.view.getCmbEthnic().setSelectedItem(this.model.getEmpEthnicName());
        this.view.getCmbReligion().setSelectedItem(this.model.getEmpReligionName());
        this.view.getCmbTitle().setSelectedItem(this.model.getEmpPositionName());
        this.view.getCmbLevel().setSelectedItem(this.model.getEmpLevel());
        this.view.getCmbManager().setSelectedItem(this.model.getEmpManagerName());
        this.view.getCmbSalaryPeriod().setSelectedItem(this.model.getEmpSalaryPeriod());
        this.view.getCmbWorkStatus().setSelectedItem(this.model.getEmpWorkStatusName());
        this.view.getChFullTime().setSelected(this.model.isEmpFullTime());
        this.view.getChCalculateSalary().setSelected(this.model.isEmpCalculateSalary());
        this.view.getChInOffice().setSelected(this.model.isEmpInOffice());
        this.view.getChConsultant().setSelected(this.model.isEmpConsultant());
        if (this.model.getEmpPicture() != null) {
            Image img = new ImageIcon(this.model.getEmpPicture()).getImage();
            Image ic = ResizeImage.resizeImage(img, this.view.getLblImage().getWidth(), this.view.getLblImage().getHeight());
            this.view.getLblImage().setText("");
            this.view.getLblImage().setIcon(new ImageIcon(ic));
        }
    }

    private void calculateSalary() {
        this.view.getTxtSalaryTotal().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "G")));
        this.view.getTxtTotalInsurance().setText(String.format("%,.0f", SalaryCalc.getInsurance(this.model.getEmpID(), SalaryCalc.getSalary(this.model.getEmpID(), "I"))));
        this.view.getTxtIncludeTax().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "T") - SalaryCalc.getInsurance(this.model.getEmpID(), SalaryCalc.getSalary(this.model.getEmpID(), "I"))));
        this.view.getTxtExcludeTax().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "X")));
        this.view.getTxtOvertimeTotal().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "O")));
        this.view.getTxtSalaryRateDay().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "G") / SalaryCalc.getNormalDay()));
        this.view.getTxtSalaryRateHour().setText(String.format("%,.0f", (SalaryCalc.getSalary(this.model.getEmpID(), "G") / SalaryCalc.getNormalDay()) / SalaryCalc.getDayHour(this.model.getEmpID())));
        this.view.getTxtOvertimeRateDay().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "O") / SalaryCalc.getOTday()));
        this.view.getTxtOvertimeRateHour().setText(String.format("%,.0f", (SalaryCalc.getSalary(this.model.getEmpID(), "O") / SalaryCalc.getOTday()) / SalaryCalc.getDayHour(this.model.getEmpID())));
        this.view.getTxtTotalTax().setText(String.format("%,.0f", totalTax));
        this.view.getTxtNetSalary().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "G") - SalaryCalc.getInsurance(this.model.getEmpID(), SalaryCalc.getSalary(this.model.getEmpID(), "I")) - totalTax));
    }

    private void setTaxCombo() {
        try {
            mapTax = this.model.getStandardTax();
            Map<String, Object[]> SortMap = new TreeMap<>(mapTax);
            this.view.getCmbTaxCustomize().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbTaxCustomize().addItem(s);
            });
            this.view.getCmbTaxCustomize().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void loadTaxTable() {
        totalTax = 0;
        DecimalFormat df = new DecimalFormat("#,##0");
        ManageTable.clearTable(this.view.getTableTax(), tableTaxModel);
        map = SalaryCalc.getTax(this.model.getEmpID());
        Map<Integer, Object[]> treeMap = new TreeMap<>(map);
        treeMap.keySet().forEach((s) -> {
            double netTax = 0;
            netTax = SalaryCalc.getSalary(this.model.getEmpID(), "T") - SalaryCalc.getInsurance(this.model.getEmpID(), SalaryCalc.getSalary(this.model.getEmpID(), "I"));
            double pct = Double.parseDouble(map.get(s)[3].toString());
            double min = Double.parseDouble(map.get(s)[4].toString());
            double max = Double.parseDouble(map.get(s)[5].toString());
            double deduction = Double.parseDouble(map.get(s)[6].toString());
            double sum = netTax + deduction;
            totalTax += SalaryCalc.fuctionTax(sum, pct, min, max, deduction);
            Object[] obj = new Object[]{map.get(s)[0].toString(), map.get(s)[1].toString(), map.get(s)[2].toString(), map.get(s)[3].toString(), df.format(map.get(s)[4]), df.format(map.get(s)[5]), df.format(map.get(s)[6]), df.format(SalaryCalc.fuctionTax(sum, pct, min, max, deduction))};
            tableTaxModel.addRow(obj);
        });
        if (Valiables.langType.equals("L1")) {
            Object[] obj = new Object[]{null, 1, null, null, "ເງິນເດືອນທີ່ໄລາອາກອນ", String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "T") - SalaryCalc.getInsurance(this.model.getEmpID(), SalaryCalc.getSalary(this.model.getEmpID(), "I"))), "ລວມຈ່າຍອາກອນ", df.format(totalTax)};
            tableTaxModel.addRow(obj);
        } else {
            Object[] obj = new Object[]{null, 1, null, null, "Tax Salary", String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "T") - SalaryCalc.getInsurance(this.model.getEmpID(), SalaryCalc.getSalary(this.model.getEmpID(), "I"))), "Total Tax", df.format(totalTax)};
            tableTaxModel.addRow(obj);
        }
        this.view.getTableTax().setModel(tableTaxModel);
    }

    private void saveEmp() {
        this.model.setEmpNbr(this.view.getTxtEmpNbr().getText());
        this.model.setEmpEmail(this.view.getTxtEmpMail().getText());
        this.model.setEmpName_L1(this.view.getTxtEmpName_L1().getText());
        this.model.setEmpName_L2(this.view.getTxtEmpName_L2().getText());
        this.model.setEmpNickname(this.view.getTxtEmpNickname().getText());
        String sex = this.view.getCmbGender().getSelectedItem().toString();
        this.model.setEmpGenderID(Integer.parseInt(this.mapGender.get(sex)[0].toString()));
        this.model.setEmpDOB(this.view.getTxtDOB().getDate());
        String empStatus = this.view.getCmbEmpStatus().getSelectedItem().toString();
        this.model.setEmpStatusID(Integer.parseInt(this.mapStatus.get(empStatus)[0].toString()));
        this.model.setEmpStartDate(this.view.getTxtStartDate().getDate());
        this.model.setEmpEndDate(this.view.getTxtEndDate().getDate());
        String division = this.view.getCmbDivision().getSelectedItem().toString();
        this.model.setEmpDivisionID(Integer.parseInt(this.mapDivision.get(division)[0].toString()));
        String loc = this.view.getCmbLocation().getSelectedItem().toString();
        this.model.setEmpLocationID(Integer.parseInt(this.mapLocation.get(loc)[0].toString()));
        String dpt = this.view.getCmbDepartment().getSelectedItem().toString();
        this.model.setEmpDepartmentID(Integer.parseInt(this.mapDepartment.get(dpt)[0].toString()));
        String unit = this.view.getCmbBusiness().getSelectedItem().toString();
        this.model.setEmpUnitID(Integer.parseInt(this.mapUnit.get(unit)[0].toString()));
        String nation = this.view.getCmbNational().getSelectedItem().toString();
        this.model.setEmpNationalityID(Integer.parseInt(this.mapNationality.get(nation)[0].toString()));
        String ethnic = this.view.getCmbEthnic().getSelectedItem().toString();
        this.model.setEmpEthnicID(Integer.parseInt(this.mapEthnic.get(ethnic)[0].toString()));
        String religion = this.view.getCmbReligion().getSelectedItem().toString();
        this.model.setEmpReligionID(Integer.parseInt(this.mapReligion.get(religion)[0].toString()));
        String position = this.view.getCmbTitle().getSelectedItem().toString();
        this.model.setEmpPositionID(Integer.parseInt(this.mapPosition.get(position)[0].toString()));
        this.model.setEmpLevel(Integer.parseInt(this.view.getCmbLevel().getSelectedItem().toString()));
        String manager = this.view.getCmbManager().getSelectedItem().toString();
        this.model.setEmpManagerID(Integer.parseInt(this.mapManager.get(manager)[0].toString()));
        this.model.setEmpSalaryPeriod(Integer.parseInt(this.view.getCmbSalaryPeriod().getSelectedItem().toString()));
        String workStatus = this.view.getCmbWorkStatus().getSelectedItem().toString();
        this.model.setEmpWorkStatusID(Integer.parseInt(this.mapWorkStatus.get(workStatus)[0].toString()));
        this.model.setEmpFullTime(this.view.getChFullTime().isSelected());
        this.model.setEmpCalculateSalary(this.view.getChCalculateSalary().isSelected());
        this.model.setEmpInOffice(this.view.getChInOffice().isSelected());
        this.model.setEmpConsultant(this.view.getChConsultant().isSelected());
        if (this.view.getTxtEmpID().getText().equals("New")) {
            if (this.model.insert() == true) {
                this.clear();
            } else {
                MessageBox.msgWarning();
            }
        } else {

        }
    }

    private void saveEmpSalary() {
        if (CheckField.comboBox(this.view.getCmbSalaryType()) == false) {
            return;
        }
        double salaryAmount = Double.parseDouble(this.view.getTxtSalaryAmount().getText().replace(",", ""));
        if (salaryAmount <= 0) {
            return;
        }
        String salaryType = this.view.getCmbSalaryType().getSelectedItem().toString();
        this.model.setSalaryTypeID(Integer.parseInt(mapSalaryType.get(salaryType)[0].toString()));
        this.model.setSalaryAmount(salaryAmount);
        this.model.setSalaryDeductionRate(Float.parseFloat(this.view.getTxtSalaryDeduction().getText()));
        this.model.setSalaryTax(this.view.getChSalaryTax().isSelected());
        this.model.setSalaryOvertime(this.view.getChSalaryOvertime().isSelected());
        this.model.setSalaryInsurance(this.view.getChSalaryInsurance().isSelected());
        if (this.view.getTxtEmpSalaryID().getText().equals("New")) {
            if (this.model.insertEmpSalary() == true) {
                this.clearSalarTab();
            } else {
                MessageBox.msgError();
            }
        } else {
            this.model.setEmpSalaryID(Integer.parseInt(this.view.getTxtEmpSalaryID().getText()));
            if (this.model.updateEmpSalary() == true) {
                this.clearSalarTab();
            } else {
                MessageBox.msgError();
            }
        }
        this.model.loadSalary(this.view.getTableSalary(), tableSalarModel);
        this.calculateSalary();
    }

    private void setInsuranceType() {
        try {
            mapInsuranceType = this.model.getInsuranceType();
            Map<String, Object[]> SortMap = new TreeMap<>(mapInsuranceType);
            this.view.getCmbInsurance().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbInsurance().addItem(s);
            });
            this.view.getCmbInsurance().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void clearInsurance() {
        this.view.getTxtInsurEmpID().setText("New");
        this.view.getTxtInsuranceNbr().setText("");
        this.view.getCmbInsurance().setSelectedIndex(-1);
        this.view.getTxtInsurMaxSalary().setText("0");
    }

    private void disableTableDetails() {
        this.view.getTabPaneDetails().setEnabledAt(0, true);
        this.view.getTabPaneDetails().setEnabledAt(1, false);
        this.view.getTabPaneDetails().setEnabledAt(2, false);
        this.view.getTabPaneDetails().setEnabledAt(3, false);
        this.view.getTabPaneDetails().setEnabledAt(4, false);
        this.view.getTabPaneDetails().setEnabledAt(5, false);
        this.view.getTabPaneDetails().setEnabledAt(6, false);
        this.view.getTabPaneDetails().setEnabledAt(7, false);
        this.view.getTabPaneDetails().setEnabledAt(8, false);
        this.view.getTabPaneDetails().setEnabledAt(9, false);
        this.view.getTabPaneDetails().setEnabledAt(10, false);
        this.view.getTabPaneDetails().setEnabledAt(11, false);
        this.view.getTabPaneDetails().setEnabledAt(12, false);
    }

    private void enableTableDetails() {
        this.view.getTabPaneDetails().setEnabledAt(0, true);
        this.view.getTabPaneDetails().setEnabledAt(1, true);
        this.view.getTabPaneDetails().setEnabledAt(2, true);
        this.view.getTabPaneDetails().setEnabledAt(3, true);
        this.view.getTabPaneDetails().setEnabledAt(4, true);
        this.view.getTabPaneDetails().setEnabledAt(5, true);
        this.view.getTabPaneDetails().setEnabledAt(6, true);
        this.view.getTabPaneDetails().setEnabledAt(7, true);
        this.view.getTabPaneDetails().setEnabledAt(8, true);
        this.view.getTabPaneDetails().setEnabledAt(9, true);
        this.view.getTabPaneDetails().setEnabledAt(10, true);
        this.view.getTabPaneDetails().setEnabledAt(11, true);
        this.view.getTabPaneDetails().setEnabledAt(12, true);
    }

    private void saveEmpCVDetails() {
        this.model.setEmpFacebook(this.view.getTxtFacebook().getText());
        this.model.setEmpPhone1(this.view.getTxtMobilePhone().getText());
        this.model.setEmpPhone2(this.view.getTxtTelephone().getText());
        this.model.setEmpBurn(this.view.getTxtPOD().getText());
        this.model.setEmpIDCard(this.view.getTxtIDCard().getText());
        this.model.setEmpFamilyNbr(this.view.getTxtFamilybook().getText());
        this.model.setEmpPassportNbr(this.view.getTxtPassportNo().getText());
        this.model.setEmpBloodGroup(this.view.getCmbBlood().getSelectedItem().toString());
        this.model.setEmpHeight(this.view.getTxtHight().getText());
        this.model.setEmpWeight(this.view.getTxtWeight().getText());
        this.model.setEmpDriverIDCard(this.view.getTxtDrivingNo().getText());
        this.model.setEmpCar(this.view.getChCar().isSelected());
        this.model.setEmpMotobile(this.view.getLblMotocycle().isSelected());
        this.model.setEmpHusbandName(this.view.getTxtHusband_Wife().getText());
        this.model.setEmpHusbandAge(Integer.parseInt(this.view.getTxtAge().getText()));
        this.model.setEmpHusbandCareer(this.view.getTxtOccupation().getText());
        this.model.setEmpHusbandWorkPlace(this.view.getTxtWorkPlace().getText());
        this.model.setEmpHusbandPhone(this.view.getTxtHusbandTelephone().getText());
        this.model.setEmpFatherName(this.view.getTxtFatherName().getText());
        this.model.setEmpFatherAge(Integer.parseInt(this.view.getTxtFatherAge().getText()));
        this.model.setEmpFatherCareer(this.view.getTxtFatherOccupation().getText());
        this.model.setEmpFatherWorkPlace(this.view.getTxtFatherWorkPlace().getText());
        this.model.setEmpFatherPhone(this.view.getTxtFatherTelephone().getText());
        this.model.setEmpMotherName(this.view.getTxtMotherName().getText());
        this.model.setEmpMotherAge(Integer.parseInt(this.view.getTxtMotherAge().getText()));
        this.model.setEmpMotherCareer(this.view.getTxtMotherOccupation().getText());
        this.model.setEmpMotherWorkPlace(this.view.getTxtMotherWorkPlace().getText());
        this.model.setEmpMotherrPhone(this.view.getTxtMotherTelephone().getText());
        this.model.setEmpEmpEmergency(this.view.getTxtEmergencyContact().getText());
        if (this.model.insertEmpDetails() == true) {
            this.view.getTabPaneDetails().setSelectedIndex(1);
        } else {
            MessageBox.msgError();
        }
    }
    
    private void setEmpCVDetails(){
        this.model.loadEmployeeDetails();
        this.view.getTxtFacebook().setText(this.model.getEmpFacebook());
        this.view.getTxtMobilePhone().setText(this.model.getEmpPhone1());
        this.view.getTxtTelephone().setText(this.model.getEmpPhone2());
        this.view.getTxtPOD().setText(this.model.getEmpBurn());
        this.view.getTxtIDCard().setText(this.model.getEmpIDCard());
        this.view.getTxtFamilybook().setText(this.model.getEmpFamilyNbr());
        this.view.getTxtPassportNo().setText(this.model.getEmpPassportNbr());
        this.view.getCmbBlood().setSelectedItem(this.model.getEmpBloodGroup());
        this.view.getTxtHight().setText(this.model.getEmpHeight());
        this.view.getTxtWeight().setText(this.model.getEmpWeight());
        this.view.getTxtDrivingNo().setText(this.model.getEmpDriverIDCard());
        this.view.getChCar().setSelected(this.model.isEmpCar());
        this.view.getLblMotocycle().setSelected(this.model.isEmpMotobile());
        this.view.getTxtHusband_Wife().setText(this.model.getEmpHusbandName());
        this.view.getTxtAge().setText(String.valueOf(this.model.getEmpHusbandAge()));
        this.view.getTxtOccupation().setText(this.model.getEmpHusbandCareer());
        this.view.getTxtWorkPlace().setText(this.model.getEmpHusbandWorkPlace());
        this.view.getTxtHusbandTelephone().setText(this.model.getEmpHusbandPhone());
        this.view.getTxtFatherName().setText(this.model.getEmpFatherName());
        this.view.getTxtFatherAge().setText(String.valueOf(this.model.getEmpFatherAge()));
        this.view.getTxtFatherOccupation().setText(this.model.getEmpFatherCareer());
        this.view.getTxtFatherWorkPlace().setText(this.model.getEmpFatherWorkPlace());
        this.view.getTxtFatherTelephone().setText(this.model.getEmpFatherPhone());
        this.view.getTxtMotherName().setText(this.model.getEmpMotherName());
        this.view.getTxtMotherAge().setText(String.valueOf(this.model.getEmpMotherAge()));
        this.view.getTxtMotherOccupation().setText(this.model.getEmpMotherCareer());
        this.view.getTxtMotherWorkPlace().setText(this.model.getEmpMotherWorkPlace());
        this.view.getTxtMotherTelephone().setText(this.model.getEmpMotherrPhone());
        this.view.getTxtEmergencyContact().setText(this.model.getEmpEmpEmergency());
    }
    
    private void clearEmpCVDetails(){
        this.view.getTxtFacebook().setText("");
        this.view.getTxtMobilePhone().setText("");
        this.view.getTxtTelephone().setText("");
        this.view.getTxtPOD().setText("");
        this.view.getTxtIDCard().setText("");
        this.view.getTxtFamilybook().setText("");
        this.view.getTxtPassportNo().setText("");
        this.view.getCmbBlood().setSelectedIndex(-1);
        this.view.getTxtHight().setText("");
        this.view.getTxtWeight().setText("");
        this.view.getTxtDrivingNo().setText("");
        this.view.getChCar().setSelected(false);
        this.view.getLblMotocycle().setSelected(false);
        this.view.getTxtHusband_Wife().setText("");
        this.view.getTxtAge().setText("0");
        this.view.getTxtOccupation().setText("");
        this.view.getTxtWorkPlace().setText("");
        this.view.getTxtHusbandTelephone().setText("");
        this.view.getTxtFatherName().setText("");
        this.view.getTxtFatherAge().setText("0");
        this.view.getTxtFatherOccupation().setText("");
        this.view.getTxtFatherWorkPlace().setText("");
        this.view.getTxtFatherTelephone().setText("");
        this.view.getTxtMotherName().setText("");
        this.view.getTxtMotherAge().setText("0");
        this.view.getTxtMotherOccupation().setText("");
        this.view.getTxtMotherWorkPlace().setText("");
        this.view.getTxtMotherTelephone().setText("");
        this.view.getTxtEmergencyContact().setText("");
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
        } else if (e.getSource() == this.view.getCmbDivision()) {
            if (this.view.getCmbDivision().getSelectedIndex() != -1) {
                String division = this.view.getCmbDivision().getSelectedItem().toString();
                this.model.setEmpDivisionID(Integer.parseInt(mapDivision.get(division)[0].toString()));
                this.setLocationCombo();
            }
        } else if (e.getSource() == this.view.getCmbLocation()) {
            if (this.view.getCmbLocation().getSelectedIndex() != -1) {
                String loc = this.view.getCmbLocation().getSelectedItem().toString();
                this.model.setEmpLocationID(Integer.parseInt(mapLocation.get(loc)[0].toString()));
                this.setDepartmentCombo();
                this.setManagerCombo();
            }
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.saveEmp();
            this.enableTableDetails();
        } else if (e.getSource() == this.view.getBtnSaveSalary()) {
            this.saveEmpSalary();
        } else if (e.getSource() == this.view.getBtnSaveTax()) {
            this.model.setEmpTaxCol(this.view.getChStandardTax().isSelected());
            if (this.view.getChStandardTax().isSelected() == true) {
                this.model.updateEmpTaxColumn();
                this.model.insertEmpStandardTax();
                this.loadTaxTable();
            } else {
                String taxType = this.view.getCmbTaxCustomize().getSelectedItem().toString();
                this.model.setTaxTypeID(Integer.parseInt(mapTax.get(taxType)[0].toString()));
                this.model.updateEmpTaxColumn();
                this.model.insertEmpCustomizeTax();
                this.loadTaxTable();
            }
        } else if (e.getSource() == this.view.getChStandardTax()) {
            if (this.view.getChStandardTax().isSelected() == true) {
                this.view.getCmbTaxCustomize().setEnabled(false);
                this.view.getCmbTaxCustomize().setSelectedIndex(-1);
            } else {
                this.view.getCmbTaxCustomize().setEnabled(true);
            }
        } else if (e.getSource() == this.view.getBtnDeleteTax()) {
            this.model.deleteEmpTax();
            this.loadTaxTable();
        } else if (e.getSource() == this.view.getBtnSaveInsurance()) {
            String insurType = this.view.getCmbInsurance().getSelectedItem().toString();
            this.model.setInsurTypeID(Integer.parseInt(this.mapInsuranceType.get(insurType)[0].toString()));
            this.model.setInsurNbr(this.view.getTxtInsuranceNbr().getText());
            this.model.setInsurMaxSalary(Double.parseDouble(this.view.getTxtInsurMaxSalary().getText().replace(",", "")));
            if (this.view.getTxtInsurEmpID().getText().equals("New")) {
                if (this.model.insertEmpInsurance() == true) {
                    this.model.loadEmpInsurance(this.view.getTableInsurance(), tableInsurModel);
                    this.clearInsurance();
                } else {
                    MessageBox.msgError();
                }
            } else {
                this.model.setInsurEmpID(Integer.parseInt(this.view.getTxtInsurEmpID().getText()));
                if (this.model.updateEmpInsurance() == true) {
                    this.model.loadEmpInsurance(this.view.getTableInsurance(), tableInsurModel);
                    this.clearInsurance();
                } else {
                    MessageBox.msgError();
                }
            }
        } else if (e.getSource() == this.view.getBtnDeleteInsurance()) {
            this.model.setInsurEmpID(Integer.parseInt(this.view.getTxtInsurEmpID().getText()));
            if (this.model.deleteEmpInsurance() == true) {
                this.model.loadEmpInsurance(this.view.getTableInsurance(), tableInsurModel);
                this.clearInsurance();
            } else {
                MessageBox.msgError();
            }
        } else if (e.getSource() == this.view.getBtnSaveCV()) {
            this.saveEmpCVDetails();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTabPane()) {
            if (this.view.getTabPane().getSelectedIndex() == 0) {

            } else if (this.view.getTabPane().getSelectedIndex() == 1) {
                this.disableTableDetails();
                this.setGenderCombo();
                this.setStatusCombo();
                this.setDivisionCombo();
                this.setUnitCombo();
                this.setNationalityCombo();
                this.setEthnicCombo();
                this.setReligionCombo();
                this.setPositionCombo();
                this.setWorkStatusCombo();
                this.clear();
                this.clearEmpCVDetails();
                this.view.getTabPaneDetails().setSelectedIndex(0);
            }
        } else if (e.getSource() == this.view.getLblImage()) {
            if (e.getClickCount() == 2) {
                JFileChooser choose = new JFileChooser();
                choose.showOpenDialog(null);
                File f = choose.getSelectedFile();
                if (f != null) {
                    this.model.setEmpPicturePath(choose.getSelectedFile().getAbsolutePath());
                    Image img = new ImageIcon(this.model.getEmpPicturePath()).getImage();
                    Image ic = ResizeImage.resizeImage(img, this.view.getLblImage().getWidth(), this.view.getLblImage().getHeight());
                    this.view.getLblImage().setText("");
                    this.view.getLblImage().setIcon(new ImageIcon(ic));
                }
            }
        } else if (e.getSource() == this.view.getTableEmpList()) {
            if (e.getClickCount() == 2) {
                this.enableTableDetails();
                this.view.getTabPane().setSelectedIndex(1);
                this.view.getTabPaneDetails().setSelectedIndex(0);
                this.setGenderCombo();
                this.setStatusCombo();
                this.setDivisionCombo();
                this.setUnitCombo();
                this.setNationalityCombo();
                this.setEthnicCombo();
                this.setReligionCombo();
                this.setPositionCombo();
                this.setWorkStatusCombo();
                this.clear();
                this.clearEmpCVDetails();
                this.setemployeeDetails();
                this.setEmpCVDetails();
                this.clearSalarTab();
                this.model.loadSalary(this.view.getTableSalary(), tableSalarModel);
                this.calculateSalary();
            }
        } else if (e.getSource() == this.view.getTabPaneDetails()) {
            switch (this.view.getTabPaneDetails().getSelectedIndex()) {
                case 0:
                    this.clearEmpCVDetails();
                    this.setEmpCVDetails();
                    break;
                case 2:
                    this.setSalaryType();
                    this.model.loadSalary(this.view.getTableSalary(), tableSalarModel);
                    clearSalarTab();
                    this.loadTaxTable();
                    this.calculateSalary();
                    break;
                case 3:
                    this.setInsuranceType();
                    this.model.loadEmpInsurance(this.view.getTableInsurance(), tableInsurModel);
                    break;
                case 4:
                    this.setTaxCombo();
                    this.loadTaxTable();
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == this.view.getTableSalary()) {
            int rowSelect = this.view.getTableSalary().getSelectedRow();
            this.view.getTxtEmpSalaryID().setText(this.view.getTableSalary().getValueAt(rowSelect, 0).toString());
            this.view.getCmbSalaryType().setSelectedItem(this.view.getTableSalary().getValueAt(rowSelect, 1).toString());
            this.view.getTxtSalaryAmount().setText(this.view.getTableSalary().getValueAt(rowSelect, 2).toString());
            this.view.getChSalaryTax().setSelected((Boolean) this.view.getTableSalary().getValueAt(rowSelect, 3));
            this.view.getChSalaryOvertime().setSelected((Boolean) this.view.getTableSalary().getValueAt(rowSelect, 4));
            this.view.getTxtSalaryDeduction().setText(String.format("%,.0f", Double.parseDouble(this.view.getTableSalary().getValueAt(rowSelect, 5).toString())));
            this.view.getChSalaryInsurance().setSelected((Boolean) this.view.getTableSalary().getValueAt(rowSelect, 7));
        } else if (e.getSource() == this.view.getTableInsurance()) {
            int rowSelc = this.view.getTableInsurance().getSelectedRow();
            this.view.getTxtInsurEmpID().setText(this.view.getTableInsurance().getValueAt(rowSelc, 0).toString());
            this.view.getCmbInsurance().setSelectedItem(this.view.getTableInsurance().getValueAt(rowSelc, 2).toString());
            this.view.getTxtInsuranceNbr().setText(this.view.getTableInsurance().getValueAt(rowSelc, 3).toString());
            this.view.getTxtInsurMaxSalary().setText(this.view.getTableInsurance().getValueAt(rowSelc, 4).toString());
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
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(false);
            this.view.getPanelSave().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveCV()) {
            this.view.getPanelSaveCVHover().setVisible(false);
            this.view.getPanelSaveCV().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveSalary()) {
            this.view.getPanelSaveSalaryHover().setVisible(false);
            this.view.getPanelSaveSalary().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveTax()) {
            this.view.getPanelSaveTaxHover().setVisible(false);
            this.view.getPanelSaveTax().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteTax()) {
            this.view.getPanelDeleteTaxHover().setVisible(false);
            this.view.getPanelDeleteTax().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteInsurance()) {
            this.view.getPanelDeleteInsurHover().setVisible(false);
            this.view.getPanelDeleteInsur().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveInsurance()) {
            this.view.getPanelSaveInsurHover().setVisible(false);
            this.view.getPanelSaveInsur().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSaveCV()) {
            this.view.getPanelSaveCVHover().setVisible(true);
            this.view.getPanelSaveCV().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSaveSalary()) {
            this.view.getPanelSaveSalaryHover().setVisible(true);
            this.view.getPanelSaveSalary().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSaveTax()) {
            this.view.getPanelSaveTaxHover().setVisible(true);
            this.view.getPanelSaveTax().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteTax()) {
            this.view.getPanelDeleteTaxHover().setVisible(true);
            this.view.getPanelDeleteTax().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteInsurance()) {
            this.view.getPanelDeleteInsurHover().setVisible(true);
            this.view.getPanelDeleteInsur().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSaveInsurance()) {
            this.view.getPanelSaveInsurHover().setVisible(true);
            this.view.getPanelSaveInsur().setVisible(false);
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
        if (e.getSource() == this.view.getTableSalary()) {
            if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                int rowSel = this.view.getTableSalary().getSelectedRow();
                this.model.setEmpSalaryID(Integer.parseInt(this.view.getTableSalary().getValueAt(rowSel, 0).toString()));
                this.model.delete();
                this.model.loadSalary(this.view.getTableSalary(), tableSalarModel);
                clearSalarTab();
                this.calculateSalary();
            }
        }
    }
}
