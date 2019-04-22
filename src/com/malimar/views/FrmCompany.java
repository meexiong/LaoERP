
package com.malimar.views;

import com.malimar.controllers.CompanyController;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmCompany extends javax.swing.JFrame {

    public FrmCompany() {
        initComponents();
        CompanyController cc = new CompanyController(this);
    }

    public JocHyperlink getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JocHyperlink btnSave) {
        this.btnSave = btnSave;
    }

    public JLabel getLblAddress_L1() {
        return lblAddress_L1;
    }

    public void setLblAddress_L1(JLabel lblAddress_L1) {
        this.lblAddress_L1 = lblAddress_L1;
    }

    public JLabel getLblAddress_L2() {
        return lblAddress_L2;
    }

    public void setLblAddress_L2(JLabel lblAddress_L2) {
        this.lblAddress_L2 = lblAddress_L2;
    }

    public JLabel getLblCompanyInfo() {
        return lblCompanyInfo;
    }

    public void setLblCompanyInfo(JLabel lblCompanyInfo) {
        this.lblCompanyInfo = lblCompanyInfo;
    }

    public JLabel getLblCompany_L1() {
        return lblCompany_L1;
    }

    public void setLblCompany_L1(JLabel lblCompany_L1) {
        this.lblCompany_L1 = lblCompany_L1;
    }

    public JLabel getLblCompany_L2() {
        return lblCompany_L2;
    }

    public void setLblCompany_L2(JLabel lblCompany_L2) {
        this.lblCompany_L2 = lblCompany_L2;
    }

    public JLabel getLblFax() {
        return lblFax;
    }

    public void setLblFax(JLabel lblFax) {
        this.lblFax = lblFax;
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblImage() {
        return lblImage;
    }

    public void setLblImage(JLabel lblImage) {
        this.lblImage = lblImage;
    }

    public JLabel getLblTelephone() {
        return lblTelephone;
    }

    public void setLblTelephone(JLabel lblTelephone) {
        this.lblTelephone = lblTelephone;
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

    public JTextField getTxtAddress_L1() {
        return txtAddress_L1;
    }

    public void setTxtAddress_L1(JTextField txtAddress_L1) {
        this.txtAddress_L1 = txtAddress_L1;
    }

    public JTextField getTxtAddress_L2() {
        return txtAddress_L2;
    }

    public void setTxtAddress_L2(JTextField txtAddress_L2) {
        this.txtAddress_L2 = txtAddress_L2;
    }

    public JTextField getTxtCompany_L1() {
        return txtCompany_L1;
    }

    public void setTxtCompany_L1(JTextField txtCompany_L1) {
        this.txtCompany_L1 = txtCompany_L1;
    }

    public JTextField getTxtCompany_L2() {
        return txtCompany_L2;
    }

    public void setTxtCompany_L2(JTextField txtCompany_L2) {
        this.txtCompany_L2 = txtCompany_L2;
    }

    public JTextField getTxtFax() {
        return txtFax;
    }

    public void setTxtFax(JTextField txtFax) {
        this.txtFax = txtFax;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtTelephone() {
        return txtTelephone;
    }

    public void setTxtTelephone(JTextField txtTelephone) {
        this.txtTelephone = txtTelephone;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuExit = new com.xzq.osc.JocHyperlink();
        lblCompanyInfo = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblCompany_L1 = new javax.swing.JLabel();
        txtCompany_L1 = new javax.swing.JTextField();
        lblCompany_L2 = new javax.swing.JLabel();
        txtCompany_L2 = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        lblAddress_L1 = new javax.swing.JLabel();
        txtAddress_L1 = new javax.swing.JTextField();
        lblAddress_L2 = new javax.swing.JLabel();
        txtAddress_L2 = new javax.swing.JTextField();
        btnSave = new com.xzq.osc.JocHyperlink();
        panelSave = new com.xzq.osc.JocHyperlink();
        panelHover = new com.xzq.osc.JocHyperlink();
        jPanel4 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 87, 99), 2, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
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

        lblCompanyInfo.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblCompanyInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblCompanyInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanyInfo.setText("Company Information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompanyInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCompanyInfo)
                    .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 735, 30);

        lblID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("ID");
        jPanel2.add(lblID);
        lblID.setBounds(20, 70, 140, 23);

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID.setText("New");
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        txtID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtID.setEnabled(false);
        txtID.setOpaque(false);
        jPanel2.add(txtID);
        txtID.setBounds(170, 70, 100, 23);

        lblCompany_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblCompany_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCompany_L1.setText("Company Name(Lao)");
        jPanel2.add(lblCompany_L1);
        lblCompany_L1.setBounds(20, 110, 140, 23);

        txtCompany_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtCompany_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtCompany_L1);
        txtCompany_L1.setBounds(170, 110, 300, 23);

        lblCompany_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblCompany_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCompany_L2.setText("Company Name(EN)");
        jPanel2.add(lblCompany_L2);
        lblCompany_L2.setBounds(20, 150, 140, 23);

        txtCompany_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtCompany_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtCompany_L2);
        txtCompany_L2.setBounds(170, 150, 300, 23);

        lblTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblTelephone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelephone.setText("Telephone");
        jPanel2.add(lblTelephone);
        lblTelephone.setBounds(20, 190, 140, 23);

        txtTelephone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtTelephone);
        txtTelephone.setBounds(170, 190, 300, 23);

        lblFax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblFax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFax.setText("Fax");
        jPanel2.add(lblFax);
        lblFax.setBounds(20, 230, 140, 23);

        txtFax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtFax);
        txtFax.setBounds(170, 230, 300, 23);

        lblAddress_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress_L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress_L1.setText("Address L1");
        jPanel2.add(lblAddress_L1);
        lblAddress_L1.setBounds(20, 270, 140, 23);

        txtAddress_L1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress_L1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtAddress_L1);
        txtAddress_L1.setBounds(170, 270, 300, 23);

        lblAddress_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblAddress_L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress_L2.setText("Address L2");
        jPanel2.add(lblAddress_L2);
        lblAddress_L2.setBounds(20, 310, 140, 23);

        txtAddress_L2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress_L2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        jPanel2.add(txtAddress_L2);
        txtAddress_L2.setBounds(170, 310, 300, 23);

        btnSave.setActiveColor(new java.awt.Color(255, 255, 255));
        btnSave.setRolloverColor(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setUnvisitColor(new java.awt.Color(255, 255, 255));
        btnSave.setVisitedColor(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(btnSave);
        btnSave.setBounds(387, 363, 82, 26);

        panelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Button.png"))); // NOI18N
        panelSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelSave);
        panelSave.setBounds(380, 360, 96, 32);

        panelHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/ButtonHover.png"))); // NOI18N
        panelHover.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel2.add(panelHover);
        panelHover.setBounds(380, 360, 96, 32);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());

        lblImage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Image");
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblImage, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(500, 130, 210, 210);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAddress_L1;
    private javax.swing.JLabel lblAddress_L2;
    private javax.swing.JLabel lblCompanyInfo;
    private javax.swing.JLabel lblCompany_L1;
    private javax.swing.JLabel lblCompany_L2;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTelephone;
    private com.xzq.osc.JocHyperlink menuExit;
    private com.xzq.osc.JocHyperlink panelHover;
    private com.xzq.osc.JocHyperlink panelSave;
    private javax.swing.JTextField txtAddress_L1;
    private javax.swing.JTextField txtAddress_L2;
    private javax.swing.JTextField txtCompany_L1;
    private javax.swing.JTextField txtCompany_L2;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
