
package com.malimar.views;

import com.malimar.controllers.ChangeLabelController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmChangeLabel extends javax.swing.JDialog {

    public FrmChangeLabel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ChangeLabelController cl = new ChangeLabelController(this);
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public JLabel getPanelSave() {
        return panelSave;
    }

    public JLabel getPanelSaveHover() {
        return panelSaveHover;
    }

    public JTextField getTxtEN() {
        return txtEN;
    }

    public JLabel getTxtFieldName() {
        return txtFieldName;
    }

    public JTextField getTxtLao() {
        return txtLao;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtLao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        menuExit = new com.xzq.osc.JocHyperlink();
        txtEN = new javax.swing.JTextField();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new javax.swing.JLabel();
        panelSaveHover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtLao.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtLao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtLao);
        txtLao.setBounds(70, 80, 240, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Great Britain_30px.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 120, 30, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Laos_30px.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 80, 30, 25);

        txtFieldName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFieldName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFieldName.setText("FieldName");
        jPanel2.add(txtFieldName);
        txtFieldName.setBounds(70, 40, 239, 22);

        lblTitle.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Change Label");
        jPanel2.add(lblTitle);
        lblTitle.setBounds(90, 2, 200, 22);

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jPanel2.add(menuExit);
        menuExit.setBounds(320, 0, 20, 20);

        txtEN.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtEN);
        txtEN.setBounds(70, 120, 240, 25);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(226, 162, 80, 25);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(220, 160, 94, 30);

        panelSaveHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        jPanel2.add(panelSaveHover);
        panelSaveHover.setBounds(220, 160, 94, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FrmChangeLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmChangeLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmChangeLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmChangeLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmChangeLabel dialog = new FrmChangeLabel(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private com.xzq.osc.JocHyperlink menuExit;
    private javax.swing.JLabel panelSave;
    private javax.swing.JLabel panelSaveHover;
    private javax.swing.JTextField txtEN;
    private javax.swing.JLabel txtFieldName;
    private javax.swing.JTextField txtLao;
    // End of variables declaration//GEN-END:variables
}
