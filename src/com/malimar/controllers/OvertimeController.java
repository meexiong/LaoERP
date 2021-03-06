package com.malimar.controllers;

import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.Overtime;
import com.malimar.models.SalaryCalc;
import com.malimar.utils.HorizontalAlignmentHeaderRenderer;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.utils.Variable;
import com.malimar.views.FrmOvertime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class OvertimeController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final FrmOvertime view;
    private final Overtime model;
    DefaultTableModel tableModel = new DefaultTableModel();
    HashMap<Float, Object[]> mapMultiper = null;
    String frm;

    public OvertimeController(FrmOvertime view, int emid, String emNbr, String emName) {
        this.view = view;
        Overtime OT = new Overtime();
        this.model = OT;
        this.frm = this.view.getClass().getSimpleName();
        this.model.setEmpID(emid);
        this.setEvent();
        this.setInitial();
        this.language();
        this.view.getTxtEmployee().setText(String.valueOf(emNbr) + " " + emName);
        this.model.load(this.view.getTable(), tableModel);
    }

    private void language() {
        this.view.getLblOvertimeInfo().setText(hmapLang.get("lblOvertimeInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblSalary().setText(hmapLang.get("lblSalary".concat(frm).toUpperCase())[LN]);
        this.view.getLblDays().setText(hmapLang.get("lblDays".concat(frm).toUpperCase())[LN]);
        this.view.getLblOTHours().setText(hmapLang.get("lblOTHours".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimeDate().setText(hmapLang.get("lblOvertimeDate".concat(frm).toUpperCase())[LN]);
        this.view.getLblHours().setText(hmapLang.get("lblHours".concat(frm).toUpperCase())[LN]);
        this.view.getLblMinute().setText(hmapLang.get("lblMinute".concat(frm).toUpperCase())[LN]);
        this.view.getLblOvertimeRate().setText(hmapLang.get("lblOvertimeRate".concat(frm).toUpperCase())[LN]);
        this.view.getLblAmount().setText(hmapLang.get("lblAmount".concat(frm).toUpperCase())[LN]);
        this.view.getLblMgrApprove().setText(hmapLang.get("lblMgrApprove".concat(frm).toUpperCase())[LN]);
        this.view.getLblHRApprove().setText(hmapLang.get("lblHRApprove".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSave().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDelete().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        ManageTable.changeTableHeaderLabel(this.view.getTable(), frm);
    }

    private void setEvent() {
        this.view.getBtnSave().addActionListener(this);
        this.view.getBtnSave().addMouseListener(this);
        this.view.getBtnSave().addMouseMotionListener(this);
        this.view.getBtnDelete().addActionListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnDelete().addMouseMotionListener(this);
        this.view.getTable().addMouseListener(this);
        this.view.getLblOvertimeInfo().addMouseListener(this);
        this.view.getLblOvertimeInfo().addMouseMotionListener(this);
        this.view.getTxtHours().addKeyListener(this);
        this.view.getTxtMinute().addKeyListener(this);
        this.view.getCmbOTRate().addActionListener(this);
    }

    private void setInitial() {
        this.view.getCmbOTRate().setUI(new BasicComboBoxUI());
        tableModel = (DefaultTableModel) this.view.getTable().getModel();
        ManageTable.setTableHeader(this.view.getTable(), this.view.getTableScrollPanel());
        this.setOvertimeMultipler();
        Date today = new Date();
        this.view.getTxtOvertimeID().setVisible(false);
        this.view.getTxtOvertimeDate().setDate(today);
        this.view.getTxtSalary().setText(String.format("%,.0f", SalaryCalc.getSalary(this.model.getEmpID(), "O")));
        this.view.getTxtTotalDays().setText(String.valueOf(SalaryCalc.getOTday()));
        this.view.getTxtOTPerHours().setText(String.format("%,.0f", (SalaryCalc.getSalary(this.model.getEmpID(), "O") / SalaryCalc.getOTday()) / SalaryCalc.getDayHour(this.model.getEmpID())));
        this.view.getTable().getColumnModel().getColumn(0).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.LEFT));
        this.view.getTable().getColumnModel().getColumn(1).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        this.view.getTable().getColumnModel().getColumn(2).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(3).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(4).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(5).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.RIGHT));
        this.view.getTable().getColumnModel().getColumn(6).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        this.view.getTable().getColumnModel().getColumn(7).setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        this.view.getTable().getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        this.view.getTable().getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
    }

    private void calculate() {
        int hrs = 0;
        int mnt = 0;
        if (this.view.getTxtHours().getText().equals("")) {
            this.view.getTxtHours().setText("0");
        } else {
            hrs = Integer.parseInt(this.view.getTxtHours().getText());
        }
        if (this.view.getTxtMinute().getText().equals("")) {
            this.view.getTxtMinute().setText("0");
        } else {
            mnt = Integer.parseInt(this.view.getTxtMinute().getText());
        }
        float rate = Float.parseFloat(this.view.getCmbOTRate().getSelectedItem().toString());
        double salaryPerMnt = Double.parseDouble(this.view.getTxtOTPerHours().getText().replace(",", ""));
        float totalMinute = (hrs * 60) + mnt;
        double totalOT = (totalMinute * (salaryPerMnt / 60)) * rate;
        this.view.getTxtAmount().setText(String.format("%,.0f", totalOT));
    }

    private void setOvertimeMultipler() {
        try {
            mapMultiper = this.model.getMultiplerInfo();
            Map<Float, Object[]> SortMap = new TreeMap<>(mapMultiper);
            this.view.getCmbOTRate().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbOTRate().addItem(String.valueOf(s));
            });
//            this.view.getCmbOTRate().setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        this.view.getTxtOvertimeID().setText("New");
        this.view.getTxtHours().setText("0");
        this.view.getTxtMinute().setText("0");
        this.view.getCmbOTRate().setSelectedIndex(0);
        this.view.getTxtAmount().setText("0");
        this.view.getChMgrApprove().setSelected(false);
        this.view.getChHRApprove().setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getCmbOTRate()) {
            if (this.view.getCmbOTRate().getSelectedIndex() != -1) {
                this.calculate();
            }
        } else if (e.getSource() == this.view.getBtnSave()) {
            try {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                float rate = Float.parseFloat(this.view.getCmbOTRate().getSelectedItem().toString());
                this.model.setRateID(Integer.parseInt(mapMultiper.get(rate)[0].toString()));
                this.model.setHour(Integer.parseInt(this.view.getTxtHours().getText()));
                this.model.setMinute(Integer.parseInt(this.view.getTxtMinute().getText()));
                this.model.setAmount(Double.parseDouble(this.view.getTxtAmount().getText().replace(",", "")));
                this.model.setOvertimeDate(this.view.getTxtOvertimeDate().getDate());
                this.model.setMgrApprove(this.view.getChMgrApprove().isSelected());
                this.model.setHrApprove(this.view.getChHRApprove().isSelected());
                Date bom = format.parse(SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()));
                Date eom = format.parse(SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()));
                String otd = format.format(this.model.getOvertimeDate());
                Date otDate = format.parse(otd);
                if ((otDate.after(bom) && otDate.before(eom)) || (otDate.compareTo(bom) == 0 || otDate.compareTo(eom) == 0)) {
                    if (this.view.getTxtAmount().getText().equals("0")) {
                        MessageBox.msgOTAmountZero();
                        return;
                    }
                    if (this.view.getTxtOvertimeID().getText().equals("New")) {
                        if (this.model.checkRate() == true) {
                            MessageBox.msgOTRate();
                            return;
                        }
                        if (this.model.insert() == true) {
                            this.clear();
                            Variable.reQuery = 1;
                        } else {
                            MessageBox.msgError();
                        }
                    } else {
                        this.model.setOvertimeID(Integer.parseInt(this.view.getTxtOvertimeID().getText()));
                        if (this.model.update() == true) {
                            this.clear();
                            Variable.reQuery = 1;
                        } else {
                            MessageBox.msgError();
                        }
                    }
                    this.model.load(this.view.getTable(), tableModel);
                } else {
                    MessageBox.msgOTDate();
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == this.view.getBtnDelete()) {
            if (this.view.getTxtOvertimeID().getText().equals("New")) {
                return;
            }
            this.model.setOvertimeID(Integer.parseInt(this.view.getTxtOvertimeID().getText()));
            if (this.model.delete() == true) {
                this.clear();
                this.model.load(this.view.getTable(), tableModel);
                Variable.reQuery = 1;
            } else {
                MessageBox.msgError();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            if (e.getSource() == this.view.getTable()) {
                int row = this.view.getTable().getSelectedRow();
                this.view.getTxtOvertimeID().setText(this.view.getTable().getValueAt(row, 0).toString());
                java.util.Date stdate = new SimpleDateFormat("dd-MM-yyyy").parse(this.view.getTable().getValueAt(row, 1).toString());
                this.view.getTxtOvertimeDate().setDate(stdate);
                this.view.getTxtHours().setText(this.view.getTable().getValueAt(row, 2).toString());
                this.view.getTxtMinute().setText(this.view.getTable().getValueAt(row, 3).toString());
                this.view.getCmbOTRate().setSelectedItem(this.view.getTable().getValueAt(row, 4).toString());
                this.view.getTxtAmount().setText(this.view.getTable().getValueAt(row, 5).toString());
                this.view.getChMgrApprove().setSelected((Boolean) this.view.getTable().getValueAt(row, 6));
                this.view.getChHRApprove().setSelected((Boolean) this.view.getTable().getValueAt(row, 7));
            }
        } catch (Exception ex) {
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLblOvertimeInfo()) {
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
        if (e.getSource() == this.view.getLblOvertimeInfo()) {
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == this.view.getTxtHours()) {
            char chr = e.getKeyChar();
            if ((Character.isDigit(chr)) || chr == KeyEvent.VK_ENTER || chr == KeyEvent.VK_BACK_SPACE) {
                this.calculate();
            } else {
                this.view.getTxtHours().setText("0");
            }
        } else if (e.getSource() == this.view.getTxtMinute()) {
            char chr = e.getKeyChar();
            if ((Character.isDigit(chr)) || chr == KeyEvent.VK_ENTER || chr == KeyEvent.VK_BACK_SPACE) {
                this.calculate();
            } else {
                this.view.getTxtMinute().setText("0");
            }
        }
    }

}
