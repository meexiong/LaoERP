
package com.malimar.views;

import com.malimar.controllers.WorkStatusController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class FrmWorkStatus extends javax.swing.JDialog {
    
    public FrmWorkStatus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        WorkStatusController wc = new WorkStatusController(this);
    }

    public JocHyperlink getBtnDelete() {
        return btnDelete;
    }

    public JocHyperlink getPanelDelete() {
        return panelDelete;
    }

    public JocHyperlink getPanelHoverDelete() {
        return panelHoverDelete;
    }

    
    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JocHyperlink btnSave) {
        this.btnSave = btnSave;
    }

    public JLabel getLblHour() {
        return lblHour;
    }

    public void setLblHour(JLabel lblHour) {
        this.lblHour = lblHour;
    }

    public JLabel getLblWorkStatusID() {
        return lblWorkStatusID;
    }

    public void setLblWorkStatusID(JLabel lblWorkStatusID) {
        this.lblWorkStatusID = lblWorkStatusID;
    }

    public JLabel getLblWorkStatusInfo() {
        return lblWorkStatusInfo;
    }

    public void setLblWorkStatusInfo(JLabel lblWorkStatusInfo) {
        this.lblWorkStatusInfo = lblWorkStatusInfo;
    }

    public JLabel getLblWorkStatus_L1() {
        return lblWorkStatus_L1;
    }

    public void setLblWorkStatus_L1(JLabel lblWorkStatus_L1) {
        this.lblWorkStatus_L1 = lblWorkStatus_L1;
    }

    public JLabel getLblWorkStatus_L2() {
        return lblWorkStatus_L2;
    }

    public void setLblWorkStatus_L2(JLabel lblWorkStatus_L2) {
        this.lblWorkStatus_L2 = lblWorkStatus_L2;
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

    public JTextField getTxtHour() {
        return txtHour;
    }

    public void setTxtHour(JTextField txtHour) {
        this.txtHour = txtHour;
    }

    public JTextField getTxtWorkStatusID() {
        return txtWorkStatusID;
    }

    public void setTxtWorkStatusID(JTextField txtWorkStatusID) {
        this.txtWorkStatusID = txtWorkStatusID;
    }

    public JTextField getTxtWorkStatus_L1() {
        return txtWorkStatus_L1;
    }

    public void setTxtWorkStatus_L1(JTextField txtWorkStatus_L1) {
        this.txtWorkStatus_L1 = txtWorkStatus_L1;
    }

    public JTextField getTxtWorkStatus_L2() {
        return txtWorkStatus_L2;
    }

    public void setTxtWorkStatus_L2(JTextField txtWorkStatus_L2) {
        this.txtWorkStatus_L2 = txtWorkStatus_L2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblWorkStatusInfo = new javax.swing.JLabel();
        txtWorkStatusID = new javax.swing.JTextField();
        lblWorkStatusID = new javax.swing.JLabel();
        txtWorkStatus_L1 = new javax.swing.JTextField();
        lblWorkStatus_L1 = new javax.swing.JLabel();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblWorkStatus_L2 = new javax.swing.JLabel();
        txtWorkStatus_L2 = new javax.swing.JTextField();
        lblHour = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        btnDelete = new com.xzq.osc.JocHyperlink();
        panelDelete = new com.xzq.osc.JocHyperlink();
        panelHoverDelete = new com.xzq.osc.JocHyperlink();

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

        lblWorkStatusInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblWorkStatusInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblWorkStatusInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorkStatusInfo.setText("Work Status");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblWorkStatusInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWorkStatusInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 500, 30);

        txtWorkStatusID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtWorkStatusID.setText("New");
        txtWorkStatusID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtWorkStatusID);
        txtWorkStatusID.setBounds(170, 40, 100, 25);

        lblWorkStatusID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblWorkStatusID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWorkStatusID.setText("ID");
        jPanel2.add(lblWorkStatusID);
        lblWorkStatusID.setBounds(30, 40, 120, 25);

        txtWorkStatus_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtWorkStatus_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtWorkStatus_L1);
        txtWorkStatus_L1.setBounds(170, 80, 260, 25);

        lblWorkStatus_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblWorkStatus_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWorkStatus_L1.setText("Work Status(Lao)");
        jPanel2.add(lblWorkStatus_L1);
        lblWorkStatus_L1.setBounds(30, 80, 120, 25);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(277, 203, 82, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(270, 200, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHover);
        panelHover.setBounds(270, 200, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "lblWorkStatusID", "lblWorkStatus_L1", "lblWorkStatus_L2", "lblHour"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            table.getColumnModel().getColumn(0).setMinWidth(63);
            table.getColumnModel().getColumn(0).setMaxWidth(63);
            table.getColumnModel().getColumn(1).setMinWidth(170);
            table.getColumnModel().getColumn(1).setMaxWidth(170);
            table.getColumnModel().getColumn(2).setMinWidth(170);
            table.getColumnModel().getColumn(2).setMaxWidth(170);
            table.getColumnModel().getColumn(3).setMinWidth(70);
            table.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jPanel4.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 240, 480, 360);

        lblWorkStatus_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblWorkStatus_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWorkStatus_L2.setText("Work Status(EN)");
        jPanel2.add(lblWorkStatus_L2);
        lblWorkStatus_L2.setBounds(30, 120, 120, 25);

        txtWorkStatus_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtWorkStatus_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtWorkStatus_L2);
        txtWorkStatus_L2.setBounds(170, 120, 260, 25);

        lblHour.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblHour.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHour.setText("Hour");
        jPanel2.add(lblHour);
        lblHour.setBounds(30, 160, 120, 25);

        txtHour.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtHour.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtHour);
        txtHour.setBounds(170, 160, 100, 25);

        btnDelete.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDelete.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDelete.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnDelete);
        btnDelete.setBounds(387, 203, 82, 26);

        panelDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDelete);
        panelDelete.setBounds(380, 200, 96, 32);

        panelHoverDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHoverDelete);
        panelHoverDelete.setBounds(380, 200, 96, 32);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmWorkStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmWorkStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmWorkStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmWorkStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                FrmWorkStatus dialog = new FrmWorkStatus(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblWorkStatusID;
    private javax.swing.JLabel lblWorkStatusInfo;
    private javax.swing.JLabel lblWorkStatus_L1;
    private javax.swing.JLabel lblWorkStatus_L2;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDelete;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelHoverDelete;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtWorkStatusID;
    private javax.swing.JTextField txtWorkStatus_L1;
    private javax.swing.JTextField txtWorkStatus_L2;
    // End of variables declaration//GEN-END:variables
}
