
package com.malimar.views;

import com.malimar.controllers.DivisionController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmDivision extends javax.swing.JDialog {

    public FrmDivision(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DivisionController dc = new DivisionController(this);
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

    public JComboBox<String> getCmbBank() {
        return cmbBank;
    }

    public JLabel getLblBank() {
        return lblBank;
    }

    public JLabel getLblDivisionID() {
        return lblDivisionID;
    }

    public JLabel getLblDivisionInfo() {
        return lblDivisionInfo;
    }

    public JLabel getLblDivision_L1() {
        return lblDivision_L1;
    }

    public JLabel getLblDivision_L2() {
        return lblDivision_L2;
    }

    public JLabel getLblImage() {
        return lblImage;
    }

    public JLabel getLblSortBy() {
        return lblSortBy;
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

    public JScrollPane getTableScrollPane() {
        return tableScrollPane;
    }

    public JTextField getTxtDivision_L1() {
        return txtDivision_L1;
    }

    public JTextField getTxtDivision_L2() {
        return txtDivision_L2;
    }

    public JTextField getTxtDivisionID() {
        return txtDivisionID;
    }

    public JTextField getTxtSortBy() {
        return txtSortBy;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblDivisionInfo = new javax.swing.JLabel();
        txtDivisionID = new javax.swing.JTextField();
        lblDivisionID = new javax.swing.JLabel();
        lblSortBy = new javax.swing.JLabel();
        txtSortBy = new javax.swing.JTextField();
        txtDivision_L1 = new javax.swing.JTextField();
        lblDivision_L1 = new javax.swing.JLabel();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblDivision_L2 = new javax.swing.JLabel();
        txtDivision_L2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblBank = new javax.swing.JLabel();
        cmbBank = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
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

        lblDivisionInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblDivisionInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblDivisionInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDivisionInfo.setText("Division");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblDivisionInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDivisionInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 682, 30);

        txtDivisionID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDivisionID.setText("New");
        txtDivisionID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtDivisionID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDivisionID.setEnabled(false);
        txtDivisionID.setOpaque(false);
        jPanel2.add(txtDivisionID);
        txtDivisionID.setBounds(170, 40, 100, 25);

        lblDivisionID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDivisionID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDivisionID.setText("ID");
        jPanel2.add(lblDivisionID);
        lblDivisionID.setBounds(30, 40, 120, 25);

        lblSortBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblSortBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSortBy.setText("Sort By");
        jPanel2.add(lblSortBy);
        lblSortBy.setBounds(30, 80, 120, 25);

        txtSortBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSortBy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtSortBy);
        txtSortBy.setBounds(170, 80, 260, 25);

        txtDivision_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDivision_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtDivision_L1);
        txtDivision_L1.setBounds(170, 120, 260, 25);

        lblDivision_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDivision_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDivision_L1.setText("Division(Lao)");
        jPanel2.add(lblDivision_L1);
        lblDivision_L1.setBounds(30, 120, 120, 25);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(457, 238, 82, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(450, 235, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHover);
        panelHover.setBounds(450, 235, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        table.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "lblDivisionID", "lblSortBy", "lblDivision_L1", "lblDivision_L2", "lblBank"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            table.getColumnModel().getColumn(2).setMinWidth(200);
            table.getColumnModel().getColumn(2).setMaxWidth(200);
            table.getColumnModel().getColumn(3).setMinWidth(200);
            table.getColumnModel().getColumn(3).setMaxWidth(200);
            table.getColumnModel().getColumn(4).setMinWidth(250);
            table.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        jPanel4.add(tableScrollPane, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 270, 660, 370);

        lblDivision_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblDivision_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDivision_L2.setText("Division(EN)");
        jPanel2.add(lblDivision_L2);
        lblDivision_L2.setBounds(30, 160, 120, 25);

        txtDivision_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDivision_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtDivision_L2);
        txtDivision_L2.setBounds(170, 160, 260, 25);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        lblImage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Image");
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(lblImage, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(450, 40, 210, 190);

        lblBank.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblBank.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBank.setText("Bank");
        jPanel2.add(lblBank);
        lblBank.setBounds(40, 205, 110, 25);

        cmbBank.setEditable(true);
        cmbBank.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbBank.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 1));
        jPanel2.add(cmbBank);
        cmbBank.setBounds(170, 205, 260, 25);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(170, 230, 260, 10);

        btnDelete.setActiveColor(new java.awt.Color(255, 255, 255));
        btnDelete.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnDelete.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnDelete);
        btnDelete.setBounds(567, 238, 82, 26);

        panelDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelDelete);
        panelDelete.setBounds(560, 235, 96, 32);

        panelHoverDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHoverDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHoverDelete);
        panelHoverDelete.setBounds(560, 235, 96, 32);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDivision dialog = new FrmDivision(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbBank;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblDivisionID;
    private javax.swing.JLabel lblDivisionInfo;
    private javax.swing.JLabel lblDivision_L1;
    private javax.swing.JLabel lblDivision_L2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblSortBy;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelDelete;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelHoverDelete;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField txtDivisionID;
    private javax.swing.JTextField txtDivision_L1;
    private javax.swing.JTextField txtDivision_L2;
    private javax.swing.JTextField txtSortBy;
    // End of variables declaration//GEN-END:variables
}
