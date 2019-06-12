package com.malimar.controllers;

import com.malimar.models.Label;
import com.malimar.models.Login;
import com.malimar.utils.EnumStatus;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Variable;
import static com.malimar.utils.Variable.langType;
import com.malimar.views.FrmChangePassword;
import com.malimar.views.FrmDatabaseSetting;
import com.malimar.views.FrmLoginSystem;
import com.malimar.views.FrmMainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class LoginController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmLoginSystem view;
    private final Login model;

    public LoginController(FrmLoginSystem view) {
        this.view = view;
        Login l = new Login();
        this.model = l;
        this.view.getTxtUsername().addActionListener((ActionListener) this);
        this.view.getTxtPassword().addActionListener((ActionListener) this);
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.view.getBtnDatabaseSetting().addActionListener((ActionListener) this);
        this.view.getBtnLogin().addActionListener((ActionListener) this);
        this.view.getBtnEnglish().addActionListener((ActionListener) this);
        this.view.getBtnLaos().addActionListener((ActionListener) this);
        this.view.getMainPanel().addMouseListener((MouseListener) this);
        this.view.getMainPanel().addMouseMotionListener((MouseMotionListener) this);
        this.view.getBtnLaos().setVisible(false);
        this.view.getBtnEnglish().setVisible(true);
        this.view.getLblWelcome().setText("ຍິນດີເຂົ້າສູ່ລະບົບ");
        this.view.getLblUsername().setText("ຊື່ຜູ້ໃຊ້ລະບົບ");
        this.view.getLblPassword().setText("ລະຫັດຜ່ານ");
        this.view.getBtnLogin().setText("ເຂົ້າໃຊ້ລະບົບ");
        this.view.getBtnDatabaseSetting().setText("ຕັ້ງຄ່າຖານຂໍ້ມູນ");
        Variable.langType = EnumStatus.L1.name();
        this.view.getTxtUsername().requestFocus();
    }

    private boolean verifyPassword() {
        try {
            if (this.view.getTxtPassword().getText().equals(this.model.getUserPassword())) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    private void login() {
        this.model.setUsername(this.view.getTxtUsername().getText());
        if (this.model.getNewUser() == true) {
            FrmChangePassword frm = new FrmChangePassword(null, true);
            frm.setVisible(true);
            this.view.getTxtUsername().requestFocus();
        } else {
            if (this.verifyPassword() == true) {
                this.view.dispose();
                if(Variable.langType.equals(EnumStatus.L1.name())){
                    Label.LN = 0;
                }else{
                    Label.LN = 1;
                }
                Label.getLabelLang();
                FrmMainMenu frm = new FrmMainMenu();
                frm.setVisible(true);
            } else {
                if (langType.equals(EnumStatus.L1.name())) {
                    this.view.getLblIncorrect().setText("ຊື່ ຫຼື ລະຫັດຜ່ານບໍ່ຖືກຕ້ອງ");
                } else {
                    this.view.getLblIncorrect().setText("User or Password Incorrect");
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getBtnLaos()) {
            Variable.langType = EnumStatus.L1.name();
            this.view.getBtnLaos().setVisible(false);
            this.view.getBtnEnglish().setVisible(true);
            this.view.getLblWelcome().setText("ຍິນດີເຂົ້າສູ່ລະບົບ");
            this.view.getLblUsername().setText("ຊື່ຜູ້ໃຊ້ລະບົບ");
            this.view.getLblPassword().setText("ລະຫັດຜ່ານ");
            this.view.getBtnLogin().setText("ເຂົ້າໃຊ້ລະບົບ");
            this.view.getBtnDatabaseSetting().setText("ຕັ້ງຄ່າຖານຂໍ້ມູນ");
            this.view.getTxtUsername().requestFocus();
        } else if (e.getSource() == this.view.getBtnEnglish()) {
            Variable.langType = EnumStatus.L2.name();
            this.view.getBtnLaos().setVisible(true);
            this.view.getBtnEnglish().setVisible(false);
            this.view.getLblWelcome().setText("Welcome to LaoERP");
            this.view.getLblUsername().setText("Username");
            this.view.getLblPassword().setText("Password");
            this.view.getBtnLogin().setText("Login");
            this.view.getBtnDatabaseSetting().setText("Database Setting");
            this.view.getTxtUsername().requestFocus();
        } else if (e.getSource() == this.view.getMenuExit()) {
            System.exit(0);
        } else if (e.getSource() == this.view.getBtnDatabaseSetting()) {
            FrmDatabaseSetting frm = new FrmDatabaseSetting(null, true);
            frm.setVisible(true);
            this.view.getTxtUsername().requestFocus();
        } else if (e.getSource() == this.view.getBtnLogin()) {
            this.login();
        } else if (e.getSource() == this.view.getTxtUsername()) {
            this.view.getTxtPassword().requestFocus();
        } else if (e.getSource() == this.view.getTxtPassword()) {
            this.login();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getMainPanel()) {
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
        if (e.getSource() == this.view.getMainPanel()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
