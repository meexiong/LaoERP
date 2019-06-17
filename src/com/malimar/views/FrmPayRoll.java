
package com.malimar.views;

import com.malimar.controllers.PayRolController;
import com.malimar.utils.InternalFrame;
import com.xzq.osc.JocHyperlink;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

    public JRadioButton getRadAbsentCnt() {
        return radAbsentCnt;
    }

    public JRadioButton getRadOTCnt() {
        return radOTCnt;
    }

    public JLabel getLblRangeDate() {
        return lblRangeDate;
    }

    public JPanel getPanelProcessGroup() {
        return panelProcessGroup;
    }

    public JPanel getPanelWorkTypeGroup() {
        return panelWorkTypeGroup;
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

    public JLabel getLblProcessStatus() {
        return lblProcessStatus;
    }

    public JLabel getLblWorkType() {
        return lblWorkType;
    }

    public JLabel getTxtStartDate() {
        return txtStartDate;
    }


    public JLabel getLblStartDate() {
        return lblRangeDate;
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

    public ButtonGroup getBtnGroup3() {
        return btnGroup3;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer (TableCellRenderer renderer, int rowIndex, int columnIndex){
                Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
                int id = (Integer)getModel().getValueAt(rowIndex,2);
                if(getModel().getValueAt(rowIndex,4) !=null){
                    //Object value = getModel().getValueAt(rowIndex,4);

                    if(id==0) {
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
                if(columnIndex == 4 && (id !=0)){
                    Object v = getModel().getValueAt(rowIndex,16);
                    if(v.equals(1)){
                        color = Color.BLUE;
                    }else{
                        color = Color.decode("#E95F03");
                    }
                    component.setForeground(color);
                }

                if(columnIndex == 3 && (id != 0)){
                    Object v = getModel().getValueAt(rowIndex,17);
                    if(v.equals(1)){
                        color = Color.decode("#027A02");
                    }else{
                        color = Color.decode("#E65E04");
                    }
                    component.setForeground(color);
                }

                if(columnIndex == 8 && (id !=0)){
                    Object v = getModel().getValueAt(rowIndex,18);
                    if(v.equals(0)){
                        color = Color.WHITE;
                    }else{
                        color = Color.decode("#EB8B8B");
                    }
                    component.setBackground(color);
                }

                if(columnIndex == 11 && (id !=0)){
                    Object v = getModel().getValueAt(rowIndex,19);
                    if(v.equals(0)){
                        color = Color.WHITE;
                    }else{
                        color = Color.decode("#208FA5");
                    }
                    component.setBackground(color);
                }
                return component;
            }
        };
        jPanel4 = new javax.swing.JPanel();
        tableDeptScrollPane = new javax.swing.JScrollPane();
        tableDept = new javax.swing.JTable();
        lblRangeDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JLabel();
        btnProcess = new com.xzq.osc.JocHyperlink();
        panelProcess = new com.xzq.osc.JocHyperlink();
        panelProcessHover = new com.xzq.osc.JocHyperlink();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelWorkTypeGroup = new javax.swing.JPanel();
        radViewAll = new javax.swing.JRadioButton();
        radFullTime = new javax.swing.JRadioButton();
        radPartTime = new javax.swing.JRadioButton();
        panelProcessGroup = new javax.swing.JPanel();
        radTotal = new javax.swing.JRadioButton();
        radCompleted = new javax.swing.JRadioButton();
        radPending = new javax.swing.JRadioButton();
        lblProcessStatus = new javax.swing.JLabel();
        lblWorkType = new javax.swing.JLabel();
        panelProcessGroup1 = new javax.swing.JPanel();
        radAbsentCnt = new javax.swing.JRadioButton();
        radOTCnt = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tableScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblPRID", "lblStatus", "lblEmpID", "lblEmpNbr", "lblEmpName", "lblGrossSalary", "lblTaxSalary", "lblExcludeTax", "lblAbsent", "lblInsurance", "lblASTax", "lblOvertime", "lblTaxNetSalary", "lblPayTax", "lblASNonTax", "lblNetSalary", "lblProcess", "lblFulltime", "lblAbsentCnt", "lblOTCnt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true
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
                "lblRowNbr", "lblDeptID", "lblDepartmentName"
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

        lblRangeDate.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblRangeDate.setText("Payroll Date:");
        jPanel2.add(lblRangeDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 110, 25));

        txtStartDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 45, 170, 25));

        btnProcess.setActiveColor(new java.awt.Color(255, 255, 255));
        btnProcess.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnProcess.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnProcess.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jPanel2.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 44, 80, -1));

        panelProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelProcess.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 40, -1, -1));

        panelProcessHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelProcessHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelProcessHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(81, 87, 99));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 775, 1360, 10));

        jSeparator2.setForeground(new java.awt.Color(81, 87, 99));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 775, 270, 10));

        panelWorkTypeGroup.setBackground(new java.awt.Color(255, 255, 255));
        panelWorkTypeGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 87, 99), 2));
        panelWorkTypeGroup.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        panelWorkTypeGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radViewAll.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radViewAll);
        radViewAll.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radViewAll.setForeground(new java.awt.Color(255, 255, 255));
        radViewAll.setText("All");
        radViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelWorkTypeGroup.add(radViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 110, -1));

        radFullTime.setBackground(new java.awt.Color(0, 153, 0));
        buttonGroup1.add(radFullTime);
        radFullTime.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radFullTime.setForeground(new java.awt.Color(255, 255, 255));
        radFullTime.setText("FullTime");
        radFullTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelWorkTypeGroup.add(radFullTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 5, 120, -1));

        radPartTime.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(radPartTime);
        radPartTime.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radPartTime.setForeground(new java.awt.Color(255, 255, 255));
        radPartTime.setText("PartTime");
        radPartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelWorkTypeGroup.add(radPartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 5, 130, -1));

        jPanel2.add(panelWorkTypeGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 35, 380, 40));

        panelProcessGroup.setBackground(new java.awt.Color(255, 255, 255));
        panelProcessGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 87, 99), 2));
        panelProcessGroup.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        panelProcessGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radTotal.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(radTotal);
        radTotal.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radTotal.setForeground(new java.awt.Color(255, 255, 255));
        radTotal.setText("All(9999)");
        radTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelProcessGroup.add(radTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 110, -1));

        radCompleted.setBackground(java.awt.Color.blue);
        buttonGroup2.add(radCompleted);
        radCompleted.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radCompleted.setForeground(new java.awt.Color(255, 255, 255));
        radCompleted.setText("Completed(9999)");
        radCompleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelProcessGroup.add(radCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 5, 140, -1));

        radPending.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup2.add(radPending);
        radPending.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radPending.setForeground(new java.awt.Color(255, 255, 255));
        radPending.setText("Pending(9999)");
        radPending.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelProcessGroup.add(radPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 5, 130, -1));

        jPanel2.add(panelProcessGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 35, 400, 40));

        lblProcessStatus.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblProcessStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcessStatus.setText("Process Status");
        jPanel2.add(lblProcessStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 400, -1));

        lblWorkType.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblWorkType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorkType.setText("Work type");
        jPanel2.add(lblWorkType, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 380, -1));

        panelProcessGroup1.setBackground(new java.awt.Color(255, 255, 255));
        panelProcessGroup1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 87, 99), 2));
        panelProcessGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        panelProcessGroup1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radAbsentCnt.setBackground(new java.awt.Color(255, 0, 51));
        btnGroup3.add(radAbsentCnt);
        radAbsentCnt.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radAbsentCnt.setForeground(new java.awt.Color(255, 255, 255));
        radAbsentCnt.setText("Absent(100)");
        radAbsentCnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelProcessGroup1.add(radAbsentCnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 110, -1));

        radOTCnt.setBackground(new java.awt.Color(0, 102, 102));
        btnGroup3.add(radOTCnt);
        radOTCnt.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        radOTCnt.setForeground(new java.awt.Color(255, 255, 255));
        radOTCnt.setText("Overtime(999)");
        radOTCnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radOTCnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOTCntActionPerformed(evt);
            }
        });
        panelProcessGroup1.add(radOTCnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 5, 120, -1));

        jPanel2.add(panelProcessGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 35, 245, 40));

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

    private void radOTCntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOTCntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radOTCntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup3;
    private com.xzq.osc.JocHyperlink btnProcess;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblProcessStatus;
    private javax.swing.JLabel lblRangeDate;
    private javax.swing.JLabel lblWorkType;
    private com.xzq.osc.JocHyperlink panelProcess;
    private javax.swing.JPanel panelProcessGroup;
    private javax.swing.JPanel panelProcessGroup1;
    private com.xzq.osc.JocHyperlink panelProcessHover;
    private javax.swing.JPanel panelWorkTypeGroup;
    private javax.swing.JRadioButton radAbsentCnt;
    private javax.swing.JRadioButton radCompleted;
    private javax.swing.JRadioButton radFullTime;
    private javax.swing.JRadioButton radOTCnt;
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
