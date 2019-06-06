package com.malimar.controllers;

import com.malimar.utils.ManageTable;
import com.malimar.views.FrmNewAbsent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.table.DefaultTableModel;

public class NewAbsentController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmNewAbsent view;
    DefaultTableModel tableModel = new DefaultTableModel();

    public NewAbsentController(FrmNewAbsent view) {
        this.view = view;
        this.setInitial();
        this.setEvent();
    }

    private void setInitial() {
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
    }

    private void setEvent() {
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(false);
            this.view.getPanelSave().setVisible(true);
        }else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelDeleteHover().setVisible(false);
            this.view.getPanelDelete().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        }else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelDeleteHover().setVisible(true);
            this.view.getPanelDelete().setVisible(false);
        }
    }

}
