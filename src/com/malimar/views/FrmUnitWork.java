
package com.malimar.views;

import com.malimar.controllers.UnitController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class FrmUnitWork extends javax.swing.JDialog {
    
    public FrmUnitWork(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        UnitController uc = new UnitController(this);
    }

    public JocHyperlink getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JocHyperlink btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JocHyperlink btnSave) {
        this.btnSave = btnSave;
    }

    public JLabel getLblBusinessID() {
        return lblBusinessID;
    }

    public void setLblBusinessID(JLabel lblBusinessID) {
        this.lblBusinessID = lblBusinessID;
    }

    public JLabel getLblBusinessUnit() {
        return lblBusinessUnit;
    }

    public void setLblBusinessUnit(JLabel lblBusinessUnit) {
        this.lblBusinessUnit = lblBusinessUnit;
    }

    public JLabel getLblBusiness_L1() {
        return lblBusiness_L1;
    }

    public void setLblBusiness_L1(JLabel lblBusiness_L1) {
        this.lblBusiness_L1 = lblBusiness_L1;
    }

    public JLabel getLblBusiness_L2() {
        return lblBusiness_L2;
    }

    public void setLblBusiness_L2(JLabel lblBusiness_L2) {
        this.lblBusiness_L2 = lblBusiness_L2;
    }

    public JLabel getLblSortBy() {
        return lblSortBy;
    }

    public void setLblSortBy(JLabel lblSortBy) {
        this.lblSortBy = lblSortBy;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public void setMenuExit(JocHyperlink menuExit) {
        this.menuExit = menuExit;
    }

    public JocHyperlink getPanelDelete() {
        return panelDelete;
    }

    public void setPanelDelete(JocHyperlink panelDelete) {
        this.panelDelete = panelDelete;
    }

    public JocHyperlink getPanelHover() {
        return panelHover;
    }

    public void setPanelHover(JocHyperlink panelHover) {
        this.panelHover = panelHover;
    }

    public JocHyperlink getPanelHoverDelete() {
        return panelHoverDelete;
    }

    public void setPanelHoverDelete(JocHyperlink panelHoverDelete) {
        this.panelHoverDelete = panelHoverDelete;
    }

    public JocHyperlink getPanelSave() {
        return panelSave;
    }

    public void setPanelSave(JocHyperlink panelSave) {
        this.panelSave = panelSave;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getTableScrollPane() {
        return tableScrollPane;
    }

    public void setTableScrollPane(JScrollPane tableScrollPane) {
        this.tableScrollPane = tableScrollPane;
    }

    public JTextField getTxtBusinessID() {
        return txtBusinessID;
    }

    public void setTxtBusinessID(JTextField txtBusinessID) {
        this.txtBusinessID = txtBusinessID;
    }

    public JTextField getTxtBusiness_L1() {
        return txtBusiness_L1;
    }

    public void setTxtBusiness_L1(JTextField txtBusiness_L1) {
        this.txtBusiness_L1 = txtBusiness_L1;
    }

    public JTextField getTxtBusiness_L2() {
        return txtBusiness_L2;
    }

    public void setTxtBusiness_L2(JTextField txtBusiness_L2) {
        this.txtBusiness_L2 = txtBusiness_L2;
    }

    public JTextField getTxtSortBy() {
        return txtSortBy;
    }

    public void setTxtSortBy(JTextField txtSortBy) {
        this.txtSortBy = txtSortBy;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblBusinessUnit = new javax.swing.JLabel();
        txtBusinessID = new javax.swing.JTextField();
        lblBusinessID = new javax.swing.JLabel();
        lblSortBy = new javax.swing.JLabel();
        txtSortBy = new javax.swing.JTextField();
        txtBusiness_L1 = new javax.swing.JTextField();
        lblBusiness_L1 = new javax.swing.JLabel();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblBusiness_L2 = new javax.swing.JLabel();
        txtBusiness_L2 = new javax.swing.JTextField();
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

        lblBusinessUnit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblBusinessUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblBusinessUnit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusinessUnit.setText("Business Unit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblBusinessUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBusinessUnit)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 526, 30);

        txtBusinessID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtBusinessID.setText("New");
        txtBusinessID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtBusinessID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBusinessID.setEnabled(false);
        txtBusinessID.setOpaque(false);
        jPanel2.add(txtBusinessID);
        txtBusinessID.setBounds(170, 40, 100, 25);

        lblBusinessID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblBusinessID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBusinessID.setText("ID");
        jPanel2.add(lblBusinessID);
        lblBusinessID.setBounds(30, 40, 120, 25);

        lblSortBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSortBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSortBy.setText("Sort By");
        jPanel2.add(lblSortBy);
        lblSortBy.setBounds(30, 80, 120, 25);

        txtSortBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSortBy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtSortBy);
        txtSortBy.setBounds(170, 80, 260, 25);

        txtBusiness_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtBusiness_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtBusiness_L1);
        txtBusiness_L1.setBounds(170, 120, 260, 25);

        lblBusiness_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblBusiness_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBusiness_L1.setText("Business Unit(Lao)");
        jPanel2.add(lblBusiness_L1);
        lblBusiness_L1.setBounds(30, 120, 120, 25);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(217, 203, 82, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(210, 200, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHover);
        panelHover.setBounds(210, 200, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "lblBusinessID", "lblSortBy", "lblBusiness_L1", "lblBusiness_L2"
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
        tableScrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setMinWidth(70);
            table.getColumnModel().getColumn(1).setMaxWidth(70);
            table.getColumnModel().getColumn(2).setMinWidth(215);
            table.getColumnModel().getColumn(2).setMaxWidth(215);
            table.getColumnModel().getColumn(3).setMinWidth(215);
            table.getColumnModel().getColumn(3).setMaxWidth(215);
        }

        jPanel4.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 240, 505, 370);

        lblBusiness_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblBusiness_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBusiness_L2.setText("Business Unit(EN)");
        jPanel2.add(lblBusiness_L2);
        lblBusiness_L2.setBounds(30, 160, 120, 25);

        txtBusiness_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtBusiness_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtBusiness_L2);
        txtBusiness_L2.setBounds(170, 160, 260, 25);

        btnDelete.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDelete.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDelete.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnDelete);
        btnDelete.setBounds(337, 203, 82, 26);

        panelDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDelete);
        panelDelete.setBounds(330, 200, 96, 32);

        panelHoverDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHoverDelete);
        panelHoverDelete.setBounds(330, 200, 96, 32);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmUnitWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUnitWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUnitWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUnitWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUnitWork dialog = new FrmUnitWork(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblBusinessID;
    private javax.swing.JLabel lblBusinessUnit;
    private javax.swing.JLabel lblBusiness_L1;
    private javax.swing.JLabel lblBusiness_L2;
    private javax.swing.JLabel lblSortBy;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDelete;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelHoverDelete;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField txtBusinessID;
    private javax.swing.JTextField txtBusiness_L1;
    private javax.swing.JTextField txtBusiness_L2;
    private javax.swing.JTextField txtSortBy;
    // End of variables declaration//GEN-END:variables
}
