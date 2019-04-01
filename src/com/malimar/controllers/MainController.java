package com.malimar.controllers;

import com.malimar.views.FrmMainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MainController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmMainMenu view;
    int cnt = 0;

    public MainController(FrmMainMenu view) {
        this.view = view;
        this.view.getMenuDashboard().addActionListener((ActionListener) this);
        this.view.getMenuHR().addActionListener((ActionListener) this);
        this.view.getMenuSetting().addActionListener((ActionListener) this);
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.view.getMenuMaximum().addActionListener((ActionListener) this);
        this.view.getMenuMinimum().addActionListener((ActionListener) this);
        this.view.getMenuYoutube().addActionListener((ActionListener) this);
        this.view.getMenuGoogle().addActionListener((ActionListener) this);
        this.view.getMenuFacebook().addActionListener((ActionListener) this);
        this.view.getMenuCompany().addActionListener((ActionListener) this);
        this.view.getMenuLocation().addActionListener((ActionListener) this);
        this.view.getMenuDivision().addActionListener((ActionListener) this);
        this.view.getMenuDepartment().addActionListener((ActionListener) this);
        this.view.getMenuUnitWork().addActionListener((ActionListener) this);
        this.view.getMenuTitle().addActionListener((ActionListener) this);
        this.view.getMenuNationality().addActionListener((ActionListener) this);
        this.view.getMenuEthnic().addActionListener((ActionListener) this);
        this.view.getMenuReligion().addActionListener((ActionListener) this);
        this.view.getMenuBank().addActionListener((ActionListener) this);
        this.view.getMenuInsurance().addActionListener((ActionListener) this);
        this.view.getMenuEmpStatus().addActionListener((ActionListener) this);
        this.view.getMenuAbsentType().addActionListener((ActionListener) this);
        this.view.getMenuOverTimeType().addActionListener((ActionListener) this);
        this.view.getMenuSalaryType().addActionListener((ActionListener) this);
        this.view.getMenuDeductionType().addActionListener((ActionListener) this);
        this.view.getMenuEmployee().addMouseListener((MouseListener) this);
        this.view.getMenuEmployee().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuPayroll().addMouseListener((MouseListener) this);
        this.view.getMenuPayroll().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuUpSalary().addMouseListener((MouseListener) this);
        this.view.getMenuUpSalary().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuLoan().addMouseListener((MouseListener) this);
        this.view.getMenuLoan().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuAbsent().addMouseListener((MouseListener) this);
        this.view.getMenuAbsent().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuOverTime().addMouseListener((MouseListener) this);
        this.view.getMenuOverTime().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuUserSetting().addMouseListener((MouseListener) this);
        this.view.getMenuUserSetting().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuReport().addMouseListener((MouseListener) this);
        this.view.getMenuReport().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuSystemSetting().addMouseListener((MouseListener) this);
        this.view.getMenuSystemSetting().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuTaxSetting().addMouseListener((MouseListener) this);
        this.view.getMenuTaxSetting().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuPayrollSetting().addMouseListener((MouseListener) this);
        this.view.getMenuPayrollSetting().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuCompany().addMouseListener((MouseListener)this);
        this.view.getMenuCompany().addMouseMotionListener((MouseMotionListener) this);
        
        this.view.getMenuLocation().addMouseListener((MouseListener)this);
        this.view.getMenuLocation().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDivision().addMouseListener((MouseListener)this);
        this.view.getMenuDivision().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDepartment().addMouseListener((MouseListener)this);
        this.view.getMenuDepartment().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuUnitWork().addMouseListener((MouseListener)this);
        this.view.getMenuUnitWork().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuTitle().addMouseListener((MouseListener)this);
        this.view.getMenuTitle().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuNationality().addMouseListener((MouseListener)this);
        this.view.getMenuNationality().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuEthnic().addMouseListener((MouseListener)this);
        this.view.getMenuEthnic().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuReligion().addMouseListener((MouseListener)this);
        this.view.getMenuReligion().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuBank().addMouseListener((MouseListener)this);
        this.view.getMenuBank().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuInsurance().addMouseListener((MouseListener)this);
        this.view.getMenuInsurance().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuEmpStatus().addMouseListener((MouseListener)this);
        this.view.getMenuEmpStatus().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuAbsentType().addMouseListener((MouseListener)this);
        this.view.getMenuAbsentType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuOverTimeType().addMouseListener((MouseListener)this);
        this.view.getMenuOverTimeType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuSalaryType().addMouseListener((MouseListener)this);
        this.view.getMenuSalaryType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDeductionType().addMouseListener((MouseListener)this);
        this.view.getMenuDeductionType().addMouseMotionListener((MouseMotionListener) this);
        
        this.view.getMenuDashboard().setSelected(true);
        this.view.getPnControllDashboard().setVisible(true);
        this.view.getPnControllHR().setVisible(false);
        this.view.getPnControllSetting().setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuDashboard()) {
            this.view.getPnControllDashboard().setVisible(true);
            this.view.getPnControllHR().setVisible(false);
            this.view.getPnControllSetting().setVisible(false);
        } else if (e.getSource() == this.view.getMenuHR()) {
            this.view.getPnControllDashboard().setVisible(false);
            this.view.getPnControllHR().setVisible(true);
            this.view.getPnControllSetting().setVisible(false);
        } else if (e.getSource() == this.view.getMenuSetting()) {
            this.view.getPnControllDashboard().setVisible(false);
            this.view.getPnControllHR().setVisible(false);
            this.view.getPnControllSetting().setVisible(true);
        } else if (e.getSource() == this.view.getMenuExit()) {
            System.exit(0);
        } else if (e.getSource() == this.view.getMenuMaximum()) {
            if (cnt == 0) {
                this.view.setExtendedState(FrmMainMenu.MAXIMIZED_BOTH);
                cnt++;
            } else {
                this.view.setExtendedState(FrmMainMenu.NORMAL);
                cnt = 0;
            }
        } else if (e.getSource() == this.view.getMenuMinimum()) {
            this.view.setState(JFrame.ICONIFIED);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getGroupMenuEmployee() || e.getSource() == this.view.getMenuEmployee()) {
            this.view.getGroupEmployeeHover().setVisible(true);
            this.view.getGroupMenuEmployee().setVisible(false);
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
        if (e.getSource() == this.view.getMenuEmployee()) {
            this.view.getGroupEmployeeHover().setVisible(false);
            this.view.getGroupMenuEmployee().setVisible(true);
        }else if (e.getSource() == this.view.getMenuPayroll()) {
            this.view.getGroupMenuPayrollHover().setVisible(false);
            this.view.getGroupMenuPayroll().setVisible(true);
        }else if (e.getSource() == this.view.getMenuUpSalary()) {
            this.view.getGroupMenuUpSalaryHover().setVisible(false);
            this.view.getGroupMenuUpSalary().setVisible(true);
        }else if(e.getSource() == this.view.getMenuLoan()){
            this.view.getGroupMenuLoanHover().setVisible(false);
            this.view.getGroupMenuLoan().setVisible(true);
        }else if(e.getSource() == this.view.getMenuAbsent()){
            this.view.getGroupMenuAbsentHover().setVisible(false);
            this.view.getGroupMenuAbsent().setVisible(true);
        }else if(e.getSource() == this.view.getMenuOverTime()){
            this.view.getGroupMenuOverTimeHover().setVisible(false);
            this.view.getGroupMenuOverTime().setVisible(true);
        }else if(e.getSource() == this.view.getMenuUserSetting()){
            this.view.getGroupMenuUserSettingHover().setVisible(false);
            this.view.getGroupMenuUserSetting().setVisible(true);
        }else if(e.getSource() == this.view.getMenuReport()){
            this.view.getGroupMenuReportHover().setVisible(false);
            this.view.getGroupMenuReport().setVisible(true);
        }else if(e.getSource() == this.view.getMenuSystemSetting()){
            this.view.getGroupMenuSystemSettingHover().setVisible(false);
            this.view.getGroupMenuSystemSetting().setVisible(true);
        }else if(e.getSource() == this.view.getMenuTaxSetting()){
            this.view.getGroupMenuTaxSettingHover().setVisible(false);
            this.view.getGroupMenuTaxSetting().setVisible(true);
        }else if(e.getSource() == this.view.getMenuPayrollSetting()){
            this.view.getGroupMenuPayrollSettingHover().setVisible(false);
            this.view.getGroupMenuPayrollSetting().setVisible(true);
        }else if(e.getSource() == this.view.getMenuCompany()){
            this.view.getMenuCompanyGH().setVisible(false);
            this.view.getMenuCompanyG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuLocation()){
            this.view.getMenuLocationGH().setVisible(false);
            this.view.getMenuLocationG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuDivision()){
            this.view.getMenuDivisionGH().setVisible(false);
            this.view.getMenuDivisionG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuDepartment()){
            this.view.getMenuDepartmentGH().setVisible(false);
            this.view.getMenuDepartmentG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuUnitWork()){
            this.view.getMenuUnitWorkGH().setVisible(false);
            this.view.getMenuUnitWorkG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuTitle()){
            this.view.getMenuTitleGH().setVisible(false);
            this.view.getMenuTitleG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuNationality()){
            this.view.getMenuNationalityGH().setVisible(false);
            this.view.getMenuNationalityG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuEthnic()){
            this.view.getMenuEthnicGH().setVisible(false);
            this.view.getMenuEthnicG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuReligion()){
            this.view.getMenuReligionGH().setVisible(false);
            this.view.getMenuReligionG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuBank()){
            this.view.getMenuBankGH().setVisible(false);
            this.view.getMenuBankG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuInsurance()){
            this.view.getMenuInsuranceGH().setVisible(false);
            this.view.getMenuInsuranceG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuEmpStatus()){
            this.view.getMenuEmpStatusGH().setVisible(false);
            this.view.getMenuEmpStatusG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuAbsentType()){
            this.view.getMenuAbsentTypeGH().setVisible(false);
            this.view.getMenuAbsentTypeG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuOverTimeType()){
            this.view.getMenuOverTimeTypeGH().setVisible(false);
            this.view.getMenuOverTimeTypeG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuSalaryType()){
            this.view.getMenuSalaryTypeGH().setVisible(false);
            this.view.getMenuSalaryTypeG().setVisible(true);
        }else if(e.getSource() == this.view.getMenuDeductionType()){
            this.view.getMenuDeductionTypeGH().setVisible(false);
            this.view.getMenuDeductionTypeG().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getMenuEmployee()) {
            this.view.getGroupEmployeeHover().setVisible(true);
            this.view.getGroupMenuEmployee().setVisible(false);
        }else if (e.getSource() == this.view.getMenuPayroll()) {
            this.view.getGroupMenuPayrollHover().setVisible(true);
            this.view.getGroupMenuPayroll().setVisible(false);
        }else if (e.getSource() == this.view.getMenuUpSalary()) {
            this.view.getGroupMenuUpSalaryHover().setVisible(true);
            this.view.getGroupMenuUpSalary().setVisible(false);
        }else if(e.getSource() == this.view.getMenuLoan()){
            this.view.getGroupMenuLoanHover().setVisible(true);
            this.view.getGroupMenuLoan().setVisible(false);
        }else if(e.getSource() == this.view.getMenuAbsent()){
            this.view.getGroupMenuAbsentHover().setVisible(true);
            this.view.getGroupMenuAbsent().setVisible(false);
        }else if(e.getSource() == this.view.getMenuOverTime()){
            this.view.getGroupMenuOverTimeHover().setVisible(true);
            this.view.getGroupMenuOverTime().setVisible(false);
        }else if(e.getSource() == this.view.getMenuUserSetting()){
            this.view.getGroupMenuUserSettingHover().setVisible(true);
            this.view.getGroupMenuUserSetting().setVisible(false);
        }else if(e.getSource() == this.view.getMenuReport()){
            this.view.getGroupMenuReportHover().setVisible(true);
            this.view.getGroupMenuReport().setVisible(false);
        }else if(e.getSource() == this.view.getMenuSystemSetting()){
            this.view.getGroupMenuSystemSettingHover().setVisible(true);
            this.view.getGroupMenuSystemSetting().setVisible(false);
        }else if(e.getSource() == this.view.getMenuTaxSetting()){
            this.view.getGroupMenuTaxSettingHover().setVisible(true);
            this.view.getGroupMenuTaxSetting().setVisible(false);
        }else if(e.getSource() == this.view.getMenuPayrollSetting()){
            this.view.getGroupMenuPayrollSettingHover().setVisible(true);
            this.view.getGroupMenuPayrollSetting().setVisible(false);
        }else if(e.getSource() == this.view.getMenuCompany()){
            this.view.getMenuCompanyGH().setVisible(true);
            this.view.getMenuCompanyG().setVisible(false);
            
        }else if(e.getSource() == this.view.getMenuLocation()){
            this.view.getMenuLocationGH().setVisible(true);
            this.view.getMenuLocationG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuDivision()){
            this.view.getMenuDivisionGH().setVisible(true);
            this.view.getMenuDivisionG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuDepartment()){
            this.view.getMenuDepartmentGH().setVisible(true);
            this.view.getMenuDepartmentG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuUnitWork()){
            this.view.getMenuUnitWorkGH().setVisible(true);
            this.view.getMenuUnitWorkG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuTitle()){
            this.view.getMenuTitleGH().setVisible(true);
            this.view.getMenuTitleG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuNationality()){
            this.view.getMenuNationalityGH().setVisible(true);
            this.view.getMenuNationalityG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuEthnic()){
            this.view.getMenuEthnicGH().setVisible(true);
            this.view.getMenuEthnicG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuReligion()){
            this.view.getMenuReligionGH().setVisible(true);
            this.view.getMenuReligionG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuBank()){
            this.view.getMenuBankGH().setVisible(true);
            this.view.getMenuBankG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuInsurance()){
            this.view.getMenuInsuranceGH().setVisible(true);
            this.view.getMenuInsuranceG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuEmpStatus()){
            this.view.getMenuEmpStatusGH().setVisible(true);
            this.view.getMenuEmpStatusG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuAbsentType()){
            this.view.getMenuAbsentTypeGH().setVisible(true);
            this.view.getMenuAbsentTypeG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuOverTimeType()){
            this.view.getMenuOverTimeTypeGH().setVisible(true);
            this.view.getMenuOverTimeTypeG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuSalaryType()){
            this.view.getMenuSalaryTypeGH().setVisible(true);
            this.view.getMenuSalaryTypeG().setVisible(false);
        }else if(e.getSource() == this.view.getMenuDeductionType()){
            this.view.getMenuDeductionTypeGH().setVisible(true);
            this.view.getMenuDeductionTypeG().setVisible(false);
        }
    }

}
