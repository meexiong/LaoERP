package com.malimar.controllers;

import com.malimar.utils.EnumStatus;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Valiables;
import com.malimar.views.FrmDatabaseSetting;
import com.malimar.views.FrmLoginSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class LoginController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmLoginSystem view;

    public LoginController(FrmLoginSystem view) {
        this.view = view;
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.view.getBtnDatabaseSetting().addActionListener((ActionListener) this);
        this.view.getBtnLogin().addActionListener((ActionListener) this);
        this.view.getBtnEnglish().addActionListener((ActionListener) this);
        this.view.getBtnLaos().addActionListener((ActionListener) this);
        this.view.getMainPanel().addMouseListener((MouseListener)this);
        this.view.getMainPanel().addMouseMotionListener((MouseMotionListener)this);
        this.view.getBtnLaos().setVisible(false);
        this.view.getBtnEnglish().setVisible(true);
        this.view.getLblWelcome().setText("ຍິນດີເຂົ້າສູ່ລະບົບ");
        this.view.getLblUsername().setText("ຊື່ຜູ້ໃຊ້ລະບົບ");
        this.view.getLblPassword().setText("ລະຫັດຜ່ານ");
        this.view.getBtnLogin().setText("ເຂົ້າໃຊ້ລະບົບ");
        this.view.getBtnDatabaseSetting().setText("ຕັ້ງຄ່າຖານຂໍ້ມູນ");
        Valiables.langType= EnumStatus.L1.name();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getBtnLaos()) {
            Valiables.langType= EnumStatus.L1.name();
            this.view.getBtnLaos().setVisible(false);
            this.view.getBtnEnglish().setVisible(true);
            this.view.getLblWelcome().setText("ຍິນດີເຂົ້າສູ່ລະບົບ");
            this.view.getLblUsername().setText("ຊື່ຜູ້ໃຊ້ລະບົບ");
            this.view.getLblPassword().setText("ລະຫັດຜ່ານ");
            this.view.getBtnLogin().setText("ເຂົ້າໃຊ້ລະບົບ");
            this.view.getBtnDatabaseSetting().setText("ຕັ້ງຄ່າຖານຂໍ້ມູນ");
        } else if (e.getSource() == this.view.getBtnEnglish()) {
             Valiables.langType= EnumStatus.L2.name();
            this.view.getBtnLaos().setVisible(true);
            this.view.getBtnEnglish().setVisible(false);
            this.view.getLblWelcome().setText("Welcome to LaoERP");
            this.view.getLblUsername().setText("Username");
            this.view.getLblPassword().setText("Password");
            this.view.getBtnLogin().setText("Login");
            this.view.getBtnDatabaseSetting().setText("Database Setting");
        } else if (e.getSource() == this.view.getMenuExit()) {
            System.exit(0);
        } else if (e.getSource() == this.view.getBtnDatabaseSetting()) {
            FrmDatabaseSetting frm = new FrmDatabaseSetting(null, true);
            frm.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == this.view.getMainPanel()){
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

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getSource() == this.view.getMainPanel()){
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
