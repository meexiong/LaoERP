
package com.malimar.views;

import com.malimar.controllers.SettingController;
import com.malimar.utils.InternalFrame;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmSetting extends javax.swing.JInternalFrame {

    public FrmSetting() {
        initComponents();
        InternalFrame inter = new InternalFrame(this);
        SettingController  sc = new SettingController(this);
    }

    public JLabel getGroupMenuPayrollSetting() {
        return groupMenuPayrollSetting;
    }

    public JLabel getGroupMenuPayrollSettingHover() {
        return groupMenuPayrollSettingHover;
    }

    public JLabel getGroupMenuSystemSetting() {
        return groupMenuSystemSetting;
    }

    public JLabel getGroupMenuSystemSettingHover() {
        return groupMenuSystemSettingHover;
    }

    public JLabel getGroupMenuTaxSetting() {
        return groupMenuTaxSetting;
    }

    public JLabel getGroupMenuTaxSettingHover() {
        return groupMenuTaxSettingHover;
    }

    public JLabel getLblPayrollSetting() {
        return lblPayrollSetting;
    }

    public JLabel getLblSystemSetting() {
        return lblSystemSetting;
    }

    public JLabel getLblTaxSetting() {
        return lblTaxSetting;
    }

    public JocHyperlink getMenuPayrollSetting() {
        return menuPayrollSetting;
    }

    public JocHyperlink getMenuSystemSetting() {
        return menuSystemSetting;
    }

    public JocHyperlink getMenuTaxSetting() {
        return menuTaxSetting;
    }

    public JPanel getPnControllSetting() {
        return pnControllSetting;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnControllSetting = new javax.swing.JPanel();
        menuSystemSetting = new com.xzq.osc.JocHyperlink();
        lblSystemSetting = new javax.swing.JLabel();
        groupMenuSystemSetting = new javax.swing.JLabel();
        groupMenuSystemSettingHover = new javax.swing.JLabel();
        lblTaxSetting = new javax.swing.JLabel();
        menuTaxSetting = new com.xzq.osc.JocHyperlink();
        groupMenuTaxSetting = new javax.swing.JLabel();
        groupMenuTaxSettingHover = new javax.swing.JLabel();
        lblPayrollSetting = new javax.swing.JLabel();
        menuPayrollSetting = new com.xzq.osc.JocHyperlink();
        groupMenuPayrollSetting = new javax.swing.JLabel();
        groupMenuPayrollSettingHover = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnControllSetting.setBackground(new java.awt.Color(255, 255, 255));
        pnControllSetting.setLayout(null);

        menuSystemSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/SystemSetting.png"))); // NOI18N
        pnControllSetting.add(menuSystemSetting);
        menuSystemSetting.setBounds(55, 65, 150, 130);

        lblSystemSetting.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblSystemSetting.setForeground(new java.awt.Color(255, 255, 255));
        lblSystemSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemSetting.setText("System Setting");
        pnControllSetting.add(lblSystemSetting);
        lblSystemSetting.setBounds(60, 200, 145, 17);

        groupMenuSystemSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuSystemSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllSetting.add(groupMenuSystemSetting);
        groupMenuSystemSetting.setBounds(50, 60, 162, 163);

        groupMenuSystemSettingHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuSystemSettingHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllSetting.add(groupMenuSystemSettingHover);
        groupMenuSystemSettingHover.setBounds(50, 60, 162, 163);

        lblTaxSetting.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblTaxSetting.setForeground(new java.awt.Color(255, 255, 255));
        lblTaxSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaxSetting.setText("Tax Setting");
        pnControllSetting.add(lblTaxSetting);
        lblTaxSetting.setBounds(250, 200, 145, 17);

        menuTaxSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/UserSetting.png"))); // NOI18N
        pnControllSetting.add(menuTaxSetting);
        menuTaxSetting.setBounds(246, 65, 150, 130);

        groupMenuTaxSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuTaxSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllSetting.add(groupMenuTaxSetting);
        groupMenuTaxSetting.setBounds(240, 60, 162, 163);

        groupMenuTaxSettingHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuTaxSettingHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllSetting.add(groupMenuTaxSettingHover);
        groupMenuTaxSettingHover.setBounds(240, 60, 162, 163);

        lblPayrollSetting.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblPayrollSetting.setForeground(new java.awt.Color(255, 255, 255));
        lblPayrollSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPayrollSetting.setText("Payroll Setting");
        pnControllSetting.add(lblPayrollSetting);
        lblPayrollSetting.setBounds(438, 200, 145, 17);

        menuPayrollSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/PaySetting.png"))); // NOI18N
        pnControllSetting.add(menuPayrollSetting);
        menuPayrollSetting.setBounds(436, 65, 150, 130);

        groupMenuPayrollSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuPayrollSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllSetting.add(groupMenuPayrollSetting);
        groupMenuPayrollSetting.setBounds(430, 60, 162, 163);

        groupMenuPayrollSettingHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuPayrollSettingHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllSetting.add(groupMenuPayrollSettingHover);
        groupMenuPayrollSettingHover.setBounds(430, 60, 162, 163);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnControllSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnControllSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel groupMenuPayrollSetting;
    private javax.swing.JLabel groupMenuPayrollSettingHover;
    private javax.swing.JLabel groupMenuSystemSetting;
    private javax.swing.JLabel groupMenuSystemSettingHover;
    private javax.swing.JLabel groupMenuTaxSetting;
    private javax.swing.JLabel groupMenuTaxSettingHover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPayrollSetting;
    private javax.swing.JLabel lblSystemSetting;
    private javax.swing.JLabel lblTaxSetting;
    private com.xzq.osc.JocHyperlink menuPayrollSetting;
    private com.xzq.osc.JocHyperlink menuSystemSetting;
    private com.xzq.osc.JocHyperlink menuTaxSetting;
    private javax.swing.JPanel pnControllSetting;
    // End of variables declaration//GEN-END:variables
}
