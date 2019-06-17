package com.malimar.views;

import com.malimar.controllers.EmployeeDetailsController;
import com.toedter.calendar.JDateChooser;
import com.xzq.osc.JocHyperlink;
import com.xzq.osc.JocTabbedPane;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

public class FrmEmployeeDetails extends javax.swing.JDialog {

    public FrmEmployeeDetails(java.awt.Frame parent, boolean modal, int emid) {
        super(parent, modal);
        initComponents();
        EmployeeDetailsController edc = new EmployeeDetailsController(this, emid);
    }

    public JTextField getTxtTotalTax() {
        return txtTotalTax;
    }

    public JTextField getTxtInsuranceNbr() {
        return txtInsuranceNbr;
    }

    public JTextField getTxtInsurEmpID() {
        return txtInsurEmpID;
    }

    public JTextField getTxtInsurMaxSalary() {
        return txtInsurMaxSalary;
    }

    public JTextField getTxtTotalInsurance() {
        return txtTotalInsurance;
    }

    public JTextField getTxtNetSalary() {
        return txtNetSalary;
    }

    public JocHyperlink getBtnDeleteTax() {
        return btnDeleteTax;
    }

    public JocHyperlink getPanelDeleteTax() {
        return panelDeleteTax;
    }

    public JocHyperlink getPanelDeleteTaxHover() {
        return panelDeleteTaxHover;
    }

    public JocHyperlink getBtnSaveTax() {
        return btnSaveTax;
    }

    public JCheckBox getChStandardTax() {
        return chStandardTax;
    }

    public JComboBox<String> getCmbTaxCustomize() {
        return cmbTaxCustomize;
    }

    public JocHyperlink getPanelSaveTax() {
        return panelSaveTax;
    }

    public JLabel getLblTaxCustomize() {
        return lblTaxCustomize;
    }

    public JLabel getLblTaxStandard() {
        return lblTaxStandard;
    }

    public JLabel getLblKip() {
        return lblKip;
    }

    public JLabel getLblExcludeTax() {
        return lblExcludeTax;
    }

    public JLabel getLblNetSalary() {
        return lblNetSalary;
    }

    public JLabel getLblOvertimePerDay() {
        return lblOvertimePerDay;
    }

    public JLabel getLblOvertimePerHous() {
        return lblOvertimePerHous;
    }

    public JLabel getLblSalaryAmount() {
        return lblSalaryAmount;
    }

    public JLabel getLblSalaryDeduction() {
        return lblSalaryDeduction;
    }

    public JLabel getLblSalaryInsurance() {
        return lblSalaryInsurance;
    }

    public JLabel getLblSalaryOvertime() {
        return lblSalaryOvertime;
    }

    public JLabel getLblSalaryPerDay() {
        return lblSalaryPerDay;
    }

    public JLabel getLblSalaryPerHours() {
        return lblSalaryPerHours;
    }

    public JLabel getLblSalaryTax() {
        return lblSalaryTax;
    }

    public JLabel getLblSalaryType() {
        return lblSalaryType;
    }

    public JLabel getLblTaxSalary() {
        return lblTaxSalary;
    }

    public JLabel getLblTotalSalary() {
        return lblTotalSalary;
    }

    public JLabel getLblInsuranceMaxSalary() {
        return lblInsuranceMaxSalary;
    }

    public JLabel getLblInsuranceNbr() {
        return lblInsuranceNbr;
    }

    public JLabel getLblInsuranceType() {
        return lblInsuranceType;
    }

    public JocHyperlink getPanelSaveTaxHover() {
        return panelSaveTaxHover;
    }

    public JTextField getTxtEmpID() {
        return txtEmpID;
    }

    public JocTabbedPane getTabPaneDetails() {
        return tabPaneDetails;
    }

    public JLabel getLblDivision() {
        return lblDivision;
    }

    public JComboBox<String> getCmbDivision() {
        return cmbDivision;
    }

    public JLabel getLblEmployeeInfo() {
        return lblEmployeeInfo;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public JocHyperlink getBtnSaveCV() {
        return btnSaveCV;
    }

    public JCheckBox getChCalculateSalary() {
        return chCalculateSalary;
    }

    public JCheckBox getChCar() {
        return chCar;
    }

    public JCheckBox getChConsultant() {
        return chConsultant;
    }

    public JCheckBox getChFullTime() {
        return chFullTime;
    }

    public JCheckBox getChInOffice() {
        return chInOffice;
    }

    public JComboBox<String> getCmbBlood() {
        return cmbBlood;
    }

    public JComboBox<String> getCmbBusiness() {
        return cmbBusiness;
    }

    public JComboBox<String> getCmbDepartment() {
        return cmbDepartment;
    }

    public JComboBox<String> getCmbEmpStatus() {
        return cmbEmpStatus;
    }

    public JComboBox<String> getCmbEthnic() {
        return cmbEthnic;
    }

    public JComboBox<String> getCmbGender() {
        return cmbGender;
    }

    public JComboBox<String> getCmbInsurance() {
        return cmbInsurance;
    }

    public JComboBox<String> getCmbLevel() {
        return cmbLevel;
    }

    public JComboBox<String> getCmbLocation() {
        return cmbLocation;
    }

    public JComboBox<String> getCmbManager() {
        return cmbManager;
    }

    public JComboBox<String> getCmbNational() {
        return cmbNational;
    }

    public JComboBox<String> getCmbReligion() {
        return cmbReligion;
    }

    public JComboBox<String> getCmbSalaryPeriod() {
        return cmbSalaryPeriod;
    }

    public JComboBox<String> getCmbSalaryType() {
        return cmbSalaryType;
    }

    public JComboBox<String> getCmbTitle() {
        return cmbTitle;
    }

    public JComboBox<String> getCmbWorkStatus() {
        return cmbWorkStatus;
    }

    public JLabel getLblAge() {
        return lblAge;
    }

    public JLabel getLblBloodGroup() {
        return lblBloodGroup;
    }

    public JLabel getLblBusinessUnit() {
        return lblBusinessUnit;
    }

    public JLabel getLblDOB() {
        return lblDOB;
    }

    public JLabel getLblDepartment() {
        return lblDepartment;
    }

    public JLabel getLblDrivingNo() {
        return lblDrivingNo;
    }

    public JLabel getLblEmergencyContact() {
        return lblEmergencyContact;
    }

    public JLabel getLblEmpEmail() {
        return lblEmpEmail;
    }

    public JLabel getLblEmpID() {
        return lblEmpID;
    }

    public JLabel getLblEmpName_L1() {
        return lblEmpName_L1;
    }

    public JLabel getLblEmpName_L2() {
        return lblEmpName_L2;
    }

    public JLabel getLblEmpNickname() {
        return lblEmpNickname;
    }

    public JLabel getLblEmpStatus() {
        return lblEmpStatus;
    }

    public JLabel getLblEndDate() {
        return lblEndDate;
    }

    public JLabel getLblEthnic() {
        return lblEthnic;
    }

    public JLabel getLblFacebook() {
        return lblFacebook;
    }

    public JLabel getLblFamilyBook() {
        return lblFamilyBook;
    }

    public JLabel getLblFatherAge() {
        return lblFatherAge;
    }

    public JLabel getLblFatherName() {
        return lblFatherName;
    }

    public JLabel getLblFatherOccupation() {
        return lblFatherOccupation;
    }

    public JLabel getLblFatherTelephone() {
        return lblFatherTelephone;
    }

    public JLabel getLblFatherWorkPlace() {
        return lblFatherWorkPlace;
    }

    public JLabel getLblGender() {
        return lblGender;
    }

    public JLabel getLblHight() {
        return lblHight;
    }

    public JLabel getLblHubandTelephone() {
        return lblHubandTelephone;
    }

    public JLabel getLblHusband_Wife() {
        return lblHusband_Wife;
    }

    public JLabel getLblIDCard() {
        return lblIDCard;
    }

    public JLabel getLblImage() {
        return lblImage;
    }

    public JLabel getLblInsurance() {
        return lblInsuranceType;
    }

    public JLabel getLblLevel() {
        return lblLevel;
    }

    public JLabel getLblLocation() {
        return lblLocation;
    }

    public JLabel getLblManager() {
        return lblManager;
    }

    public JLabel getLblMobilePhone() {
        return lblMobilePhone;
    }

    public JLabel getLblMotherAge() {
        return lblMotherAge;
    }

    public JLabel getLblMotherName() {
        return lblMotherName;
    }

    public JLabel getLblMotherOccupation() {
        return lblMotherOccupation;
    }

    public JLabel getLblMotherTelephone() {
        return lblMotherTelephone;
    }

    public JLabel getLblMotherWorkPlace() {
        return lblMotherWorkPlace;
    }

    public JCheckBox getLblMotocycle() {
        return lblMotocycle;
    }

    public JLabel getLblNationality() {
        return lblNationality;
    }

    public JLabel getLblOccupation() {
        return lblOccupation;
    }

    public JLabel getLblPOB() {
        return lblPOB;
    }

    public JLabel getLblPassportNo() {
        return lblPassportNo;
    }

    public JLabel getLblReligion() {
        return lblReligion;
    }

    public JLabel getLblSalaryPeriod() {
        return lblSalaryPeriod;
    }

    public JLabel getLblStartDate() {
        return lblStartDate;
    }

    public JLabel getLblTelephone() {
        return lblTelephone;
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public JLabel getLblWeight() {
        return lblWeight;
    }

    public JLabel getLblWorkPlace() {
        return lblWorkPlace;
    }

    public JLabel getLblWorkStatus() {
        return lblWorkStatus;
    }

    public JocHyperlink getPanelHover() {
        return panelHover;
    }

    public JocHyperlink getPanelSave() {
        return panelSave;
    }

    public JocHyperlink getPanelSaveCV() {
        return panelSaveCV;
    }

    public JocHyperlink getPanelSaveCVHover() {
        return panelSaveCVHover;
    }

    public JTextField getTxtAge() {
        return txtAge;
    }

    public JDateChooser getTxtDOB() {
        return txtDOB;
    }

    public JTextField getTxtDrivingNo() {
        return txtDrivingNo;
    }

    public JTextField getTxtEmergencyContact() {
        return txtEmergencyContact;
    }

    public JTextField getTxtEmpNbr() {
        return txtEmpNbr;
    }

    public JTextField getTxtEmpMail() {
        return txtEmpMail;
    }

    public JTextField getTxtEmpName_L1() {
        return txtEmpName_L1;
    }

    public JTextField getTxtEmpName_L2() {
        return txtEmpName_L2;
    }

    public JTextField getTxtEmpNickname() {
        return txtEmpNickname;
    }

    public JDateChooser getTxtEndDate() {
        return txtEndDate;
    }

    public JTextField getTxtFacebook() {
        return txtFacebook;
    }

    public JTextField getTxtFamilybook() {
        return txtFamilybook;
    }

    public JTextField getTxtFatherAge() {
        return txtFatherAge;
    }

    public JTextField getTxtFatherName() {
        return txtFatherName;
    }

    public JTextField getTxtFatherOccupation() {
        return txtFatherOccupation;
    }

    public JTextField getTxtFatherTelephone() {
        return txtFatherTelephone;
    }

    public JTextField getTxtFatherWorkPlace() {
        return txtFatherWorkPlace;
    }

    public JTextField getTxtHight() {
        return txtHight;
    }

    public JTextField getTxtHusbandTelephone() {
        return txtHusbandTelephone;
    }

    public JTextField getTxtHusband_Wife() {
        return txtHusband_Wife;
    }

    public JTextField getTxtIDCard() {
        return txtIDCard;
    }

    public JTextField getTxtMobilePhone() {
        return txtMobilePhone;
    }

    public JTextField getTxtMotherAge() {
        return txtMotherAge;
    }

    public JTextField getTxtMotherName() {
        return txtMotherName;
    }

    public JTextField getTxtMotherOccupation() {
        return txtMotherOccupation;
    }

    public JTextField getTxtMotherTelephone() {
        return txtMotherTelephone;
    }

    public JTextField getTxtMotherWorkPlace() {
        return txtMotherWorkPlace;
    }

    public JTextField getTxtOccupation() {
        return txtOccupation;
    }

    public JTextField getTxtPOD() {
        return txtPOD;
    }

    public JTextField getTxtPassportNo() {
        return txtPassportNo;
    }

    public JDateChooser getTxtStartDate() {
        return txtStartDate;
    }

    public JTextField getTxtTelephone() {
        return txtTelephone;
    }

    public JTextField getTxtWeight() {
        return txtWeight;
    }

    public JTextField getTxtWorkPlace() {
        return txtWorkPlace;
    }

    public JCheckBox getChSalaryInsurance() {
        return chSalaryInsurance;
    }

    public JCheckBox getChSalaryOvertime() {
        return chSalaryOvertime;
    }

    public JCheckBox getChSalaryTax() {
        return chSalaryTax;
    }

    public JTable getTableSalary() {
        return tableSalary;
    }

    public JTextField getTxtExcludeTax() {
        return txtExcludeTax;
    }

    public JTextField getTxtIncludeTax() {
        return txtIncludeTax;
    }

    public JTextField getTxtOvertimeRateDay() {
        return txtOvertimeRateDay;
    }

    public JTextField getTxtOvertimeRateHour() {
        return txtOvertimeRateHour;
    }

    public JTextField getTxtOvertimeTotal() {
        return txtOvertimeTotal;
    }

    public JTextField getTxtSalaryAmount() {
        return txtSalaryAmount;
    }

    public JTextField getTxtSalaryDeduction() {
        return txtSalaryDeduction;
    }

    public JocHyperlink getBtnDeleteInsurance() {
        return btnDeleteInsurance;
    }

    public JocHyperlink getBtnSaveInsurance() {
        return btnSaveInsurance;
    }

    public JocHyperlink getPanelDeleteInsur() {
        return panelDeleteInsur;
    }

    public JocHyperlink getPanelDeleteInsurHover() {
        return panelDeleteInsurHover;
    }

    public JocHyperlink getPanelSaveInsur() {
        return panelSaveInsur;
    }

    public JocHyperlink getPanelSaveInsurHover() {
        return panelSaveInsurHover;
    }

    public JTable getTableInsurance() {
        return tableInsurance;
    }

    public JScrollPane getTableInsuranceScrollPane() {
        return tableInsuranceScrollPane;
    }

    public JTextField getTxtSalaryRateDay() {
        return txtSalaryRateDay;
    }

    public JTextField getTxtSalaryRateHour() {
        return txtSalaryRateHour;
    }

    public JTextField getTxtSalaryTotal() {
        return txtSalaryTotal;
    }

    public JScrollPane getScrollPanelTax() {
        return scrollPanelTax;
    }

    public JTable getTableTax() {
        return tableTax;
    }

    public JTextField getTxtEmpSalaryID() {
        return txtEmpSalaryID;
    }

    public JScrollPane getScrollPaneSalary() {
        return scrollPaneSalary;
    }

    public JocHyperlink getBtnSaveSalary() {
        return btnSaveSalary;
    }

    public JocHyperlink getPanelSaveSalary() {
        return panelSaveSalary;
    }

    public JocHyperlink getPanelSaveSalaryHover() {
        return panelSaveSalaryHover;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        txtEmpNbr = new javax.swing.JTextField();
        lblEmpID = new javax.swing.JLabel();
        lblEmpEmail = new javax.swing.JLabel();
        txtEmpMail = new javax.swing.JTextField();
        lblEmpName_L1 = new javax.swing.JLabel();
        txtEmpName_L1 = new javax.swing.JTextField();
        lblEmpName_L2 = new javax.swing.JLabel();
        txtEmpName_L2 = new javax.swing.JTextField();
        lblEmpNickname = new javax.swing.JLabel();
        txtEmpNickname = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        lblGender = new javax.swing.JLabel();
        txtDOB = new com.toedter.calendar.JDateChooser();
        lblEmpStatus = new javax.swing.JLabel();
        cmbEmpStatus = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        cmbNational = new javax.swing.JComboBox<>();
        lblNationality = new javax.swing.JLabel();
        lblEthnic = new javax.swing.JLabel();
        cmbEthnic = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        lblReligion = new javax.swing.JLabel();
        cmbReligion = new javax.swing.JComboBox<>();
        jSeparator11 = new javax.swing.JSeparator();
        lblManager = new javax.swing.JLabel();
        cmbManager = new javax.swing.JComboBox<>();
        jSeparator12 = new javax.swing.JSeparator();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        lblEndDate = new javax.swing.JLabel();
        txtEndDate = new com.toedter.calendar.JDateChooser();
        lblLocation = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        jSeparator13 = new javax.swing.JSeparator();
        lblDepartment = new javax.swing.JLabel();
        lblBusinessUnit = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        cmbBusiness = new javax.swing.JComboBox<>();
        cmbTitle = new javax.swing.JComboBox<>();
        jSeparator16 = new javax.swing.JSeparator();
        lblLevel = new javax.swing.JLabel();
        cmbLevel = new javax.swing.JComboBox<>();
        jSeparator17 = new javax.swing.JSeparator();
        lblWorkStatus = new javax.swing.JLabel();
        cmbWorkStatus = new javax.swing.JComboBox<>();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        lblSalaryPeriod = new javax.swing.JLabel();
        cmbSalaryPeriod = new javax.swing.JComboBox<>();
        tabPaneDetails = new com.xzq.osc.JocTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        lblPOB = new javax.swing.JLabel();
        txtPOD = new javax.swing.JTextField();
        lblIDCard = new javax.swing.JLabel();
        txtIDCard = new javax.swing.JTextField();
        lblFamilyBook = new javax.swing.JLabel();
        txtFamilybook = new javax.swing.JTextField();
        lblPassportNo = new javax.swing.JLabel();
        txtPassportNo = new javax.swing.JTextField();
        lblBloodGroup = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        cmbBlood = new javax.swing.JComboBox<>();
        lblHight = new javax.swing.JLabel();
        txtHight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        lblDrivingNo = new javax.swing.JLabel();
        txtDrivingNo = new javax.swing.JTextField();
        lblMotocycle = new javax.swing.JCheckBox();
        txtHusband_Wife = new javax.swing.JTextField();
        lblHusband_Wife = new javax.swing.JLabel();
        chCar = new javax.swing.JCheckBox();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblOccupation = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        lblWorkPlace = new javax.swing.JLabel();
        txtWorkPlace = new javax.swing.JTextField();
        txtHusbandTelephone = new javax.swing.JTextField();
        lblHubandTelephone = new javax.swing.JLabel();
        txtFatherTelephone = new javax.swing.JTextField();
        lblFatherTelephone = new javax.swing.JLabel();
        lblFatherWorkPlace = new javax.swing.JLabel();
        txtFatherWorkPlace = new javax.swing.JTextField();
        txtFatherOccupation = new javax.swing.JTextField();
        lblFatherOccupation = new javax.swing.JLabel();
        lblFatherName = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        txtFatherAge = new javax.swing.JTextField();
        lblFatherAge = new javax.swing.JLabel();
        lblMotherName = new javax.swing.JLabel();
        txtMotherTelephone = new javax.swing.JTextField();
        lblMotherTelephone = new javax.swing.JLabel();
        lblMotherWorkPlace = new javax.swing.JLabel();
        txtMotherWorkPlace = new javax.swing.JTextField();
        txtMotherOccupation = new javax.swing.JTextField();
        lblMotherOccupation = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        lblMotherAge = new javax.swing.JLabel();
        txtMotherAge = new javax.swing.JTextField();
        lblFacebook = new javax.swing.JLabel();
        txtFacebook = new javax.swing.JTextField();
        lblMobilePhone = new javax.swing.JLabel();
        txtMobilePhone = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        lblEmergencyContact = new javax.swing.JLabel();
        txtEmergencyContact = new javax.swing.JTextField();
        btnSaveCV = new com.xzq.osc.JocHyperlink();
        panelSaveCV = new com.xzq.osc.JocHyperlink();
        panelSaveCVHover = new com.xzq.osc.JocHyperlink();
        jPanel9 = new javax.swing.JPanel();
        lblAddress2 = new javax.swing.JLabel();
        txtAddress1_L1 = new javax.swing.JTextField();
        lblAddress1_L2 = new javax.swing.JLabel();
        txtAddress1_L2 = new javax.swing.JTextField();
        lblDistrict1 = new javax.swing.JLabel();
        cmbDistrict1 = new javax.swing.JComboBox<>();
        jSeparator22 = new javax.swing.JSeparator();
        lblProvince1 = new javax.swing.JLabel();
        cmbProvince1 = new javax.swing.JComboBox<>();
        jSeparator23 = new javax.swing.JSeparator();
        lblAddress2_L1 = new javax.swing.JLabel();
        txtAddress2_L1 = new javax.swing.JTextField();
        lblAddress2_L2 = new javax.swing.JLabel();
        txtAddress2_L2 = new javax.swing.JTextField();
        lblDistrict2 = new javax.swing.JLabel();
        cmbDistrict2 = new javax.swing.JComboBox<>();
        jSeparator24 = new javax.swing.JSeparator();
        lblProvince2 = new javax.swing.JLabel();
        cmbProvince2 = new javax.swing.JComboBox<>();
        jSeparator25 = new javax.swing.JSeparator();
        lblAddress1_L1 = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        btnSaveAddress = new com.xzq.osc.JocHyperlink();
        panelSaveAddress = new com.xzq.osc.JocHyperlink();
        panelSaveAddressHover = new com.xzq.osc.JocHyperlink();
        jPanel10 = new javax.swing.JPanel();
        lblSalaryType = new javax.swing.JLabel();
        cmbSalaryType = new javax.swing.JComboBox<>();
        jSeparator26 = new javax.swing.JSeparator();
        lblID27 = new javax.swing.JLabel();
        txtSalaryAmount = new javax.swing.JTextField();
        lblSalaryDeduction = new javax.swing.JLabel();
        txtSalaryDeduction = new javax.swing.JTextField();
        chSalaryInsurance = new javax.swing.JCheckBox();
        chSalaryTax = new javax.swing.JCheckBox();
        chSalaryOvertime = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        scrollPaneSalary = new javax.swing.JScrollPane();
        tableSalary = new javax.swing.JTable();
        lblSalaryAmount = new javax.swing.JLabel();
        lblKip = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        txtSalaryTotal = new javax.swing.JTextField();
        lblTotalSalary = new javax.swing.JLabel();
        lblTaxSalary = new javax.swing.JLabel();
        txtIncludeTax = new javax.swing.JTextField();
        lblExcludeTax = new javax.swing.JLabel();
        txtExcludeTax = new javax.swing.JTextField();
        lblSalaryPerDay = new javax.swing.JLabel();
        txtSalaryRateDay = new javax.swing.JTextField();
        lblSalaryPerHours = new javax.swing.JLabel();
        txtSalaryRateHour = new javax.swing.JTextField();
        lblSalaryOvertime = new javax.swing.JLabel();
        txtOvertimeTotal = new javax.swing.JTextField();
        lblOvertimePerDay = new javax.swing.JLabel();
        txtOvertimeRateDay = new javax.swing.JTextField();
        lblOvertimePerHous = new javax.swing.JLabel();
        txtOvertimeRateHour = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        lblSalaryInsurance = new javax.swing.JLabel();
        txtTotalInsurance = new javax.swing.JTextField();
        lblSalaryTax = new javax.swing.JLabel();
        txtTotalTax = new javax.swing.JTextField();
        lblNetSalary = new javax.swing.JLabel();
        txtNetSalary = new javax.swing.JTextField();
        btnSaveSalary = new com.xzq.osc.JocHyperlink();
        panelSaveSalary = new com.xzq.osc.JocHyperlink();
        panelSaveSalaryHover = new com.xzq.osc.JocHyperlink();
        txtEmpSalaryID = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        lblInsuranceType = new javax.swing.JLabel();
        cmbInsurance = new javax.swing.JComboBox<>();
        jSeparator20 = new javax.swing.JSeparator();
        txtInsurEmpID = new javax.swing.JTextField();
        lblInsuranceNbr = new javax.swing.JLabel();
        txtInsuranceNbr = new javax.swing.JTextField();
        btnSaveInsurance = new com.xzq.osc.JocHyperlink();
        panelSaveInsur = new com.xzq.osc.JocHyperlink();
        panelSaveInsurHover = new com.xzq.osc.JocHyperlink();
        btnDeleteInsurance = new com.xzq.osc.JocHyperlink();
        panelDeleteInsur = new com.xzq.osc.JocHyperlink();
        panelDeleteInsurHover = new com.xzq.osc.JocHyperlink();
        jPanel28 = new javax.swing.JPanel();
        tableInsuranceScrollPane = new javax.swing.JScrollPane();
        tableInsurance = new javax.swing.JTable();
        lblInsuranceMaxSalary = new javax.swing.JLabel();
        txtInsurMaxSalary = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        chStandardTax = new javax.swing.JCheckBox();
        lblTaxStandard = new javax.swing.JLabel();
        lblTaxCustomize = new javax.swing.JLabel();
        cmbTaxCustomize = new javax.swing.JComboBox<>();
        jSeparator27 = new javax.swing.JSeparator();
        btnSaveTax = new com.xzq.osc.JocHyperlink();
        panelSaveTax = new com.xzq.osc.JocHyperlink();
        panelSaveTaxHover = new com.xzq.osc.JocHyperlink();
        jPanel26 = new javax.swing.JPanel();
        scrollPanelTax = new javax.swing.JScrollPane();
        tableTax = new javax.swing.JTable()
        {
            @Override
            public Component prepareRenderer (TableCellRenderer renderer, int rowIndex, int columnIndex){
                Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
                if(getModel().getValueAt(rowIndex,1) !=null){
                    Object value = getModel().getValueAt(rowIndex,1);
                    if(value.equals(1)) {
                        component.setBackground(Color.decode("#82E0AA"));
                        component.setForeground(Color.BLACK);
                    }else {
                        component.setBackground(Color.WHITE);
                        component.setForeground(Color.BLACK);
                    }

                }
                return component;
            }
        }
        ;
        btnDeleteTax = new com.xzq.osc.JocHyperlink();
        panelDeleteTax = new com.xzq.osc.JocHyperlink();
        panelDeleteTaxHover = new com.xzq.osc.JocHyperlink();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        chConsultant = new javax.swing.JCheckBox();
        chFullTime = new javax.swing.JCheckBox();
        chCalculateSalary = new javax.swing.JCheckBox();
        chInOffice = new javax.swing.JCheckBox();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        lblDivision = new javax.swing.JLabel();
        cmbDivision = new javax.swing.JComboBox<>();
        jSeparator28 = new javax.swing.JSeparator();
        txtEmpID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblEmployeeInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 87, 99), 2));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.BorderLayout());

        lblImage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Picture");
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblImage, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(5, 5, 110, 120);

        txtEmpNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpNbr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtEmpNbr);
        txtEmpNbr.setBounds(270, 10, 200, 23);

        lblEmpID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpID.setText("Emp Nbr");
        jPanel6.add(lblEmpID);
        lblEmpID.setBounds(160, 10, 100, 23);

        lblEmpEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpEmail.setText("EmpEmail");
        jPanel6.add(lblEmpEmail);
        lblEmpEmail.setBounds(118, 40, 142, 23);

        txtEmpMail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtEmpMail);
        txtEmpMail.setBounds(270, 40, 200, 23);

        lblEmpName_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpName_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpName_L1.setText("Employee Name(Lao)");
        jPanel6.add(lblEmpName_L1);
        lblEmpName_L1.setBounds(118, 70, 142, 23);

        txtEmpName_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpName_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtEmpName_L1);
        txtEmpName_L1.setBounds(270, 70, 200, 23);

        lblEmpName_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpName_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpName_L2.setText("Employee Name(EN)");
        jPanel6.add(lblEmpName_L2);
        lblEmpName_L2.setBounds(118, 100, 142, 23);

        txtEmpName_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpName_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtEmpName_L2);
        txtEmpName_L2.setBounds(270, 100, 200, 23);

        lblEmpNickname.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpNickname.setText("Nickname");
        jPanel6.add(lblEmpNickname);
        lblEmpNickname.setBounds(130, 130, 130, 23);

        txtEmpNickname.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpNickname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtEmpNickname);
        txtEmpNickname.setBounds(270, 130, 200, 23);

        lblDOB.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("Date of birth");
        jPanel6.add(lblDOB);
        lblDOB.setBounds(150, 190, 110, 23);

        cmbGender.setEditable(true);
        cmbGender.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbGender);
        cmbGender.setBounds(270, 160, 200, 25);
        jPanel6.add(jSeparator6);
        jSeparator6.setBounds(270, 185, 200, 5);

        lblGender.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender");
        jPanel6.add(lblGender);
        lblGender.setBounds(150, 160, 110, 23);

        txtDOB.setDateFormatString("dd/MM/yyy");
        txtDOB.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(txtDOB);
        txtDOB.setBounds(270, 190, 200, 23);

        lblEmpStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpStatus.setText("Status");
        jPanel6.add(lblEmpStatus);
        lblEmpStatus.setBounds(150, 220, 110, 23);

        cmbEmpStatus.setEditable(true);
        cmbEmpStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbEmpStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbEmpStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbEmpStatus);
        cmbEmpStatus.setBounds(270, 220, 200, 25);
        jPanel6.add(jSeparator8);
        jSeparator8.setBounds(270, 245, 200, 5);
        jPanel6.add(jSeparator9);
        jSeparator9.setBounds(590, 215, 200, 5);

        cmbNational.setEditable(true);
        cmbNational.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbNational.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbNational.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbNational);
        cmbNational.setBounds(590, 190, 200, 25);

        lblNationality.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblNationality.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNationality.setText("Nationality");
        jPanel6.add(lblNationality);
        lblNationality.setBounds(480, 190, 100, 23);

        lblEthnic.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEthnic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEthnic.setText("Ethnic");
        jPanel6.add(lblEthnic);
        lblEthnic.setBounds(480, 220, 100, 23);

        cmbEthnic.setEditable(true);
        cmbEthnic.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbEthnic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbEthnic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbEthnic);
        cmbEthnic.setBounds(590, 220, 200, 25);
        jPanel6.add(jSeparator10);
        jSeparator10.setBounds(590, 245, 200, 5);

        lblReligion.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblReligion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReligion.setText("Religion");
        jPanel6.add(lblReligion);
        lblReligion.setBounds(810, 10, 100, 23);

        cmbReligion.setEditable(true);
        cmbReligion.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbReligion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbReligion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbReligion);
        cmbReligion.setBounds(920, 10, 180, 25);
        jPanel6.add(jSeparator11);
        jSeparator11.setBounds(920, 35, 180, 5);

        lblManager.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblManager.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManager.setText("Manager");
        jPanel6.add(lblManager);
        lblManager.setBounds(810, 100, 100, 23);

        cmbManager.setEditable(true);
        cmbManager.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbManager.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbManager);
        cmbManager.setBounds(920, 100, 180, 25);
        jPanel6.add(jSeparator12);
        jSeparator12.setBounds(920, 125, 180, 5);

        lblStartDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate.setText("Start Date");
        jPanel6.add(lblStartDate);
        lblStartDate.setBounds(480, 10, 100, 23);

        txtStartDate.setDateFormatString("dd/MM/yyy");
        txtStartDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(txtStartDate);
        txtStartDate.setBounds(590, 10, 140, 23);

        lblEndDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEndDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEndDate.setText("End Date");
        jPanel6.add(lblEndDate);
        lblEndDate.setBounds(480, 40, 100, 23);

        txtEndDate.setDateFormatString("dd/MM/yyy");
        txtEndDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(txtEndDate);
        txtEndDate.setBounds(590, 40, 140, 23);

        lblLocation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocation.setText("Location");
        jPanel6.add(lblLocation);
        lblLocation.setBounds(480, 100, 100, 23);

        cmbLocation.setEditable(true);
        cmbLocation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbLocation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbLocation);
        cmbLocation.setBounds(590, 100, 200, 25);
        jPanel6.add(jSeparator13);
        jSeparator13.setBounds(590, 125, 200, 5);

        lblDepartment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDepartment.setText("Department");
        jPanel6.add(lblDepartment);
        lblDepartment.setBounds(480, 130, 100, 23);

        lblBusinessUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblBusinessUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBusinessUnit.setText("Business Unit");
        jPanel6.add(lblBusinessUnit);
        lblBusinessUnit.setBounds(480, 160, 100, 23);

        lblTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Title");
        jPanel6.add(lblTitle);
        lblTitle.setBounds(810, 40, 100, 23);

        cmbDepartment.setEditable(true);
        cmbDepartment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDepartment.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbDepartment);
        cmbDepartment.setBounds(590, 130, 200, 25);
        jPanel6.add(jSeparator14);
        jSeparator14.setBounds(590, 155, 200, 5);
        jPanel6.add(jSeparator15);
        jSeparator15.setBounds(590, 185, 200, 5);

        cmbBusiness.setEditable(true);
        cmbBusiness.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbBusiness.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbBusiness.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbBusiness);
        cmbBusiness.setBounds(590, 160, 200, 25);

        cmbTitle.setEditable(true);
        cmbTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbTitle);
        cmbTitle.setBounds(920, 40, 180, 25);
        jPanel6.add(jSeparator16);
        jSeparator16.setBounds(920, 65, 180, 5);

        lblLevel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level");
        jPanel6.add(lblLevel);
        lblLevel.setBounds(810, 70, 100, 23);

        cmbLevel.setEditable(true);
        cmbLevel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cmbLevel.setSelectedIndex(-1);
        cmbLevel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbLevel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbLevel);
        cmbLevel.setBounds(920, 70, 180, 25);
        jPanel6.add(jSeparator17);
        jSeparator17.setBounds(920, 95, 180, 5);

        lblWorkStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblWorkStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWorkStatus.setText("Work Status");
        jPanel6.add(lblWorkStatus);
        lblWorkStatus.setBounds(810, 190, 100, 23);

        cmbWorkStatus.setEditable(true);
        cmbWorkStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbWorkStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbWorkStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbWorkStatus);
        cmbWorkStatus.setBounds(920, 190, 180, 25);
        jPanel6.add(jSeparator18);
        jSeparator18.setBounds(920, 215, 180, 5);
        jPanel6.add(jSeparator19);
        jSeparator19.setBounds(920, 185, 180, 5);

        lblSalaryPeriod.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryPeriod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryPeriod.setText("Salary Period");
        jPanel6.add(lblSalaryPeriod);
        lblSalaryPeriod.setBounds(810, 160, 100, 23);

        cmbSalaryPeriod.setEditable(true);
        cmbSalaryPeriod.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbSalaryPeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cmbSalaryPeriod.setSelectedIndex(-1);
        cmbSalaryPeriod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbSalaryPeriod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbSalaryPeriod);
        cmbSalaryPeriod.setBounds(920, 160, 180, 25);

        tabPaneDetails.setShowCloseButton(false);
        tabPaneDetails.setShowListButton(false);
        tabPaneDetails.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tabPaneDetails.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneDetailsStateChanged(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        lblPOB.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblPOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPOB.setText("Place of birth");
        jPanel8.add(lblPOB);
        lblPOB.setBounds(10, 100, 100, 23);

        txtPOD.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPOD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtPOD);
        txtPOD.setBounds(120, 100, 370, 23);

        lblIDCard.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblIDCard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIDCard.setText("ID Card");
        jPanel8.add(lblIDCard);
        lblIDCard.setBounds(10, 130, 100, 23);

        txtIDCard.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtIDCard.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtIDCard);
        txtIDCard.setBounds(120, 130, 370, 23);

        lblFamilyBook.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFamilyBook.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFamilyBook.setText("Family-Book");
        jPanel8.add(lblFamilyBook);
        lblFamilyBook.setBounds(10, 160, 100, 23);

        txtFamilybook.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFamilybook.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFamilybook);
        txtFamilybook.setBounds(120, 160, 370, 23);

        lblPassportNo.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblPassportNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassportNo.setText("Passport No.");
        jPanel8.add(lblPassportNo);
        lblPassportNo.setBounds(10, 190, 100, 23);

        txtPassportNo.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPassportNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtPassportNo);
        txtPassportNo.setBounds(120, 190, 370, 23);

        lblBloodGroup.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblBloodGroup.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBloodGroup.setText("Blood Group");
        jPanel8.add(lblBloodGroup);
        lblBloodGroup.setBounds(10, 220, 100, 23);
        jPanel8.add(jSeparator21);
        jSeparator21.setBounds(120, 245, 60, 5);

        cmbBlood.setEditable(true);
        cmbBlood.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        cmbBlood.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbBlood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(cmbBlood);
        cmbBlood.setBounds(120, 220, 60, 25);

        lblHight.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHight.setText("Hight");
        jPanel8.add(lblHight);
        lblHight.setBounds(190, 220, 50, 23);

        txtHight.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtHight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtHight);
        txtHight.setBounds(250, 220, 60, 23);

        txtWeight.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtWeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtWeight);
        txtWeight.setBounds(410, 220, 80, 23);

        lblWeight.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeight.setText("Weight");
        jPanel8.add(lblWeight);
        lblWeight.setBounds(350, 220, 50, 23);

        lblDrivingNo.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDrivingNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDrivingNo.setText("Driving No.");
        jPanel8.add(lblDrivingNo);
        lblDrivingNo.setBounds(10, 250, 100, 23);

        txtDrivingNo.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDrivingNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtDrivingNo);
        txtDrivingNo.setBounds(120, 250, 190, 23);

        lblMotocycle.setBackground(new java.awt.Color(255, 255, 255));
        lblMotocycle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMotocycle.setText("Motocycle");
        lblMotocycle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(lblMotocycle);
        lblMotocycle.setBounds(400, 250, 90, 23);

        txtHusband_Wife.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtHusband_Wife.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtHusband_Wife);
        txtHusband_Wife.setBounds(120, 280, 260, 23);

        lblHusband_Wife.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHusband_Wife.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHusband_Wife.setText("Husband / Wife");
        jPanel8.add(lblHusband_Wife);
        lblHusband_Wife.setBounds(10, 280, 100, 23);

        chCar.setBackground(new java.awt.Color(255, 255, 255));
        chCar.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chCar.setText("Car");
        chCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(chCar);
        chCar.setBounds(320, 250, 70, 23);

        lblAge.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("age");
        jPanel8.add(lblAge);
        lblAge.setBounds(380, 280, 40, 23);

        txtAge.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtAge);
        txtAge.setBounds(430, 280, 60, 23);

        lblOccupation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOccupation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOccupation.setText("Occupation");
        jPanel8.add(lblOccupation);
        lblOccupation.setBounds(10, 310, 100, 23);

        txtOccupation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOccupation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtOccupation);
        txtOccupation.setBounds(120, 310, 370, 23);

        lblWorkPlace.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblWorkPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWorkPlace.setText("Work Place");
        jPanel8.add(lblWorkPlace);
        lblWorkPlace.setBounds(540, 10, 120, 23);

        txtWorkPlace.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtWorkPlace.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtWorkPlace);
        txtWorkPlace.setBounds(670, 10, 370, 23);

        txtHusbandTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtHusbandTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtHusbandTelephone);
        txtHusbandTelephone.setBounds(670, 40, 370, 23);

        lblHubandTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHubandTelephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHubandTelephone.setText("Telephone");
        jPanel8.add(lblHubandTelephone);
        lblHubandTelephone.setBounds(540, 40, 120, 23);

        txtFatherTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFatherTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFatherTelephone);
        txtFatherTelephone.setBounds(670, 160, 370, 23);

        lblFatherTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFatherTelephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFatherTelephone.setText("Telephone");
        jPanel8.add(lblFatherTelephone);
        lblFatherTelephone.setBounds(540, 160, 120, 23);

        lblFatherWorkPlace.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFatherWorkPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFatherWorkPlace.setText("Work Place");
        jPanel8.add(lblFatherWorkPlace);
        lblFatherWorkPlace.setBounds(540, 130, 120, 23);

        txtFatherWorkPlace.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFatherWorkPlace.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFatherWorkPlace);
        txtFatherWorkPlace.setBounds(670, 130, 370, 23);

        txtFatherOccupation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFatherOccupation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFatherOccupation);
        txtFatherOccupation.setBounds(670, 100, 370, 23);

        lblFatherOccupation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFatherOccupation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFatherOccupation.setText("Occupation");
        jPanel8.add(lblFatherOccupation);
        lblFatherOccupation.setBounds(540, 100, 120, 23);

        lblFatherName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFatherName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFatherName.setText("Father Name");
        jPanel8.add(lblFatherName);
        lblFatherName.setBounds(540, 70, 120, 23);

        txtFatherName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFatherName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFatherName);
        txtFatherName.setBounds(670, 70, 260, 23);

        txtFatherAge.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFatherAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFatherAge);
        txtFatherAge.setBounds(980, 70, 60, 23);

        lblFatherAge.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFatherAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFatherAge.setText("age");
        jPanel8.add(lblFatherAge);
        lblFatherAge.setBounds(930, 70, 40, 23);

        lblMotherName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMotherName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotherName.setText("Mother Name");
        jPanel8.add(lblMotherName);
        lblMotherName.setBounds(540, 190, 120, 23);

        txtMotherTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMotherTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtMotherTelephone);
        txtMotherTelephone.setBounds(670, 280, 370, 23);

        lblMotherTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMotherTelephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotherTelephone.setText("Telephone");
        jPanel8.add(lblMotherTelephone);
        lblMotherTelephone.setBounds(540, 280, 120, 23);

        lblMotherWorkPlace.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMotherWorkPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotherWorkPlace.setText("Work Place");
        jPanel8.add(lblMotherWorkPlace);
        lblMotherWorkPlace.setBounds(540, 250, 120, 23);

        txtMotherWorkPlace.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMotherWorkPlace.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtMotherWorkPlace);
        txtMotherWorkPlace.setBounds(670, 250, 370, 23);

        txtMotherOccupation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMotherOccupation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtMotherOccupation);
        txtMotherOccupation.setBounds(670, 220, 370, 23);

        lblMotherOccupation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMotherOccupation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotherOccupation.setText("Occupation");
        jPanel8.add(lblMotherOccupation);
        lblMotherOccupation.setBounds(540, 220, 120, 23);

        txtMotherName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMotherName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtMotherName);
        txtMotherName.setBounds(670, 190, 260, 23);

        lblMotherAge.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMotherAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotherAge.setText("age");
        jPanel8.add(lblMotherAge);
        lblMotherAge.setBounds(930, 190, 40, 23);

        txtMotherAge.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMotherAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtMotherAge);
        txtMotherAge.setBounds(980, 190, 60, 23);

        lblFacebook.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFacebook.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFacebook.setText("FaceBook");
        jPanel8.add(lblFacebook);
        lblFacebook.setBounds(10, 10, 100, 23);

        txtFacebook.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFacebook.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtFacebook);
        txtFacebook.setBounds(120, 10, 370, 23);

        lblMobilePhone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMobilePhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMobilePhone.setText("Mobile Phone");
        jPanel8.add(lblMobilePhone);
        lblMobilePhone.setBounds(10, 40, 100, 23);

        txtMobilePhone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMobilePhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtMobilePhone);
        txtMobilePhone.setBounds(120, 40, 370, 23);

        lblTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTelephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelephone.setText("Telephone");
        jPanel8.add(lblTelephone);
        lblTelephone.setBounds(10, 70, 100, 23);

        txtTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtTelephone);
        txtTelephone.setBounds(120, 70, 370, 23);

        lblEmergencyContact.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmergencyContact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmergencyContact.setText("Emergency Contact");
        jPanel8.add(lblEmergencyContact);
        lblEmergencyContact.setBounds(540, 310, 120, 23);

        txtEmergencyContact.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmergencyContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel8.add(txtEmergencyContact);
        txtEmergencyContact.setBounds(670, 310, 290, 23);

        btnSaveCV.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSaveCV.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSaveCV.setText("Save");
        btnSaveCV.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveCV.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveCV.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel8.add(btnSaveCV);
        btnSaveCV.setBounds(1007, 313, 82, 26);

        panelSaveCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveCV.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel8.add(panelSaveCV);
        panelSaveCV.setBounds(1000, 310, 96, 32);

        panelSaveCVHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelSaveCVHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel8.add(panelSaveCVHover);
        panelSaveCVHover.setBounds(1000, 310, 96, 32);

        tabPaneDetails.addTab("Curriculum vitae", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        lblAddress2.setBackground(new java.awt.Color(81, 87, 99));
        lblAddress2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        lblAddress2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress2.setText("Address 2");
        lblAddress2.setOpaque(true);
        jPanel9.add(lblAddress2);
        lblAddress2.setBounds(560, 30, 535, 25);

        txtAddress1_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress1_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel9.add(txtAddress1_L1);
        txtAddress1_L1.setBounds(160, 80, 320, 23);

        lblAddress1_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress1_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress1_L2.setText("Address(EN)");
        jPanel9.add(lblAddress1_L2);
        lblAddress1_L2.setBounds(20, 110, 130, 23);

        txtAddress1_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress1_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel9.add(txtAddress1_L2);
        txtAddress1_L2.setBounds(160, 110, 320, 23);

        lblDistrict1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrict1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrict1.setText("District");
        jPanel9.add(lblDistrict1);
        lblDistrict1.setBounds(20, 140, 130, 23);

        cmbDistrict1.setEditable(true);
        cmbDistrict1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDistrict1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel9.add(cmbDistrict1);
        cmbDistrict1.setBounds(160, 140, 320, 25);
        jPanel9.add(jSeparator22);
        jSeparator22.setBounds(160, 165, 320, 5);

        lblProvince1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblProvince1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProvince1.setText("Province");
        jPanel9.add(lblProvince1);
        lblProvince1.setBounds(20, 170, 130, 23);

        cmbProvince1.setEditable(true);
        cmbProvince1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbProvince1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel9.add(cmbProvince1);
        cmbProvince1.setBounds(160, 170, 320, 25);
        jPanel9.add(jSeparator23);
        jSeparator23.setBounds(160, 195, 320, 5);

        lblAddress2_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress2_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress2_L1.setText("Address(Lao)");
        jPanel9.add(lblAddress2_L1);
        lblAddress2_L1.setBounds(570, 80, 130, 23);

        txtAddress2_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress2_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel9.add(txtAddress2_L1);
        txtAddress2_L1.setBounds(710, 80, 320, 23);

        lblAddress2_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress2_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress2_L2.setText("Address(EN)");
        jPanel9.add(lblAddress2_L2);
        lblAddress2_L2.setBounds(570, 110, 130, 23);

        txtAddress2_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress2_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel9.add(txtAddress2_L2);
        txtAddress2_L2.setBounds(710, 110, 320, 23);

        lblDistrict2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrict2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrict2.setText("District");
        jPanel9.add(lblDistrict2);
        lblDistrict2.setBounds(570, 140, 130, 23);

        cmbDistrict2.setEditable(true);
        cmbDistrict2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDistrict2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel9.add(cmbDistrict2);
        cmbDistrict2.setBounds(710, 140, 320, 25);
        jPanel9.add(jSeparator24);
        jSeparator24.setBounds(710, 165, 320, 5);

        lblProvince2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblProvince2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProvince2.setText("Province");
        jPanel9.add(lblProvince2);
        lblProvince2.setBounds(570, 170, 130, 23);

        cmbProvince2.setEditable(true);
        cmbProvince2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbProvince2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel9.add(cmbProvince2);
        cmbProvince2.setBounds(710, 170, 320, 25);
        jPanel9.add(jSeparator25);
        jSeparator25.setBounds(710, 195, 320, 5);

        lblAddress1_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress1_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress1_L1.setText("Address(Lao)");
        jPanel9.add(lblAddress1_L1);
        lblAddress1_L1.setBounds(20, 80, 130, 23);

        lblAddress1.setBackground(new java.awt.Color(81, 87, 99));
        lblAddress1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        lblAddress1.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress1.setText("Address 1");
        lblAddress1.setOpaque(true);
        jPanel9.add(lblAddress1);
        lblAddress1.setBounds(10, 30, 540, 25);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 142, 196), new java.awt.Color(0, 142, 196), new java.awt.Color(81, 87, 99), new java.awt.Color(81, 87, 99)));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel20);
        jPanel20.setBounds(560, 55, 535, 230);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 142, 196), new java.awt.Color(0, 142, 196), new java.awt.Color(81, 87, 99), new java.awt.Color(81, 87, 99)));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel21);
        jPanel21.setBounds(10, 55, 540, 230);

        btnSaveAddress.setText("Save");
        btnSaveAddress.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveAddress.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveAddress.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel9.add(btnSaveAddress);
        btnSaveAddress.setBounds(1007, 313, 82, 26);

        panelSaveAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveAddress.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel9.add(panelSaveAddress);
        panelSaveAddress.setBounds(1000, 310, 96, 32);

        panelSaveAddressHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelSaveAddressHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel9.add(panelSaveAddressHover);
        panelSaveAddressHover.setBounds(1000, 310, 96, 32);

        tabPaneDetails.addTab("Address", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        lblSalaryType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryType.setText("Salary Type");
        jPanel10.add(lblSalaryType);
        lblSalaryType.setBounds(10, 10, 100, 23);

        cmbSalaryType.setEditable(true);
        cmbSalaryType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbSalaryType.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel10.add(cmbSalaryType);
        cmbSalaryType.setBounds(120, 10, 170, 25);
        jPanel10.add(jSeparator26);
        jSeparator26.setBounds(120, 35, 170, 5);

        lblID27.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID27.setText("%");
        jPanel10.add(lblID27);
        lblID27.setBounds(190, 73, 40, 23);

        txtSalaryAmount.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalaryAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel10.add(txtSalaryAmount);
        txtSalaryAmount.setBounds(120, 43, 130, 23);

        lblSalaryDeduction.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryDeduction.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryDeduction.setText("Deduction");
        jPanel10.add(lblSalaryDeduction);
        lblSalaryDeduction.setBounds(10, 73, 100, 23);

        txtSalaryDeduction.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalaryDeduction.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel10.add(txtSalaryDeduction);
        txtSalaryDeduction.setBounds(120, 73, 60, 23);

        chSalaryInsurance.setBackground(new java.awt.Color(255, 255, 255));
        chSalaryInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chSalaryInsurance.setText("Insurance");
        jPanel10.add(chSalaryInsurance);
        chSalaryInsurance.setBounds(120, 170, 120, 23);

        chSalaryTax.setBackground(new java.awt.Color(255, 255, 255));
        chSalaryTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chSalaryTax.setText("Tax");
        jPanel10.add(chSalaryTax);
        chSalaryTax.setBounds(120, 110, 120, 23);

        chSalaryOvertime.setBackground(new java.awt.Color(255, 255, 255));
        chSalaryOvertime.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chSalaryOvertime.setText("Overtime");
        jPanel10.add(chSalaryOvertime);
        chSalaryOvertime.setBounds(120, 140, 120, 23);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        scrollPaneSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tableSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblID", "lblSalaryType", "lblSalaryAmount", "lblSalaryTax", "lblSalaryOT", "lblSalaryDeduction", "lblSalaryDedAmount", "lblInsurance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSalary.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableSalary.setGridColor(new java.awt.Color(204, 204, 204));
        tableSalary.setRowHeight(25);
        tableSalary.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableSalary.setSelectionForeground(java.awt.Color.red);
        scrollPaneSalary.setViewportView(tableSalary);

        jPanel22.add(scrollPaneSalary, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel22);
        jPanel22.setBounds(310, 5, 790, 190);

        lblSalaryAmount.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryAmount.setText("Amount");
        jPanel10.add(lblSalaryAmount);
        lblSalaryAmount.setBounds(10, 43, 100, 23);

        lblKip.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblKip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKip.setText("LAK");
        jPanel10.add(lblKip);
        lblKip.setBounds(260, 40, 40, 23);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(81, 87, 99)));
        jPanel23.setLayout(null);

        txtSalaryTotal.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalaryTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtSalaryTotal);
        txtSalaryTotal.setBounds(100, 10, 100, 23);

        lblTotalSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTotalSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalSalary.setText("Salary");
        jPanel23.add(lblTotalSalary);
        lblTotalSalary.setBounds(10, 10, 80, 23);

        lblTaxSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTaxSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTaxSalary.setText("Tax Salary");
        jPanel23.add(lblTaxSalary);
        lblTaxSalary.setBounds(10, 50, 80, 23);

        txtIncludeTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtIncludeTax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtIncludeTax);
        txtIncludeTax.setBounds(100, 50, 100, 23);

        lblExcludeTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblExcludeTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblExcludeTax.setText("Exclude Tax");
        jPanel23.add(lblExcludeTax);
        lblExcludeTax.setBounds(210, 50, 80, 23);

        txtExcludeTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtExcludeTax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtExcludeTax);
        txtExcludeTax.setBounds(300, 50, 90, 23);

        lblSalaryPerDay.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryPerDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryPerDay.setText("Salary/Day");
        jPanel23.add(lblSalaryPerDay);
        lblSalaryPerDay.setBounds(400, 50, 80, 23);

        txtSalaryRateDay.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalaryRateDay.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtSalaryRateDay);
        txtSalaryRateDay.setBounds(488, 50, 90, 23);

        lblSalaryPerHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryPerHours.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryPerHours.setText("Rate/hour");
        jPanel23.add(lblSalaryPerHours);
        lblSalaryPerHours.setBounds(583, 50, 90, 23);

        txtSalaryRateHour.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalaryRateHour.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtSalaryRateHour);
        txtSalaryRateHour.setBounds(680, 50, 110, 23);

        lblSalaryOvertime.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryOvertime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryOvertime.setText("Overtime");
        jPanel23.add(lblSalaryOvertime);
        lblSalaryOvertime.setBounds(10, 100, 90, 23);

        txtOvertimeTotal.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtOvertimeTotal);
        txtOvertimeTotal.setBounds(110, 100, 100, 23);

        lblOvertimePerDay.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimePerDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOvertimePerDay.setText("Rate/day");
        jPanel23.add(lblOvertimePerDay);
        lblOvertimePerDay.setBounds(220, 100, 80, 23);

        txtOvertimeRateDay.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeRateDay.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtOvertimeRateDay);
        txtOvertimeRateDay.setBounds(310, 100, 90, 23);

        lblOvertimePerHous.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimePerHous.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOvertimePerHous.setText("Rate/hour");
        jPanel23.add(lblOvertimePerHous);
        lblOvertimePerHous.setBounds(410, 100, 80, 23);

        txtOvertimeRateHour.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeRateHour.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtOvertimeRateHour);
        txtOvertimeRateHour.setBounds(500, 100, 100, 23);

        jPanel24.setBackground(new java.awt.Color(81, 87, 99));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel24);
        jPanel24.setBounds(0, 80, 790, 3);

        lblSalaryInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryInsurance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryInsurance.setText("Insurance");
        jPanel23.add(lblSalaryInsurance);
        lblSalaryInsurance.setBounds(210, 10, 80, 23);

        txtTotalInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTotalInsurance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtTotalInsurance);
        txtTotalInsurance.setBounds(300, 10, 90, 23);

        lblSalaryTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalaryTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryTax.setText("Tax");
        jPanel23.add(lblSalaryTax);
        lblSalaryTax.setBounds(400, 10, 80, 23);

        txtTotalTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTotalTax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtTotalTax);
        txtTotalTax.setBounds(488, 10, 90, 23);

        lblNetSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblNetSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetSalary.setText("Net Salary");
        jPanel23.add(lblNetSalary);
        lblNetSalary.setBounds(583, 10, 90, 23);

        txtNetSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtNetSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel23.add(txtNetSalary);
        txtNetSalary.setBounds(680, 10, 110, 23);

        jPanel10.add(jPanel23);
        jPanel23.setBounds(310, 200, 790, 140);

        btnSaveSalary.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSaveSalary.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveSalary.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSaveSalary.setText("Save");
        btnSaveSalary.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveSalary.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel10.add(btnSaveSalary);
        btnSaveSalary.setBounds(157, 283, 82, 26);

        panelSaveSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel10.add(panelSaveSalary);
        panelSaveSalary.setBounds(150, 280, 96, 32);

        panelSaveSalaryHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelSaveSalaryHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel10.add(panelSaveSalaryHover);
        panelSaveSalaryHover.setBounds(150, 280, 96, 32);

        txtEmpSalaryID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpSalaryID.setText("New");
        txtEmpSalaryID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel10.add(txtEmpSalaryID);
        txtEmpSalaryID.setBounds(10, 290, 60, 23);

        tabPaneDetails.addTab("Salary", jPanel10);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(null);

        lblInsuranceType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblInsuranceType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsuranceType.setText("Insurance Type");
        jPanel27.add(lblInsuranceType);
        lblInsuranceType.setBounds(10, 37, 100, 23);

        cmbInsurance.setEditable(true);
        cmbInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbInsurance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbInsurance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.add(cmbInsurance);
        cmbInsurance.setBounds(120, 37, 200, 25);
        jPanel27.add(jSeparator20);
        jSeparator20.setBounds(120, 62, 200, 2);

        txtInsurEmpID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtInsurEmpID.setText("New");
        txtInsurEmpID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel27.add(txtInsurEmpID);
        txtInsurEmpID.setBounds(20, 310, 60, 23);

        lblInsuranceNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblInsuranceNbr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsuranceNbr.setText("Insurance ID");
        jPanel27.add(lblInsuranceNbr);
        lblInsuranceNbr.setBounds(10, 80, 100, 23);

        txtInsuranceNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtInsuranceNbr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel27.add(txtInsuranceNbr);
        txtInsuranceNbr.setBounds(120, 80, 200, 23);

        btnSaveInsurance.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSaveInsurance.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSaveInsurance.setText("Save");
        btnSaveInsurance.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveInsurance.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel27.add(btnSaveInsurance);
        btnSaveInsurance.setBounds(127, 173, 82, 26);

        panelSaveInsur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveInsur.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel27.add(panelSaveInsur);
        panelSaveInsur.setBounds(120, 170, 96, 32);

        panelSaveInsurHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelSaveInsurHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel27.add(panelSaveInsurHover);
        panelSaveInsurHover.setBounds(120, 170, 96, 32);

        btnDeleteInsurance.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDeleteInsurance.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDeleteInsurance.setText("Delete");
        btnDeleteInsurance.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDeleteInsurance.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDeleteInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel27.add(btnDeleteInsurance);
        btnDeleteInsurance.setBounds(237, 173, 82, 26);

        panelDeleteInsur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDeleteInsur.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel27.add(panelDeleteInsur);
        panelDeleteInsur.setBounds(230, 170, 96, 32);

        panelDeleteInsurHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelDeleteInsurHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel27.add(panelDeleteInsurHover);
        panelDeleteInsurHover.setBounds(230, 170, 96, 32);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new java.awt.BorderLayout());

        tableInsuranceScrollPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(81, 87, 99)));

        tableInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableInsurance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "lblID", "lblRowNbr", "lblInsuranceType", "lblInsuranceNbr", "lblInsuranceMaxSalary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInsurance.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableInsurance.setGridColor(new java.awt.Color(204, 204, 204));
        tableInsurance.setRowHeight(25);
        tableInsurance.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableInsurance.setSelectionForeground(java.awt.Color.red);
        tableInsuranceScrollPane.setViewportView(tableInsurance);

        jPanel28.add(tableInsuranceScrollPane, java.awt.BorderLayout.CENTER);

        jPanel27.add(jPanel28);
        jPanel28.setBounds(350, 10, 740, 330);

        lblInsuranceMaxSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblInsuranceMaxSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsuranceMaxSalary.setText("Max Salary");
        jPanel27.add(lblInsuranceMaxSalary);
        lblInsuranceMaxSalary.setBounds(10, 120, 100, 23);

        txtInsurMaxSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtInsurMaxSalary.setText("0");
        txtInsurMaxSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel27.add(txtInsurMaxSalary);
        txtInsurMaxSalary.setBounds(120, 120, 200, 23);

        tabPaneDetails.addTab("Insurance", jPanel27);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        chStandardTax.setBackground(new java.awt.Color(255, 255, 255));
        chStandardTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(chStandardTax);
        chStandardTax.setBounds(119, 10, 21, 23);

        lblTaxStandard.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTaxStandard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTaxStandard.setText("Standard");
        jPanel11.add(lblTaxStandard);
        lblTaxStandard.setBounds(10, 10, 100, 23);

        lblTaxCustomize.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTaxCustomize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTaxCustomize.setText("Customize Tax");
        jPanel11.add(lblTaxCustomize);
        lblTaxCustomize.setBounds(10, 40, 100, 23);

        cmbTaxCustomize.setEditable(true);
        cmbTaxCustomize.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbTaxCustomize.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel11.add(cmbTaxCustomize);
        cmbTaxCustomize.setBounds(120, 40, 200, 25);
        jPanel11.add(jSeparator27);
        jSeparator27.setBounds(120, 65, 200, 5);

        btnSaveTax.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSaveTax.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSaveTax.setText("Save");
        btnSaveTax.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveTax.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(btnSaveTax);
        btnSaveTax.setBounds(127, 83, 82, 26);

        panelSaveTax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(panelSaveTax);
        panelSaveTax.setBounds(120, 80, 96, 32);

        panelSaveTaxHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelSaveTaxHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(panelSaveTaxHover);
        panelSaveTaxHover.setBounds(120, 80, 96, 32);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new java.awt.BorderLayout());

        scrollPanelTax.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tableTax.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableTax.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblEmpTaxID", "lblTaxID", "lblTaxPercentage", "lblTaxPercentage", "lblTaxMin", "lblTaxMax", "lblTaxDeduction", "lblPaidTax"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTax.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableTax.setGridColor(new java.awt.Color(204, 204, 204));
        tableTax.setRowHeight(25);
        tableTax.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableTax.setSelectionForeground(java.awt.Color.red);
        scrollPanelTax.setViewportView(tableTax);

        jPanel26.add(scrollPanelTax, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel26);
        jPanel26.setBounds(350, 10, 745, 340);

        btnDeleteTax.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDeleteTax.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDeleteTax.setText("Delete");
        btnDeleteTax.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDeleteTax.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDeleteTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(btnDeleteTax);
        btnDeleteTax.setBounds(232, 83, 82, 26);

        panelDeleteTax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDeleteTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(panelDeleteTax);
        panelDeleteTax.setBounds(225, 80, 96, 32);

        panelDeleteTaxHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelDeleteTaxHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel11.add(panelDeleteTaxHover);
        panelDeleteTaxHover.setBounds(225, 80, 96, 32);

        tabPaneDetails.addTab("Tax", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Education", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Note", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Equipment", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Experience", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Absent", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Bank", jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Manage Location", jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tabPaneDetails.addTab("Document", jPanel19);

        jPanel6.add(tabPaneDetails);
        tabPaneDetails.setBounds(10, 250, 1110, 385);

        chConsultant.setBackground(new java.awt.Color(255, 255, 255));
        chConsultant.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chConsultant.setText("Consultant");
        chConsultant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(chConsultant);
        chConsultant.setBounds(10, 220, 120, 23);

        chFullTime.setBackground(new java.awt.Color(255, 255, 255));
        chFullTime.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chFullTime.setText("Full Time");
        chFullTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(chFullTime);
        chFullTime.setBounds(10, 130, 120, 23);

        chCalculateSalary.setBackground(new java.awt.Color(255, 255, 255));
        chCalculateSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chCalculateSalary.setText("Calculate Salary");
        chCalculateSalary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(chCalculateSalary);
        chCalculateSalary.setBounds(10, 160, 120, 23);

        chInOffice.setBackground(new java.awt.Color(255, 255, 255));
        chInOffice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chInOffice.setText("In Office");
        chInOffice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(chInOffice);
        chInOffice.setBounds(10, 190, 120, 23);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(btnSave);
        btnSave.setBounds(1007, 233, 82, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelSave);
        panelSave.setBounds(1000, 230, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelHover);
        panelHover.setBounds(1000, 230, 96, 32);

        lblDivision.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDivision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDivision.setText("Division");
        jPanel6.add(lblDivision);
        lblDivision.setBounds(480, 70, 100, 23);

        cmbDivision.setEditable(true);
        cmbDivision.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDivision.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cmbDivision);
        cmbDivision.setBounds(590, 70, 200, 25);
        jPanel6.add(jSeparator28);
        jSeparator28.setBounds(590, 95, 200, 5);

        txtEmpID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpID.setText("New");
        txtEmpID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtEmpID);
        txtEmpID.setBounds(830, 220, 50, 23);

        jPanel3.setBackground(new java.awt.Color(81, 87, 99));

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });

        lblEmployeeInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblEmployeeInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployeeInfo.setText("Employee Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmployeeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmployeeInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuExitActionPerformed

    private void tabPaneDetailsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneDetailsStateChanged
        
    }//GEN-LAST:event_tabPaneDetailsStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmEmployeeDetails dialog = new FrmEmployeeDetails(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnDeleteInsurance;
    private com.xzq.osc.JocHyperlink btnDeleteTax;
    private com.xzq.osc.JocHyperlink btnSave;
    private com.xzq.osc.JocHyperlink btnSaveAddress;
    private com.xzq.osc.JocHyperlink btnSaveCV;
    private com.xzq.osc.JocHyperlink btnSaveInsurance;
    private com.xzq.osc.JocHyperlink btnSaveSalary;
    private com.xzq.osc.JocHyperlink btnSaveTax;
    private javax.swing.JCheckBox chCalculateSalary;
    private javax.swing.JCheckBox chCar;
    private javax.swing.JCheckBox chConsultant;
    private javax.swing.JCheckBox chFullTime;
    private javax.swing.JCheckBox chInOffice;
    private javax.swing.JCheckBox chSalaryInsurance;
    private javax.swing.JCheckBox chSalaryOvertime;
    private javax.swing.JCheckBox chSalaryTax;
    private javax.swing.JCheckBox chStandardTax;
    private javax.swing.JComboBox<String> cmbBlood;
    private javax.swing.JComboBox<String> cmbBusiness;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbDistrict1;
    private javax.swing.JComboBox<String> cmbDistrict2;
    private javax.swing.JComboBox<String> cmbDivision;
    private javax.swing.JComboBox<String> cmbEmpStatus;
    private javax.swing.JComboBox<String> cmbEthnic;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbInsurance;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbManager;
    private javax.swing.JComboBox<String> cmbNational;
    private javax.swing.JComboBox<String> cmbProvince1;
    private javax.swing.JComboBox<String> cmbProvince2;
    private javax.swing.JComboBox<String> cmbReligion;
    private javax.swing.JComboBox<String> cmbSalaryPeriod;
    private javax.swing.JComboBox<String> cmbSalaryType;
    private javax.swing.JComboBox<String> cmbTaxCustomize;
    private javax.swing.JComboBox<String> cmbTitle;
    private javax.swing.JComboBox<String> cmbWorkStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress1_L1;
    private javax.swing.JLabel lblAddress1_L2;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblAddress2_L1;
    private javax.swing.JLabel lblAddress2_L2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblBusinessUnit;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDistrict1;
    private javax.swing.JLabel lblDistrict2;
    private javax.swing.JLabel lblDivision;
    private javax.swing.JLabel lblDrivingNo;
    private javax.swing.JLabel lblEmergencyContact;
    private javax.swing.JLabel lblEmpEmail;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpName_L1;
    private javax.swing.JLabel lblEmpName_L2;
    private javax.swing.JLabel lblEmpNickname;
    private javax.swing.JLabel lblEmpStatus;
    private javax.swing.JLabel lblEmployeeInfo;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblEthnic;
    private javax.swing.JLabel lblExcludeTax;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblFamilyBook;
    private javax.swing.JLabel lblFatherAge;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblFatherOccupation;
    private javax.swing.JLabel lblFatherTelephone;
    private javax.swing.JLabel lblFatherWorkPlace;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHight;
    private javax.swing.JLabel lblHubandTelephone;
    private javax.swing.JLabel lblHusband_Wife;
    private javax.swing.JLabel lblID27;
    private javax.swing.JLabel lblIDCard;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInsuranceMaxSalary;
    private javax.swing.JLabel lblInsuranceNbr;
    private javax.swing.JLabel lblInsuranceType;
    private javax.swing.JLabel lblKip;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblMobilePhone;
    private javax.swing.JLabel lblMotherAge;
    private javax.swing.JLabel lblMotherName;
    private javax.swing.JLabel lblMotherOccupation;
    private javax.swing.JLabel lblMotherTelephone;
    private javax.swing.JLabel lblMotherWorkPlace;
    private javax.swing.JCheckBox lblMotocycle;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblNetSalary;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblOvertimePerDay;
    private javax.swing.JLabel lblOvertimePerHous;
    private javax.swing.JLabel lblPOB;
    private javax.swing.JLabel lblPassportNo;
    private javax.swing.JLabel lblProvince1;
    private javax.swing.JLabel lblProvince2;
    private javax.swing.JLabel lblReligion;
    private javax.swing.JLabel lblSalaryAmount;
    private javax.swing.JLabel lblSalaryDeduction;
    private javax.swing.JLabel lblSalaryInsurance;
    private javax.swing.JLabel lblSalaryOvertime;
    private javax.swing.JLabel lblSalaryPerDay;
    private javax.swing.JLabel lblSalaryPerHours;
    private javax.swing.JLabel lblSalaryPeriod;
    private javax.swing.JLabel lblSalaryTax;
    private javax.swing.JLabel lblSalaryType;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTaxCustomize;
    private javax.swing.JLabel lblTaxSalary;
    private javax.swing.JLabel lblTaxStandard;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalSalary;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWorkPlace;
    private javax.swing.JLabel lblWorkStatus;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDeleteInsur;
    private com.xzq.osc.JocHyperlink panelDeleteInsurHover;
    private com.xzq.osc.JocHyperlink panelDeleteTax;
    private com.xzq.osc.JocHyperlink panelDeleteTaxHover;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private com.xzq.osc.JocHyperlink panelSaveAddress;
    private com.xzq.osc.JocHyperlink panelSaveAddressHover;
    private com.xzq.osc.JocHyperlink panelSaveCV;
    private com.xzq.osc.JocHyperlink panelSaveCVHover;
    private com.xzq.osc.JocHyperlink panelSaveInsur;
    private com.xzq.osc.JocHyperlink panelSaveInsurHover;
    private com.xzq.osc.JocHyperlink panelSaveSalary;
    private com.xzq.osc.JocHyperlink panelSaveSalaryHover;
    private com.xzq.osc.JocHyperlink panelSaveTax;
    private com.xzq.osc.JocHyperlink panelSaveTaxHover;
    private javax.swing.JScrollPane scrollPaneSalary;
    private javax.swing.JScrollPane scrollPanelTax;
    private com.xzq.osc.JocTabbedPane tabPaneDetails;
    private javax.swing.JTable tableInsurance;
    private javax.swing.JScrollPane tableInsuranceScrollPane;
    private javax.swing.JTable tableSalary;
    private javax.swing.JTable tableTax;
    private javax.swing.JTextField txtAddress1_L1;
    private javax.swing.JTextField txtAddress1_L2;
    private javax.swing.JTextField txtAddress2_L1;
    private javax.swing.JTextField txtAddress2_L2;
    private javax.swing.JTextField txtAge;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtDrivingNo;
    private javax.swing.JTextField txtEmergencyContact;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpMail;
    private javax.swing.JTextField txtEmpName_L1;
    private javax.swing.JTextField txtEmpName_L2;
    private javax.swing.JTextField txtEmpNbr;
    private javax.swing.JTextField txtEmpNickname;
    private javax.swing.JTextField txtEmpSalaryID;
    private com.toedter.calendar.JDateChooser txtEndDate;
    private javax.swing.JTextField txtExcludeTax;
    private javax.swing.JTextField txtFacebook;
    private javax.swing.JTextField txtFamilybook;
    private javax.swing.JTextField txtFatherAge;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFatherOccupation;
    private javax.swing.JTextField txtFatherTelephone;
    private javax.swing.JTextField txtFatherWorkPlace;
    private javax.swing.JTextField txtHight;
    private javax.swing.JTextField txtHusbandTelephone;
    private javax.swing.JTextField txtHusband_Wife;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtIncludeTax;
    private javax.swing.JTextField txtInsurEmpID;
    private javax.swing.JTextField txtInsurMaxSalary;
    private javax.swing.JTextField txtInsuranceNbr;
    private javax.swing.JTextField txtMobilePhone;
    private javax.swing.JTextField txtMotherAge;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtMotherOccupation;
    private javax.swing.JTextField txtMotherTelephone;
    private javax.swing.JTextField txtMotherWorkPlace;
    private javax.swing.JTextField txtNetSalary;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtOvertimeRateDay;
    private javax.swing.JTextField txtOvertimeRateHour;
    private javax.swing.JTextField txtOvertimeTotal;
    private javax.swing.JTextField txtPOD;
    private javax.swing.JTextField txtPassportNo;
    private javax.swing.JTextField txtSalaryAmount;
    private javax.swing.JTextField txtSalaryDeduction;
    private javax.swing.JTextField txtSalaryRateDay;
    private javax.swing.JTextField txtSalaryRateHour;
    private javax.swing.JTextField txtSalaryTotal;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTotalInsurance;
    private javax.swing.JTextField txtTotalTax;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWorkPlace;
    // End of variables declaration//GEN-END:variables
}
