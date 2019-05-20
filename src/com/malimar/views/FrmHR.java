
package com.malimar.views;

import com.malimar.controllers.HRController;
import com.malimar.utils.InternalFrame;
import com.xzq.osc.JocHyperlink;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmHR extends javax.swing.JInternalFrame {

    public FrmHR() {
        initComponents();
        InternalFrame inter = new InternalFrame(this);
        HRController hr = new HRController(this);
    }

    public JLabel getGroupEmployeeHover() {
        return groupEmployeeHover;
    }

    public JLabel getGroupMenuAbsent() {
        return groupMenuAbsent;
    }

    public JLabel getGroupMenuAbsentHover() {
        return groupMenuAbsentHover;
    }

    public JLabel getGroupMenuEmployee() {
        return groupMenuEmployee;
    }

    public JLabel getGroupMenuLoan() {
        return groupMenuLoan;
    }

    public JLabel getGroupMenuLoanHover() {
        return groupMenuLoanHover;
    }

    public JLabel getGroupMenuOverTime() {
        return groupMenuOverTime;
    }

    public JLabel getGroupMenuOverTimeHover() {
        return groupMenuOverTimeHover;
    }

    public JLabel getGroupMenuPayroll() {
        return groupMenuPayroll;
    }

    public JLabel getGroupMenuPayrollHover() {
        return groupMenuPayrollHover;
    }

    public JLabel getGroupMenuReport() {
        return groupMenuReport;
    }

    public JLabel getGroupMenuReportHover() {
        return groupMenuReportHover;
    }

    public JLabel getGroupMenuUpSalary() {
        return groupMenuUpSalary;
    }

    public JLabel getGroupMenuUpSalaryHover() {
        return groupMenuUpSalaryHover;
    }

    public JLabel getGroupMenuUserSetting() {
        return groupMenuUserSetting;
    }

    public JLabel getGroupMenuUserSettingHover() {
        return groupMenuUserSettingHover;
    }

    public JLabel getLblAbsent() {
        return lblAbsent;
    }

    public JLabel getLblEmployee() {
        return lblEmployee;
    }

    public JLabel getLblLoan() {
        return lblLoan;
    }

    public JLabel getLblOvertime() {
        return lblOvertime;
    }

    public JLabel getLblPayroll() {
        return lblPayroll;
    }

    public JLabel getLblReport() {
        return lblReport;
    }

    public JLabel getLblUpSalary() {
        return lblUpSalary;
    }

    public JLabel getLblUserSetting() {
        return lblUserSetting;
    }

    public JocHyperlink getMenuAbsent() {
        return menuAbsent;
    }

    public JocHyperlink getMenuEmployee() {
        return menuEmployee;
    }

    public JocHyperlink getMenuLoan() {
        return menuLoan;
    }

    public JocHyperlink getMenuOverTime() {
        return menuOverTime;
    }

    public JocHyperlink getMenuPayroll() {
        return menuPayroll;
    }

    public JocHyperlink getMenuReport() {
        return menuReport;
    }

    public JocHyperlink getMenuUpSalary() {
        return menuUpSalary;
    }

    public JocHyperlink getMenuUserSetting() {
        return menuUserSetting;
    }

    public JPanel getPnControllHR() {
        return pnControllHR;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnControllHR = new javax.swing.JPanel();
        menuEmployee = new com.xzq.osc.JocHyperlink();
        lblEmployee = new javax.swing.JLabel();
        groupMenuEmployee = new javax.swing.JLabel();
        groupEmployeeHover = new javax.swing.JLabel();
        lblPayroll = new javax.swing.JLabel();
        menuPayroll = new com.xzq.osc.JocHyperlink();
        groupMenuPayroll = new javax.swing.JLabel();
        groupMenuPayrollHover = new javax.swing.JLabel();
        lblUpSalary = new javax.swing.JLabel();
        menuUpSalary = new com.xzq.osc.JocHyperlink();
        groupMenuUpSalary = new javax.swing.JLabel();
        groupMenuUpSalaryHover = new javax.swing.JLabel();
        lblLoan = new javax.swing.JLabel();
        menuLoan = new com.xzq.osc.JocHyperlink();
        groupMenuLoan = new javax.swing.JLabel();
        groupMenuLoanHover = new javax.swing.JLabel();
        lblAbsent = new javax.swing.JLabel();
        menuAbsent = new com.xzq.osc.JocHyperlink();
        groupMenuAbsent = new javax.swing.JLabel();
        groupMenuAbsentHover = new javax.swing.JLabel();
        lblOvertime = new javax.swing.JLabel();
        menuOverTime = new com.xzq.osc.JocHyperlink();
        groupMenuOverTime = new javax.swing.JLabel();
        groupMenuOverTimeHover = new javax.swing.JLabel();
        lblUserSetting = new javax.swing.JLabel();
        menuUserSetting = new com.xzq.osc.JocHyperlink();
        groupMenuUserSetting = new javax.swing.JLabel();
        groupMenuUserSettingHover = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();
        menuReport = new com.xzq.osc.JocHyperlink();
        groupMenuReport = new javax.swing.JLabel();
        groupMenuReportHover = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnControllHR.setBackground(new java.awt.Color(255, 255, 255));
        pnControllHR.setLayout(null);

        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/employee1.png"))); // NOI18N
        pnControllHR.add(menuEmployee);
        menuEmployee.setBounds(55, 65, 150, 130);

        lblEmployee.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployee.setText("Employee");
        pnControllHR.add(lblEmployee);
        lblEmployee.setBounds(60, 200, 145, 17);

        groupMenuEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuEmployee);
        groupMenuEmployee.setBounds(50, 60, 162, 163);

        groupEmployeeHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupEmployeeHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupEmployeeHover);
        groupEmployeeHover.setBounds(50, 60, 162, 163);

        lblPayroll.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblPayroll.setForeground(new java.awt.Color(255, 255, 255));
        lblPayroll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPayroll.setText("Payroll");
        pnControllHR.add(lblPayroll);
        lblPayroll.setBounds(250, 200, 145, 17);

        menuPayroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/payroll1.png"))); // NOI18N
        pnControllHR.add(menuPayroll);
        menuPayroll.setBounds(245, 65, 150, 130);

        groupMenuPayroll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuPayroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuPayroll);
        groupMenuPayroll.setBounds(240, 60, 162, 163);

        groupMenuPayrollHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuPayrollHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuPayrollHover);
        groupMenuPayrollHover.setBounds(240, 60, 162, 163);

        lblUpSalary.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblUpSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblUpSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpSalary.setText("Up Salary");
        pnControllHR.add(lblUpSalary);
        lblUpSalary.setBounds(440, 200, 145, 17);

        menuUpSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/UpSalary.png"))); // NOI18N
        pnControllHR.add(menuUpSalary);
        menuUpSalary.setBounds(436, 65, 150, 130);

        groupMenuUpSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuUpSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuUpSalary);
        groupMenuUpSalary.setBounds(430, 60, 162, 163);

        groupMenuUpSalaryHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuUpSalaryHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuUpSalaryHover);
        groupMenuUpSalaryHover.setBounds(430, 60, 162, 163);

        lblLoan.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblLoan.setForeground(new java.awt.Color(255, 255, 255));
        lblLoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoan.setText("Loan");
        pnControllHR.add(lblLoan);
        lblLoan.setBounds(630, 200, 145, 17);

        menuLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Loan.png"))); // NOI18N
        pnControllHR.add(menuLoan);
        menuLoan.setBounds(626, 65, 150, 130);

        groupMenuLoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuLoan);
        groupMenuLoan.setBounds(620, 60, 162, 163);

        groupMenuLoanHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuLoanHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuLoanHover);
        groupMenuLoanHover.setBounds(620, 60, 162, 163);

        lblAbsent.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblAbsent.setForeground(new java.awt.Color(255, 255, 255));
        lblAbsent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbsent.setText("Absent");
        pnControllHR.add(lblAbsent);
        lblAbsent.setBounds(60, 410, 145, 17);

        menuAbsent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Absent.png"))); // NOI18N
        pnControllHR.add(menuAbsent);
        menuAbsent.setBounds(55, 275, 150, 130);

        groupMenuAbsent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuAbsent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuAbsent);
        groupMenuAbsent.setBounds(50, 270, 162, 163);

        groupMenuAbsentHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuAbsentHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuAbsentHover);
        groupMenuAbsentHover.setBounds(50, 270, 162, 163);

        lblOvertime.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblOvertime.setForeground(new java.awt.Color(255, 255, 255));
        lblOvertime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOvertime.setText("Overtime");
        pnControllHR.add(lblOvertime);
        lblOvertime.setBounds(250, 410, 145, 17);

        menuOverTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/OverTime.png"))); // NOI18N
        pnControllHR.add(menuOverTime);
        menuOverTime.setBounds(245, 275, 150, 130);

        groupMenuOverTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuOverTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuOverTime);
        groupMenuOverTime.setBounds(240, 270, 162, 163);

        groupMenuOverTimeHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuOverTimeHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuOverTimeHover);
        groupMenuOverTimeHover.setBounds(240, 270, 162, 163);

        lblUserSetting.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblUserSetting.setForeground(new java.awt.Color(255, 255, 255));
        lblUserSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserSetting.setText("User Setting");
        pnControllHR.add(lblUserSetting);
        lblUserSetting.setBounds(440, 410, 145, 17);

        menuUserSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/UserSetting.png"))); // NOI18N
        pnControllHR.add(menuUserSetting);
        menuUserSetting.setBounds(436, 275, 150, 130);

        groupMenuUserSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuUserSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuUserSetting);
        groupMenuUserSetting.setBounds(430, 270, 162, 163);

        groupMenuUserSettingHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuUserSettingHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuUserSettingHover);
        groupMenuUserSettingHover.setBounds(430, 270, 162, 163);

        lblReport.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        lblReport.setForeground(new java.awt.Color(255, 255, 255));
        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setText("Report");
        pnControllHR.add(lblReport);
        lblReport.setBounds(630, 410, 145, 17);

        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/Report.png"))); // NOI18N
        pnControllHR.add(menuReport);
        menuReport.setBounds(626, 275, 150, 130);

        groupMenuReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menu.png"))); // NOI18N
        pnControllHR.add(groupMenuReport);
        groupMenuReport.setBounds(620, 270, 162, 163);

        groupMenuReportHover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupMenuReportHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/malimar/images/menuHover.png"))); // NOI18N
        pnControllHR.add(groupMenuReportHover);
        groupMenuReportHover.setBounds(620, 270, 162, 163);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnControllHR, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnControllHR, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel groupEmployeeHover;
    private javax.swing.JLabel groupMenuAbsent;
    private javax.swing.JLabel groupMenuAbsentHover;
    private javax.swing.JLabel groupMenuEmployee;
    private javax.swing.JLabel groupMenuLoan;
    private javax.swing.JLabel groupMenuLoanHover;
    private javax.swing.JLabel groupMenuOverTime;
    private javax.swing.JLabel groupMenuOverTimeHover;
    private javax.swing.JLabel groupMenuPayroll;
    private javax.swing.JLabel groupMenuPayrollHover;
    private javax.swing.JLabel groupMenuReport;
    private javax.swing.JLabel groupMenuReportHover;
    private javax.swing.JLabel groupMenuUpSalary;
    private javax.swing.JLabel groupMenuUpSalaryHover;
    private javax.swing.JLabel groupMenuUserSetting;
    private javax.swing.JLabel groupMenuUserSettingHover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbsent;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblLoan;
    private javax.swing.JLabel lblOvertime;
    private javax.swing.JLabel lblPayroll;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblUpSalary;
    private javax.swing.JLabel lblUserSetting;
    private com.xzq.osc.JocHyperlink menuAbsent;
    private com.xzq.osc.JocHyperlink menuEmployee;
    private com.xzq.osc.JocHyperlink menuLoan;
    private com.xzq.osc.JocHyperlink menuOverTime;
    private com.xzq.osc.JocHyperlink menuPayroll;
    private com.xzq.osc.JocHyperlink menuReport;
    private com.xzq.osc.JocHyperlink menuUpSalary;
    private com.xzq.osc.JocHyperlink menuUserSetting;
    private javax.swing.JPanel pnControllHR;
    // End of variables declaration//GEN-END:variables
}
