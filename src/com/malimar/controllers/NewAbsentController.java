package com.malimar.controllers;

import com.malimar.models.Absent;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Variable;
import com.malimar.views.FrmNewAbsent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;

public class NewAbsentController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmNewAbsent view;
    private final Absent model;
    DefaultTableModel tableModel = new DefaultTableModel();
    HashMap<String, Object[]> mapAbDeduction = null;
    HashMap<String, Object[]> mapAbReason = null;
    String frm;
    public NewAbsentController(FrmNewAbsent view, int emID, String emNbr, String emName) {
        this.view = view;
        Absent ab = new Absent();
        this.model = ab;
        this.model.setEmpID(emID);
        this.frm = this.view.getClass().getSimpleName();
        this.view.getTxtEmployee().setText(String.valueOf(emNbr) + " " + emName);
        this.setInitial();
        this.setEvent();
        this.language();
    }

    private void setInitial() {
        this.view.getCmbReason().setUI(new BasicComboBoxUI());
        this.view.getCmbDeductionFrom().setUI(new BasicComboBoxUI());
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        this.setAbDeduction();
        this.setAbReason();
        this.model.load(this.view.getTable(), tableModel);
        this.clear();
        this.view.getTxtAbsentID().setVisible(false);
        this.view.getTxtAbsentDate().setDate(new Date());
    }

    private void setAbDeduction() {
        try {
            mapAbDeduction = this.model.getAbDeduction();
            Map<String, Object[]> SortMap = new TreeMap<>(mapAbDeduction);
            this.view.getCmbDeductionFrom().removeAllItems();
            SortMap.keySet().forEach((s) -> {

                this.view.getCmbDeductionFrom().addItem(s);
            });
            this.view.getCmbDeductionFrom().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setAbReason() {
        try {
            mapAbReason = this.model.getAbReason();
            Map<String, Object[]> SortMap = new TreeMap<>(mapAbReason);
            this.view.getCmbReason().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbReason().addItem(s);
            });
            this.view.getCmbReason().setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }

    private void setEvent() {
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getLblNewAbsentInfo().addMouseListener(this);
        this.view.getLblNewAbsentInfo().addMouseMotionListener(this);
    }
    
    private void language(){
        this.view.getLblNewAbsentInfo().setText(hmapLang.get("lblNewAbsentInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblAbsentDate().setText(hmapLang.get("lblAbsentDate".concat(frm).toUpperCase())[LN]);
        this.view.getLblDeductionFrom().setText(hmapLang.get("lblDeductionFrom".concat(frm).toUpperCase())[LN]);
        this.view.getLblHours().setText(hmapLang.get("lblHours".concat(frm).toUpperCase())[LN]);
        this.view.getLblMinute().setText(hmapLang.get("lblMinute".concat(frm).toUpperCase())[LN]);
        this.view.getLblReason().setText(hmapLang.get("lblReason".concat(frm).toUpperCase())[LN]);
        this.view.getLblMgr().setText(hmapLang.get("lblMgr".concat(frm).toUpperCase())[LN]);
        this.view.getLblHRApprove().setText(hmapLang.get("lblHR".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
    }

    private void clear() {
        this.view.getTxtAbsentID().setText("New");
        this.view.getCmbDeductionFrom().setSelectedIndex(-1);
        this.view.getTxtHours().setText("0");
        this.view.getTxtMinute().setText("0");
        this.view.getCmbReason().setSelectedIndex(-1);
        this.view.getChHRApprove().setSelected(false);
        this.view.getChMgrApprove().setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            String abDed = this.view.getCmbDeductionFrom().getSelectedItem().toString();
            this.model.setDedID(Integer.parseInt(mapAbDeduction.get(abDed)[0].toString()));
            this.model.setHours(Integer.parseInt(this.view.getTxtHours().getText()));
            this.model.setMinute(Integer.parseInt(this.view.getTxtMinute().getText()));
            this.model.setAbsentDate(this.view.getTxtAbsentDate().getDate());
            this.model.setMgrApprove(this.view.getChMgrApprove().isSelected());
            this.model.setHrApprove(this.view.getChHRApprove().isSelected());
            String reason = this.view.getCmbReason().getSelectedItem().toString();
            this.model.setReasonID(Integer.parseInt(mapAbReason.get(reason)[0].toString()));
            if (this.view.getTxtAbsentID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    this.model.load(this.view.getTable(), tableModel);
                    this.clear();
                    Variable.reQuery=1;
                }
            } else {
                this.model.setAbsentID(Integer.parseInt(this.view.getTxtAbsentID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    this.model.load(this.view.getTable(), tableModel);
                    this.clear();
                    Variable.reQuery=1;
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clear();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setAbsentID(Integer.parseInt(this.view.getTxtAbsentID().getText()));
            if (this.model.delete() != true) {
                MessageBox.msgError();
            } else {
                this.model.load(this.view.getTable(), tableModel);
                this.clear();
                Variable.reQuery=1;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTable()) {
            try {
                int rowSelc = this.view.getTable().getSelectedRow();
                this.view.getTxtAbsentID().setText(this.view.getTable().getValueAt(rowSelc, 0).toString());
                java.util.Date stdate = new SimpleDateFormat("dd-MM-yyyy").parse(this.view.getTable().getValueAt(rowSelc, 1).toString());
                this.view.getTxtAbsentDate().setDate(stdate);
                this.view.getTxtHours().setText(this.view.getTable().getValueAt(rowSelc, 2).toString());
                this.view.getTxtMinute().setText(this.view.getTable().getValueAt(rowSelc, 3).toString());
                String cate = this.view.getTable().getValueAt(rowSelc, 4).toString();
                String x = this.model.getDedMapKey(mapAbDeduction, cate);
                this.view.getCmbDeductionFrom().setSelectedItem(x);
                this.view.getCmbReason().setSelectedItem(this.view.getTable().getValueAt(rowSelc, 5).toString());
                this.view.getChMgrApprove().setSelected((Boolean) this.view.getTable().getValueAt(rowSelc, 6));
                this.view.getChHRApprove().setSelected((Boolean) this.view.getTable().getValueAt(rowSelc, 7));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblNewAbsentInfo()) {
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
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelDeleteHover().setVisible(false);
            this.view.getPanelDelete().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLblNewAbsentInfo()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelDeleteHover().setVisible(true);
            this.view.getPanelDelete().setVisible(false);
        }
    }

}
