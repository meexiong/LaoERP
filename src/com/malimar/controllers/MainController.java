package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ControlDeskTop;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Valiables;
import com.malimar.views.FrmAbsentType;
import com.malimar.views.FrmBank;
import com.malimar.views.FrmCompany;
import com.malimar.views.FrmDashboard;
import com.malimar.views.FrmDeductionType;
import com.malimar.views.FrmDepartment;
import com.malimar.views.FrmDivision;
import com.malimar.views.FrmEthnic;
import com.malimar.views.FrmHR;
import com.malimar.views.FrmInsurance;
import com.malimar.views.FrmLocation;
import com.malimar.views.FrmMainMenu;
import com.malimar.views.FrmNationality;
import com.malimar.views.FrmOverTimeType;
import com.malimar.views.FrmReligion;
import com.malimar.views.FrmSalaryType;
import com.malimar.views.FrmSetting;
import com.malimar.views.FrmTitle;
import com.malimar.views.FrmUnitWork;
import com.malimar.views.FrmWorkStatus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MainController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmMainMenu view;
    int cnt = 0;
    String frm;

    public MainController(FrmMainMenu view) {
        this.view = view;
        this.view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frm = this.view.getClass().getSimpleName();
        this.startMain();
        this.changeLabel();
        FrmDashboard obj = new FrmDashboard();
        this.view.getDeskTopControll().add(obj);
        obj.setVisible(true);
    }

    private void startMain() {
        this.view.getLblUserlogin().setText(Valiables.emailLogin);
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

        this.view.getMenuCompany().addMouseListener((MouseListener) this);
        this.view.getMenuCompany().addMouseMotionListener((MouseMotionListener) this);

        this.view.getMenuLocation().addMouseListener((MouseListener) this);
        this.view.getMenuLocation().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDivision().addMouseListener((MouseListener) this);
        this.view.getMenuDivision().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDepartment().addMouseListener((MouseListener) this);
        this.view.getMenuDepartment().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuUnitWork().addMouseListener((MouseListener) this);
        this.view.getMenuUnitWork().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuTitle().addMouseListener((MouseListener) this);
        this.view.getMenuTitle().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuNationality().addMouseListener((MouseListener) this);
        this.view.getMenuNationality().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuEthnic().addMouseListener((MouseListener) this);
        this.view.getMenuEthnic().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuReligion().addMouseListener((MouseListener) this);
        this.view.getMenuReligion().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuBank().addMouseListener((MouseListener) this);
        this.view.getMenuBank().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuInsurance().addMouseListener((MouseListener) this);
        this.view.getMenuInsurance().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuEmpStatus().addMouseListener((MouseListener) this);
        this.view.getMenuEmpStatus().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuAbsentType().addMouseListener((MouseListener) this);
        this.view.getMenuAbsentType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuOverTimeType().addMouseListener((MouseListener) this);
        this.view.getMenuOverTimeType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuSalaryType().addMouseListener((MouseListener) this);
        this.view.getMenuSalaryType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDeductionType().addMouseListener((MouseListener) this);
        this.view.getMenuDeductionType().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDashboard().setSelected(true);
        this.view.getLblLaoERP().addMouseListener((MouseListener) this);
        this.view.getLblLaoERP().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuDashboard().addMouseListener((MouseListener) this);
        this.view.getMenuHR().addMouseListener((MouseListener) this);
        this.view.getMenuSetting().addMouseListener((MouseListener) this);
        this.view.getLblMainData().addMouseListener((MouseListener) this);

        this.view.getPanelTitle().addMouseListener((MouseListener) this);
        this.view.getPanelTitle().addMouseMotionListener((MouseMotionListener) this);
    }

    private void changeLabel() {
        this.view.getLblLaoERP().setText(hmapLang.get("lblLaoERP".concat(frm).toUpperCase())[LN]);
        this.view.getMenuDashboard().setText(hmapLang.get("menuDashboard".concat(frm).toUpperCase())[LN]);
        this.view.getMenuHR().setText(hmapLang.get("menuHR".concat(frm).toUpperCase())[LN]);
        this.view.getMenuSetting().setText(hmapLang.get("menuSetting".concat(frm).toUpperCase())[LN]);
        this.view.getLblMainData().setText(hmapLang.get("lblMainData".concat(frm).toUpperCase())[LN]);
        this.view.getMenuCompany().setText(hmapLang.get("menuCompany".concat(frm).toUpperCase())[LN]);
        this.view.getMenuLocation().setText(hmapLang.get("menuLocation".concat(frm).toUpperCase())[LN]);
        this.view.getMenuDivision().setText(hmapLang.get("menuDivision".concat(frm).toUpperCase())[LN]);
        this.view.getMenuDepartment().setText(hmapLang.get("menuDepartment".concat(frm).toUpperCase())[LN]);
        this.view.getMenuUnitWork().setText(hmapLang.get("menuUnitWork".concat(frm).toUpperCase())[LN]);
        this.view.getMenuTitle().setText(hmapLang.get("menuTitle".concat(frm).toUpperCase())[LN]);
        this.view.getMenuNationality().setText(hmapLang.get("menuNationality".concat(frm).toUpperCase())[LN]);
        this.view.getMenuEthnic().setText(hmapLang.get("menuEthnic".concat(frm).toUpperCase())[LN]);
        this.view.getMenuReligion().setText(hmapLang.get("menuReligion".concat(frm).toUpperCase())[LN]);
        this.view.getMenuBank().setText(hmapLang.get("menuBank".concat(frm).toUpperCase())[LN]);
        this.view.getMenuInsurance().setText(hmapLang.get("menuInsurance".concat(frm).toUpperCase())[LN]);
        this.view.getMenuEmpStatus().setText(hmapLang.get("menuEmpStatus".concat(frm).toUpperCase())[LN]);
        this.view.getMenuAbsentType().setText(hmapLang.get("menuAbsentType".concat(frm).toUpperCase())[LN]);
        this.view.getMenuOverTimeType().setText(hmapLang.get("menuOverTimeType".concat(frm).toUpperCase())[LN]);
        this.view.getMenuSalaryType().setText(hmapLang.get("menuSalaryType".concat(frm).toUpperCase())[LN]);
        this.view.getMenuDeductionType().setText(hmapLang.get("menuDeductionType".concat(frm).toUpperCase())[LN]);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuDashboard()) {
            ControlDeskTop.closeChilds(this.view.getDeskTopControll());
            FrmDashboard obj = new FrmDashboard();
            this.view.getDeskTopControll().add(obj);
            obj.setVisible(true);
        } else if (e.getSource() == this.view.getMenuHR()) {
            ControlDeskTop.closeChilds(this.view.getDeskTopControll());
            FrmHR obj = new FrmHR();
            this.view.getDeskTopControll().add(obj);
            obj.setVisible(true);
        } else if (e.getSource() == this.view.getMenuSetting()) {
            ControlDeskTop.closeChilds(this.view.getDeskTopControll());
            FrmSetting obj = new FrmSetting();
            this.view.getDeskTopControll().add(obj);
            obj.setVisible(true);
        } else if (e.getSource() == this.view.getMenuExit()) {
            System.exit(0);
        } else if (e.getSource() == this.view.getMenuMaximum()) {
            if (cnt == 0) {
                this.view.setExtendedState(this.view.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                cnt++;
            } else {
                this.view.setExtendedState(FrmMainMenu.NORMAL);
                cnt = 0;
            }
        } else if (e.getSource() == this.view.getMenuMinimum()) {
            this.view.setState(JFrame.ICONIFIED);
        } else if (e.getSource() == this.view.getMenuCompany()) {
            FrmCompany f = new FrmCompany();
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuLocation()) {
            FrmLocation f = new FrmLocation();
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuDivision()) {
            FrmDivision f = new FrmDivision(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuDepartment()) {
            FrmDepartment f = new FrmDepartment(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuUnitWork()) {
            FrmUnitWork f = new FrmUnitWork(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuTitle()) {
            FrmTitle f = new FrmTitle(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuNationality()) {
            FrmNationality f = new FrmNationality(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuEthnic()) {
            FrmEthnic f = new FrmEthnic(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuReligion()) {
            FrmReligion f = new FrmReligion(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuBank()) {
            FrmBank f = new FrmBank(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuInsurance()) {
            FrmInsurance f = new FrmInsurance(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuEmpStatus()) {
            FrmWorkStatus f = new FrmWorkStatus(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuAbsentType()) {
            FrmAbsentType f = new FrmAbsentType(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuOverTimeType()) {
            FrmOverTimeType f = new FrmOverTimeType(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuSalaryType()) {
            FrmSalaryType f = new FrmSalaryType(null, true);
            f.setVisible(true);
        } else if (e.getSource() == this.view.getMenuDeductionType()) {
            FrmDeductionType f = new FrmDeductionType(null, true);
            f.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getLblLaoERP()) {
            Label.WindowChangeLabel("lblLaoERP", frm, e);
        } else if (e.getSource() == this.view.getMenuDashboard()) {
            Label.WindowChangeLabel("menuDashboard", frm, e);
        } else if (e.getSource() == this.view.getMenuHR()) {
            Label.WindowChangeLabel("menuHR", frm, e);
        } else if (e.getSource() == this.view.getMenuSetting()) {
            Label.WindowChangeLabel("menuSetting", frm, e);
        } else if (e.getSource() == this.view.getLblMainData()) {
            Label.WindowChangeLabel("lblMainData", frm, e);
        } else if (e.getSource() == this.view.getMenuCompany()) {
            Label.WindowChangeLabel("menuCompany", frm, e);
        } else if (e.getSource() == this.view.getMenuLocation()) {
            Label.WindowChangeLabel("menuLocation", frm, e);
        } else if (e.getSource() == this.view.getMenuDivision()) {
            Label.WindowChangeLabel("menuDivision", frm, e);
        } else if (e.getSource() == this.view.getMenuDepartment()) {
            Label.WindowChangeLabel("menuDepartment", frm, e);
        } else if (e.getSource() == this.view.getMenuUnitWork()) {
            Label.WindowChangeLabel("menuUnitWork", frm, e);
        } else if (e.getSource() == this.view.getMenuTitle()) {
            Label.WindowChangeLabel("menuTitle", frm, e);
        } else if (e.getSource() == this.view.getMenuNationality()) {
            Label.WindowChangeLabel("menuNationality", frm, e);
        } else if (e.getSource() == this.view.getMenuEthnic()) {
            Label.WindowChangeLabel("menuEthnic", frm, e);
        } else if (e.getSource() == this.view.getMenuReligion()) {
            Label.WindowChangeLabel("menuReligion", frm, e);
        } else if (e.getSource() == this.view.getMenuBank()) {
            Label.WindowChangeLabel("menuBank", frm, e);
        } else if (e.getSource() == this.view.getMenuInsurance()) {
            Label.WindowChangeLabel("menuInsurance", frm, e);
        } else if (e.getSource() == this.view.getMenuEmpStatus()) {
            Label.WindowChangeLabel("menuEmpStatus", frm, e);
        } else if (e.getSource() == this.view.getMenuAbsentType()) {
            Label.WindowChangeLabel("menuAbsentType", frm, e);
        } else if (e.getSource() == this.view.getMenuOverTimeType()) {
            Label.WindowChangeLabel("menuOverTimeType", frm, e);
        } else if (e.getSource() == this.view.getMenuSalaryType()) {
            Label.WindowChangeLabel("menuSalaryType", frm, e);
        } else if (e.getSource() == this.view.getMenuDeductionType()) {
            Label.WindowChangeLabel("menuDeductionType", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getPanelTitle()) {
            MoveForm.mousePressed(e);
        } else if (e.getSource() == this.view.getLblLaoERP()) {
            MoveForm.mousePressed(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == this.view.getMenuCompany()) {
            this.view.getMenuCompanyGH().setVisible(false);
            this.view.getMenuCompanyG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuLocation()) {
            this.view.getMenuLocationGH().setVisible(false);
            this.view.getMenuLocationG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuDivision()) {
            this.view.getMenuDivisionGH().setVisible(false);
            this.view.getMenuDivisionG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuDepartment()) {
            this.view.getMenuDepartmentGH().setVisible(false);
            this.view.getMenuDepartmentG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuUnitWork()) {
            this.view.getMenuUnitWorkGH().setVisible(false);
            this.view.getMenuUnitWorkG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuTitle()) {
            this.view.getMenuTitleGH().setVisible(false);
            this.view.getMenuTitleG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuNationality()) {
            this.view.getMenuNationalityGH().setVisible(false);
            this.view.getMenuNationalityG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuEthnic()) {
            this.view.getMenuEthnicGH().setVisible(false);
            this.view.getMenuEthnicG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuReligion()) {
            this.view.getMenuReligionGH().setVisible(false);
            this.view.getMenuReligionG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuBank()) {
            this.view.getMenuBankGH().setVisible(false);
            this.view.getMenuBankG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuInsurance()) {
            this.view.getMenuInsuranceGH().setVisible(false);
            this.view.getMenuInsuranceG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuEmpStatus()) {
            this.view.getMenuEmpStatusGH().setVisible(false);
            this.view.getMenuEmpStatusG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuAbsentType()) {
            this.view.getMenuAbsentTypeGH().setVisible(false);
            this.view.getMenuAbsentTypeG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuOverTimeType()) {
            this.view.getMenuOverTimeTypeGH().setVisible(false);
            this.view.getMenuOverTimeTypeG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuSalaryType()) {
            this.view.getMenuSalaryTypeGH().setVisible(false);
            this.view.getMenuSalaryTypeG().setVisible(true);
        } else if (e.getSource() == this.view.getMenuDeductionType()) {
            this.view.getMenuDeductionTypeGH().setVisible(false);
            this.view.getMenuDeductionTypeG().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getPanelTitle()) {
            MoveForm.mouseDragded(e, this.view);
        } else if (e.getSource() == this.view.getLblLaoERP()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getMenuCompany()) {
            this.view.getMenuCompanyGH().setVisible(true);
            this.view.getMenuCompanyG().setVisible(false);

        } else if (e.getSource() == this.view.getMenuLocation()) {
            this.view.getMenuLocationGH().setVisible(true);
            this.view.getMenuLocationG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuDivision()) {
            this.view.getMenuDivisionGH().setVisible(true);
            this.view.getMenuDivisionG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuDepartment()) {
            this.view.getMenuDepartmentGH().setVisible(true);
            this.view.getMenuDepartmentG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuUnitWork()) {
            this.view.getMenuUnitWorkGH().setVisible(true);
            this.view.getMenuUnitWorkG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuTitle()) {
            this.view.getMenuTitleGH().setVisible(true);
            this.view.getMenuTitleG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuNationality()) {
            this.view.getMenuNationalityGH().setVisible(true);
            this.view.getMenuNationalityG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuEthnic()) {
            this.view.getMenuEthnicGH().setVisible(true);
            this.view.getMenuEthnicG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuReligion()) {
            this.view.getMenuReligionGH().setVisible(true);
            this.view.getMenuReligionG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuBank()) {
            this.view.getMenuBankGH().setVisible(true);
            this.view.getMenuBankG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuInsurance()) {
            this.view.getMenuInsuranceGH().setVisible(true);
            this.view.getMenuInsuranceG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuEmpStatus()) {
            this.view.getMenuEmpStatusGH().setVisible(true);
            this.view.getMenuEmpStatusG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuAbsentType()) {
            this.view.getMenuAbsentTypeGH().setVisible(true);
            this.view.getMenuAbsentTypeG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuOverTimeType()) {
            this.view.getMenuOverTimeTypeGH().setVisible(true);
            this.view.getMenuOverTimeTypeG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuSalaryType()) {
            this.view.getMenuSalaryTypeGH().setVisible(true);
            this.view.getMenuSalaryTypeG().setVisible(false);
        } else if (e.getSource() == this.view.getMenuDeductionType()) {
            this.view.getMenuDeductionTypeGH().setVisible(true);
            this.view.getMenuDeductionTypeG().setVisible(false);
        }
    }

}
