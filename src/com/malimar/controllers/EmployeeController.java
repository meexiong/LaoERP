package com.malimar.controllers;

import com.malimar.models.Employee;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.views.FrmDashboard;
import com.malimar.views.FrmEmployee;
import com.malimar.views.FrmHR;
import com.malimar.views.FrmMainMenu;
import com.malimar.views.FrmSetting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class EmployeeController implements ActionListener, MouseListener, MouseMotionListener {

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
    HashMap<String, Object[]> mapInsurance = null;
    HashMap<String, Object[]> mapWorkStatus = null;
    HashMap<String, Object[]> mapLocation = null;

    public EmployeeController(FrmEmployee view) {
        this.view = view;
        Employee em = new Employee();
        this.model = em;
        frm = this.view.getClass().getSimpleName();
        this.setEvent();
        this.setComboBoxBaseUI();
        this.changeLabel();

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
        this.view.getCmbDivision().addActionListener((ActionListener)this);
        this.view.getCmbLocation().addActionListener((ActionListener)this);
        this.view.getLblImage().addMouseListener((MouseListener)this);
    }

    private void changeLabel() {
        this.view.getLblEmployeeInfo().setText(hmapLang.get("lblEmployeeInfo".concat(frm).toUpperCase())[LN]);
        this.view.getTabPane().setTitleAt(1, hmapLang.get("tabPane2".concat(frm).toUpperCase())[LN]);
        this.view.getTabPane().setTitleAt(0, hmapLang.get("tabPane1".concat(frm).toUpperCase())[LN]);
        this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase())[LN]);
        this.view.getLblEmpID().setText(hmapLang.get("lblEmpID".concat(frm).toUpperCase())[LN]);
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
        this.view.getTabPaneDetails().setTitleAt(3, hmapLang.get("tabPaneDetails_Tax".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(4, hmapLang.get("tabPaneDetails_Edu".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(5, hmapLang.get("tabPaneDetails_Note".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(6, hmapLang.get("tabPaneDetails_Equ".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(7, hmapLang.get("tabPaneDetails_Exp".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(8, hmapLang.get("tabPaneDetails_Absent".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(9, hmapLang.get("tabPaneDetails_Bank".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(10, hmapLang.get("tabPaneDetails_Manege".concat(frm).toUpperCase())[LN]);
        this.view.getTabPaneDetails().setTitleAt(11, hmapLang.get("tabPaneDetails_Docu".concat(frm).toUpperCase())[LN]);
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
    private void setInsuranceCombo() {
        try {
            mapInsurance = this.model.getInsuranceCombo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapInsurance);
            this.view.getCmbInsurance().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbInsurance().addItem(s);
            });
            this.view.getCmbInsurance().setSelectedIndex(-1);
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
        }else if(e.getSource() == this.view.getCmbDivision()){
            if(this.view.getCmbDivision().getSelectedIndex() !=-1){
                String division = this.view.getCmbDivision().getSelectedItem().toString();
                this.model.setEmpDivisionID(Integer.parseInt(mapDivision.get(division)[0].toString()));
                this.setLocationCombo();
            }
        }else if(e.getSource() == this.view.getCmbLocation()){
            if(this.view.getCmbLocation().getSelectedIndex() !=-1){
                String loc = this.view.getCmbLocation().getSelectedItem().toString();
                this.model.setEmpLocationID(Integer.parseInt(mapLocation.get(loc)[0].toString()));
                this.setDepartmentCombo();
                this.setManagerCombo();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTabPane()) {
            if (this.view.getTabPane().getSelectedIndex() == 0) {

            } else if (this.view.getTabPane().getSelectedIndex() == 1) {
                this.setGenderCombo();
                this.setStatusCombo();
                this.setDivisionCombo();
                this.setUnitCombo();
                this.setNationalityCombo();
                this.setEthnicCombo();
                this.setReligionCombo();
                this.setPositionCombo();
                this.setInsuranceCombo();
                this.setWorkStatusCombo();
            }
        }else if(e.getSource() == this.view.getLblImage()){
            if(e.getClickCount() == 2){
                
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
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(false);
            this.view.getPanelSave().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveCV()) {
            this.view.getPanelSaveCVHover().setVisible(false);
            this.view.getPanelSaveCV().setVisible(true);
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
        }
    }
}
