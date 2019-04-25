package com.malimar.controllers;

import com.malimar.models.Bank;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.CheckField;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmBank;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class BankController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmBank view;
    private final Bank model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;
    HashMap<String, Object[]> mapDist = null;

    public BankController(FrmBank view) {
        this.view = view;
        Bank b = new Bank();
        this.model = b;
        this.frm = this.view.getClass().getSimpleName();
        this.view.getCmbDistrict().setUI(new BasicComboBoxUI());
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.setEvent();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
        this.setDistrictCombox();
    }

    private void setEvent() {
        this.view.getLblBankInfo().addMouseListener(this);
        this.view.getLblBankInfo().addMouseMotionListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getLblBankID().addMouseListener(this);
        this.view.getLblBankName_L1().addMouseListener(this);
        this.view.getLblBank_L2().addMouseListener(this);
        this.view.getLblDistrict().addMouseListener(this);
        this.view.getCmbDistrict().addActionListener(this);
        this.view.getTxtBankID().addMouseListener(this);
        this.view.getLblDetails().addMouseListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblBankInfo().setText(hmapLang.get("lblBankInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblBankID().setText(hmapLang.get("lblBankID".concat(frm).toUpperCase())[LN]);
        this.view.getLblBankName_L1().setText(hmapLang.get("lblBankName_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblBank_L2().setText(hmapLang.get("lblBank_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblDistrict().setText(hmapLang.get("lblDistrict".concat(frm).toUpperCase())[LN]);;
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getLblDetails().setText(hmapLang.get("lblDetails".concat(frm).toUpperCase())[LN]);
    }

    private void clearText() {
        this.view.getTxtBankID().setText("New");
        this.view.getTxtBank_L1().setText("");
        this.view.getTxtBank_L2().setText("");
        this.view.getTxtDetails().setText("");
        this.view.getCmbDistrict().setSelectedIndex(-1);
    }

    private void setDistrictCombox() {
        try {
            mapDist = this.model.getDistrictInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapDist);
            this.view.getCmbDistrict().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbDistrict().addItem(s);
            });
            this.view.getCmbDistrict().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbDistrict());
        } catch (Exception e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            if (CheckField.comboBox(this.view.getCmbDistrict()) == false) {
                return;
            }
            this.model.setBankName_L1(this.view.getTxtBank_L1().getText());
            this.model.setBankName_L2(this.view.getTxtBank_L2().getText());
            this.model.setDetails(this.view.getTxtDetails().getText());
            String dist = this.view.getCmbDistrict().getSelectedItem().toString();
            this.model.setDistrictID(Integer.parseInt(mapDist.get(dist)[0].toString()));
            if (this.view.getTxtBankID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setBankID(Integer.parseInt(this.view.getTxtBankID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setBankID(Integer.parseInt(this.view.getTxtBankID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        } else if (e.getSource() == this.view.getCmbDistrict()) {
            this.view.getCmbDistrict().setBorder(new EmptyBorder(0, 0, 0, 0));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTxtBankID()) {
            if (e.getClickCount() == 2) {
                this.clearText();
            }
        }else if (e.getSource() == this.view.getTable()) {
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtBankID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtBank_L1().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtBank_L2().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtDetails().setText(this.view.getTable().getValueAt(row, 3).toString());
            this.view.getCmbDistrict().setSelectedItem(this.view.getTable().getValueAt(row, 4).toString());
        } else if (e.getSource() == this.view.getTxtBankID()) {
            if(e.getClickCount()==2){
                this.clearText();
            }
        } else if (e.getSource() == this.view.getLblBankInfo()) {
            Label.WindowChangeLabel("lblBankInfo", frm, e);
        } else if (e.getSource() == this.view.getLblBankID()) {
            Label.WindowChangeLabel("lblBankID", frm, e);
        } else if (e.getSource() == this.view.getLblBankName_L1()) {
            Label.WindowChangeLabel("lblBankName_L1", frm, e);
        } else if (e.getSource() == this.view.getLblBank_L2()) {
            Label.WindowChangeLabel("lblBank_L2", frm, e);
        } else if (e.getSource() == this.view.getLblDistrict()) {
            Label.WindowChangeLabel("lblDistrict", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }else if (e.getSource() == this.view.getLblDetails()) {
            Label.WindowChangeLabel("lblDetails", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblBankInfo()) {
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
            this.view.getPanelHoverDelete().setVisible(false);
            this.view.getPanelDelete().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLblBankInfo()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSave()) {
            this.view.getPanelHover().setVisible(true);
            this.view.getPanelSave().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.view.getPanelHoverDelete().setVisible(true);
            this.view.getPanelDelete().setVisible(false);
        }
    }
}
