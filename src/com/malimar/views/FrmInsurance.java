
package com.malimar.views;

import com.malimar.controllers.InsuranceController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class FrmInsurance extends javax.swing.JDialog {
    
    public FrmInsurance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        InsuranceController ic = new InsuranceController(this);
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JocHyperlink btnSave) {
        this.btnSave = btnSave;
    }

    public JLabel getLblComPercent() {
        return lblComPercent;
    }

    public void setLblComPercent(JLabel lblComPercent) {
        this.lblComPercent = lblComPercent;
    }

    public JLabel getLblEmpPercent() {
        return lblEmpPercent;
    }

    public void setLblEmpPercent(JLabel lblEmpPercent) {
        this.lblEmpPercent = lblEmpPercent;
    }

    public JLabel getLblInsuranceID() {
        return lblInsuranceID;
    }

    public void setLblInsuranceID(JLabel lblInsuranceID) {
        this.lblInsuranceID = lblInsuranceID;
    }

    public JLabel getLblInsuranceInfo() {
        return lblInsuranceInfo;
    }

    public void setLblInsuranceInfo(JLabel lblInsuranceInfo) {
        this.lblInsuranceInfo = lblInsuranceInfo;
    }

    public JLabel getLblInsurance_L1() {
        return lblInsurance_L1;
    }

    public void setLblInsurance_L1(JLabel lblInsurance_L1) {
        this.lblInsurance_L1 = lblInsurance_L1;
    }

    public JLabel getLblInsurance_L2() {
        return lblInsurance_L2;
    }

    public void setLblInsurance_L2(JLabel lblInsurance_L2) {
        this.lblInsurance_L2 = lblInsurance_L2;
    }

    public JLabel getLblMaxMoney() {
        return lblMaxMoney;
    }

    public void setLblMaxMoney(JLabel lblMaxMoney) {
        this.lblMaxMoney = lblMaxMoney;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public void setMenuExit(JocHyperlink menuExit) {
        this.menuExit = menuExit;
    }

    public JocHyperlink getPanelHover() {
        return panelHover;
    }

    public void setPanelHover(JocHyperlink panelHover) {
        this.panelHover = panelHover;
    }

    public JocHyperlink getPanelSave() {
        return panelSave;
    }

    public void setPanelSave(JocHyperlink panelSave) {
        this.panelSave = panelSave;
    }

    public JScrollPane getScrollPanel() {
        return scrollPanel;
    }

    public void setScrollPanel(JScrollPane scrollPanel) {
        this.scrollPanel = scrollPanel;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JTextField getTxtComPercentage() {
        return txtComPercentage;
    }

    public void setTxtComPercentage(JTextField txtComPercentage) {
        this.txtComPercentage = txtComPercentage;
    }

    public JTextField getTxtEmpPercentage() {
        return txtEmpPercentage;
    }

    public void setTxtEmpPercentage(JTextField txtEmpPercentage) {
        this.txtEmpPercentage = txtEmpPercentage;
    }

    public JTextField getTxtInsuranceID() {
        return txtInsuranceID;
    }

    public void setTxtInsuranceID(JTextField txtInsuranceID) {
        this.txtInsuranceID = txtInsuranceID;
    }

    public JTextField getTxtInsurance_L1() {
        return txtInsurance_L1;
    }

    public void setTxtInsurance_L1(JTextField txtInsurance_L1) {
        this.txtInsurance_L1 = txtInsurance_L1;
    }

    public JTextField getTxtInsurance_L2() {
        return txtInsurance_L2;
    }

    public void setTxtInsurance_L2(JTextField txtInsurance_L2) {
        this.txtInsurance_L2 = txtInsurance_L2;
    }

    public JTextField getTxtMaxMoney() {
        return txtMaxMoney;
    }

    public void setTxtMaxMoney(JTextField txtMaxMoney) {
        this.txtMaxMoney = txtMaxMoney;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblInsuranceInfo = new javax.swing.JLabel();
        txtInsuranceID = new javax.swing.JTextField();
        lblInsuranceID = new javax.swing.JLabel();
        txtInsurance_L1 = new javax.swing.JTextField();
        lblInsurance_L1 = new javax.swing.JLabel();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblInsurance_L2 = new javax.swing.JLabel();
        txtInsurance_L2 = new javax.swing.JTextField();
        lblEmpPercent = new javax.swing.JLabel();
        txtEmpPercentage = new javax.swing.JTextField();
        lblComPercent = new javax.swing.JLabel();
        txtComPercentage = new javax.swing.JTextField();
        lblMaxMoney = new javax.swing.JLabel();
        txtMaxMoney = new javax.swing.JTextField();

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

        lblInsuranceInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblInsuranceInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInsuranceInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsuranceInfo.setText("Insurance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblInsuranceInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInsuranceInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 500, 30);

        txtInsuranceID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtInsuranceID.setText("New");
        txtInsuranceID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtInsuranceID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInsuranceID.setEnabled(false);
        txtInsuranceID.setOpaque(false);
        jPanel2.add(txtInsuranceID);
        txtInsuranceID.setBounds(170, 40, 100, 25);

        lblInsuranceID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblInsuranceID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsuranceID.setText("ID");
        jPanel2.add(lblInsuranceID);
        lblInsuranceID.setBounds(30, 40, 120, 25);

        txtInsurance_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtInsurance_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtInsurance_L1);
        txtInsurance_L1.setBounds(170, 80, 260, 25);

        lblInsurance_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblInsurance_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsurance_L1.setText("Insurance(Lao)");
        jPanel2.add(lblInsurance_L1);
        lblInsurance_L1.setBounds(30, 80, 120, 25);

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
                {null, null, null, null, null, null}
            },
            new String [] {
                "lblInsuranceID", "lblInsurance_L1", "lblInsurance_L2", "lblEmpPercent", "lblComPercent", "lblMaxMoney"
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
        scrollPanel.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setMinWidth(202);
            table.getColumnModel().getColumn(1).setMaxWidth(202);
            table.getColumnModel().getColumn(2).setMinWidth(202);
            table.getColumnModel().getColumn(2).setMaxWidth(202);
            table.getColumnModel().getColumn(3).setMinWidth(100);
            table.getColumnModel().getColumn(3).setMaxWidth(100);
            table.getColumnModel().getColumn(4).setMinWidth(100);
            table.getColumnModel().getColumn(4).setMaxWidth(100);
            table.getColumnModel().getColumn(5).setMinWidth(120);
            table.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        jPanel4.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 240, 480, 360);

        lblInsurance_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblInsurance_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsurance_L2.setText("Insurance(EN)");
        jPanel2.add(lblInsurance_L2);
        lblInsurance_L2.setBounds(30, 120, 120, 25);

        txtInsurance_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtInsurance_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtInsurance_L2);
        txtInsurance_L2.setBounds(170, 120, 260, 25);

        lblEmpPercent.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblEmpPercent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpPercent.setText("EmpPercentage");
        jPanel2.add(lblEmpPercent);
        lblEmpPercent.setBounds(30, 160, 120, 25);

        txtEmpPercentage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEmpPercentage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtEmpPercentage);
        txtEmpPercentage.setBounds(170, 160, 60, 25);

        lblComPercent.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblComPercent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComPercent.setText("ComPercentage");
        jPanel2.add(lblComPercent);
        lblComPercent.setBounds(250, 160, 100, 25);

        txtComPercentage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtComPercentage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtComPercentage);
        txtComPercentage.setBounds(370, 160, 60, 25);

        lblMaxMoney.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblMaxMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaxMoney.setText("Max Money");
        jPanel2.add(lblMaxMoney);
        lblMaxMoney.setBounds(30, 200, 120, 25);

        txtMaxMoney.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMaxMoney.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtMaxMoney);
        txtMaxMoney.setBounds(170, 200, 140, 25);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInsurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmInsurance dialog = new FrmInsurance(new javax.swing.JFrame(), true);
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
    private com.xzq.osc.JocHyperlink btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblComPercent;
    private javax.swing.JLabel lblEmpPercent;
    private javax.swing.JLabel lblInsuranceID;
    private javax.swing.JLabel lblInsuranceInfo;
    private javax.swing.JLabel lblInsurance_L1;
    private javax.swing.JLabel lblInsurance_L2;
    private javax.swing.JLabel lblMaxMoney;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtComPercentage;
    private javax.swing.JTextField txtEmpPercentage;
    private javax.swing.JTextField txtInsuranceID;
    private javax.swing.JTextField txtInsurance_L1;
    private javax.swing.JTextField txtInsurance_L2;
    private javax.swing.JTextField txtMaxMoney;
    // End of variables declaration//GEN-END:variables
}
