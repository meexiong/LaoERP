
package com.malimar.controllers;

import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.views.FrmSetting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class SettingController implements ActionListener, MouseListener, MouseMotionListener{
    private final FrmSetting view;
    String frm;
    public SettingController(FrmSetting view){
        this.view = view;
        frm = this.view.getClass().getSimpleName();
        this.setEvent();
        this.changeLabel();
    }
    
    private void setEvent(){
        this.view.getMenuSystemSetting().addMouseListener((MouseListener) this);
        this.view.getMenuSystemSetting().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuTaxSetting().addMouseListener((MouseListener) this);
        this.view.getMenuTaxSetting().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuPayrollSetting().addMouseListener((MouseListener) this);
        this.view.getMenuPayrollSetting().addMouseMotionListener((MouseMotionListener) this);
    }
    
    private void changeLabel(){
        this.view.getLblSystemSetting().setText(hmapLang.get("menuSystemSetting".concat(frm).toUpperCase()) [LN]);
        this.view.getLblTaxSetting().setText(hmapLang.get("menuTaxSetting".concat(frm).toUpperCase()) [LN]);
        this.view.getLblPayrollSetting().setText(hmapLang.get("menuPayrollSetting".concat(frm).toUpperCase()) [LN]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         if(e.getSource() == this.view.getLblSystemSetting()){
            Label.WindowChangeLabel("menuSystemSetting", frm, e);
        }else if(e.getSource() == this.view.getLblTaxSetting()){
            Label.WindowChangeLabel("menuTaxSetting", frm, e);
        }else if(e.getSource() == this.view.getLblPayrollSetting()){
            Label.WindowChangeLabel("menuPayrollSetting", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        if (e.getSource() == this.view.getMenuSystemSetting()) {
            this.view.getGroupMenuSystemSettingHover().setVisible(false);
            this.view.getGroupMenuSystemSetting().setVisible(true);
        } else if (e.getSource() == this.view.getMenuTaxSetting()) {
            this.view.getGroupMenuTaxSettingHover().setVisible(false);
            this.view.getGroupMenuTaxSetting().setVisible(true);
        } else if (e.getSource() == this.view.getMenuPayrollSetting()) {
            this.view.getGroupMenuPayrollSettingHover().setVisible(false);
            this.view.getGroupMenuPayrollSetting().setVisible(true);
        } 
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getMenuSystemSetting()) {
            this.view.getGroupMenuSystemSettingHover().setVisible(true);
            this.view.getGroupMenuSystemSetting().setVisible(false);
        } else if (e.getSource() == this.view.getMenuTaxSetting()) {
            this.view.getGroupMenuTaxSettingHover().setVisible(true);
            this.view.getGroupMenuTaxSetting().setVisible(false);
        } else if (e.getSource() == this.view.getMenuPayrollSetting()) {
            this.view.getGroupMenuPayrollSettingHover().setVisible(true);
            this.view.getGroupMenuPayrollSetting().setVisible(false);
        }
    }
}
