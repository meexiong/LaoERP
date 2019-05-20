
package com.malimar.views;

import com.malimar.controllers.DashBoardController;
import com.malimar.utils.InternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmDashboard extends javax.swing.JInternalFrame {

    public FrmDashboard() {
        initComponents();
        InternalFrame inter = new InternalFrame(this);
        DashBoardController dc = new DashBoardController(this);
    }

    public JLabel getLblFemale() {
        return lblFemale;
    }

    public JLabel getLblMOT() {
        return lblMOT;
    }

    public JLabel getLblMSBD() {
        return lblMSBD;
    }

    public JLabel getLblMale() {
        return lblMale;
    }

    public JLabel getLblTotalEmp() {
        return lblTotalEmp;
    }

    public JLabel getLblYSBM() {
        return lblYSBM;
    }

    public JLabel getPanelMSBD() {
        return panelMSBD;
    }

    public JLabel getPanelYSBM() {
        return panelYSBM;
    }

    public JPanel getPnControllDashboard() {
        return pnControllDashboard;
    }

    public JLabel getTxtEmpTotal() {
        return txtEmpTotal;
    }

    public JLabel getTxtFemale() {
        return txtFemale;
    }

    public JLabel getTxtMale() {
        return txtMale;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnControllDashboard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpTotal = new javax.swing.JLabel();
        lblTotalEmp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFemale = new javax.swing.JLabel();
        lblFemale = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMale = new javax.swing.JLabel();
        lblMale = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMSBD = new javax.swing.JLabel();
        panelMSBD = new javax.swing.JLabel();
        lblYSBM = new javax.swing.JLabel();
        panelYSBM = new javax.swing.JLabel();
        lblMOT = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnControllDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnControllDashboard.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Untitled-2.png"))); // NOI18N
        pnControllDashboard.add(jLabel4);
        jLabel4.setBounds(560, 210, 380, 380);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Untitled-1.png"))); // NOI18N
        pnControllDashboard.add(jLabel3);
        jLabel3.setBounds(30, 210, 500, 380);

        txtEmpTotal.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtEmpTotal.setForeground(new java.awt.Color(0, 204, 0));
        txtEmpTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmpTotal.setText("45");
        pnControllDashboard.add(txtEmpTotal);
        txtEmpTotal.setBounds(20, 60, 150, 60);

        lblTotalEmp.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblTotalEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalEmp.setText("Employee");
        pnControllDashboard.add(lblTotalEmp);
        lblTotalEmp.setBounds(20, 160, 150, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/panel.png"))); // NOI18N
        pnControllDashboard.add(jLabel2);
        jLabel2.setBounds(10, 20, 170, 170);

        txtFemale.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtFemale.setForeground(new java.awt.Color(255, 153, 102));
        txtFemale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFemale.setText("20");
        pnControllDashboard.add(txtFemale);
        txtFemale.setBounds(210, 60, 140, 60);

        lblFemale.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblFemale.setForeground(new java.awt.Color(255, 255, 255));
        lblFemale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFemale.setText("Female");
        pnControllDashboard.add(lblFemale);
        lblFemale.setBounds(210, 160, 140, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/panel.png"))); // NOI18N
        pnControllDashboard.add(jLabel6);
        jLabel6.setBounds(195, 20, 170, 170);

        txtMale.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtMale.setForeground(new java.awt.Color(153, 153, 255));
        txtMale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMale.setText("25");
        pnControllDashboard.add(txtMale);
        txtMale.setBounds(390, 60, 150, 60);

        lblMale.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblMale.setForeground(new java.awt.Color(255, 255, 255));
        lblMale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMale.setText("Male");
        pnControllDashboard.add(lblMale);
        lblMale.setBounds(390, 160, 150, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/panel.png"))); // NOI18N
        pnControllDashboard.add(jLabel7);
        jLabel7.setBounds(380, 20, 170, 170);

        lblMSBD.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblMSBD.setForeground(new java.awt.Color(255, 255, 255));
        lblMSBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMSBD.setText("Monthly Salary by Department");
        pnControllDashboard.add(lblMSBD);
        lblMSBD.setBounds(20, 605, 520, 22);

        panelMSBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMSBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/panel2.png"))); // NOI18N
        pnControllDashboard.add(panelMSBD);
        panelMSBD.setBounds(10, 190, 540, 450);

        lblYSBM.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblYSBM.setForeground(new java.awt.Color(255, 255, 255));
        lblYSBM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYSBM.setText("Yearly Salary by month");
        pnControllDashboard.add(lblYSBM);
        lblYSBM.setBounds(560, 606, 380, 22);

        panelYSBM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelYSBM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/panel3.png"))); // NOI18N
        pnControllDashboard.add(panelYSBM);
        panelYSBM.setBounds(550, 190, 400, 450);

        lblMOT.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblMOT.setForeground(new java.awt.Color(255, 255, 255));
        lblMOT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMOT.setText("Monthly OverTime");
        pnControllDashboard.add(lblMOT);
        lblMOT.setBounds(560, 160, 380, 22);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/panel4.png"))); // NOI18N
        pnControllDashboard.add(jLabel10);
        jLabel10.setBounds(545, 20, 410, 170);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnControllDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnControllDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFemale;
    private javax.swing.JLabel lblMOT;
    private javax.swing.JLabel lblMSBD;
    private javax.swing.JLabel lblMale;
    private javax.swing.JLabel lblTotalEmp;
    private javax.swing.JLabel lblYSBM;
    private javax.swing.JLabel panelMSBD;
    private javax.swing.JLabel panelYSBM;
    private javax.swing.JPanel pnControllDashboard;
    private javax.swing.JLabel txtEmpTotal;
    private javax.swing.JLabel txtFemale;
    private javax.swing.JLabel txtMale;
    // End of variables declaration//GEN-END:variables
}
