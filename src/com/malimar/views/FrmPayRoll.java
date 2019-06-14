
package com.malimar.views;

import com.malimar.controllers.PayRolController;
import com.malimar.utils.InternalFrame;
import com.xzq.osc.JocHyperlink;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class FrmPayRoll extends javax.swing.JInternalFrame {
    public FrmPayRoll() {
        initComponents();
        InternalFrame inter = new InternalFrame(this);
        PayRolController pc = new PayRolController(this);
    }

    public JRadioButton getRadFullTime() {
        return radFullTime;
    }

    public JRadioButton getRadPartTime() {
        return radPartTime;
    }

    public JRadioButton getRadViewAll() {
        return radViewAll;
    }

    public JRadioButton getRadCompleted() {
        return radCompleted;
    }

    public JRadioButton getRadPending() {
        return radPending;
    }

    public JRadioButton getRadTotal() {
        return radTotal;
    }


    public JocHyperlink getBtnProcess() {
        return btnProcess;
    }

    public JocHyperlink getPanelProcess() {
        return panelProcess;
    }

    public JocHyperlink getPanelProcessHover() {
        return panelProcessHover;
    }

    public JLabel getTxtStartDate() {
        return txtStartDate;
    }


    public JLabel getLblStartDate() {
        return lblStartDate;
    }

    public JTable getTableDept() {
        return tableDept;
    }

    public JScrollPane getTableDeptScrollPane() {
        return tableDeptScrollPane;
    }

    public JTable getTable() {
        return table;
    }

    public JScrollPane getTableScrollPane() {
        return tableScrollPane;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer (TableCellRenderer renderer, int rowIndex, int columnIndex){
                Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
                if(getModel().getValueAt(rowIndex,4) !=null){
                    //Object value = getModel().getValueAt(rowIndex,4);

                    if(table.getRowCount()-1==rowIndex) {
                        table.setRowSelectionAllowed(false);
                        component.setBackground(Color.decode("#82E0AA"));
                        component.setForeground(Color.BLACK);
                        component.setFont(new Font("Saysettha OT", Font.BOLD, 12));
                    }else {
                        component.setBackground(Color.WHITE);
                        component.setForeground(Color.BLACK);
                        component.setFont(new Font("Saysettha OT", Font.PLAIN, 12));
                    }
                }
                Color color = null;
                if(columnIndex == 4 && (table.getRowCount()-1 != rowIndex)){
                    Object v = getModel().getValueAt(rowIndex,16);
                    if(v.equals(1)){
                        color = Color.BLUE;
                    }else{
                        color = Color.RED;
                    }
                    component.setForeground(color);
                }

                if(columnIndex == 3 && (table.getRowCount()-1 != rowIndex)){
                    Object v = getModel().getValueAt(rowIndex,17);
                    if(v.equals(1)){
                        color = Color.decode("#027A02");
                    }else{
                        color = Color.decode("#E65E04");
                    }
                    component.setForeground(color);
                }
                return component;
            }
        };
        jPanel4 = new javax.swing.JPanel();
        tableDeptScrollPane = new javax.swing.JScrollPane();
        tableDept = new javax.swing.JTable();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JLabel();
        btnProcess = new com.xzq.osc.JocHyperlink();
        panelProcess = new com.xzq.osc.JocHyperlink();
        panelProcessHover = new com.xzq.osc.JocHyperlink();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        radViewAll = new javax.swing.JRadioButton();
        radFullTime = new javax.swing.JRadioButton();
        radPartTime = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        radTotal = new javax.swing.JRadioButton();
        radCompleted = new javax.swing.JRadioButton();
        radPending = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tableScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblPRID", "lblStatus", "lblEmpID", "lblEmpNbr", "lblEmpName", "lblGrossSalary", "lblTaxSalary", "lblExcludeTax", "lblAbsent", "lblInsurance", "lblTax + or -", "lblOvertime", "lblTaxNetSalary", "lblPayTax", "lblNonTax + or -", "lblNetSalary", "lblProcess", "lblFulltime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRowHeight(25);
        tableScrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setMinWidth(60);
            table.getColumnModel().getColumn(1).setMaxWidth(60);
            table.getColumnModel().getColumn(2).setMinWidth(0);
            table.getColumnModel().getColumn(2).setMaxWidth(0);
            table.getColumnModel().getColumn(3).setMinWidth(60);
            table.getColumnModel().getColumn(3).setMaxWidth(60);
            table.getColumnModel().getColumn(4).setMinWidth(175);
            table.getColumnModel().getColumn(4).setMaxWidth(175);
            table.getColumnModel().getColumn(5).setMinWidth(100);
            table.getColumnModel().getColumn(5).setMaxWidth(100);
            table.getColumnModel().getColumn(6).setMinWidth(100);
            table.getColumnModel().getColumn(6).setMaxWidth(100);
            table.getColumnModel().getColumn(7).setMinWidth(100);
            table.getColumnModel().getColumn(7).setMaxWidth(100);
            table.getColumnModel().getColumn(8).setMinWidth(90);
            table.getColumnModel().getColumn(8).setMaxWidth(90);
            table.getColumnModel().getColumn(9).setMinWidth(90);
            table.getColumnModel().getColumn(9).setMaxWidth(90);
            table.getColumnModel().getColumn(10).setMinWidth(90);
            table.getColumnModel().getColumn(10).setMaxWidth(90);
            table.getColumnModel().getColumn(11).setMinWidth(90);
            table.getColumnModel().getColumn(11).setMaxWidth(90);
            table.getColumnModel().getColumn(12).setMinWidth(100);
            table.getColumnModel().getColumn(12).setMaxWidth(100);
            table.getColumnModel().getColumn(13).setMinWidth(90);
            table.getColumnModel().getColumn(13).setMaxWidth(90);
            table.getColumnModel().getColumn(14).setMinWidth(90);
            table.getColumnModel().getColumn(14).setMaxWidth(90);
            table.getColumnModel().getColumn(15).setMinWidth(100);
            table.getColumnModel().getColumn(15).setMaxWidth(100);
            table.getColumnModel().getColumn(16).setMinWidth(0);
            table.getColumnModel().getColumn(16).setMaxWidth(0);
            table.getColumnModel().getColumn(17).setMinWidth(0);
            table.getColumnModel().getColumn(17).setMaxWidth(0);
        }

        jPanel3.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1360, 690));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        tableDeptScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tableDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableDept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "lblRow#", "lblDeptID", "lblDepartmentName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDept.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableDept.setGridColor(new java.awt.Color(204, 204, 204));
        tableDept.setRowHeight(25);
        tableDept.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableDept.setSelectionForeground(java.awt.Color.red);
        tableDeptScrollPane.setViewportView(tableDept);
        if (tableDept.getColumnModel().getColumnCount() > 0) {
            tableDept.getColumnModel().getColumn(0).setMinWidth(65);
            tableDept.getColumnModel().getColumn(0).setMaxWidth(65);
            tableDept.getColumnModel().getColumn(1).setMinWidth(0);
            tableDept.getColumnModel().getColumn(1).setMaxWidth(0);
            tableDept.getColumnModel().getColumn(2).setMinWidth(205);
            tableDept.getColumnModel().getColumn(2).setMaxWidth(205);
        }

        jPanel4.add(tableDeptScrollPane, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 690));

        lblStartDate.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblStartDate.setText("Payroll Date:");
        jPanel2.add(lblStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 90, 25));

        txtStartDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 180, 25));

        btnProcess.setActiveColor(new java.awt.Color(255, 255, 255));
        btnProcess.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnProcess.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnProcess.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1178, 44, 80, -1));

        panelProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelProcess.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, -1, -1));

        panelProcessHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelProcessHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelProcessHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(81, 87, 99));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 775, 1360, 10));

        jSeparator2.setForeground(new java.awt.Color(81, 87, 99));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 775, 270, 10));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 87, 99), 2), "Work Type", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 1, 12))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radViewAll.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radViewAll);
        radViewAll.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radViewAll.setForeground(new java.awt.Color(255, 255, 255));
        radViewAll.setText("All");
        radViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(radViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 110, -1));

        radFullTime.setBackground(new java.awt.Color(0, 153, 0));
        buttonGroup1.add(radFullTime);
        radFullTime.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radFullTime.setForeground(new java.awt.Color(255, 255, 255));
        radFullTime.setText("FullTime");
        radFullTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(radFullTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 23, 120, -1));

        radPartTime.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(radPartTime);
        radPartTime.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radPartTime.setForeground(new java.awt.Color(255, 255, 255));
        radPartTime.setText("PartTime");
        radPartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(radPartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 23, 130, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 400, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 87, 99), 2), "Process", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 1, 12))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radTotal.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(radTotal);
        radTotal.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radTotal.setForeground(new java.awt.Color(255, 255, 255));
        radTotal.setText("All(9999)");
        radTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(radTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 110, -1));

        radCompleted.setBackground(java.awt.Color.blue);
        buttonGroup2.add(radCompleted);
        radCompleted.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radCompleted.setForeground(new java.awt.Color(255, 255, 255));
        radCompleted.setText("Completed(9999)");
        radCompleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(radCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 23, 140, -1));

        radPending.setBackground(java.awt.Color.red);
        buttonGroup2.add(radPending);
        radPending.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radPending.setForeground(new java.awt.Color(255, 255, 255));
        radPending.setText("Pending(9999)");
        radPending.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(radPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 23, 130, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 420, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1685, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnProcess;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblStartDate;
    private com.xzq.osc.JocHyperlink panelProcess;
    private com.xzq.osc.JocHyperlink panelProcessHover;
    private javax.swing.JRadioButton radCompleted;
    private javax.swing.JRadioButton radFullTime;
    private javax.swing.JRadioButton radPartTime;
    private javax.swing.JRadioButton radPending;
    private javax.swing.JRadioButton radTotal;
    private javax.swing.JRadioButton radViewAll;
    private javax.swing.JTable table;
    private javax.swing.JTable tableDept;
    private javax.swing.JScrollPane tableDeptScrollPane;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel txtStartDate;
    // End of variables declaration//GEN-END:variables
}
