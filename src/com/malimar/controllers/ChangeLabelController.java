
package com.malimar.controllers;

import com.malimar.models.Label;
import com.malimar.views.FrmChangeLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeLabelController implements ActionListener{
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
}
