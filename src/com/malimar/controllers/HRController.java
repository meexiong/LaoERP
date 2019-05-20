
package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ControlDeskTop;
import com.malimar.views.FrmEmployee;
import com.malimar.views.FrmHR;
import com.malimar.views.FrmMainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class HRController implements ActionListener, MouseListener, MouseMotionListener{
    private final FrmHR view;
    String frm;
    public HRController(FrmHR view){
        this.view = view;
        frm = this.view.getClass().getSimpleName();
        this.changeLabel();
        this.setAction();
    }
    private void setAction(){
        this.view.getMenuEmployee().addActionListener((ActionListener) this);
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
    }
    private void changeLabel(){
        this.view.getLblEmployee().setText(hmapLang.get("menuEmployee".concat(frm).toUpperCase()) [LN]);
        this.view.getLblPayroll().setText(hmapLang.get("menuPayroll".concat(frm).toUpperCase()) [LN]);
        this.view.getLblUpSalary().setText(hmapLang.get("menuUpSalary".concat(frm).toUpperCase()) [LN]);
        this.view.getLblLoan().setText(hmapLang.get("menuLoan".concat(frm).toUpperCase()) [LN]);
        this.view.getLblAbsent().setText(hmapLang.get("menuAbsent".concat(frm).toUpperCase()) [LN]);
        this.view.getLblOvertime().setText(hmapLang.get("menuOverTime".concat(frm).toUpperCase()) [LN]);
        this.view.getLblUserSetting().setText(hmapLang.get("menuUserSetting".concat(frm).toUpperCase()) [LN]);
        this.view.getLblReport().setText(hmapLang.get("menuReport".concat(frm).toUpperCase()) [LN]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == this.view.getMenuEmployee()){
             ControlDeskTop.closeChilds(FrmMainMenu.deskTopControll);
            FrmEmployee f = new FrmEmployee();
            FrmMainMenu.deskTopControll.add(f);
            f.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getLblEmployee()){
            Label.WindowChangeLabel("menuEmployee", frm, e);
        }else if(e.getSource() == this.view.getLblPayroll()){
            Label.WindowChangeLabel("menuPayroll", frm, e);
        }else if(e.getSource() == this.view.getLblUpSalary()){
            Label.WindowChangeLabel("menuUpSalary", frm, e);
        }else if(e.getSource() == this.view.getLblLoan()){
            Label.WindowChangeLabel("menuLoan", frm, e);
        }else if(e.getSource() == this.view.getLblAbsent()){
            Label.WindowChangeLabel("menuAbsent", frm, e);
        }else if(e.getSource() == this.view.getLblOvertime()){
            Label.WindowChangeLabel("menuOverTime", frm, e);
        }else if(e.getSource() == this.view.getLblUserSetting()){
            Label.WindowChangeLabel("menuUserSetting", frm, e);
        }else if(e.getSource() == this.view.getLblReport()){
            Label.WindowChangeLabel("menuReport", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == this.view.getMenuEmployee()) {
            this.view.getGroupEmployeeHover().setVisible(false);
            this.view.getGroupMenuEmployee().setVisible(true);
        } else if (e.getSource() == this.view.getMenuPayroll()) {
            this.view.getGroupMenuPayrollHover().setVisible(false);
            this.view.getGroupMenuPayroll().setVisible(true);
        } else if (e.getSource() == this.view.getMenuUpSalary()) {
            this.view.getGroupMenuUpSalaryHover().setVisible(false);
            this.view.getGroupMenuUpSalary().setVisible(true);
        } else if (e.getSource() == this.view.getMenuLoan()) {
            this.view.getGroupMenuLoanHover().setVisible(false);
            this.view.getGroupMenuLoan().setVisible(true);
        } else if (e.getSource() == this.view.getMenuAbsent()) {
            this.view.getGroupMenuAbsentHover().setVisible(false);
            this.view.getGroupMenuAbsent().setVisible(true);
        } else if (e.getSource() == this.view.getMenuOverTime()) {
            this.view.getGroupMenuOverTimeHover().setVisible(false);
            this.view.getGroupMenuOverTime().setVisible(true);
        }else if (e.getSource() == this.view.getMenuUserSetting()) {
            this.view.getGroupMenuUserSettingHover().setVisible(false);
            this.view.getGroupMenuUserSetting().setVisible(true);
        } else if (e.getSource() == this.view.getMenuReport()) {
            this.view.getGroupMenuReportHover().setVisible(false);
            this.view.getGroupMenuReport().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getMenuEmployee()) {
            this.view.getGroupEmployeeHover().setVisible(true);
            this.view.getGroupMenuEmployee().setVisible(false);
        } else if (e.getSource() == this.view.getMenuPayroll()) {
            this.view.getGroupMenuPayrollHover().setVisible(true);
            this.view.getGroupMenuPayroll().setVisible(false);
        } else if (e.getSource() == this.view.getMenuUpSalary()) {
            this.view.getGroupMenuUpSalaryHover().setVisible(true);
            this.view.getGroupMenuUpSalary().setVisible(false);
        } else if (e.getSource() == this.view.getMenuLoan()) {
            this.view.getGroupMenuLoanHover().setVisible(true);
            this.view.getGroupMenuLoan().setVisible(false);
        } else if (e.getSource() == this.view.getMenuAbsent()) {
            this.view.getGroupMenuAbsentHover().setVisible(true);
            this.view.getGroupMenuAbsent().setVisible(false);
        } else if (e.getSource() == this.view.getMenuOverTime()) {
            this.view.getGroupMenuOverTimeHover().setVisible(true);
            this.view.getGroupMenuOverTime().setVisible(false);
        } else if (e.getSource() == this.view.getMenuUserSetting()) {
            this.view.getGroupMenuUserSettingHover().setVisible(true);
            this.view.getGroupMenuUserSetting().setVisible(false);
        } else if (e.getSource() == this.view.getMenuReport()) {
            this.view.getGroupMenuReportHover().setVisible(true);
            this.view.getGroupMenuReport().setVisible(false);
        } 
    }
    
}
