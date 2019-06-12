
package com.malimar.views;

import com.malimar.controllers.PayRolController;
import com.malimar.utils.InternalFrame;
import com.xzq.osc.JocHyperlink;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class FrmPayRoll extends javax.swing.JInternalFrame {
    public FrmPayRoll() {
        initComponents();
        InternalFrame inter = new InternalFrame(this);
        PayRolController pc = new PayRolController(this);
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

    public JocHyperlink getBtnLoad() {
        return btnLoad;
    }

    public JocHyperlink getPanelLoad() {
        return panelLoad;
    }

    public JocHyperlink getPanelLoadHover() {
        return panelLoadHover;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer (TableCellRenderer renderer, int rowIndex, int columnIndex){
                Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
                if(getModel().getValueAt(rowIndex,4) !=null){
                    Object value = getModel().getValueAt(rowIndex,4);
                    if(value.equals("Total")) {
                        table.setRowSelectionAllowed(false);
                        component.setBackground(Color.decode("#82E0AA"));
                        component.setForeground(Color.BLACK);
                    }else {
                        component.setBackground(Color.WHITE);
                        component.setForeground(Color.BLACK);
                    }
                }
                Color color = null;
                if(columnIndex == 4){
                    Object v = getModel().getValueAt(rowIndex,16);
                    if(v.equals(1)){
                        color = Color.BLUE;
                    }else{
                        Object value = getModel().getValueAt(rowIndex,4);
                        if(value.equals("Total")) {
                            color = Color.BLACK;
                        }else{
                            color = Color.red;
                        }
                    }
                }
                component.setForeground(color);
                return component;
            }
        };
        btnLoad = new com.xzq.osc.JocHyperlink();
        panelLoad = new com.xzq.osc.JocHyperlink();
        panelLoadHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        tableDeptScrollPane = new javax.swing.JScrollPane();
        tableDept = new javax.swing.JTable();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JLabel();
        btnProcess = new com.xzq.osc.JocHyperlink();
        panelProcess = new com.xzq.osc.JocHyperlink();
        panelProcessHover = new com.xzq.osc.JocHyperlink();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tableScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblPRID", "lblStatus", "lblEmpID", "lblEmpNbr", "lblEmpName", "lblGrossSalary", "lblTaxSalary", "lblExcludeTax", "lblAbsent", "lblInsurance", "lblTax + or -", "lblOvertime", "lblTaxNetSalary", "lblPayTax", "lblNonTax + or -", "lblNetSalary", "lblProcess"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            table.getColumnModel().getColumn(5).setMinWidth(90);
            table.getColumnModel().getColumn(5).setMaxWidth(90);
            table.getColumnModel().getColumn(6).setMinWidth(90);
            table.getColumnModel().getColumn(6).setMaxWidth(90);
            table.getColumnModel().getColumn(7).setMinWidth(90);
            table.getColumnModel().getColumn(7).setMaxWidth(90);
            table.getColumnModel().getColumn(8).setMinWidth(90);
            table.getColumnModel().getColumn(8).setMaxWidth(90);
            table.getColumnModel().getColumn(9).setMinWidth(90);
            table.getColumnModel().getColumn(9).setMaxWidth(90);
            table.getColumnModel().getColumn(10).setMinWidth(90);
            table.getColumnModel().getColumn(10).setMaxWidth(90);
            table.getColumnModel().getColumn(11).setMinWidth(90);
            table.getColumnModel().getColumn(11).setMaxWidth(90);
            table.getColumnModel().getColumn(12).setMinWidth(90);
            table.getColumnModel().getColumn(12).setMaxWidth(90);
            table.getColumnModel().getColumn(13).setMinWidth(90);
            table.getColumnModel().getColumn(13).setMaxWidth(90);
            table.getColumnModel().getColumn(14).setMinWidth(90);
            table.getColumnModel().getColumn(14).setMaxWidth(90);
            table.getColumnModel().getColumn(15).setMinWidth(90);
            table.getColumnModel().getColumn(15).setMaxWidth(90);
            table.getColumnModel().getColumn(16).setMinWidth(0);
            table.getColumnModel().getColumn(16).setMaxWidth(0);
        }

        jPanel3.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1310, 690));

        btnLoad.setActiveColor(new java.awt.Color(255, 255, 255));
        btnLoad.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnLoad.setText("Load");
        btnLoad.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnLoad.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnLoad.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 44, 80, -1));

        panelLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelLoad.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        panelLoadHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelLoadHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelLoadHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

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
        jPanel2.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 44, 80, -1));

        panelProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelProcess.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        panelProcessHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelProcessHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelProcessHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1635, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnLoad;
    private com.xzq.osc.JocHyperlink btnProcess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblStartDate;
    private com.xzq.osc.JocHyperlink panelLoad;
    private com.xzq.osc.JocHyperlink panelLoadHover;
    private com.xzq.osc.JocHyperlink panelProcess;
    private com.xzq.osc.JocHyperlink panelProcessHover;
    private javax.swing.JTable table;
    private javax.swing.JTable tableDept;
    private javax.swing.JScrollPane tableDeptScrollPane;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel txtStartDate;
    // End of variables declaration//GEN-END:variables
}
