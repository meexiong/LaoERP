
package com.malimar.views;

import com.malimar.controllers.EmployeeController;
import com.malimar.utils.InternalFrame;
import com.xzq.osc.JocHyperlink;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmEmployee extends javax.swing.JInternalFrame {

    public FrmEmployee() {
        initComponents();
        InternalFrame inter = new InternalFrame(this);
        EmployeeController ec = new EmployeeController(this);
        
    }
    public JLabel getLblFindbyDept() {
        return lblFindbyDept;
    }

    public JLabel getLblSearchEmp() {
        return lblSearchEmp;
    }

    public JTable getTableEmpList() {
        return tableEmpList;
    }

    public JScrollPane getTableEmpListScrollPane() {
        return tableEmpListScrollPane;
    }

    public JTextField getTxtSearchEmp() {
        return txtSearchEmp;
    }

    public JComboBox<String> getCmbFindDepartment() {
        return cmbFindDepartment;
    }

    public JLabel getLblFindbyLoc() {
        return lblFindbyLoc;
    }

    public JComboBox<String> getCmbFindLocation() {
        return cmbFindLocation;
    }

    public JLabel getLblEmployeeInfo() {
        return lblEmployeeInfo;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblEmployeeInfo = new javax.swing.JLabel();
        lblSearchEmp = new javax.swing.JLabel();
        txtSearchEmp = new javax.swing.JTextField();
        lblFindbyDept = new javax.swing.JLabel();
        cmbFindDepartment = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        cmbFindLocation = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        tableEmpListScrollPane = new javax.swing.JScrollPane();
        tableEmpList = new javax.swing.JTable();
        lblFindbyLoc = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(81, 87, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jPanel3.add(menuExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1148, 0, 24, 25));

        lblEmployeeInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblEmployeeInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployeeInfo.setText("Employee");
        jPanel3.add(lblEmployeeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 1134, -1));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1172, 27);

        lblSearchEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSearchEmp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSearchEmp.setText("Search");
        jPanel2.add(lblSearchEmp);
        lblSearchEmp.setBounds(10, 40, 80, 23);

        txtSearchEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSearchEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtSearchEmp);
        txtSearchEmp.setBounds(100, 40, 190, 23);

        lblFindbyDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFindbyDept.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFindbyDept.setText("Department");
        jPanel2.add(lblFindbyDept);
        lblFindbyDept.setBounds(300, 40, 140, 23);

        cmbFindDepartment.setEditable(true);
        cmbFindDepartment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbFindDepartment.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(cmbFindDepartment);
        cmbFindDepartment.setBounds(450, 40, 220, 25);
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(450, 60, 220, 5);

        cmbFindLocation.setEditable(true);
        cmbFindLocation.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbFindLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(cmbFindLocation);
        cmbFindLocation.setBounds(830, 40, 220, 25);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(830, 60, 220, 5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        tableEmpList.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tableEmpList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblEmpID", "lblEmpNbr", "lblEmpName", "lblGender", "lblEmpEmail", "lblTitle", "lblDepartment", "lblLocation", "lblWorkStatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmpList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableEmpList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableEmpList.setGridColor(new java.awt.Color(204, 204, 204));
        tableEmpList.setRowHeight(25);
        tableEmpList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableEmpList.setSelectionForeground(java.awt.Color.red);
        tableEmpListScrollPane.setViewportView(tableEmpList);
        if (tableEmpList.getColumnModel().getColumnCount() > 0) {
            tableEmpList.getColumnModel().getColumn(0).setMinWidth(0);
            tableEmpList.getColumnModel().getColumn(0).setMaxWidth(0);
            tableEmpList.getColumnModel().getColumn(1).setMinWidth(70);
            tableEmpList.getColumnModel().getColumn(1).setMaxWidth(70);
            tableEmpList.getColumnModel().getColumn(2).setMinWidth(200);
            tableEmpList.getColumnModel().getColumn(2).setMaxWidth(200);
            tableEmpList.getColumnModel().getColumn(3).setMinWidth(60);
            tableEmpList.getColumnModel().getColumn(3).setMaxWidth(60);
            tableEmpList.getColumnModel().getColumn(4).setMinWidth(200);
            tableEmpList.getColumnModel().getColumn(4).setMaxWidth(200);
            tableEmpList.getColumnModel().getColumn(5).setMinWidth(180);
            tableEmpList.getColumnModel().getColumn(5).setMaxWidth(180);
            tableEmpList.getColumnModel().getColumn(6).setMinWidth(150);
            tableEmpList.getColumnModel().getColumn(6).setMaxWidth(150);
            tableEmpList.getColumnModel().getColumn(7).setMinWidth(150);
            tableEmpList.getColumnModel().getColumn(7).setMaxWidth(150);
            tableEmpList.getColumnModel().getColumn(8).setMinWidth(120);
            tableEmpList.getColumnModel().getColumn(8).setMaxWidth(120);
        }

        jPanel4.add(tableEmpListScrollPane, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 80, 1150, 620);

        lblFindbyLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFindbyLoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFindbyLoc.setText("Location");
        jPanel2.add(lblFindbyLoc);
        lblFindbyLoc.setBounds(680, 40, 140, 23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFindDepartment;
    private javax.swing.JComboBox<String> cmbFindLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblEmployeeInfo;
    private javax.swing.JLabel lblFindbyDept;
    private javax.swing.JLabel lblFindbyLoc;
    private javax.swing.JLabel lblSearchEmp;
    private com.xzq.osc.JocHyperlink menuExit;
    private javax.swing.JTable tableEmpList;
    private javax.swing.JScrollPane tableEmpListScrollPane;
    private javax.swing.JTextField txtSearchEmp;
    // End of variables declaration//GEN-END:variables
}
