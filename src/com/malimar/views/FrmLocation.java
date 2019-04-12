package com.malimar.views;

import java.awt.Color;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class FrmLocation extends javax.swing.JFrame {

    public FrmLocation() {
        initComponents();
        tableLocationScrollPane.getViewport().setBackground(Color.WHITE);
        tableLocation.setShowGrid(true);
        cmbDivision.setUI(new BasicComboBoxUI());
        cmbLocProvince.setUI(new BasicComboBoxUI());
        cmbDistrict.setUI(new BasicComboBoxUI());
        cmbManager.setUI(new BasicComboBoxUI());
        cmbAssistant.setUI(new BasicComboBoxUI());
        cmbDisProvince.setUI(new BasicComboBoxUI());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblLocationInfo = new javax.swing.JLabel();
        tabPanel = new com.xzq.osc.JocTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblLocationID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblSortBy = new javax.swing.JLabel();
        txtSortBy = new javax.swing.JTextField();
        lblDivision = new javax.swing.JLabel();
        lblLocation_L1 = new javax.swing.JLabel();
        txtLocation_L1 = new javax.swing.JTextField();
        lblLocation_L2 = new javax.swing.JLabel();
        txtLocation_L2 = new javax.swing.JTextField();
        lblLocProvince = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        lblAddress_L2 = new javax.swing.JLabel();
        txtAddress_L2 = new javax.swing.JTextField();
        btnSaveLoc = new com.xzq.osc.JocHyperlink();
        panelSaveLoc = new com.xzq.osc.JocHyperlink();
        panelHoverLoc = new com.xzq.osc.JocHyperlink();
        lblAddress_L1 = new javax.swing.JLabel();
        txtAddress_L1 = new javax.swing.JTextField();
        lblLocDistrict = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        cmbDivision = new javax.swing.JComboBox<>();
        cmbLocProvince = new javax.swing.JComboBox<>();
        lblManager = new javax.swing.JLabel();
        cmbManager = new javax.swing.JComboBox<>();
        cmbAssistant = new javax.swing.JComboBox<>();
        lblAssistant = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tableLocationScrollPane = new javax.swing.JScrollPane();
        tableLocation = new javax.swing.JTable();
        cmbDistrict = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        txtID1 = new javax.swing.JTextField();
        lblDistrictProvince = new javax.swing.JLabel();
        lblDistrictID = new javax.swing.JLabel();
        lblDistrict_L1 = new javax.swing.JLabel();
        txtSortBy2 = new javax.swing.JTextField();
        lblDistrict_L2 = new javax.swing.JLabel();
        txtSortBy3 = new javax.swing.JTextField();
        btnSaveDistrict = new com.xzq.osc.JocHyperlink();
        panelDistrictSave = new com.xzq.osc.JocHyperlink();
        panelDistrictHover = new com.xzq.osc.JocHyperlink();
        jPanel8 = new javax.swing.JPanel();
        tableDistrictScrollPane = new javax.swing.JScrollPane();
        tableDistrict = new javax.swing.JTable();
        cmbDisProvince = new javax.swing.JComboBox<>();
        lblDistrictProvince3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        lblProvince = new javax.swing.JLabel();
        txtProvinceID = new javax.swing.JTextField();
        lblProvince_L2 = new javax.swing.JLabel();
        txtProvince_L2 = new javax.swing.JTextField();
        lblProvince_L1 = new javax.swing.JLabel();
        txtProvince_L1 = new javax.swing.JTextField();
        btnSaveProvince = new com.xzq.osc.JocHyperlink();
        panelSavePro = new com.xzq.osc.JocHyperlink();
        panelHoverPro = new com.xzq.osc.JocHyperlink();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProvince = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 87, 99), 2, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(81, 87, 99));

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });

        lblLocationInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblLocationInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblLocationInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocationInfo.setText("Location");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLocationInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLocationInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1033, 30);

        tabPanel.setBorderColor(new java.awt.Color(204, 204, 204));
        tabPanel.setShowCloseButton(false);
        tabPanel.setShowListButton(false);
        tabPanel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        lblLocationID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLocationID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocationID.setText("ID");
        jPanel4.add(lblLocationID);
        lblLocationID.setBounds(10, 10, 140, 25);

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID.setText("New");
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtID);
        txtID.setBounds(170, 10, 100, 25);

        lblSortBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSortBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSortBy.setText("Sort By");
        jPanel4.add(lblSortBy);
        lblSortBy.setBounds(10, 50, 140, 25);

        txtSortBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSortBy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtSortBy);
        txtSortBy.setBounds(170, 50, 290, 25);

        lblDivision.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDivision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDivision.setText("Division");
        jPanel4.add(lblDivision);
        lblDivision.setBounds(10, 90, 140, 25);

        lblLocation_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLocation_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocation_L1.setText("Location(Lao)");
        jPanel4.add(lblLocation_L1);
        lblLocation_L1.setBounds(10, 130, 140, 25);

        txtLocation_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtLocation_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtLocation_L1);
        txtLocation_L1.setBounds(170, 130, 290, 25);

        lblLocation_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLocation_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocation_L2.setText("Location(En)");
        jPanel4.add(lblLocation_L2);
        lblLocation_L2.setBounds(10, 170, 140, 25);

        txtLocation_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtLocation_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtLocation_L2);
        txtLocation_L2.setBounds(170, 170, 290, 25);

        lblLocProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLocProvince.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocProvince.setText("Province");
        jPanel4.add(lblLocProvince);
        lblLocProvince.setBounds(10, 250, 140, 25);

        txtTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtTelephone);
        txtTelephone.setBounds(170, 210, 290, 25);

        lblAddress_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress_L2.setText("Address(EN)");
        jPanel4.add(lblAddress_L2);
        lblAddress_L2.setBounds(10, 370, 140, 25);

        txtAddress_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtAddress_L2);
        txtAddress_L2.setBounds(170, 370, 290, 25);

        btnSaveLoc.setText("Save");
        btnSaveLoc.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveLoc.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel4.add(btnSaveLoc);
        btnSaveLoc.setBounds(367, 513, 82, 26);

        panelSaveLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSaveLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel4.add(panelSaveLoc);
        panelSaveLoc.setBounds(360, 510, 96, 32);

        panelHoverLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel4.add(panelHoverLoc);
        panelHoverLoc.setBounds(360, 510, 96, 32);

        lblAddress_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress_L1.setText("Address(Lao)");
        jPanel4.add(lblAddress_L1);
        lblAddress_L1.setBounds(10, 330, 140, 25);

        txtAddress_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel4.add(txtAddress_L1);
        txtAddress_L1.setBounds(170, 330, 290, 25);

        lblLocDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblLocDistrict.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocDistrict.setText("District");
        jPanel4.add(lblLocDistrict);
        lblLocDistrict.setBounds(10, 290, 140, 25);

        lblTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTelephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelephone.setText("Telephone");
        jPanel4.add(lblTelephone);
        lblTelephone.setBounds(10, 210, 140, 25);

        cmbDivision.setEditable(true);
        cmbDivision.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDivision.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(cmbDivision);
        cmbDivision.setBounds(170, 90, 290, 25);

        cmbLocProvince.setEditable(true);
        cmbLocProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLocProvince.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(cmbLocProvince);
        cmbLocProvince.setBounds(170, 250, 290, 25);

        lblManager.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblManager.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManager.setText("Manager");
        jPanel4.add(lblManager);
        lblManager.setBounds(10, 410, 140, 25);

        cmbManager.setEditable(true);
        cmbManager.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbManager.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(cmbManager);
        cmbManager.setBounds(170, 410, 290, 25);

        cmbAssistant.setEditable(true);
        cmbAssistant.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbAssistant.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(cmbAssistant);
        cmbAssistant.setBounds(170, 450, 290, 25);

        lblAssistant.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAssistant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAssistant.setText("Assistant manager");
        jPanel4.add(lblAssistant);
        lblAssistant.setBounds(10, 450, 140, 25);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        tableLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblID", "lblSortBy", "lblDivision", "lblLocation_L1", "lblLocation_L2", "lblTelephone", "lblProvince", "lblDistrict", "lblAddress_L1", "lblAddress_L2", "lblManager", "lblAssisten"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLocation.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableLocation.setGridColor(new java.awt.Color(204, 204, 204));
        tableLocation.setRowHeight(25);
        tableLocation.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableLocation.setSelectionForeground(java.awt.Color.red);
        tableLocation.setShowGrid(true);
        tableLocationScrollPane.setViewportView(tableLocation);
        if (tableLocation.getColumnModel().getColumnCount() > 0) {
            tableLocation.getColumnModel().getColumn(0).setMinWidth(0);
            tableLocation.getColumnModel().getColumn(0).setMaxWidth(0);
            tableLocation.getColumnModel().getColumn(1).setMinWidth(70);
            tableLocation.getColumnModel().getColumn(1).setMaxWidth(70);
            tableLocation.getColumnModel().getColumn(2).setMinWidth(170);
            tableLocation.getColumnModel().getColumn(2).setMaxWidth(170);
            tableLocation.getColumnModel().getColumn(3).setMinWidth(200);
            tableLocation.getColumnModel().getColumn(3).setMaxWidth(200);
            tableLocation.getColumnModel().getColumn(4).setMinWidth(200);
            tableLocation.getColumnModel().getColumn(4).setMaxWidth(200);
            tableLocation.getColumnModel().getColumn(5).setMinWidth(150);
            tableLocation.getColumnModel().getColumn(5).setMaxWidth(150);
            tableLocation.getColumnModel().getColumn(6).setMinWidth(170);
            tableLocation.getColumnModel().getColumn(6).setMaxWidth(170);
            tableLocation.getColumnModel().getColumn(7).setMinWidth(170);
            tableLocation.getColumnModel().getColumn(7).setMaxWidth(170);
            tableLocation.getColumnModel().getColumn(8).setMinWidth(200);
            tableLocation.getColumnModel().getColumn(8).setMaxWidth(200);
            tableLocation.getColumnModel().getColumn(9).setMinWidth(200);
            tableLocation.getColumnModel().getColumn(9).setMaxWidth(200);
            tableLocation.getColumnModel().getColumn(10).setMinWidth(170);
            tableLocation.getColumnModel().getColumn(10).setMaxWidth(170);
            tableLocation.getColumnModel().getColumn(11).setMinWidth(200);
            tableLocation.getColumnModel().getColumn(11).setMaxWidth(200);
        }

        jPanel7.add(tableLocationScrollPane, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(470, 5, 530, 542);

        cmbDistrict.setEditable(true);
        cmbDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDistrict.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(cmbDistrict);
        cmbDistrict.setBounds(170, 290, 290, 25);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(170, 475, 290, 10);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(170, 435, 290, 10);
        jPanel4.add(jSeparator3);
        jSeparator3.setBounds(170, 315, 290, 10);
        jPanel4.add(jSeparator4);
        jSeparator4.setBounds(170, 275, 290, 10);
        jPanel4.add(jSeparator5);
        jSeparator5.setBounds(170, 115, 290, 10);

        tabPanel.addTab("Location", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        txtID1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID1.setText("New");
        txtID1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel5.add(txtID1);
        txtID1.setBounds(140, 30, 100, 25);

        lblDistrictProvince.setBackground(new java.awt.Color(255, 255, 255));
        lblDistrictProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrictProvince.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrictProvince.setOpaque(true);
        jPanel5.add(lblDistrictProvince);
        lblDistrictProvince.setBounds(70, 350, 260, 10);

        lblDistrictID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrictID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrictID.setText("ID");
        jPanel5.add(lblDistrictID);
        lblDistrictID.setBounds(10, 30, 110, 25);

        lblDistrict_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrict_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrict_L1.setText("Distrct Name(Lao)");
        jPanel5.add(lblDistrict_L1);
        lblDistrict_L1.setBounds(10, 110, 110, 25);

        txtSortBy2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSortBy2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel5.add(txtSortBy2);
        txtSortBy2.setBounds(140, 110, 260, 25);

        lblDistrict_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrict_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrict_L2.setText("Distrct Name(EN)");
        jPanel5.add(lblDistrict_L2);
        lblDistrict_L2.setBounds(10, 150, 110, 25);

        txtSortBy3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSortBy3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel5.add(txtSortBy3);
        txtSortBy3.setBounds(140, 150, 260, 25);

        btnSaveDistrict.setText("Save");
        btnSaveDistrict.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveDistrict.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(btnSaveDistrict);
        btnSaveDistrict.setBounds(307, 233, 82, 26);

        panelDistrictSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDistrictSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(panelDistrictSave);
        panelDistrictSave.setBounds(300, 230, 96, 32);

        panelDistrictHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelDistrictHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel5.add(panelDistrictHover);
        panelDistrictHover.setBounds(300, 230, 96, 32);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        tableDistrictScrollPane.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        tableDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableDistrict.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "lblID", "lblDistrict_L1", "lblDistrict_L2", "lblDistrictProvince"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDistrict.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableDistrict.setGridColor(new java.awt.Color(204, 204, 204));
        tableDistrict.setRowHeight(25);
        tableDistrict.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableDistrict.setSelectionForeground(java.awt.Color.red);
        tableDistrictScrollPane.setViewportView(tableDistrict);
        if (tableDistrict.getColumnModel().getColumnCount() > 0) {
            tableDistrict.getColumnModel().getColumn(0).setMinWidth(60);
            tableDistrict.getColumnModel().getColumn(0).setMaxWidth(60);
            tableDistrict.getColumnModel().getColumn(1).setMinWidth(170);
            tableDistrict.getColumnModel().getColumn(1).setMaxWidth(170);
            tableDistrict.getColumnModel().getColumn(2).setMinWidth(170);
            tableDistrict.getColumnModel().getColumn(2).setMaxWidth(170);
            tableDistrict.getColumnModel().getColumn(3).setMinWidth(170);
            tableDistrict.getColumnModel().getColumn(3).setMaxWidth(170);
        }

        jPanel8.add(tableDistrictScrollPane, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel8);
        jPanel8.setBounds(420, 8, 577, 540);

        cmbDisProvince.setEditable(true);
        cmbDisProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDisProvince.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 1));
        jPanel5.add(cmbDisProvince);
        cmbDisProvince.setBounds(140, 70, 260, 25);

        lblDistrictProvince3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDistrictProvince3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistrictProvince3.setText("Province");
        jPanel5.add(lblDistrictProvince3);
        lblDistrictProvince3.setBounds(10, 70, 110, 25);
        jPanel5.add(jSeparator6);
        jSeparator6.setBounds(140, 95, 260, 10);

        tabPanel.addTab("District", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        lblProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblProvince.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProvince.setText("ID");
        jPanel6.add(lblProvince);
        lblProvince.setBounds(10, 30, 120, 25);

        txtProvinceID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtProvinceID.setText("New");
        txtProvinceID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtProvinceID);
        txtProvinceID.setBounds(150, 30, 100, 25);

        lblProvince_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblProvince_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProvince_L2.setText("Province Name(EN)");
        jPanel6.add(lblProvince_L2);
        lblProvince_L2.setBounds(10, 110, 120, 25);

        txtProvince_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtProvince_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtProvince_L2);
        txtProvince_L2.setBounds(150, 110, 260, 25);

        lblProvince_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblProvince_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProvince_L1.setText("Province Name(Lao)");
        jPanel6.add(lblProvince_L1);
        lblProvince_L1.setBounds(10, 70, 120, 25);

        txtProvince_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtProvince_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtProvince_L1);
        txtProvince_L1.setBounds(150, 70, 260, 25);

        btnSaveProvince.setText("Save");
        btnSaveProvince.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSaveProvince.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSaveProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(btnSaveProvince);
        btnSaveProvince.setBounds(317, 183, 82, 26);

        panelSavePro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSavePro.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelSavePro);
        panelSavePro.setBounds(310, 180, 96, 32);

        panelHoverPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverPro.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(panelHoverPro);
        panelHoverPro.setBounds(310, 180, 96, 32);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        tableProvince.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "lblProvinceID", "lblProvince_L1", "lblProvince_L2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProvince.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableProvince.setGridColor(new java.awt.Color(204, 204, 204));
        tableProvince.setRowHeight(25);
        tableProvince.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableProvince.setSelectionForeground(java.awt.Color.red);
        jScrollPane1.setViewportView(tableProvince);
        if (tableProvince.getColumnModel().getColumnCount() > 0) {
            tableProvince.getColumnModel().getColumn(0).setMinWidth(70);
            tableProvince.getColumnModel().getColumn(0).setMaxWidth(70);
            tableProvince.getColumnModel().getColumn(1).setMinWidth(222);
            tableProvince.getColumnModel().getColumn(1).setMaxWidth(222);
            tableProvince.getColumnModel().getColumn(2).setMinWidth(222);
            tableProvince.getColumnModel().getColumn(2).setMaxWidth(222);
        }

        jPanel9.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel9);
        jPanel9.setBounds(460, 20, 520, 510);

        tabPanel.addTab("Province", jPanel6);

        jPanel2.add(tabPanel);
        tabPanel.setBounds(10, 35, 1010, 590);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
         this.dispose();
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
            java.util.logging.Logger.getLogger(FrmLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnSaveDistrict;
    private com.xzq.osc.JocHyperlink btnSaveLoc;
    private com.xzq.osc.JocHyperlink btnSaveProvince;
    private javax.swing.JComboBox<String> cmbAssistant;
    private javax.swing.JComboBox<String> cmbDisProvince;
    private javax.swing.JComboBox<String> cmbDistrict;
    private javax.swing.JComboBox<String> cmbDivision;
    private javax.swing.JComboBox<String> cmbLocProvince;
    private javax.swing.JComboBox<String> cmbManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAddress_L1;
    private javax.swing.JLabel lblAddress_L2;
    private javax.swing.JLabel lblAssistant;
    private javax.swing.JLabel lblDistrictID;
    private javax.swing.JLabel lblDistrictProvince;
    private javax.swing.JLabel lblDistrictProvince3;
    private javax.swing.JLabel lblDistrict_L1;
    private javax.swing.JLabel lblDistrict_L2;
    private javax.swing.JLabel lblDivision;
    private javax.swing.JLabel lblLocDistrict;
    private javax.swing.JLabel lblLocProvince;
    private javax.swing.JLabel lblLocationID;
    private javax.swing.JLabel lblLocationInfo;
    private javax.swing.JLabel lblLocation_L1;
    private javax.swing.JLabel lblLocation_L2;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblProvince_L1;
    private javax.swing.JLabel lblProvince_L2;
    private javax.swing.JLabel lblSortBy;
    private javax.swing.JLabel lblTelephone;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDistrictHover;
    private com.xzq.osc.JocHyperlink panelDistrictSave;
    private com.xzq.osc.JocHyperlink panelHoverLoc;
    private com.xzq.osc.JocHyperlink panelHoverPro;
    private com.xzq.osc.JocHyperlink panelSaveLoc;
    private com.xzq.osc.JocHyperlink panelSavePro;
    private com.xzq.osc.JocTabbedPane tabPanel;
    private javax.swing.JTable tableDistrict;
    private javax.swing.JScrollPane tableDistrictScrollPane;
    private javax.swing.JTable tableLocation;
    private javax.swing.JScrollPane tableLocationScrollPane;
    private javax.swing.JTable tableProvince;
    private javax.swing.JTextField txtAddress_L1;
    private javax.swing.JTextField txtAddress_L2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtLocation_L1;
    private javax.swing.JTextField txtLocation_L2;
    private javax.swing.JTextField txtProvinceID;
    private javax.swing.JTextField txtProvince_L1;
    private javax.swing.JTextField txtProvince_L2;
    private javax.swing.JTextField txtSortBy;
    private javax.swing.JTextField txtSortBy2;
    private javax.swing.JTextField txtSortBy3;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
