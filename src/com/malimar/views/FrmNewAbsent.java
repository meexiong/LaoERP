
package com.malimar.views;

import com.toedter.calendar.JDateChooser;
import com.xzq.osc.JocHyperlink;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmNewAbsent extends javax.swing.JDialog {
    
    public FrmNewAbsent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JocHyperlink getBtnDelete() {
        return btnDelete;
    }

    public JCheckBox getChHRApprove() {
        return chHRApprove;
    }

    public JCheckBox getChMgrApprove() {
        return chMgrApprove;
    }

    public JLabel getLblHRApprove() {
        return lblHRApprove;
    }

    public JLabel getLblMgrApprove() {
        return lblMgrApprove;
    }

    public JocHyperlink getPanelDelete() {
        return panelDelete;
    }

    public JocHyperlink getPanelDeleteHover() {
        return panelDeleteHover;
    }

    public JTextField getTxtEmployee() {
        return txtEmployee;
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public JComboBox<String> getCmbDeductionFrom() {
        return cmbDeductionFrom;
    }

    public JComboBox<String> getCmbReason() {
        return cmbReason;
    }

    public JLabel getLblAbsentDate() {
        return lblAbsentDate;
    }

    public JLabel getLblAbsentID() {
        return lblAbsentID;
    }

    public JLabel getLblDeductionFrom() {
        return lblDeductionFrom;
    }

    public JLabel getLblEmployee() {
        return lblEmployee;
    }

    public JLabel getLblHours() {
        return lblHours;
    }

    public JLabel getLblMinute() {
        return lblMinute;
    }

    public JLabel getLblNewAbsentInfo() {
        return lblNewAbsentInfo;
    }

    public JLabel getLblReason() {
        return lblReason;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
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

    public JDateChooser getTxtAbsentDate() {
        return txtAbsentDate;
    }

    public JTextField getTxtAbsentID() {
        return txtAbsentID;
    }

    public JTextField getTxtHours() {
        return txtHours;
    }

    public JTextField getTxtMinute() {
        return txtMinute;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblNewAbsentInfo = new javax.swing.JLabel();
        txtAbsentID = new javax.swing.JTextField();
        lblAbsentID = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblDeductionFrom = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        lblHours = new javax.swing.JLabel();
        cmbDeductionFrom = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        lblMinute = new javax.swing.JLabel();
        txtMinute = new javax.swing.JTextField();
        txtAbsentDate = new com.toedter.calendar.JDateChooser();
        lblAbsentDate = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        cmbReason = new javax.swing.JComboBox<>();
        txtEmployee = new javax.swing.JTextField();
        chMgrApprove = new javax.swing.JCheckBox();
        lblMgrApprove = new javax.swing.JLabel();
        lblHRApprove = new javax.swing.JLabel();
        chHRApprove = new javax.swing.JCheckBox();
        btnDelete = new com.xzq.osc.JocHyperlink();
        panelDelete = new com.xzq.osc.JocHyperlink();
        panelDeleteHover = new com.xzq.osc.JocHyperlink();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 87, 99), 2, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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

        lblNewAbsentInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblNewAbsentInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblNewAbsentInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewAbsentInfo.setText("New Absent");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblNewAbsentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNewAbsentInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 660, 30);

        txtAbsentID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAbsentID.setText("New");
        txtAbsentID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtAbsentID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAbsentID.setEnabled(false);
        txtAbsentID.setOpaque(false);
        jPanel2.add(txtAbsentID);
        txtAbsentID.setBounds(80, 50, 80, 25);

        lblAbsentID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAbsentID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAbsentID.setText("ID");
        jPanel2.add(lblAbsentID);
        lblAbsentID.setBounds(30, 50, 40, 25);

        lblEmployee.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployee.setText("Employee");
        jPanel2.add(lblEmployee);
        lblEmployee.setBounds(170, 50, 100, 25);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(427, 193, 83, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(420, 190, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHover);
        panelHover.setBounds(420, 190, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "lblAbsentID", "lblAbsentDate", "lblHours", "lblMinute", "lblDeductionFrom", "lblReason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

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
            table.getColumnModel().getColumn(2).setMinWidth(120);
            table.getColumnModel().getColumn(2).setMaxWidth(120);
            table.getColumnModel().getColumn(3).setMinWidth(90);
            table.getColumnModel().getColumn(3).setMaxWidth(90);
            table.getColumnModel().getColumn(4).setMinWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.getColumnModel().getColumn(5).setMinWidth(185);
            table.getColumnModel().getColumn(5).setMaxWidth(185);
        }

        jPanel4.add(tableScrollPanel, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 240, 640, 380);

        lblDeductionFrom.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDeductionFrom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeductionFrom.setText("Deduction From");
        jPanel2.add(lblDeductionFrom);
        lblDeductionFrom.setBounds(30, 130, 100, 25);

        txtHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtHours.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtHours);
        txtHours.setBounds(350, 90, 60, 25);

        lblHours.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHours.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHours.setText("Hours");
        jPanel2.add(lblHours);
        lblHours.setBounds(280, 90, 50, 25);

        cmbDeductionFrom.setEditable(true);
        cmbDeductionFrom.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDeductionFrom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(cmbDeductionFrom);
        cmbDeductionFrom.setBounds(150, 130, 180, 25);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(150, 155, 180, 5);

        lblMinute.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMinute.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinute.setText("Minute");
        jPanel2.add(lblMinute);
        lblMinute.setBounds(420, 90, 50, 25);

        txtMinute.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMinute.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtMinute);
        txtMinute.setBounds(480, 90, 70, 25);

        txtAbsentDate.setDateFormatString("dd-MM-yyyy");
        txtAbsentDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(txtAbsentDate);
        txtAbsentDate.setBounds(150, 90, 120, 25);

        lblAbsentDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAbsentDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAbsentDate.setText("Absent Date");
        jPanel2.add(lblAbsentDate);
        lblAbsentDate.setBounds(30, 90, 100, 22);

        lblReason.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblReason.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReason.setText("Reason");
        jPanel2.add(lblReason);
        lblReason.setBounds(340, 130, 80, 25);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(430, 155, 200, 5);

        cmbReason.setEditable(true);
        cmbReason.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbReason.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(cmbReason);
        cmbReason.setBounds(430, 130, 200, 25);

        txtEmployee.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmployee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtEmployee);
        txtEmployee.setBounds(290, 50, 260, 25);

        chMgrApprove.setBackground(new java.awt.Color(255, 255, 255));
        chMgrApprove.setFont(new java.awt.Font("Saysettha Lao", 0, 12)); // NOI18N
        jPanel2.add(chMgrApprove);
        chMgrApprove.setBounds(150, 170, 20, 25);

        lblMgrApprove.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMgrApprove.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMgrApprove.setText("Manager Approve");
        jPanel2.add(lblMgrApprove);
        lblMgrApprove.setBounds(10, 170, 120, 25);

        lblHRApprove.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHRApprove.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHRApprove.setText("HR Approve");
        jPanel2.add(lblHRApprove);
        lblHRApprove.setBounds(180, 170, 90, 25);

        chHRApprove.setBackground(new java.awt.Color(255, 255, 255));
        chHRApprove.setFont(new java.awt.Font("Saysettha Lao", 0, 12)); // NOI18N
        jPanel2.add(chHRApprove);
        chHRApprove.setBounds(280, 170, 20, 25);

        btnDelete.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDelete.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDelete.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnDelete);
        btnDelete.setBounds(537, 193, 83, 26);

        panelDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDelete);
        panelDelete.setBounds(530, 190, 96, 32);

        panelDeleteHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelDeleteHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDeleteHover);
        panelDeleteHover.setBounds(530, 190, 96, 32);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmNewAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmNewAbsent dialog = new FrmNewAbsent(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbDeductionFrom;
    private javax.swing.JComboBox<String> cmbReason;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblAbsentDate;
    private javax.swing.JLabel lblAbsentID;
    private javax.swing.JLabel lblDeductionFrom;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblHRApprove;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblMgrApprove;
    private javax.swing.JLabel lblMinute;
    private javax.swing.JLabel lblNewAbsentInfo;
    private javax.swing.JLabel lblReason;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDelete;
    private com.xzq.osc.JocHyperlink panelDeleteHover;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPanel;
    private com.toedter.calendar.JDateChooser txtAbsentDate;
    private javax.swing.JTextField txtAbsentID;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtMinute;
    // End of variables declaration//GEN-END:variables
}
