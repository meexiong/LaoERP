package com.malimar.controllers;

import com.malimar.models.JobDuties;
import com.malimar.models.Label;
import static com.malimar.models.Label.LN;
import static com.malimar.models.Label.hmapLang;
import com.malimar.models.Title;
import com.malimar.utils.ManageTable;
import com.malimar.utils.MessageBox;
import com.malimar.utils.MoveForm;
import com.malimar.views.FrmTitle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class TitleController implements ActionListener, MouseListener, MouseMotionListener {

    private final FrmTitle view;
    private final JobDuties jobDutiesModel;
    private final Title titleModel;
    DefaultTableModel tableJobModel = new DefaultTableModel();
    DefaultTableModel tableTitleModel = new DefaultTableModel();
    String frm;
    HashMap<String, Object[]> mapJob = null;

    public TitleController(FrmTitle view) {
        this.view = view;
        this.frm = this.view.getClass().getSimpleName();
        JobDuties jd = new JobDuties();
        jobDutiesModel = jd;
        Title t = new Title();
        this.titleModel = t;
        this.view.getCmbTitle().setUI(new BasicComboBoxUI());
        tableTitleModel = (DefaultTableModel) this.view.getTableTitle().getModel();
        tableJobModel = (DefaultTableModel) this.view.getTableJob().getModel();
        this.setEvent();
        this.changeLabel();
        this.titleModel.load(this.view.getTableTitle(), tableTitleModel);
        this.setLocationCombox();
    }

    private void setEvent() {
        this.view.getLbllblTitleInfo().addMouseListener(this);
        this.view.getLbllblTitleInfo().addMouseMotionListener(this);
        this.view.getLblTitleID().addMouseListener(this);
        this.view.getLblTitle_L1().addMouseListener(this);
        this.view.getLblTitle_L2().addMouseListener(this);
        this.view.getLblJonDuties().addMouseListener(this);
        this.view.getLblJobDutiesID().addMouseListener(this);
        this.view.getLblJobDuties_L1().addMouseListener(this);
        this.view.getLblJobDuties_L2().addMouseListener(this);
        this.view.getBtnSaveJob().addActionListener(this);
        this.view.getBtnSaveJob().addMouseListener(this);
        this.view.getBtnSaveJob().addMouseMotionListener(this);
        this.view.getBtnSaveTitle().addActionListener(this);
        this.view.getBtnSaveTitle().addMouseListener(this);
        this.view.getBtnSaveTitle().addMouseMotionListener(this);
        this.view.getBtnDeleteTitle().addActionListener(this);
        this.view.getBtnDeleteTitle().addMouseListener(this);
        this.view.getBtnDeleteTitle().addMouseMotionListener(this);
        this.view.getBtnDeleteJob().addActionListener(this);
        this.view.getBtnDeleteJob().addMouseListener(this);
        this.view.getBtnDeleteJob().addMouseMotionListener(this);
        this.view.getTxtJobDutiesID().addMouseListener(this);
        this.view.getTxtTitleID().addMouseListener(this);
        this.view.getMenuExit().addActionListener(this);
        this.view.getTabPanel().addMouseListener(this);
        this.view.getTableJob().addMouseListener(this);
        this.view.getTableTitle().addMouseListener(this);
    }

    private void changeLabel() {
        ManageTable.setTableHeader(this.view.getTableTitle(), this.view.getTableScrollPanleTitle());
        ManageTable.setTableHeader(this.view.getTableJob(), this.view.getTableScrollPaneJob());
        ManageTable.changeTableHeaderLabel(this.view.getTableTitle(), frm);
        ManageTable.changeTableHeaderLabel(this.view.getTableJob(), frm);
        this.view.getLbllblTitleInfo().setText(hmapLang.get("lblTitleInfo".concat(frm).toUpperCase())[LN]);
        this.view.getLblTitleID().setText(hmapLang.get("lblTitleID".concat(frm).toUpperCase())[LN]);
        this.view.getLblTitle_L1().setText(hmapLang.get("lblTitle_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblTitle_L2().setText(hmapLang.get("lblTitle_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblJobDutiesID().setText(hmapLang.get("lblJobDutiesID".concat(frm).toUpperCase())[LN]);
        this.view.getLblJobDuties_L1().setText(hmapLang.get("lblJobDuties_L1".concat(frm).toUpperCase())[LN]);
        this.view.getLblJobDuties_L2().setText(hmapLang.get("lblJobDuties_L2".concat(frm).toUpperCase())[LN]);
        this.view.getLblJonDuties().setText(hmapLang.get("lblJonDuties".concat(frm).toUpperCase())[LN]);
        this.view.getTabPanel().setTitleAt(0, hmapLang.get("tabTitle".concat(frm).toUpperCase())[LN]);
        this.view.getTabPanel().setTitleAt(1, hmapLang.get("tabJob".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveTitle().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnSaveJob().setText(hmapLang.get("btnSave".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDeleteTitle().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
        this.view.getBtnDeleteJob().setText(hmapLang.get("btnDelete".concat(frm).toUpperCase())[LN]);
    }

    private void clearJobText() {
        this.view.getTxtJobDutiesID().setText("New");
        this.view.getTxtJobDuties_L1().setText("");
        this.view.getTxtJobDuties_L2().setText("");
    }

    private void clearTitleText() {
        this.view.getTxtTitleID().setText("New");
        this.view.getTxtTitle_L1().setText("");
        this.view.getTxtTitle_L2().setText("");
        this.view.getCmbTitle().setSelectedIndex(-1);
    }

    private void setLocationCombox() {
        try {
            mapJob = this.titleModel.getJobInfo();
            Map<String, Object[]> SortMap = new TreeMap<>(mapJob);
            this.view.getCmbTitle().removeAllItems();
            SortMap.keySet().forEach((s) -> {
                this.view.getCmbTitle().addItem(s);
            });
            this.view.getCmbTitle().setSelectedIndex(-1);
            AutoCompleteDecorator.decorate(this.view.getCmbTitle());
        } catch (Exception e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getMenuExit()) {
            this.view.dispose();
        } else if (e.getSource() == this.view.getBtnSaveJob()) {
            this.jobDutiesModel.setJobDuties_L1(this.view.getTxtJobDuties_L1().getText());
            this.jobDutiesModel.setJobDuties_L2(this.view.getTxtJobDuties_L2().getText());
            if (this.view.getTxtJobDutiesID().getText().equals("New")) {
                if (this.jobDutiesModel.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.jobDutiesModel.setJobDutiesID(Integer.parseInt(this.view.getTxtJobDutiesID().getText()));
                if (this.jobDutiesModel.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.jobDutiesModel.load(this.view.getTableJob(), tableJobModel);
            this.clearJobText();
        } else if (e.getSource() == this.view.getBtnDeleteJob()) {
            this.jobDutiesModel.setJobDutiesID(Integer.parseInt(this.view.getTxtJobDutiesID().getText()));
            if (this.jobDutiesModel.delete() == true) {
                MessageBox.msgSuccess();
                this.jobDutiesModel.load(this.view.getTableJob(), tableJobModel);
                this.clearJobText();
            }
        } else if (e.getSource() == this.view.getBtnSaveTitle()) {
            this.titleModel.setTitleName_L1(this.view.getTxtTitle_L1().getText());
            this.titleModel.setTitleName_L2(this.view.getTxtTitle_L2().getText());
            String job = this.view.getCmbTitle().getSelectedItem().toString();
            this.titleModel.setJobDutiesID(Integer.parseInt(mapJob.get(job)[0].toString()));
            if (this.view.getTxtTitleID().getText().equals("New")) {
                if (this.titleModel.insert() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            } else {
                this.titleModel.setTitleID(Integer.parseInt(this.view.getTxtTitleID().getText()));
                if (this.titleModel.update() != true) {
                    MessageBox.msgError();
                } else {
                    MessageBox.msgSuccess();
                }
            }
            this.titleModel.load(this.view.getTableTitle(), tableTitleModel);
            this.clearTitleText();
        } else if (e.getSource() == this.view.getBtnDeleteTitle()) {
            this.titleModel.setTitleID(Integer.parseInt(this.view.getTxtTitleID().getText()));
            if (this.titleModel.delete() == true) {
                MessageBox.msgSuccess();
                this.titleModel.load(this.view.getTableTitle(), tableTitleModel);
                this.clearTitleText();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getTabPanel()) {
            if (this.view.getTabPanel().getSelectedIndex() == 0) {
                this.titleModel.load(this.view.getTableTitle(), tableTitleModel);
                this.setLocationCombox();
                Label.WindowChangeLabel("tabTitle", frm, e);
            } else {
                this.jobDutiesModel.load(this.view.getTableJob(), tableJobModel);
                Label.WindowChangeLabel("tabJob", frm, e);
            }
        } else if (e.getSource() == this.view.getTableJob()) {
            int row = this.view.getTableJob().getSelectedRow();
            this.view.getTxtJobDutiesID().setText(this.view.getTableJob().getValueAt(row, 0).toString());
            this.view.getTxtJobDuties_L1().setText(this.view.getTableJob().getValueAt(row, 1).toString());
            this.view.getTxtJobDuties_L2().setText(this.view.getTableJob().getValueAt(row, 2).toString());
        } else if (e.getSource() == this.view.getTxtTitleID()) {
            this.clearTitleText();
        } else if (e.getSource() == this.view.getTxtJobDutiesID()) {
            this.clearJobText();
        } else if (e.getSource() == this.view.getTableTitle()) {
            int row = this.view.getTableTitle().getSelectedRow();
            this.view.getTxtTitleID().setText(this.view.getTableTitle().getValueAt(row, 0).toString());
            this.view.getTxtTitle_L1().setText(this.view.getTableTitle().getValueAt(row, 1).toString());
            this.view.getTxtTitle_L2().setText(this.view.getTableTitle().getValueAt(row, 2).toString());
            this.view.getCmbTitle().setSelectedItem(this.view.getTableTitle().getValueAt(row, 3).toString());
        } else if (e.getSource() == this.view.getLbllblTitleInfo()) {
            Label.WindowChangeLabel("lblTitleInfo", frm, e);
        }else if (e.getSource() == this.view.getLblTitleID()) {
            Label.WindowChangeLabel("lblTitleID", frm, e);
        }else if (e.getSource() == this.view.getLblTitle_L1()) {
            Label.WindowChangeLabel("lblTitle_L1", frm, e);
        }else if (e.getSource() == this.view.getLblTitle_L2()) {
            Label.WindowChangeLabel("lblTitle_L2", frm, e);
        }else if (e.getSource() == this.view.getBtnSaveTitle()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getBtnDeleteTitle()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }else if (e.getSource() == this.view.getLblJonDuties()) {
            Label.WindowChangeLabel("lblJonDuties", frm, e);
        }else if (e.getSource() == this.view.getLblJobDutiesID()) {
            Label.WindowChangeLabel("lblJobDutiesID", frm, e);
        }else if (e.getSource() == this.view.getLblJobDuties_L1()) {
            Label.WindowChangeLabel("lblJobDuties_L1", frm, e);
        }else if (e.getSource() == this.view.getLblJobDuties_L2()) {
            Label.WindowChangeLabel("lblJobDuties_L2", frm, e);
        }else if (e.getSource() == this.view.getBtnSaveJob()) {
            Label.WindowChangeLabel("btnSave", frm, e);
        }else if (e.getSource() == this.view.getBtnDeleteJob()) {
            Label.WindowChangeLabel("btnDelete", frm, e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.view.getLbllblTitleInfo()) {
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
        if (e.getSource() == this.view.getBtnSaveTitle()) {
            this.view.getPanelHoverTitle().setVisible(false);
            this.view.getPanelSaveTitle().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteTitle()) {
            this.view.getPanelHoverDeleteTitle().setVisible(false);
            this.view.getPanelDeleteTitle().setVisible(true);
        } else if (e.getSource() == this.view.getBtnSaveJob()) {
            this.view.getPanelHoverJob().setVisible(false);
            this.view.getPanelSaveJob().setVisible(true);
        } else if (e.getSource() == this.view.getBtnDeleteJob()) {
            this.view.getPanelHoverDeleteJob().setVisible(false);
            this.view.getPanelDeleteJob().setVisible(true);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.view.getLbllblTitleInfo()) {
            MoveForm.mouseDragded(e, this.view);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == this.view.getBtnSaveTitle()) {
            this.view.getPanelHoverTitle().setVisible(true);
            this.view.getPanelSaveTitle().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteTitle()) {
            this.view.getPanelHoverDeleteTitle().setVisible(true);
            this.view.getPanelDeleteTitle().setVisible(false);
        } else if (e.getSource() == this.view.getBtnSaveJob()) {
            this.view.getPanelHoverJob().setVisible(true);
            this.view.getPanelSaveJob().setVisible(false);
        } else if (e.getSource() == this.view.getBtnDeleteJob()) {
            this.view.getPanelHoverDeleteJob().setVisible(true);
            this.view.getPanelDeleteJob().setVisible(false);
        }
    }

}
