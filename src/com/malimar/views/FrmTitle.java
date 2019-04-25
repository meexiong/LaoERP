
package com.malimar.views;

import com.malimar.controllers.TitleController;
import com.xzq.osc.JocHyperlink;
import com.xzq.osc.JocTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmTitle extends javax.swing.JDialog {

    public FrmTitle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TitleController tc = new TitleController(this);
    }

    public JocHyperlink getBtnDeleteJob() {
        return btnDeleteJob;
    }

    public void setBtnDeleteJob(JocHyperlink btnDeleteJob) {
        this.btnDeleteJob = btnDeleteJob;
    }

    public JocHyperlink getBtnSaveJob() {
        return btnSaveJob;
    }

    public void setBtnSaveJob(JocHyperlink btnSaveJob) {
        this.btnSaveJob = btnSaveJob;
    }

    public JocHyperlink getBtnSaveTitle() {
        return btnSaveTitle;
    }

    public void setBtnSaveTitle(JocHyperlink btnSaveTitle) {
        this.btnSaveTitle = btnSaveTitle;
    }

    public JComboBox<String> getCmbTitle() {
        return cmbTitle;
    }

    public void setCmbTitle(JComboBox<String> cmbTitle) {
        this.cmbTitle = cmbTitle;
    }

    public JLabel getLblJobDutiesID() {
        return lblJobDutiesID;
    }

    public void setLblJobDutiesID(JLabel lblJobDutiesID) {
        this.lblJobDutiesID = lblJobDutiesID;
    }

    public JLabel getLblJobDuties_L1() {
        return lblJobDuties_L1;
    }

    public void setLblJobDuties_L1(JLabel lblJobDuties_L1) {
        this.lblJobDuties_L1 = lblJobDuties_L1;
    }

    public JLabel getLblJobDuties_L2() {
        return lblJobDuties_L2;
    }

    public void setLblJobDuties_L2(JLabel lblJobDuties_L2) {
        this.lblJobDuties_L2 = lblJobDuties_L2;
    }

    public JLabel getLblJonDuties() {
        return lblJonDuties;
    }

    public void setLblJonDuties(JLabel lblJonDuties) {
        this.lblJonDuties = lblJonDuties;
    }

    public JLabel getLblTitleID() {
        return lblTitleID;
    }

    public void setLblTitleID(JLabel lblTitleID) {
        this.lblTitleID = lblTitleID;
    }

    public JLabel getLblTitle_L1() {
        return lblTitle_L1;
    }

    public void setLblTitle_L1(JLabel lblTitle_L1) {
        this.lblTitle_L1 = lblTitle_L1;
    }

    public JLabel getLblTitle_L2() {
        return lblTitle_L2;
    }

    public void setLblTitle_L2(JLabel lblTitle_L2) {
        this.lblTitle_L2 = lblTitle_L2;
    }

    public JLabel getLbllblTitleInfo() {
        return lbllblTitleInfo;
    }

    public void setLbllblTitleInfo(JLabel lbllblTitleInfo) {
        this.lbllblTitleInfo = lbllblTitleInfo;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public void setMenuExit(JocHyperlink menuExit) {
        this.menuExit = menuExit;
    }

    public JocHyperlink getPanelDeleteJob() {
        return panelDeleteJob;
    }

    public void setPanelDeleteJob(JocHyperlink panelDeleteJob) {
        this.panelDeleteJob = panelDeleteJob;
    }

    public JocHyperlink getPanelHoverDeleteJob() {
        return panelHoverDeleteJob;
    }

    public void setPanelHoverDeleteJob(JocHyperlink panelHoverDeleteJob) {
        this.panelHoverDeleteJob = panelHoverDeleteJob;
    }

    public JocHyperlink getPanelHoverJob() {
        return panelHoverJob;
    }

    public void setPanelHoverJob(JocHyperlink panelHoverJob) {
        this.panelHoverJob = panelHoverJob;
    }

    public JocHyperlink getPanelHoverTitle() {
        return panelHoverTitle;
    }

    public void setPanelHoverTitle(JocHyperlink panelHoverTitle) {
        this.panelHoverTitle = panelHoverTitle;
    }

    public JocHyperlink getPanelSaveJob() {
        return panelSaveJob;
    }

    public void setPanelSaveJob(JocHyperlink panelSaveJob) {
        this.panelSaveJob = panelSaveJob;
    }

    public JocHyperlink getPanelSaveTitle() {
        return panelSaveTitle;
    }

    public void setPanelSaveTitle(JocHyperlink panelSaveTitle) {
        this.panelSaveTitle = panelSaveTitle;
    }

    public JocTabbedPane getTabPanel() {
        return tabPanel;
    }

    public void setTabPanel(JocTabbedPane tabPanel) {
        this.tabPanel = tabPanel;
    }

    public JTable getTableJob() {
        return tableJob;
    }

    public void setTableJob(JTable tableJob) {
        this.tableJob = tableJob;
    }

    public JScrollPane getTableScrollPaneJob() {
        return tableScrollPaneJob;
    }

    public void setTableScrollPaneJob(JScrollPane tableScrollPaneJob) {
        this.tableScrollPaneJob = tableScrollPaneJob;
    }

    public JScrollPane getTableScrollPanleTitle() {
        return tableScrollPanleTitle;
    }

    public void setTableScrollPanleTitle(JScrollPane tableScrollPanleTitle) {
        this.tableScrollPanleTitle = tableScrollPanleTitle;
    }

    public JTable getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(JTable tableTitle) {
        this.tableTitle = tableTitle;
    }

    public JTextField getTxtJobDutiesID() {
        return txtJobDutiesID;
    }

    public void setTxtJobDutiesID(JTextField txtJobDutiesID) {
        this.txtJobDutiesID = txtJobDutiesID;
    }

    public JTextField getTxtJobDuties_L1() {
        return txtJobDuties_L1;
    }

    public void setTxtJobDuties_L1(JTextField txtJobDuties_L1) {
        this.txtJobDuties_L1 = txtJobDuties_L1;
    }

    public JTextField getTxtJobDuties_L2() {
        return txtJobDuties_L2;
    }

    public void setTxtJobDuties_L2(JTextField txtJobDuties_L2) {
        this.txtJobDuties_L2 = txtJobDuties_L2;
    }

    public JTextField getTxtTitleID() {
        return txtTitleID;
    }

    public void setTxtTitleID(JTextField txtTitleID) {
        this.txtTitleID = txtTitleID;
    }

    public JTextField getTxtTitle_L1() {
        return txtTitle_L1;
    }

    public void setTxtTitle_L1(JTextField txtTitle_L1) {
        this.txtTitle_L1 = txtTitle_L1;
    }

    public JTextField getTxtTitle_L2() {
        return txtTitle_L2;
    }

    public void setTxtTitle_L2(JTextField txtTitle_L2) {
        this.txtTitle_L2 = txtTitle_L2;
    }

    public JocHyperlink getBtnDeleteTitle() {
        return btnDeleteTitle;
    }

    public JocHyperlink getPanelDeleteTitle() {
        return panelDeleteTitle;
    }

    public JocHyperlink getPanelHoverDeleteTitle() {
        return panelHoverDeleteTitle;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbllblTitleInfo = new javax.swing.JLabel();
        menuExit = new com.xzq.osc.JocHyperlink();
        tabPanel = new com.xzq.osc.JocTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        txtTitleID = new javax.swing.JTextField();
        lblTitleID = new javax.swing.JLabel();
        txtTitle_L1 = new javax.swing.JTextField();
        lblTitle_L1 = new javax.swing.JLabel();
        btnSaveTitle = new com.xzq.osc.JocHyperlink();
        panelSaveTitle = new com.xzq.osc.JocHyperlink();
        panelHoverTitle = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanleTitle = new javax.swing.JScrollPane();
        tableTitle = new javax.swing.JTable();
        lblTitle_L2 = new javax.swing.JLabel();
        txtTitle_L2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblJonDuties = new javax.swing.JLabel();
        cmbTitle = new javax.swing.JComboBox<>();
        btnDeleteTitle = new com.xzq.osc.JocHyperlink();
        panelDeleteTitle = new com.xzq.osc.JocHyperlink();
        panelHoverDeleteTitle = new com.xzq.osc.JocHyperlink();
        jPanel6 = new javax.swing.JPanel();
        lblJobDutiesID = new javax.swing.JLabel();
        txtJobDutiesID = new javax.swing.JTextField();
        lblJobDuties_L1 = new javax.swing.JLabel();
        txtJobDuties_L1 = new javax.swing.JTextField();
        lblJobDuties_L2 = new javax.swing.JLabel();
        txtJobDuties_L2 = new javax.swing.JTextField();
        btnSaveJob = new com.xzq.osc.JocHyperlink();
        panelSaveJob = new com.xzq.osc.JocHyperlink();
        panelHoverJob = new com.xzq.osc.JocHyperlink();
        jPanel7 = new javax.swing.JPanel();
        tableScrollPaneJob = new javax.swing.JScrollPane();
        tableJob = new javax.swing.JTable();
        btnDeleteJob = new com.xzq.osc.JocHyperlink();
        panelDeleteJob = new com.xzq.osc.JocHyperlink();
        panelHoverDeleteJob = new com.xzq.osc.JocHyperlink();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 87, 99), 2, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(81, 87, 99));
        jPanel3.setLayout(null);

        lbllblTitleInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lbllblTitleInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbllblTitleInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllblTitleInfo.setText("Title Information");
        jPanel3.add(lbllblTitleInfo);
        lbllblTitleInfo.setBounds(8, 4, 520, 22);

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jPanel3.add(menuExit);
        menuExit.setBounds(535, 0, 25, 25);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 562, 30);

        tabPanel.setShowCloseButton(false);
        tabPanel.setShowListButton(false);
        tabPanel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        txtTitleID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTitleID.setText("New");
        txtTitleID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtTitleID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTitleID.setEnabled(false);
        txtTitleID.setOpaque(false);
        jPanel5.add(txtTitleID);
        txtTitleID.setBounds(170, 20, 100, 25);

        lblTitleID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTitleID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitleID.setText("ID");
        jPanel5.add(lblTitleID);
        lblTitleID.setBounds(30, 20, 120, 25);

        txtTitle_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTitle_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel5.add(txtTitle_L1);
        txtTitle_L1.setBounds(170, 60, 300, 25);

        lblTitle_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTitle_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle_L1.setText("Title(Lao)");
        jPanel5.add(lblTitle_L1);
        lblTitle_L1.setBounds(30, 60, 120, 25);

        btnSaveTitle.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSaveTitle.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSaveTitle.setText("Save");
        btnSaveTitle.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveTitle.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(btnSaveTitle);
        btnSaveTitle.setBounds(267, 183, 83, 25);

        panelSaveTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(panelSaveTitle);
        panelSaveTitle.setBounds(260, 180, 96, 32);

        panelHoverTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(panelHoverTitle);
        panelHoverTitle.setBounds(260, 180, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        tableTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableTitle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "lblTitleID", "lblTitle_L1", "lblTitle_L2", "lblJonDuties"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTitle.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableTitle.setGridColor(new java.awt.Color(204, 204, 204));
        tableTitle.setRowHeight(25);
        tableTitle.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableTitle.setSelectionForeground(java.awt.Color.red);
        tableScrollPanleTitle.setViewportView(tableTitle);
        if (tableTitle.getColumnModel().getColumnCount() > 0) {
            tableTitle.getColumnModel().getColumn(0).setMinWidth(0);
            tableTitle.getColumnModel().getColumn(0).setMaxWidth(0);
            tableTitle.getColumnModel().getColumn(1).setMinWidth(207);
            tableTitle.getColumnModel().getColumn(1).setMaxWidth(207);
            tableTitle.getColumnModel().getColumn(2).setMinWidth(207);
            tableTitle.getColumnModel().getColumn(2).setMaxWidth(207);
            tableTitle.getColumnModel().getColumn(3).setMinWidth(210);
            tableTitle.getColumnModel().getColumn(3).setMaxWidth(210);
        }

        jPanel4.add(tableScrollPanleTitle, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(5, 220, 545, 379);

        lblTitle_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTitle_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle_L2.setText("Title(EN)");
        jPanel5.add(lblTitle_L2);
        lblTitle_L2.setBounds(30, 100, 120, 25);

        txtTitle_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTitle_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel5.add(txtTitle_L2);
        txtTitle_L2.setBounds(170, 100, 300, 25);
        jPanel5.add(jSeparator6);
        jSeparator6.setBounds(170, 165, 300, 10);

        lblJonDuties.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblJonDuties.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJonDuties.setText("Job duties");
        jPanel5.add(lblJonDuties);
        lblJonDuties.setBounds(30, 140, 120, 25);

        cmbTitle.setEditable(true);
        cmbTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 1));
        jPanel5.add(cmbTitle);
        cmbTitle.setBounds(170, 140, 300, 25);

        btnDeleteTitle.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDeleteTitle.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDeleteTitle.setText("Delete");
        btnDeleteTitle.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDeleteTitle.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDeleteTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(btnDeleteTitle);
        btnDeleteTitle.setBounds(377, 183, 82, 26);

        panelDeleteTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDeleteTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(panelDeleteTitle);
        panelDeleteTitle.setBounds(370, 180, 96, 32);

        panelHoverDeleteTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverDeleteTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(panelHoverDeleteTitle);
        panelHoverDeleteTitle.setBounds(370, 180, 96, 32);

        tabPanel.addTab("Title", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        lblJobDutiesID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblJobDutiesID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJobDutiesID.setText("ID");
        jPanel6.add(lblJobDutiesID);
        lblJobDutiesID.setBounds(30, 20, 120, 25);

        txtJobDutiesID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtJobDutiesID.setText("New");
        txtJobDutiesID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtJobDutiesID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJobDutiesID.setEnabled(false);
        txtJobDutiesID.setOpaque(false);
        jPanel6.add(txtJobDutiesID);
        txtJobDutiesID.setBounds(170, 20, 100, 25);

        lblJobDuties_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblJobDuties_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJobDuties_L1.setText("Job Duties(Lao)");
        jPanel6.add(lblJobDuties_L1);
        lblJobDuties_L1.setBounds(30, 60, 120, 25);

        txtJobDuties_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtJobDuties_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtJobDuties_L1);
        txtJobDuties_L1.setBounds(170, 60, 300, 25);

        lblJobDuties_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblJobDuties_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJobDuties_L2.setText("Job Duties(EN)");
        jPanel6.add(lblJobDuties_L2);
        lblJobDuties_L2.setBounds(30, 100, 120, 25);

        txtJobDuties_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtJobDuties_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtJobDuties_L2);
        txtJobDuties_L2.setBounds(170, 100, 300, 25);

        btnSaveJob.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSaveJob.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSaveJob.setText("Save");
        btnSaveJob.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveJob.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(btnSaveJob);
        btnSaveJob.setBounds(256, 143, 83, 26);

        panelSaveJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelSaveJob);
        panelSaveJob.setBounds(250, 140, 96, 32);

        panelHoverJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelHoverJob);
        panelHoverJob.setBounds(250, 140, 96, 32);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        tableJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableJob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "lblJobDutiesID", "lblJobDuties_L1", "lblJobDuties_L2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableJob.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableJob.setGridColor(new java.awt.Color(204, 204, 204));
        tableJob.setRowHeight(25);
        tableJob.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableJob.setSelectionForeground(java.awt.Color.red);
        tableScrollPaneJob.setViewportView(tableJob);
        if (tableJob.getColumnModel().getColumnCount() > 0) {
            tableJob.getColumnModel().getColumn(0).setMinWidth(100);
            tableJob.getColumnModel().getColumn(0).setMaxWidth(100);
            tableJob.getColumnModel().getColumn(1).setMinWidth(265);
            tableJob.getColumnModel().getColumn(1).setMaxWidth(265);
            tableJob.getColumnModel().getColumn(2).setMinWidth(260);
            tableJob.getColumnModel().getColumn(2).setMaxWidth(260);
        }

        jPanel7.add(tableScrollPaneJob, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(5, 200, 545, 400);

        btnDeleteJob.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDeleteJob.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDeleteJob.setText("Delete");
        btnDeleteJob.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDeleteJob.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDeleteJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(btnDeleteJob);
        btnDeleteJob.setBounds(377, 143, 82, 26);

        panelDeleteJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDeleteJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelDeleteJob);
        panelDeleteJob.setBounds(370, 140, 96, 32);

        panelHoverDeleteJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverDeleteJob.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelHoverDeleteJob);
        panelHoverDeleteJob.setBounds(370, 140, 96, 32);

        tabPanel.addTab("Job Duties", jPanel6);

        jPanel2.add(tabPanel);
        tabPanel.setBounds(0, 30, 560, 640);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        
    }//GEN-LAST:event_menuExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTitle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTitle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTitle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTitle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmTitle dialog = new FrmTitle(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnDeleteJob;
    private com.xzq.osc.JocHyperlink btnDeleteTitle;
    private com.xzq.osc.JocHyperlink btnSaveJob;
    private com.xzq.osc.JocHyperlink btnSaveTitle;
    private javax.swing.JComboBox<String> cmbTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblJobDutiesID;
    private javax.swing.JLabel lblJobDuties_L1;
    private javax.swing.JLabel lblJobDuties_L2;
    private javax.swing.JLabel lblJonDuties;
    private javax.swing.JLabel lblTitleID;
    private javax.swing.JLabel lblTitle_L1;
    private javax.swing.JLabel lblTitle_L2;
    private javax.swing.JLabel lbllblTitleInfo;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDeleteJob;
    private com.xzq.osc.JocHyperlink panelDeleteTitle;
    private com.xzq.osc.JocHyperlink panelHoverDeleteJob;
    private com.xzq.osc.JocHyperlink panelHoverDeleteTitle;
    private com.xzq.osc.JocHyperlink panelHoverJob;
    private com.xzq.osc.JocHyperlink panelHoverTitle;
    private com.xzq.osc.JocHyperlink panelSaveJob;
    private com.xzq.osc.JocHyperlink panelSaveTitle;
    private com.xzq.osc.JocTabbedPane tabPanel;
    private javax.swing.JTable tableJob;
    private javax.swing.JScrollPane tableScrollPaneJob;
    private javax.swing.JScrollPane tableScrollPanleTitle;
    private javax.swing.JTable tableTitle;
    private javax.swing.JTextField txtJobDutiesID;
    private javax.swing.JTextField txtJobDuties_L1;
    private javax.swing.JTextField txtJobDuties_L2;
    private javax.swing.JTextField txtTitleID;
    private javax.swing.JTextField txtTitle_L1;
    private javax.swing.JTextField txtTitle_L2;
    // End of variables declaration//GEN-END:variables
}
