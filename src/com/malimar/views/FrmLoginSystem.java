
package com.malimar.views;

import com.malimar.controllers.LoginController;
import com.xzq.osc.JocHyperlink;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FrmLoginSystem extends javax.swing.JFrame {

    
    public FrmLoginSystem() {
        initComponents();
        LoginController lc = new LoginController(this);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel2.setBackground(new Color(0,0,0,0));
        jPanel3.setBackground(new Color(0,0,0,0));
    }

    public JLabel getLblIncorrect() {
        return lblIncorrect;
    }

    public JLabel getMainPanel() {
        return MainPanel;
    }

    public JocHyperlink getBtnDatabaseSetting() {
        return btnDatabaseSetting;
    }

    public JocHyperlink getBtnEnglish() {
        return btnEnglish;
    }

    public JocHyperlink getBtnLaos() {
        return btnLaos;
    }

    public JocHyperlink getBtnLogin() {
        return btnLogin;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public JLabel getLblWelcome() {
        return lblWelcome;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLaos = new com.xzq.osc.JocHyperlink();
        btnEnglish = new com.xzq.osc.JocHyperlink();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnDatabaseSetting = new com.xzq.osc.JocHyperlink();
        btnLogin = new com.xzq.osc.JocHyperlink();
        lblIncorrect = new javax.swing.JLabel();
        MainPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        lblWelcome.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("WELCOME HOME");
        jPanel3.add(lblWelcome);
        lblWelcome.setBounds(40, 50, 250, 30);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/User_50px.png"))); // NOI18N
        jPanel3.add(lblIcon);
        lblIcon.setBounds(137, 130, 50, 40);

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jPanel3.add(menuExit);
        menuExit.setBounds(270, 20, 25, 25);

        lblPassword.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblPassword.setText("Password");
        jPanel3.add(lblPassword);
        lblPassword.setBounds(55, 270, 210, 25);
        jPanel3.add(txtUsername);
        txtUsername.setBounds(55, 240, 210, 25);

        btnLaos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Laos_30px.png"))); // NOI18N
        jPanel3.add(btnLaos);
        btnLaos.setBounds(40, 140, 32, 20);

        btnEnglish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Great Britain_30px.png"))); // NOI18N
        jPanel3.add(btnEnglish);
        btnEnglish.setBounds(40, 140, 32, 20);

        lblUsername.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblUsername.setText("User name");
        jPanel3.add(lblUsername);
        lblUsername.setBounds(55, 210, 210, 25);
        jPanel3.add(txtPassword);
        txtPassword.setBounds(55, 300, 210, 25);

        btnDatabaseSetting.setText("Database Setting");
        btnDatabaseSetting.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        btnDatabaseSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatabaseSettingActionPerformed(evt);
            }
        });
        jPanel3.add(btnDatabaseSetting);
        btnDatabaseSetting.setBounds(30, 420, 260, 25);

        btnLogin.setText("Login");
        btnLogin.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin);
        btnLogin.setBounds(26, 368, 268, 40);

        lblIncorrect.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblIncorrect.setForeground(java.awt.Color.red);
        lblIncorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblIncorrect);
        lblIncorrect.setBounds(50, 330, 220, 20);

        MainPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Login.png"))); // NOI18N
        jPanel3.add(MainPanel);
        MainPanel.setBounds(0, 0, 318, 475);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 318, 475);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnDatabaseSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatabaseSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatabaseSettingActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoginSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainPanel;
    private com.xzq.osc.JocHyperlink btnDatabaseSetting;
    private com.xzq.osc.JocHyperlink btnEnglish;
    private com.xzq.osc.JocHyperlink btnLaos;
    private com.xzq.osc.JocHyperlink btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIncorrect;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private com.xzq.osc.JocHyperlink menuExit;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
