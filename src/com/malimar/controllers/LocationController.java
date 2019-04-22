package com.malimar.controllers;

import com.malimar.models.District;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.Location;
import com.malimar.models.Province;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmLocation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class LocationController implements ActionListener, MouseListener, KeyListener, MouseMotionListener {

    private final FrmLocation view;
    private final Province provinceModel;
    private final District districtModel;
    private final Location locModel;
    String frm;
    DefaultTableModel tableLocationModel = new DefaultTableModel();
    DefaultTableModel tableDistrictModel = new DefaultTableModel();
    DefaultTableModel tableProvinceModel = new DefaultTableModel();
    HashMap<String, Object[]> mapdistProvince = null;
    HashMap<String, Object[]> mapLocDivision = null;
    HashMap<String, Object[]> mapLocGroup = null;
    HashMap<String, Object[]> mapLocDistrict = null;
    HashMap<String, Object[]> mapLocManager = null;
    HashMap<String, Object[]> mapLocAssistant = null;

    public LocationController(FrmLocation view) {
        this.view = view;
        frm = this.view.getClass().getSimpleName();
        Province p = new Province();
        this.provinceModel = p;
        District d = new District();
        this.districtModel = d;
        Location l = new Location();
        this.locModel = l;
        this.setAction();
        this.changeLabel();
        this.view.getCmbDivision().setUI(new BasicComboBoxUI());
        this.view.getCmbLocProvince().setUI(new BasicComboBoxUI());
        this.view.getCmbLocDistrict().setUI(new BasicComboBoxUI());
        this.view.getCmbManager().setUI(new BasicComboBoxUI());
        this.view.getCmbAssistant().setUI(new BasicComboBoxUI());
        this.view.getCmbDisProvince().setUI(new BasicComboBoxUI());
        this.setDivisionCombox();
        this.setGroupCombox();
        this.setDistrictCombox();
        this.setManagerCombox();
        this.setAssistantCombox();
        this.locModel.load(this.view.getTableLocation(), tableLocationModel);
    }

    private void setAction() {
        this.view.getLblLocationInfo().addMouseListener(this);
        this.view.getLblLocationInfo().addMouseMotionListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getLblProvinceID().addMouseListener(this);
        this.view.getLblProvince_L1().addMouseListener(this);
        this.view.getLblProvince_L2().addMouseListener(this);
        this.view.getBtnSaveProvince().addActionListener(this);
        this.view.getBtnSaveProvince().addMouseListener(this);
        this.view.getBtnSaveProvince().addMouseMotionListener(this);
        this.view.getTabPanel().addMouseListener(this);
        this.view.getBtnDeleteProvince().addActionListener(this);
        this.view.getBtnDeleteProvince().addMouseListener(this);
        this.view.getBtnDeleteProvince().addMouseMotionListener(this);
        this.view.getTableProvince().addMouseListener(this);
        this.view.getBtnSaveDistrict().addActionListener(this);
        this.view.getBtnSaveDistrict().addMouseListener(this);
        this.view.getBtnSaveDistrict().addMouseMotionListener(this);
        this.view.getTxtProvinceID().addMouseListener(this);
        this.view.getBtnDeleteDistrict().addActionListener(this);
        this.view.getBtnDeleteDistrict().addMouseListener(this);
        this.view.getBtnDeleteDistrict().addMouseMotionListener(this);
        this.view.getTxtDistrictID().addMouseListener(this);
        this.view.getTableDistrict().addMouseListener(this);
        this.view.getBtnSaveLoc().addActionListener(this);
        this.view.getBtnSaveLoc().addMouseListener(this);
        this.view.getBtnSaveLoc().addMouseMotionListener(this);
        this.view.getBtnDeleteLoc().addActionListener(this);
        this.view.getBtnDeleteLoc().addMouseListener(this);
        this.view.getBtnDeleteLoc().addMouseMotionListener(this);
        this.view.getTableLocation().addMouseListener(this);
    }

    private void changeLabel() {
        tableLocationModel = (DefaultTableModel) this.view.getTableLocation().getModel();
        tableDistrictModel = (DefaultTableModel) this.view.getTableDistrict().getModel();
        tableProvinceModel = (DefaultTableModel) this.view.getTableProvince().getModel();
        this.view.getLblLocationInfo().setText(hmapLang.get("lblLocationInfo".concat(frm).toUpperCase())[LN]);
        this.view.getTabPanel().setTitleAt(2, hmapLang.get("tabProvince".concat(frm).toUpperCase())[LN]);
        this.view.getLblProvinceID().setText(hmapLang.get("lblProvinceID".concat(frm).toUpperCase())[LN]);
        this.view.getLblProvince_L1().setText(hmapLang.get("lblProvince_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblProvince_L2().setText(hmapLang.get("lblProvince_L2".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveProvince().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDeleteProvince().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        ManageTable.setTableHeader(this.view.getTableProvince(), this.view.getScrollPaneProvince());
        ManageTable.changeTableHeaderLabel(this.view.getTableProvince(), frm);
        this.view.getTabPanel().setTitleAt(1, hmapLang.get("tabDistrict".concat(frm).toUpperCase())[LN]);
        this.view.getLblDistrictID().setText(hmapLang.get("lblDistrictID".concat(frm).toUpperCase())[LN]);
        this.view.getLblDistrict_L1().setText(hmapLang.get("lblDistrict_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblDistrict_L2().setText(hmapLang.get("lblDistrict_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblDistrictProvince().setText(hmapLang.get("lblDistrictProvince".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveDistrict().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        ManageTable.setTableHeader(this.view.getTableDistrict(), this.view.getTableDistrictScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTableDistrict(), frm);
        this.view.getTabPanel().setTitleAt(0, hmapLang.get("tabLocation".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocationID().setText(hmapLang.get("lblLocationID".concat(frm).toUpperCase())[LN]);
        this.view.getLblSortBy().setText(hmapLang.get("lblSortBy".concat(frm).toUpperCase())[LN]);
        this.view.getLblDivision().setText(hmapLang.get("lblDivision".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocation_L1().setText(hmapLang.get("lblLocation_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocation_L2().setText(hmapLang.get("lblLocation_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblTelephone().setText(hmapLang.get("lblTelephone".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocProvince().setText(hmapLang.get("lblLocProvince".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocDistrict().setText(hmapLang.get("lblLocDistrict".concat(frm).toUpperCase())[LN]);
        this.view.getLblAddress_L1().setText(hmapLang.get("lblAddress_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblAddress_L2().setText(hmapLang.get("lblAddress_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblManager().setText(hmapLang.get("lblManager".concat(frm).toUpperCase())[LN]);
        this.view.getLblAssistant().setText(hmapLang.get("lblAssistant".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveLoc().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDeleteDistrict().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        ManageTable.setTableHeader(this.view.getTableLocation(), this.view.getTableLocationScrollPane());
        ManageTable.changeTableHeaderLabel(this.view.getTableLocation(), frm);
        this.view.getBtnDeleteLoc().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getLblLocNumber().setText(hmapLang.get("lblLocNumber".concat(frm).toUpperCase())[LN]);
    }

    private void clearProvinceText() {
        this.view.getTxtProvinceID().setText("New");
        this.view.getTxtProvince_L1().setText("");
        this.view.getTxtProvince_L2().setText("");
    }

    private void clearDistrictText() {
        this.view.getTxtDistrictID().setText("New");
        this.view.getTxtDistrict_L1().setText("");
        this.view.getTxtDistrict_L2().setText("");
        this.view.getCmbDisProvince().setSelectedIndex(-1);
    }

    private void setProvinceCombox() {
        try {
            mapdistProvince = this.districtModel.getProvinceInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapdistProvince);
            this.view.getCmbDisProvince().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbDisProvince().addItem(s);
            });
            this.view.getCmbDisProvince().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbDisProvince());
        } catch (Exception e) {
        }
    }

    private void setDivisionCombox() {
        try {
            mapLocDivision = this.locModel.getDivisionInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocDivision);
            this.view.getCmbDivision().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbDivision().addItem(s);
            });
            this.view.getCmbDivision().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbDivision());
        } catch (Exception e) {
        }
    }

    private void setGroupCombox() {
        try {
            mapLocGroup = this.locModel.getGroupInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocGroup);
            this.view.getCmbLocProvince().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbLocProvince().addItem(s);
            });
            this.view.getCmbLocProvince().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbLocProvince());
        } catch (Exception e) {
        }
    }

    private void setDistrictCombox() {
        try {
            mapLocDistrict = this.locModel.getDistrictInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocDistrict);
            this.view.getCmbLocDistrict().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbLocDistrict().addItem(s);
            });
            this.view.getCmbLocDistrict().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbLocDistrict());
        } catch (Exception e) {
        }
    }

    private void setManagerCombox() {
        try {
            mapLocManager = this.locModel.getManagerInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocManager);
            this.view.getCmbManager().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbManager().addItem(s);
            });
            this.view.getCmbManager().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbManager());
        } catch (Exception e) {
        }
    }

    private void setAssistantCombox() {
        try {
            mapLocAssistant = this.locModel.getAssistant();
            Map<String, Object[]> SortMap = new TreeMap<>(mapLocAssistant);
            this.view.getCmbAssistant().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbAssistant().addItem(s);
            });
            this.view.getCmbAssistant().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbAssistant());
        } catch (Exception e) {
        }
    }

    private void clearText() {
        this.view.getTxtLocationID().setText("New");
        this.view.getTxtLocNumber().setText("");
        this.view.getCmbDivision().setSelectedIndex(-1);
        this.view.getTxtLocation_L1().setText("");
        this.view.getTxtLocation_L2().setText("");
        this.view.getTxtTelephone().setText("");
        this.view.getCmbLocProvince().setSelectedIndex(-1);
        this.view.getCmbLocDistrict().setSelectedIndex(-1);
        this.view.getTxtAddress_L1().setText("");
        this.view.getTxtAddress_L2().setText("");
        this.view.getCmbManager().setSelectedIndex(-1);
        this.view.getCmbAssistant().setSelectedIndex(-1);
        this.view.getTxtSortBy().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSaveProvince()) {
            this.provinceModel.setProvinceName_L1(this.view.getTxtProvince_L1().getText());
            this.provinceModel.setProvinceName_L2(this.view.getTxtProvince_L2().getText());
            if (this.view.getTxtProvinceID().getText().equals("New")) {
                if (this.provinceModel.insert() != true) {
                    MessageBox.msgWarning();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.provinceModel.setProvinceID(Integer.parseInt(this.view.getTxtProvinceID().getText()));
                if (this.provinceModel.update() != true) {
                    MessageBox.msgWarning();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.provinceModel.load(this.view.getTableProvince(), tableProvinceModel);
            this.clearProvinceText();
        } else if (e.getSource() == this.view.getBtnDeleteProvince()) {
            this.provinceModel.setProvinceID(Integer.parseInt(this.view.getTxtProvinceID().getText()));
            this.provinceModel.setProvinceName_L1(this.view.getTxtProvince_L1().getText());
            this.provinceModel.setProvinceName_L2(this.view.getTxtProvince_L2().getText());
            if (this.provinceModel.delete() != true) {
                MessageBox.msgWarning();
            } else {
                MessageBox.msgSuccess();
            }
            this.provinceModel.load(this.view.getTableProvince(), tableProvinceModel);
            this.clearProvinceText();
        } else if (e.getSource() == this.view.getBtnSaveDistrict()) {
            String distPro = this.view.getCmbDisProvince().getSelectedItem().toString();
            this.districtModel.setProvinceID(Integer.parseInt(mapdistProvince.get(distPro)[0].toString()));
            this.districtModel.setDistrictName_L1(this.view.getTxtDistrict_L1().getText());
            this.districtModel.setDistrictName_L2(this.view.getTxtDistrict_L2().getText());
            if (this.view.getTxtDistrictID().getText().equals("New")) {
                if (this.districtModel.insert() != true) {
                    MessageBox.msgWarning();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.districtModel.setDistrictID(Integer.parseInt(this.view.getTxtDistrictID().getText()));
                if (this.districtModel.update() != true) {
                    MessageBox.msgWarning();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.districtModel.load(this.view.getTableDistrict(), tableDistrictModel);
            this.clearDistrictText();
        } else if (e.getSource() == this.view.getBtnDeleteDistrict()) {
            this.districtModel.setDistrictID(Integer.parseInt(this.view.getTxtDistrictID().getText()));
            if (this.districtModel.delete() != true) {
                MessageBox.msgWarning();
            } else {
                MessageBox.msgSuccess();
            }
            this.districtModel.load(this.view.getTableDistrict(), tableDistrictModel);
            this.clearDistrictText();
        } else if (e.getSource() == this.view.getBtnSaveLoc()) {
            this.locModel.setLocNumber(this.view.getTxtLocNumber().getText());
            this.locModel.setSortBy(Integer.parseInt(this.view.getTxtSortBy().getText()));
            String divi = this.view.getCmbDivision().getSelectedItem().toString();
            this.locModel.setDivisionID(Integer.parseInt(this.mapLocDivision.get(divi)[0].toString()));
            this.locModel.setLocationName_L1(this.view.getTxtLocation_L1().getText());
            this.locModel.setLocationName_L2(this.view.getTxtLocation_L2().getText());
            this.locModel.setTelephone(this.view.getTxtTelephone().getText());
            String group = this.view.getCmbLocProvince().getSelectedItem().toString();
            this.locModel.setGroupID(Integer.parseInt(mapLocGroup.get(group)[0].toString()));
            String distrct = this.view.getCmbLocDistrict().getSelectedItem().toString();
            this.locModel.setDistrictID(Integer.parseInt(mapLocDistrict.get(distrct)[0].toString()));
            this.locModel.setAddress_L1(this.view.getTxtAddress_L1().getText());
            this.locModel.setAddress_L2(this.view.getTxtAddress_L2().getText());
            String mgr = this.view.getCmbManager().getSelectedItem().toString();
            this.locModel.setManagerID(Integer.parseInt(mapLocManager.get(mgr)[0].toString()));
            String ast = this.view.getCmbAssistant().getSelectedItem().toString();
            this.locModel.setAssistantID(Integer.parseInt(mapLocAssistant.get(ast)[0].toString()));
            if (this.view.getTxtLocationID().getText().equals("New")) {
                if (this.locModel.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.locModel.setLocationID(Integer.parseInt(this.view.getTxtLocationID().getText()));
                if (this.locModel.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.locModel.load(this.view.getTableLocation(), tableLocationModel);
            this.clearText();
        } else if (e.getSource() == this.view.getBtnDeleteLoc()) {
            this.locModel.setLocationID(Integer.parseInt(this.view.getTxtLocationID().getText()));
            if (this.locModel.delete() == true) {
                MessageBox.msgSuccess();
                this.locModel.load(this.view.getTableLocation(), tableLocationModel);
                this.clearText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTabPanel()) {
            if (this.view.getTabPanel().getSelectedIndex() == 2) {
                this.provinceModel.load(this.view.getTableProvince(), tableProvinceModel);
            } else if (this.view.getTabPanel().getSelectedIndex() == 1) {
                this.districtModel.load(this.view.getTableDistrict(), tableDistrictModel);
                this.setProvinceCombox();
            }
        } else if (e.getSource() == this.view.getTableProvince()) {
            int row = this.view.getTableProvince().getSelectedRow();
            this.view.getTxtProvinceID().setText(this.view.getTableProvince().getValueAt(row, 0).toString());
            this.view.getTxtProvince_L1().setText(this.view.getTableProvince().getValueAt(row, 1).toString());
            this.view.getTxtProvince_L2().setText(this.view.getTableProvince().getValueAt(row, 2).toString());
        } else if (e.getSource() == this.view.getTxtProvinceID()) {
            if (e.getClickCount() == 2) {
                this.clearProvinceText();
            }
        } else if (e.getSource() == this.view.getTxtDistrictID()) {
            if (e.getClickCount() == 2) {
                this.clearDistrictText();
            }
        } else if (e.getSource() == this.view.getTableDistrict()) {
            int row = this.view.getTableDistrict().getSelectedRow();
            this.view.getTxtDistrictID().setText(this.view.getTableDistrict().getValueAt(row, 0).toString());
            this.view.getTxtDistrict_L1().setText(this.view.getTableDistrict().getValueAt(row, 1).toString());
            this.view.getTxtDistrict_L2().setText(this.view.getTableDistrict().getValueAt(row, 2).toString());
            this.view.getCmbDisProvince().setSelectedItem(this.view.getTableDistrict().getValueAt(row, 3).toString());
        } else if (e.getSource() == this.view.getTableLocation()) {
            int row = this.view.getTableLocation().getSelectedRow();
            this.view.getTxtLocationID().setText(this.view.getTableLocation().getValueAt(row, 0).toString());
            this.view.getTxtLocNumber().setText(this.view.getTableLocation().getValueAt(row, 1).toString());
            this.view.getTxtLocation_L1().setText(this.view.getTableLocation().getValueAt(row, 2).toString());
            this.view.getTxtLocation_L2().setText(this.view.getTableLocation().getValueAt(row, 3).toString());
            this.view.getTxtTelephone().setText(this.view.getTableLocation().getValueAt(row, 4).toString());
            this.view.getCmbLocProvince().setSelectedItem(this.view.getTableLocation().getValueAt(row, 5).toString());
            this.view.getCmbLocDistrict().setSelectedItem(this.view.getTableLocation().getValueAt(row, 6).toString());
            this.view.getTxtAddress_L1().setText(this.view.getTableLocation().getValueAt(row, 7).toString());
            this.view.getTxtAddress_L2().setText(this.view.getTableLocation().getValueAt(row, 8).toString());
            this.view.getCmbManager().setSelectedItem(this.view.getTableLocation().getValueAt(row, 9).toString());
            this.view.getCmbAssistant().setSelectedItem(this.view.getTableLocation().getValueAt(row, 10).toString());
            this.view.getCmbDivision().setSelectedItem(this.view.getTableLocation().getValueAt(row, 11).toString());
            this.view.getTxtSortBy().setText(this.view.getTableLocation().getValueAt(row, 12).toString());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblLocationInfo()) {
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
        if (e.getSource() == this.view.getBtnSaveProvince()) {
            this.view.getPanelHoverPro().setVisible(false);
            this.view.getPanelSavePro().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteProvince()) {
            this.view.getPanelDeleteHoverPro().setVisible(false);
            this.view.getPanelDeletePro().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteDistrict()) {
            this.view.getPanelDeleteHoverDist().setVisible(false);
            this.view.getPanelDeleteDist().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteLoc()) {
            this.view.getPanelDeleteHoverLoc().setVisible(false);
            this.view.getPanelDeleteLoc().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveLoc()) {
            this.view.getPanelHoverLoc().setVisible(false);
            this.view.getPanelSaveLoc().setVisible(true);
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
        if (e.getSource() == this.view.getLblLocationInfo()) {
            MoveForm.mouseDragded(e, view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSaveProvince()) {
            this.view.getPanelHoverPro().setVisible(true);
            this.view.getPanelSavePro().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteProvince()) {
            this.view.getPanelDeleteHoverPro().setVisible(true);
            this.view.getPanelDeletePro().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteDistrict()) {
            this.view.getPanelDeleteHoverDist().setVisible(true);
            this.view.getPanelDeleteDist().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteLoc()) {
            this.view.getPanelDeleteHoverLoc().setVisible(true);
            this.view.getPanelDeleteLoc().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSaveLoc()) {
            this.view.getPanelHoverLoc().setVisible(true);
            this.view.getPanelSaveLoc().setVisible(false);
        }
    }
}
