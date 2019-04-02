package com.malimar.controllers;

import com.malimar.models.DatabaseSetting;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmDatabaseSetting;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.jdesktop.swingx.prompt.PromptSupport;

public class DatabaseSettingController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmDatabaseSetting view;
    private final DatabaseSetting model;
    public DatabaseSettingController(FrmDatabaseSetting view) {
        this.view = view;
        DatabaseSetting m = new DatabaseSetting();
        this.model = m;
        this.view.getBtnRead().addActionListener((ActionListener) this);
        this.view.getBtnRead().addMouseListener((MouseListener) this);
        this.view.getBtnRead().addMouseMotionListener((MouseMotionListener) this);
        this.view.getBtnTest().addActionListener((ActionListener) this);
        this.view.getBtnTest().addMouseListener((MouseListener) this);
        this.view.getBtnTest().addMouseMotionListener((MouseMotionListener) this);
        this.view.getBtnSave().addActionListener((ActionListener) this);
        this.view.getBtnSave().addMouseListener((MouseListener) this);
        this.view.getBtnSave().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMain().addMouseListener((MouseListener) this);
        this.view.getMain().addMouseMotionListener((MouseMotionListener) this);
        this.view.getMenuExit().addActionListener((ActionListener) this);
        this.changeLabel();
    }
    private void changeLabel(){
        PromptSupport.setPrompt("Server name", this.view.getTxtServerName());
        PromptSupport.setPrompt("Database name", this.view.getTxtDatabase());
        PromptSupport.setPrompt("User name", this.view.getTxtUsername());
        PromptSupport.setPrompt("Password", this.view.getTxtPassword());
        PromptSupport.setPrompt("Port", this.view.getTxtPort());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        }else if(e.getSource() == this.view.getBtnSave()){
            this.model.setServerName(this.view.getTxtServerName().getText());
            this.model.setDatabaseName(this.view.getTxtDatabase().getText());
            this.model.setUserName(this.view.getTxtUsername().getText());
            this.model.setPassword(this.view.getTxtPassword().getText());
            this.model.setPort(this.view.getTxtPort().getText());
            if(this.model.write() == true){
               this.view.dispose();
            }else{
                MessageBox.msgWarning();
            }
        }else if(e.getSource() == this.view.getBtnRead()){
            this.model.read();
            this.view.getTxtServerName().setText(this.model.getServerName());
            this.view.getTxtDatabase().setText(this.model.getDatabaseName());
            this.view.getTxtUsername().setText(this.model.getUserName());
            this.view.getTxtPassword().setText(this.model.getPassword());
            this.view.getTxtPort().setText(this.model.getPort());
        }else if(e.getSource() == this.view.getBtnTest()){
            this.model.setServerName(this.view.getTxtServerName().getText());
            this.model.setDatabaseName(this.view.getTxtDatabase().getText());
            this.model.setUserName(this.view.getTxtUsername().getText());
            this.model.setPassword(this.view.getTxtPassword().getText());
            this.model.setPort(this.view.getTxtPort().getText());
            if(this.model.test() == true){
                MessageBox.msgConnected();
            }else{
                MessageBox.msgDisconnected();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getMain()) {
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
        if (e.getSource() == this.view.getBtnRead()) {
            this.view.getPanelReadHover().setVisible(false);
            this.view.getPanelRead().setVisible(true);
        } else if (e.getSource() == this.view.getBtnTest()) {
            this.view.getPanelTestHover().setVisible(false);
            this.view.getPanelTest().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelSaveHover().setVisible(false);
            this.view.getPanelSave().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getMain()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnRead()) {
            this.view.getPanelReadHover().setVisible(true);
            this.view.getPanelRead().setVisible(false);
        } else if (e.getSource() == this.view.getBtnTest()) {
            this.view.getPanelTestHover().setVisible(true);
            this.view.getPanelTest().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelSaveHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        }
    }

}
