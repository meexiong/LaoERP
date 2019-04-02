
package com.malimar.views;

import com.malimar.controllers.DatabaseSettingController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FrmDatabaseSetting extends javax.swing.JDialog {

    public FrmDatabaseSetting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DatabaseSettingController dc = new DatabaseSettingController(this);
    }

    public JLabel getMain() {
        return Main;
    }

    public JocHyperlink getBtnRead() {
        return btnRead;
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public JocHyperlink getBtnTest() {
        return btnTest;
    }

    public JLabel getLblDatabaseSettingTitle() {
        return lblDatabaseSettingTitle;
    }

    public JocHyperlink getMenuExit() {
        return menuExit;
    }

    public JocHyperlink getPanelRead() {
        return panelRead;
    }

    public JocHyperlink getPanelReadHover() {
        return panelReadHover;
    }

    public JocHyperlink getPanelSave() {
        return panelSave;
    }

    public JocHyperlink getPanelSaveHover() {
        return panelSaveHover;
    }

    public JocHyperlink getPanelTest() {
        return panelTest;
    }

    public JocHyperlink getPanelTestHover() {
        return panelTestHover;
    }

    public JTextField getTxtDatabase() {
        return txtDatabase;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtPort() {
        return txtPort;
    }

    public JTextField getTxtServerName() {
        return txtServerName;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        btnSave = new com.xzq.osc.JocHyperlink();
        btnRead = new com.xzq.osc.JocHyperlink();
        btnTest = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelRead = new com.xzq.osc.JocHyperlink();
        panelTest = new com.xzq.osc.JocHyperlink();
        panelSaveHover = new com.xzq.osc.JocHyperlink();
        panelReadHover = new com.xzq.osc.JocHyperlink();
        panelTestHover = new com.xzq.osc.JocHyperlink();
        lblDatabaseSettingTitle = new javax.swing.JLabel();
        lblServerName = new javax.swing.JLabel();
        txtServerName = new javax.swing.JTextField();
        lblServerName1 = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        lblServerName2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblServerName3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblServerName4 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        Main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        menuExit.setActiveColor(new java.awt.Color(255, 50, 50));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Delete_30px.png"))); // NOI18N
        menuExit.setUnvisitColor(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jPanel2.add(menuExit);
        menuExit.setBounds(333, 0, 20, 20);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(238, 384, 80, 24);

        btnRead.setActiveColor(new java.awt.Color(255, 255, 255));
        btnRead.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnRead.setText("Read");
        btnRead.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnRead.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnRead.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnRead);
        btnRead.setBounds(27, 384, 80, 24);

        btnTest.setActiveColor(new java.awt.Color(255, 255, 255));
        btnTest.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnTest.setText("Test");
        btnTest.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnTest.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnTest.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnTest);
        btnTest.setBounds(132, 384, 80, 24);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(230, 380, 96, 32);

        panelRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        jPanel2.add(panelRead);
        panelRead.setBounds(20, 380, 96, 32);

        panelTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        jPanel2.add(panelTest);
        panelTest.setBounds(125, 380, 96, 32);

        panelSaveHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        jPanel2.add(panelSaveHover);
        panelSaveHover.setBounds(230, 380, 96, 32);

        panelReadHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        jPanel2.add(panelReadHover);
        panelReadHover.setBounds(20, 380, 96, 32);

        panelTestHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        jPanel2.add(panelTestHover);
        panelTestHover.setBounds(125, 380, 96, 32);

        lblDatabaseSettingTitle.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblDatabaseSettingTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblDatabaseSettingTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatabaseSettingTitle.setText("Database Setting");
        jPanel2.add(lblDatabaseSettingTitle);
        lblDatabaseSettingTitle.setBounds(80, 10, 200, 22);

        lblServerName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblServerName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Server_25px.png"))); // NOI18N
        jPanel2.add(lblServerName);
        lblServerName.setBounds(30, 100, 25, 25);

        txtServerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServerName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtServerName);
        txtServerName.setBounds(60, 100, 240, 25);

        lblServerName1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblServerName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Database_25px.png"))); // NOI18N
        jPanel2.add(lblServerName1);
        lblServerName1.setBounds(30, 140, 25, 25);

        txtDatabase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDatabase.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtDatabase);
        txtDatabase.setBounds(60, 140, 240, 25);

        lblServerName2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblServerName2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/User_25px.png"))); // NOI18N
        jPanel2.add(lblServerName2);
        lblServerName2.setBounds(30, 180, 25, 25);

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtUsername);
        txtUsername.setBounds(60, 180, 240, 25);

        lblServerName3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblServerName3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Password_25px.png"))); // NOI18N
        jPanel2.add(lblServerName3);
        lblServerName3.setBounds(30, 220, 25, 25);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtPassword);
        txtPassword.setBounds(60, 220, 240, 25);

        lblServerName4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblServerName4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/icons/Connected_25px.png"))); // NOI18N
        jPanel2.add(lblServerName4);
        lblServerName4.setBounds(30, 260, 25, 25);

        txtPort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPort.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtPort);
        txtPort.setBounds(60, 260, 240, 25);

        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/DatasourceTitle.png"))); // NOI18N
        jPanel2.add(Main);
        Main.setBounds(0, 0, 353, 440);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmDatabaseSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatabaseSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatabaseSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatabaseSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDatabaseSetting dialog = new FrmDatabaseSetting(new javax.swing.JFrame(), true);
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
    private com.xzq.osc.JocHyperlink btnRead;
    private com.xzq.osc.JocHyperlink btnSave;
    private com.xzq.osc.JocHyperlink btnTest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDatabaseSettingTitle;
    private javax.swing.JLabel lblServerName;
    private javax.swing.JLabel lblServerName1;
    private javax.swing.JLabel lblServerName2;
    private javax.swing.JLabel lblServerName3;
    private javax.swing.JLabel lblServerName4;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelRead;
    private com.xzq.osc.JocHyperlink panelReadHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private com.xzq.osc.JocHyperlink panelSaveHover;
    private com.xzq.osc.JocHyperlink panelTest;
    private com.xzq.osc.JocHyperlink panelTestHover;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtServerName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
