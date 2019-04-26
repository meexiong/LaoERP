
package com.malimar.controllers;

import com.malimar.models.Label;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmChangeLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ChangeLabelController implements ActionListener, MouseListener, MouseMotionListener{
    private final FrmChangeLabel view;
    private final Label model;
    public ChangeLabelController(FrmChangeLabel view){
        this.view = view;
        Label lb = new Label();
        this.model = lb;
        this.view.getBtnSave().addActionListener((ActionListener)this);
        this.model.load();
        this.view.getTxtFieldName().setText(Label.fieldName);
        this.view.getTxtLao().setText(this.model.getLabelLao());
        this.view.getTxtEN().setText(this.model.getLabelEN());
        this.view.getMenuExit().addActionListener((ActionListener)this);
        this.view.getLblTitle().addMouseListener((MouseListener)this);
        this.view.getLblTitle().addMouseMotionListener((MouseMotionListener)this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.view.getBtnSave()){
            this.model.setLabelLao(this.view.getTxtLao().getText());
            this.model.setLabelEN(this.view.getTxtEN().getText());
            this.model.saveLabel();
            this.view.dispose();
        }else if(e.getSource() == this.view.getMenuExit()){
            this.view.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblTitle()) {
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
        if (e.getSource() == this.view.getLblTitle()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
