package com.malimar.controllers;

import com.malimar.models.Company;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.utils.ResizeImage;
import com.malimar.views.FrmCompany;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class CompanyController implements ActionListener, MouseListener, KeyListener, MouseMotionListener {

    private final FrmCompany view;
    private final Company model;
    String frm;
    public CompanyController(FrmCompany view) {
        this.view = view;
        this.frm = this.view.getClass().getSimpleName();
        Company d = new Company();
        this.model = d;
        this.changeLabel();
        this.setAction();
        this.load();
    }

    private void setAction() {
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.view.getLblCompanyInfo().addMouseListener(this);
        this.view.getLblCompanyInfo().addMouseMotionListener(this);
        this.view.getLblID().addMouseListener(this);
        this.view.getLblCompany_L1().addMouseListener(this);
        this.view.getLblCompany_L2().addMouseListener(this);
        this.view.getLblTelephone().addMouseListener(this);
        this.view.getLblAddress_L1().addMouseListener(this);
        this.view.getLblAddress_L2().addMouseListener(this);
        this.view.getLblFax().addMouseListener(this);
        this.view.getLblImage().addMouseListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
    }

    private void load() {
        try {
            this.model.setCompanyInfo();
            this.view.getTxtID().setText(String.valueOf(this.model.getCompayID()));
            this.view.getTxtCompany_L1().setText(this.model.getCompayName_L1());
            this.view.getTxtCompany_L2().setText(this.model.getCompayName_L2());
            this.view.getTxtTelephone().setText(this.model.getTelephone());
            this.view.getTxtFax().setText(this.model.getFax());
            this.view.getTxtAddress_L1().setText(this.model.getAddress_L1());
            this.view.getTxtAddress_L2().setText(this.model.getAddress_L2());
            if (this.model.getLogo() == null) {
                this.view.getLblImage().setText("");
                this.view.getLblImage().setIcon(null);
            } else {
                Image img1 = new ImageIcon(this.model.getLogo()).getImage();
                Image ic = ResizeImage.resizeImage(img1, this.view.getLblImage().getWidth(), this.view.getLblImage().getHeight());
                this.view.getLblImage().setIcon(new ImageIcon(ic));
            }
        } catch (Exception e) {
        }
    }
    private void changeLabel(){
        this.view.getLblCompanyInfo().setText(hmapLang.get("lblCompanyInfo".concat(frm).toUpperCase()) [LN]);
        this.view.getLblID().setText(hmapLang.get("lblID".concat(frm).toUpperCase()) [LN]);
        this.view.getLblCompany_L1().setText(hmapLang.get("lblCompany_L1".concat(frm).toUpperCase()) [LN]);
        this.view.getLblCompany_L2().setText(hmapLang.get("lblCompany_L2".concat(frm).toUpperCase()) [LN]);
        this.view.getLblTelephone().setText(hmapLang.get("lblTelephone".concat(frm).toUpperCase()) [LN]);
        this.view.getLblFax().setText(hmapLang.get("lblFax".concat(frm).toUpperCase()) [LN]);
        this.view.getLblAddress_L1().setText(hmapLang.get("lblAddress_L1".concat(frm).toUpperCase()) [LN]);
        this.view.getLblAddress_L2().setText(hmapLang.get("lblAddress_L2".concat(frm).toUpperCase()) [LN]);
        this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase()) [LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase()) [LN]);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.model.setCompayName_L1(this.view.getTxtCompany_L1().getText());
            this.model.setCompayName_L2(this.view.getTxtCompany_L2().getText());
            this.model.setTelephone(this.view.getTxtTelephone().getText());
            this.model.setFax(this.view.getTxtFax().getText());
            this.model.setAddress_L1(this.view.getTxtAddress_L1().getText());
            this.model.setAddress_L2(this.view.getTxtAddress_L2().getText());
            if (this.view.getTxtID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgWarning();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setCompayID(Integer.parseInt(this.view.getTxtID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgWarning();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.load();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getLblImage()) {
            if (e.getClickCount() == 2) {
                JFileChooser choose = new JFileChooser();
                choose.showOpenDialog(null);
                File f = choose.getSelectedFile();
                if (f != null) {
                    this.model.setPathLogo(choose.getSelectedFile().getAbsolutePath());
                    Image img = new ImageIcon(this.model.getPathLogo()).getImage();
                    Image ic = ResizeImage.resizeImage(img, this.view.getLblImage().getWidth(), this.view.getLblImage().getHeight());
                    this.view.getLblImage().setText("");
                    this.view.getLblImage().setIcon(new ImageIcon(ic));
                }
            }
        }else if(e.getSource() == this.view.getLblCompanyInfo()){
            Label.WindowChangeLabel("lblCompanyInfo", frm, e);
        }else if(e.getSource() == this.view.getLblID()){
            Label.WindowChangeLabel("lblID", frm, e);
        }else if(e.getSource() == this.view.getLblCompany_L1()){
            Label.WindowChangeLabel("lblCompany_L1", frm, e);
        }else if(e.getSource() == this.view.getLblCompany_L2()){
            Label.WindowChangeLabel("lblCompany_L2", frm, e);
        }else if(e.getSource() == this.view.getLblTelephone()){
            Label.WindowChangeLabel("lblTelephone", frm, e);
        }else if(e.getSource() == this.view.getLblFax()){
            Label.WindowChangeLabel("lblFax", frm, e);
        }else if(e.getSource() == this.view.getLblAddress_L1()){
            Label.WindowChangeLabel("lblAddress_L1", frm, e);
        }else if(e.getSource() == this.view.getLblAddress_L2()){
            Label.WindowChangeLabel("lblAddress_L2", frm, e);
        }else if(e.getSource() == this.view.getLblImage()){
            Label.WindowChangeLabel("lblImage", frm, e);
        }else if(e.getSource() == this.view.getBtnSave()){
            Label.WindowChangeLabel("btnSave", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblCompanyInfo()) {
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
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(false);
            this.view.getPanelSave().setVisible(true);
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

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLblCompanyInfo()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        }
    }
}
