
package com.malimar.views;

import javax.swing.plaf.basic.BasicComboBoxUI;

public class FrmEmployee extends javax.swing.JFrame {

    public FrmEmployee() {
        initComponents();
        cmbFindDepartment.setUI(new BasicComboBoxUI());
        cmbFindLocation.setUI(new BasicComboBoxUI());
        cmbGender.setUI(new BasicComboBoxUI());
        cmbNational.setUI(new BasicComboBoxUI());
        cmbEthnic.setUI(new BasicComboBoxUI());
        cmbReligion.setUI(new BasicComboBoxUI());
        cmbManager.setUI(new BasicComboBoxUI());
        cmbLocation.setUI(new BasicComboBoxUI());
        cmbDepartment.setUI(new BasicComboBoxUI());
        cmbBusiness.setUI(new BasicComboBoxUI());
        cmbTitle.setUI(new BasicComboBoxUI());
        cmbLevel.setUI(new BasicComboBoxUI());
        cmbWorkStatus.setUI(new BasicComboBoxUI());
        cmbInsurance.setUI(new BasicComboBoxUI());
        cmbSalaryPeriod.setUI(new BasicComboBoxUI());
        cmbEmpStatus.setUI(new BasicComboBoxUI());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jocTabbedPane1 = new com.xzq.osc.JocTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblID = new javax.swing.JLabel();
        cmbFindLocation = new javax.swing.JComboBox<>();
        lblID2 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        cmbFindDepartment = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        lblID3 = new javax.swing.JLabel();
        lblID4 = new javax.swing.JLabel();
        txtID2 = new javax.swing.JTextField();
        lblID5 = new javax.swing.JLabel();
        txtID3 = new javax.swing.JTextField();
        lblID6 = new javax.swing.JLabel();
        txtID4 = new javax.swing.JTextField();
        lblID7 = new javax.swing.JLabel();
        txtID5 = new javax.swing.JTextField();
        lblID8 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        lblID9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblID10 = new javax.swing.JLabel();
        cmbEmpStatus = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        cmbNational = new javax.swing.JComboBox<>();
        lblID11 = new javax.swing.JLabel();
        lblID12 = new javax.swing.JLabel();
        cmbEthnic = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        lblID13 = new javax.swing.JLabel();
        cmbReligion = new javax.swing.JComboBox<>();
        jSeparator11 = new javax.swing.JSeparator();
        lblID14 = new javax.swing.JLabel();
        cmbManager = new javax.swing.JComboBox<>();
        jSeparator12 = new javax.swing.JSeparator();
        lblID15 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        lblID16 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        lblID17 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        jSeparator13 = new javax.swing.JSeparator();
        lblID18 = new javax.swing.JLabel();
        lblID19 = new javax.swing.JLabel();
        lblID20 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        cmbBusiness = new javax.swing.JComboBox<>();
        cmbTitle = new javax.swing.JComboBox<>();
        jSeparator16 = new javax.swing.JSeparator();
        lblID21 = new javax.swing.JLabel();
        cmbLevel = new javax.swing.JComboBox<>();
        jSeparator17 = new javax.swing.JSeparator();
        lblID22 = new javax.swing.JLabel();
        cmbWorkStatus = new javax.swing.JComboBox<>();
        jSeparator18 = new javax.swing.JSeparator();
        lblID23 = new javax.swing.JLabel();
        cmbInsurance = new javax.swing.JComboBox<>();
        jSeparator19 = new javax.swing.JSeparator();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        lblID25 = new javax.swing.JLabel();
        lblID26 = new javax.swing.JLabel();
        cmbSalaryPeriod = new javax.swing.JComboBox<>();
        jSeparator20 = new javax.swing.JSeparator();
        lblID27 = new javax.swing.JLabel();
        jocTabbedPane2 = new com.xzq.osc.JocTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblCompanyInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 87, 99), 2, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setLayout(null);

        jocTabbedPane1.setShowCloseButton(false);
        jocTabbedPane1.setShowListButton(false);
        jocTabbedPane1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);
        jPanel5.add(jSeparator7);
        jSeparator7.setBounds(730, 35, 220, 5);
        jPanel5.add(jSeparator5);
        jSeparator5.setBounds(410, 35, 220, 5);

        lblID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("Department");
        jPanel5.add(lblID);
        lblID.setBounds(300, 10, 100, 23);

        cmbFindLocation.setEditable(true);
        cmbFindLocation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbFindLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(cmbFindLocation);
        cmbFindLocation.setBounds(730, 10, 220, 25);

        lblID2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID2.setText("Location");
        jPanel5.add(lblID2);
        lblID2.setBounds(640, 10, 90, 23);

        lblID1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID1.setText("Search");
        jPanel5.add(lblID1);
        lblID1.setBounds(10, 10, 80, 23);

        cmbFindDepartment.setEditable(true);
        cmbFindDepartment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbFindDepartment.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(cmbFindDepartment);
        cmbFindDepartment.setBounds(410, 10, 220, 25);

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel5.add(txtID);
        txtID.setBounds(100, 10, 190, 23);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblEmpID", "lblEmpNbr", "lblEmpName", "lbGender", "lblEmpEmail", "lblEmpDepart", "lblEmpTitle", "lblEmpLoc", "lblEmpWorkStatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(java.awt.Color.red);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(4).setMinWidth(200);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(5).setMinWidth(170);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(6).setMinWidth(170);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(7).setMinWidth(170);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(8).setMinWidth(170);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(170);
        }

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(5, 50, 1060, 590);

        jocTabbedPane1.addTab("Employees", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Picture");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(5, 5, 110, 120);

        txtID1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtID1);
        txtID1.setBounds(260, 10, 200, 23);

        lblID3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID3.setText("Emp ID");
        jPanel6.add(lblID3);
        lblID3.setBounds(120, 10, 130, 23);

        lblID4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID4.setText("EmpEmail");
        jPanel6.add(lblID4);
        lblID4.setBounds(120, 40, 130, 23);

        txtID2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtID2);
        txtID2.setBounds(260, 40, 200, 23);

        lblID5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID5.setText("Employee Name(Lao)");
        jPanel6.add(lblID5);
        lblID5.setBounds(120, 70, 130, 23);

        txtID3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtID3);
        txtID3.setBounds(260, 70, 200, 23);

        lblID6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID6.setText("Employee Name(EN)");
        jPanel6.add(lblID6);
        lblID6.setBounds(120, 100, 130, 23);

        txtID4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtID4);
        txtID4.setBounds(260, 100, 200, 23);

        lblID7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID7.setText("Nickname");
        jPanel6.add(lblID7);
        lblID7.setBounds(120, 130, 130, 23);

        txtID5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel6.add(txtID5);
        txtID5.setBounds(260, 130, 200, 23);

        lblID8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID8.setText("Date of birth");
        jPanel6.add(lblID8);
        lblID8.setBounds(120, 190, 130, 23);

        cmbGender.setEditable(true);
        cmbGender.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbGender);
        cmbGender.setBounds(260, 160, 200, 25);
        jPanel6.add(jSeparator6);
        jSeparator6.setBounds(260, 185, 200, 5);

        lblID9.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID9.setText("Gender");
        jPanel6.add(lblID9);
        lblID9.setBounds(120, 160, 130, 23);

        jDateChooser1.setDateFormatString("dd/MM/yyy");
        jDateChooser1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(jDateChooser1);
        jDateChooser1.setBounds(260, 190, 200, 23);

        lblID10.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID10.setText("Status");
        jPanel6.add(lblID10);
        lblID10.setBounds(120, 220, 130, 23);

        cmbEmpStatus.setEditable(true);
        cmbEmpStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbEmpStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbEmpStatus);
        cmbEmpStatus.setBounds(260, 220, 200, 25);
        jPanel6.add(jSeparator8);
        jSeparator8.setBounds(260, 245, 200, 5);
        jPanel6.add(jSeparator9);
        jSeparator9.setBounds(590, 185, 200, 5);

        cmbNational.setEditable(true);
        cmbNational.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbNational.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbNational);
        cmbNational.setBounds(590, 160, 200, 25);

        lblID11.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID11.setText("Nationality");
        jPanel6.add(lblID11);
        lblID11.setBounds(480, 160, 100, 23);

        lblID12.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID12.setText("Ethnic");
        jPanel6.add(lblID12);
        lblID12.setBounds(480, 190, 100, 23);

        cmbEthnic.setEditable(true);
        cmbEthnic.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbEthnic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbEthnic);
        cmbEthnic.setBounds(590, 190, 200, 25);
        jPanel6.add(jSeparator10);
        jSeparator10.setBounds(590, 215, 200, 5);

        lblID13.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID13.setText("Religion");
        jPanel6.add(lblID13);
        lblID13.setBounds(490, 220, 90, 23);

        cmbReligion.setEditable(true);
        cmbReligion.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbReligion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbReligion);
        cmbReligion.setBounds(590, 220, 200, 25);
        jPanel6.add(jSeparator11);
        jSeparator11.setBounds(590, 245, 200, 5);

        lblID14.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID14.setText("Manager");
        jPanel6.add(lblID14);
        lblID14.setBounds(810, 70, 100, 23);

        cmbManager.setEditable(true);
        cmbManager.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbManager.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbManager);
        cmbManager.setBounds(920, 70, 180, 25);
        jPanel6.add(jSeparator12);
        jSeparator12.setBounds(920, 95, 180, 5);

        lblID15.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID15.setText("Start Date");
        jPanel6.add(lblID15);
        lblID15.setBounds(480, 10, 100, 23);

        jDateChooser2.setDateFormatString("dd/MM/yyy");
        jDateChooser2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(jDateChooser2);
        jDateChooser2.setBounds(590, 10, 140, 23);

        lblID16.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID16.setText("End Date");
        jPanel6.add(lblID16);
        lblID16.setBounds(480, 40, 100, 23);

        jDateChooser3.setDateFormatString("dd/MM/yyy");
        jDateChooser3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(jDateChooser3);
        jDateChooser3.setBounds(590, 40, 140, 23);

        lblID17.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID17.setText("Location");
        jPanel6.add(lblID17);
        lblID17.setBounds(480, 70, 100, 23);

        cmbLocation.setEditable(true);
        cmbLocation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbLocation);
        cmbLocation.setBounds(590, 70, 200, 25);
        jPanel6.add(jSeparator13);
        jSeparator13.setBounds(590, 95, 200, 5);

        lblID18.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID18.setText("Department");
        jPanel6.add(lblID18);
        lblID18.setBounds(480, 100, 100, 23);

        lblID19.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID19.setText("Business Unit");
        jPanel6.add(lblID19);
        lblID19.setBounds(480, 130, 100, 23);

        lblID20.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID20.setText("Title");
        jPanel6.add(lblID20);
        lblID20.setBounds(810, 10, 100, 23);

        cmbDepartment.setEditable(true);
        cmbDepartment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDepartment.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbDepartment);
        cmbDepartment.setBounds(590, 100, 200, 25);
        jPanel6.add(jSeparator14);
        jSeparator14.setBounds(590, 125, 200, 5);
        jPanel6.add(jSeparator15);
        jSeparator15.setBounds(590, 155, 200, 5);

        cmbBusiness.setEditable(true);
        cmbBusiness.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbBusiness.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbBusiness);
        cmbBusiness.setBounds(590, 130, 200, 25);

        cmbTitle.setEditable(true);
        cmbTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbTitle);
        cmbTitle.setBounds(920, 10, 180, 25);
        jPanel6.add(jSeparator16);
        jSeparator16.setBounds(920, 35, 180, 5);

        lblID21.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID21.setText("Level");
        jPanel6.add(lblID21);
        lblID21.setBounds(810, 40, 100, 23);

        cmbLevel.setEditable(true);
        cmbLevel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLevel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbLevel);
        cmbLevel.setBounds(920, 40, 180, 25);
        jPanel6.add(jSeparator17);
        jSeparator17.setBounds(920, 65, 180, 5);

        lblID22.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID22.setText("Work Status");
        jPanel6.add(lblID22);
        lblID22.setBounds(810, 160, 100, 23);

        cmbWorkStatus.setEditable(true);
        cmbWorkStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbWorkStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbWorkStatus);
        cmbWorkStatus.setBounds(920, 160, 180, 25);
        jPanel6.add(jSeparator18);
        jSeparator18.setBounds(920, 185, 180, 5);

        lblID23.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID23.setText("Insurance");
        jPanel6.add(lblID23);
        lblID23.setBounds(810, 100, 100, 23);

        cmbInsurance.setEditable(true);
        cmbInsurance.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbInsurance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbInsurance);
        cmbInsurance.setBounds(920, 100, 180, 25);
        jPanel6.add(jSeparator19);
        jSeparator19.setBounds(920, 155, 180, 5);

        jDateChooser4.setDateFormatString("dd/MM/yyy");
        jDateChooser4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(jDateChooser4);
        jDateChooser4.setBounds(920, 220, 180, 23);

        jDateChooser5.setDateFormatString("dd/MM/yyy");
        jDateChooser5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel6.add(jDateChooser5);
        jDateChooser5.setBounds(920, 190, 180, 23);

        lblID25.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID25.setText("To Date");
        jPanel6.add(lblID25);
        lblID25.setBounds(810, 220, 100, 23);

        lblID26.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID26.setText("Salary Period");
        jPanel6.add(lblID26);
        lblID26.setBounds(810, 130, 100, 23);

        cmbSalaryPeriod.setEditable(true);
        cmbSalaryPeriod.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbSalaryPeriod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(cmbSalaryPeriod);
        cmbSalaryPeriod.setBounds(920, 130, 180, 25);
        jPanel6.add(jSeparator20);
        jSeparator20.setBounds(920, 120, 180, 5);

        lblID27.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID27.setText("Start Date");
        jPanel6.add(lblID27);
        lblID27.setBounds(810, 190, 100, 23);

        jocTabbedPane2.setShowCloseButton(false);
        jocTabbedPane2.setShowListButton(false);
        jocTabbedPane2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Curriculum vitae", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Contact me", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Salary", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Tax", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Education", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Note", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Equipment", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Experience", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Absent", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Bank", jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Manag Location", jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jocTabbedPane2.addTab("Document", jPanel19);

        jPanel6.add(jocTabbedPane2);
        jocTabbedPane2.setBounds(10, 250, 1110, 385);

        jocTabbedPane1.addTab("New Employee", jPanel6);

        jPanel2.add(jocTabbedPane1);
        jocTabbedPane1.setBounds(0, 30, 1135, 680);

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

        lblCompanyInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblCompanyInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblCompanyInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanyInfo.setText("Employee");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompanyInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCompanyInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1135, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBusiness;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbEmpStatus;
    private javax.swing.JComboBox<String> cmbEthnic;
    private javax.swing.JComboBox<String> cmbFindDepartment;
    private javax.swing.JComboBox<String> cmbFindLocation;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbInsurance;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbManager;
    private javax.swing.JComboBox<String> cmbNational;
    private javax.swing.JComboBox<String> cmbReligion;
    private javax.swing.JComboBox<String> cmbSalaryPeriod;
    private javax.swing.JComboBox<String> cmbTitle;
    private javax.swing.JComboBox<String> cmbWorkStatus;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private com.xzq.osc.JocTabbedPane jocTabbedPane1;
    private com.xzq.osc.JocTabbedPane jocTabbedPane2;
    private javax.swing.JLabel lblCompanyInfo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID10;
    private javax.swing.JLabel lblID11;
    private javax.swing.JLabel lblID12;
    private javax.swing.JLabel lblID13;
    private javax.swing.JLabel lblID14;
    private javax.swing.JLabel lblID15;
    private javax.swing.JLabel lblID16;
    private javax.swing.JLabel lblID17;
    private javax.swing.JLabel lblID18;
    private javax.swing.JLabel lblID19;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID20;
    private javax.swing.JLabel lblID21;
    private javax.swing.JLabel lblID22;
    private javax.swing.JLabel lblID23;
    private javax.swing.JLabel lblID25;
    private javax.swing.JLabel lblID26;
    private javax.swing.JLabel lblID27;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblID4;
    private javax.swing.JLabel lblID5;
    private javax.swing.JLabel lblID6;
    private javax.swing.JLabel lblID7;
    private javax.swing.JLabel lblID8;
    private javax.swing.JLabel lblID9;
    private com.xzq.osc.JocHyperlink menuExit;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtID3;
    private javax.swing.JTextField txtID4;
    private javax.swing.JTextField txtID5;
    // End of variables declaration//GEN-END:variables
}
