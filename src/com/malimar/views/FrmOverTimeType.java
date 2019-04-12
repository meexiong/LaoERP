
package com.malimar.views;


public class FrmOverTimeType extends javax.swing.JDialog {
    
    public FrmOverTimeType(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblOvertimeTypeInfo = new javax.swing.JLabel();
        txtOvertimeTypeID = new javax.swing.JTextField();
        lblOvertimeTypeID = new javax.swing.JLabel();
        lblOvertimeType_L1 = new javax.swing.JLabel();
        txtOvertimeType_L1 = new javax.swing.JTextField();
        txtOvertimeType_L2 = new javax.swing.JTextField();
        lblOvertimeType_L2 = new javax.swing.JLabel();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblOvertimeTypeRate = new javax.swing.JLabel();
        txtOvertimeTypeRate = new javax.swing.JTextField();

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

        lblOvertimeTypeInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblOvertimeTypeInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblOvertimeTypeInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOvertimeTypeInfo.setText("Overtime Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblOvertimeTypeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOvertimeTypeInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 526, 30);

        txtOvertimeTypeID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeTypeID.setText("New");
        txtOvertimeTypeID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtOvertimeTypeID);
        txtOvertimeTypeID.setBounds(170, 40, 100, 25);

        lblOvertimeTypeID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimeTypeID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOvertimeTypeID.setText("ID");
        jPanel2.add(lblOvertimeTypeID);
        lblOvertimeTypeID.setBounds(30, 40, 120, 25);

        lblOvertimeType_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimeType_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOvertimeType_L1.setText("Overtime Type(Lao)");
        jPanel2.add(lblOvertimeType_L1);
        lblOvertimeType_L1.setBounds(30, 80, 120, 25);

        txtOvertimeType_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeType_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtOvertimeType_L1);
        txtOvertimeType_L1.setBounds(170, 80, 260, 25);

        txtOvertimeType_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeType_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtOvertimeType_L2);
        txtOvertimeType_L2.setBounds(170, 120, 260, 25);

        lblOvertimeType_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimeType_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOvertimeType_L2.setText("Overtime Type(EN)");
        jPanel2.add(lblOvertimeType_L2);
        lblOvertimeType_L2.setBounds(30, 120, 120, 25);

        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(347, 203, 82, 26);

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

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "lblOvertimeTypeID", "lblOvertimeType_L1", "lblOvertimeType_L2", "lblOvertimeTypeRate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(java.awt.Color.red);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(202);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(202);
            jTable1.getColumnModel().getColumn(2).setMinWidth(202);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(202);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 240, 480, 330);

        lblOvertimeTypeRate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblOvertimeTypeRate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOvertimeTypeRate.setText("Rate");
        jPanel2.add(lblOvertimeTypeRate);
        lblOvertimeTypeRate.setBounds(30, 160, 120, 25);

        txtOvertimeTypeRate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOvertimeTypeRate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtOvertimeTypeRate);
        txtOvertimeTypeRate.setBounds(170, 160, 260, 25);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmOverTimeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOverTimeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOverTimeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOverTimeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                FrmOverTimeType dialog = new FrmOverTimeType(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOvertimeTypeID;
    private javax.swing.JLabel lblOvertimeTypeInfo;
    private javax.swing.JLabel lblOvertimeTypeRate;
    private javax.swing.JLabel lblOvertimeType_L1;
    private javax.swing.JLabel lblOvertimeType_L2;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JTextField txtOvertimeTypeID;
    private javax.swing.JTextField txtOvertimeTypeRate;
    private javax.swing.JTextField txtOvertimeType_L1;
    private javax.swing.JTextField txtOvertimeType_L2;
    // End of variables declaration//GEN-END:variables
}
