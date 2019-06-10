
package com.malimar.views;

import com.malimar.controllers.OvertimeController;
import com.toedter.calendar.JDateChooser;
import com.xzq.osc.JocHyperlink;
import java.text.NumberFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmOvertime extends javax.swing.JDialog {
    
    public FrmOvertime(java.awt.Frame parent, boolean modal, int emid, String emNbr, String emName) {
        super(parent, modal);
        initComponents();
        OvertimeController oc = new OvertimeController(this, emid, emNbr, emName);
    }

    public JLabel getLblDays() {
        return lblDays;
    }

    public JLabel getLblOTHours() {
        return lblOTHours;
    }

    public JLabel getLblSalary() {
        return lblSalary;
    }

    public JTextField getTxtOTPerHours() {
        return txtOTPerHours;
    }

    public JTextField getTxtSalary() {
        return txtSalary;
    }

    public JTextField getTxtTotalDays() {
        return txtTotalDays;
    }

    public JTextField getTxtOvertimeID() {
        return txtOvertimeID;
    }

    public JocHyperlink getBtnDelete() {
        return btnDelete;
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public JCheckBox getChHRApprove() {
        return chHRApprove;
    }

    public JCheckBox getChMgrApprove() {
        return chMgrApprove;
    }

    public JComboBox<String> getCmbOTRate() {
        return cmbOTRate;
    }

    public JLabel getLblAmount() {
        return lblAmount;
    }

    public JLabel getLblEmployee() {
        return lblEmployee;
    }

    public JLabel getLblHRApprove() {
        return lblHRApprove;
    }

    public JLabel getLblHours() {
        return lblHours;
    }

    public JLabel getLblMgrApprove() {
        return lblMgrApprove;
    }

    public JLabel getLblMinute() {
        return lblMinute;
    }

    public JLabel getLblOvertimeDate() {
        return lblOvertimeDate;
    }

    public JLabel getLblOvertimeRate() {
        return lblOvertimeRate;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public JocHyperlink getPanelDelete() {
        return panelDelete;
    }

    public JocHyperlink getPanelDeleteHover() {
        return panelDeleteHover;
    }

    public JocHyperlink getPanelHover() {
        return panelHover;
    }

    public JocHyperlink getPanelSave() {
        return panelSave;
    }

    public JTable getTable() {
        return table;
    }

    public JScrollPane getTableScrollPanel() {
        return tableScrollPanel;
    }

    public JTextField getTxtAmount() {
        return txtAmount;
    }

    public JTextField getTxtEmployee() {
        return txtEmployee;
    }

    public JTextField getTxtHours() {
        return txtHours;
    }

    public JTextField getTxtMinute() {
        return txtMinute;
    }

    public JDateChooser getTxtOvertimeDate() {
        return txtOvertimeDate;
    }

    public JLabel getLblOvertimeInfo() {
        return lblOvertimeInfo;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblOvertimeInfo = new javax.swing.JLabel();
        txtOvertimeID = new javax.swing.JTextField();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblOvertimeRate = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        lblHours = new javax.swing.JLabel();
        cmbOTRate = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        lblMinute = new javax.swing.JLabel();
        txtMinute = new javax.swing.JTextField();
        txtOvertimeDate = new com.toedter.calendar.JDateChooser();
        lblOvertimeDate = new javax.swing.JLabel();
        txtEmployee = new javax.swing.JTextField();
        chMgrApprove = new javax.swing.JCheckBox();
        lblMgrApprove = new javax.swing.JLabel();
        lblHRApprove = new javax.swing.JLabel();
        chHRApprove = new javax.swing.JCheckBox();
        btnDelete = new com.xzq.osc.JocHyperlink();
        panelDelete = new com.xzq.osc.JocHyperlink();
        panelDeleteHover = new com.xzq.osc.JocHyperlink();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblOTHours = new javax.swing.JLabel();
        txtOTPerHours = new javax.swing.JTextField();
        lblDays = new javax.swing.JLabel();
        txtTotalDays = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 87, 99), 2, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel3.add(menuExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 0, 25, 25));

        lblOvertimeInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblOvertimeInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblOvertimeInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOvertimeInfo.setText("Overtime");
        jPanel3.add(lblOvertimeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 1, 550, -1));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 610, 26);

        txtOvertimeID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeID.setText("New");
        txtOvertimeID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtOvertimeID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtOvertimeID.setEnabled(false);
        txtOvertimeID.setOpaque(false);
        jPanel2.add(txtOvertimeID);
        txtOvertimeID.setBounds(20, 190, 30, 25);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(346, 203, 83, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(340, 200, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHover);
        panelHover.setBounds(340, 200, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "lblOvertimeID", "lblOvertimeDate", "lblHours", "lblMinute", "lblOvertimeRate", "lblAmount", "lblMgrApprove", "lblHRApprove"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setSelectionForeground(java.awt.Color.red);
        tableScrollPanel.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setMinWidth(90);
            table.getColumnModel().getColumn(1).setMaxWidth(90);
            table.getColumnModel().getColumn(2).setMinWidth(70);
            table.getColumnModel().getColumn(2).setMaxWidth(70);
            table.getColumnModel().getColumn(3).setMinWidth(60);
            table.getColumnModel().getColumn(3).setMaxWidth(60);
            table.getColumnModel().getColumn(4).setMinWidth(60);
            table.getColumnModel().getColumn(4).setMaxWidth(60);
            table.getColumnModel().getColumn(5).setMinWidth(140);
            table.getColumnModel().getColumn(5).setMaxWidth(140);
            table.getColumnModel().getColumn(6).setMinWidth(70);
            table.getColumnModel().getColumn(6).setMaxWidth(70);
            table.getColumnModel().getColumn(7).setMinWidth(70);
            table.getColumnModel().getColumn(7).setMaxWidth(70);
        }

        jPanel4.add(tableScrollPanel, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 250, 566, 370);

        lblOvertimeRate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimeRate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOvertimeRate.setText("Rate");
        jPanel2.add(lblOvertimeRate);
        lblOvertimeRate.setBounds(250, 120, 60, 25);

        txtHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtHours.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHours.setText("0");
        txtHours.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtHours);
        txtHours.setBounds(150, 150, 40, 25);

        lblHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHours.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHours.setText("Hours");
        jPanel2.add(lblHours);
        lblHours.setBounds(150, 120, 40, 25);

        cmbOTRate.setEditable(true);
        cmbOTRate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbOTRate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(cmbOTRate);
        cmbOTRate.setBounds(250, 150, 60, 25);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(250, 175, 60, 5);

        lblMinute.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMinute.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinute.setText("Minute");
        jPanel2.add(lblMinute);
        lblMinute.setBounds(200, 120, 40, 25);

        txtMinute.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMinute.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMinute.setText("0");
        txtMinute.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtMinute);
        txtMinute.setBounds(200, 150, 40, 25);

        txtOvertimeDate.setDateFormatString("dd-MM-yyyy");
        txtOvertimeDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(txtOvertimeDate);
        txtOvertimeDate.setBounds(20, 150, 120, 25);

        lblOvertimeDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimeDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOvertimeDate.setText("Date");
        jPanel2.add(lblOvertimeDate);
        lblOvertimeDate.setBounds(20, 120, 100, 22);

        txtEmployee.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmployee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtEmployee);
        txtEmployee.setBounds(30, 80, 240, 25);

        chMgrApprove.setBackground(new java.awt.Color(255, 255, 255));
        chMgrApprove.setFont(new java.awt.Font("Saysettha Lao", 0, 12)); // NOI18N
        jPanel2.add(chMgrApprove);
        chMgrApprove.setBounds(470, 150, 20, 25);

        lblMgrApprove.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMgrApprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMgrApprove.setText("Manager");
        jPanel2.add(lblMgrApprove);
        lblMgrApprove.setBounds(450, 120, 60, 25);

        lblHRApprove.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHRApprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHRApprove.setText("HR");
        jPanel2.add(lblHRApprove);
        lblHRApprove.setBounds(530, 120, 20, 25);

        chHRApprove.setBackground(new java.awt.Color(255, 255, 255));
        chHRApprove.setFont(new java.awt.Font("Saysettha Lao", 0, 12)); // NOI18N
        jPanel2.add(chHRApprove);
        chHRApprove.setBounds(530, 150, 20, 25);

        btnDelete.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDelete.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDelete.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnDelete);
        btnDelete.setBounds(456, 203, 83, 26);

        panelDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDelete);
        panelDelete.setBounds(450, 200, 96, 32);

        panelDeleteHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelDeleteHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDeleteHover);
        panelDeleteHover.setBounds(450, 200, 96, 32);

        lblAmount.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAmount.setText("Amount");
        jPanel2.add(lblAmount);
        lblAmount.setBounds(320, 120, 120, 25);

        txtAmount.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.setText("0");
        txtAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtAmount);
        txtAmount.setBounds(320, 150, 120, 25);

        lblEmployee.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmployee.setText("Employee Name");
        jPanel2.add(lblEmployee);
        lblEmployee.setBounds(30, 50, 240, 25);

        txtSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSalary.setText("0");
        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtSalary);
        txtSalary.setBounds(280, 80, 120, 25);

        lblOTHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOTHours.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOTHours.setText("OT/Hours");
        jPanel2.add(lblOTHours);
        lblOTHours.setBounds(460, 50, 90, 25);

        txtOTPerHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOTPerHours.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOTPerHours.setText("0");
        txtOTPerHours.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtOTPerHours);
        txtOTPerHours.setBounds(460, 80, 90, 25);

        lblDays.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDays.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDays.setText("Days");
        jPanel2.add(lblDays);
        lblDays.setBounds(410, 50, 40, 25);

        txtTotalDays.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTotalDays.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalDays.setText("0");
        txtTotalDays.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtTotalDays);
        txtTotalDays.setBounds(410, 80, 40, 25);

        lblSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalary.setText("Salary");
        jPanel2.add(lblSalary);
        lblSalary.setBounds(280, 50, 120, 25);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmOvertime dialog = new FrmOvertime(new javax.swing.JFrame(), true, 0, null, null);
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
    private com.xzq.osc.JocHyperlink btnDelete;
    private com.xzq.osc.JocHyperlink btnSave;
    private javax.swing.JCheckBox chHRApprove;
    private javax.swing.JCheckBox chMgrApprove;
    private javax.swing.JComboBox<String> cmbOTRate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblHRApprove;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblMgrApprove;
    private javax.swing.JLabel lblMinute;
    private javax.swing.JLabel lblOTHours;
    private javax.swing.JLabel lblOvertimeDate;
    private javax.swing.JLabel lblOvertimeInfo;
    private javax.swing.JLabel lblOvertimeRate;
    private javax.swing.JLabel lblSalary;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDelete;
    private com.xzq.osc.JocHyperlink panelDeleteHover;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtMinute;
    private javax.swing.JTextField txtOTPerHours;
    private com.toedter.calendar.JDateChooser txtOvertimeDate;
    private javax.swing.JTextField txtOvertimeID;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTotalDays;
    // End of variables declaration//GEN-END:variables
}
