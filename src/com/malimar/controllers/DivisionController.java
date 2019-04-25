package com.malimar.controllers;

import com.malimar.models.Division;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.utils.CheckField;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.utils.ResizeImage;
import com.malimar.views.FrmDivision;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class DivisionController implements ActionListener, MouseListener, KeyListener, MouseMotionListener {

    private final FrmDivision view;
    private final Division model;
    DefaultTableModel tableModel = new DefaultTableModel();
    String frm;
    HashMap<String, Object[]> mapBank = null;

    public DivisionController(FrmDivision view) {
        this.view = view;
        Division d = new Division();
        this.model = d;
        this.setEvent();
        this.frm = this.view.getClass().getSimpleName();
        this.view.getCmbBank().setUI(new BasicComboBoxUI());
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        this.changeLabel();
        this.model.load(this.view.getTable(), tableModel);
        this.setProvinceCombox();
    }

    private void setEvent() {
        this.view.getLblDivisionInfo().addMouseListener(this);
        this.view.getLblDivisionInfo().addMouseMotionListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getLblDivisionInfo().addMouseListener(this);
        this.view.getLblDivisionID().addMouseListener(this);
        this.view.getLblDivision_L1().addMouseListener(this);
        this.view.getLblDivision_L2().addMouseListener(this);
        this.view.getLblBank().addMouseListener(this);
        this.view.getCmbBank().addActionListener(this);
        this.view.getLblImage().addMouseListener(this);
        this.view.getTxtDivisionID().addMouseListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
        this.view.getLblDivisionInfo().setText(hmapLang.get("lblDivisionInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblDivisionID().setText(hmapLang.get("lblDivisionID".concat(frm).toUpperCase())[LN]);
        this.view.getLblDivision_L1().setText(hmapLang.get("lblDivision_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblDivision_L2().setText(hmapLang.get("lblDivision_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblBank().setText(hmapLang.get("lblBank".concat(frm).toUpperCase())[LN]);
        this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getLblSortBy().setText(hmapLang.get("lblSortBy".concat(frm).toUpperCase())[LN]);
    }

    private void setProvinceCombox() {
        try {
            mapBank = this.model.getBankInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapBank);
            this.view.getCmbBank().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbBank().addItem(s);
            });
            this.view.getCmbBank().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbBank());
        } catch (Exception e) {
        }
    }

    private void clearText() {
        this.view.getTxtDivisionID().setText("New");
        this.view.getTxtDivision_L1().setText("");
        this.view.getTxtDivision_L2().setText("");
        this.view.getTxtSortBy().setText("");
        this.view.getCmbBank().setSelectedIndex(-1);
        this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase())[LN]);
        this.view.getLblImage().setIcon(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSave()) {
            if (CheckField.comboBox(this.view.getCmbBank()) == false) {
                return;
            }
            this.model.setDivision_L1(this.view.getTxtDivision_L1().getText());
            this.model.setDivision_L2(this.view.getTxtDivision_L2().getText());
            this.model.setSortBy(Integer.parseInt(this.view.getTxtSortBy().getText()));
            String bank = this.view.getCmbBank().getSelectedItem().toString();
            this.model.setBankID(Integer.parseInt(mapBank.get(bank)[0].toString()));
            if (this.view.getTxtDivisionID().getText().equals("New")) {
                if (this.model.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.model.setDivisionID(Integer.parseInt(this.view.getTxtDivisionID().getText()));
                if (this.model.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.model.load(this.view.getTable(), tableModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDelete()) {
            this.model.setDivisionID(Integer.parseInt(this.view.getTxtDivisionID().getText()));
            if (this.model.delete() == true) {
                MessageBox.msgSuccess();
                this.model.load(this.view.getTable(), tableModel);
                this.clearText();
            }
        } else if (e.getSource() == this.view.getCmbBank()) {
            this.view.getCmbBank().setBorder(new EmptyBorder(0, 0, 0, 0));
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
                    this.model.setLogoPath(choose.getSelectedFile().getAbsolutePath());
                    Image img = new ImageIcon(this.model.getLogoPath()).getImage();
                    Image ic = ResizeImage.resizeImage(img, this.view.getLblImage().getWidth(), this.view.getLblImage().getHeight());
                    this.view.getLblImage().setText("");
                    this.view.getLblImage().setIcon(new ImageIcon(ic));
                }
            }
        } else if (e.getSource() == this.view.getTable()) {
            int row = this.view.getTable().getSelectedRow();
            this.view.getTxtDivisionID().setText(this.view.getTable().getValueAt(row, 0).toString());
            this.view.getTxtSortBy().setText(this.view.getTable().getValueAt(row, 1).toString());
            this.view.getTxtDivision_L1().setText(this.view.getTable().getValueAt(row, 2).toString());
            this.view.getTxtDivision_L2().setText(this.view.getTable().getValueAt(row, 3).toString());
            this.view.getCmbBank().setSelectedItem(this.view.getTable().getValueAt(row, 4).toString());

            this.model.setDivisionID(Integer.parseInt(this.view.getTxtDivisionID().getText()));
            if (this.model.getLogoImage() != null) {
                Image img = new ImageIcon(this.model.getLogoImage()).getImage();
                Image ic = ResizeImage.resizeImage(img, this.view.getLblImage().getWidth(), this.view.getLblImage().getHeight());
                this.view.getLblImage().setText("");
                this.view.getLblImage().setIcon(new ImageIcon(ic));
            } else {
                this.view.getLblImage().setText(hmapLang.get("lblImage".concat(frm).toUpperCase())[LN]);
                this.view.getLblImage().setIcon(null);
            }
        } else if (e.getSource() == this.view.getTxtDivisionID()) {
            this.clearText();
        } else if (e.getSource() == this.view.getLblDivisionInfo()) {
            Label.WindowChangeLabel("lblDivisionInfo", frm, e);
        } else if (e.getSource() == this.view.getLblDivisionID()) {
            Label.WindowChangeLabel("lblDivisionID", frm, e);
        } else if (e.getSource() == this.view.getLblDivision_L1()) {
            Label.WindowChangeLabel("lblDivision_L1", frm, e);
        } else if (e.getSource() == this.view.getLblDivision_L2()) {
            Label.WindowChangeLabel("lblDivision_L2", frm, e);
        } else if (e.getSource() == this.view.getLblSortBy()) {
            Label.WindowChangeLabel("lblSortBy", frm, e);
        } else if (e.getSource() == this.view.getLblBank()) {
            Label.WindowChangeLabel("lblBank", frm, e);
        } else if (e.getSource() == this.view.getBtnSave()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        } else if (e.getSource() == this.view.getBtnDelete()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        } else if (e.getSource() == this.view.getLblImage()) {
            Label.WindowChangeLabel("lblImage", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblDivisionInfo()) {
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
        if (e.getSource() == this.view.getLblDivisionInfo()) {
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
