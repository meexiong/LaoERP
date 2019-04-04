
package com.malimar.views;


public class FrmChangePassword extends javax.swing.JDialog {


    public FrmChangePassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblConfirm = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtComfirm = new javax.swing.JPasswordField();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new javax.swing.JLabel();
        panelSaveHover = new javax.swing.JLabel();
        lblChagePassword = new javax.swing.JLabel();
        Main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jPanel2.add(menuExit);
        menuExit.setBounds(296, 0, 20, 20);

        lblConfirm.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblConfirm.setText("Confirm");
        jPanel2.add(lblConfirm);
        lblConfirm.setBounds(20, 130, 70, 25);

        lblPassword.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblPassword.setText("Password");
        jPanel2.add(lblPassword);
        lblPassword.setBounds(20, 90, 70, 25);
        jPanel2.add(txtPassword);
        txtPassword.setBounds(100, 90, 170, 25);
        jPanel2.add(txtComfirm);
        txtComfirm.setBounds(100, 130, 170, 25);

        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(185, 183, 80, 24);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(177, 180, 94, 30);

        panelSaveHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        jPanel2.add(panelSaveHover);
        panelSaveHover.setBounds(177, 180, 94, 30);

        lblChagePassword.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblChagePassword.setForeground(new java.awt.Color(255, 255, 255));
        lblChagePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChagePassword.setText("Change Password");
        jPanel2.add(lblChagePassword);
        lblChagePassword.setBounds(45, 5, 220, 20);

        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ChangePassword.png"))); // NOI18N
        jPanel2.add(Main);
        Main.setBounds(0, 0, 316, 260);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmChangePassword dialog = new FrmChangePassword(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Main;
    private com.xzq.osc.JocHyperlink btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblChagePassword;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblPassword;
    private com.xzq.osc.JocHyperlink menuExit;
    private javax.swing.JLabel panelSave;
    private javax.swing.JLabel panelSaveHover;
    private javax.swing.JPasswordField txtComfirm;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
