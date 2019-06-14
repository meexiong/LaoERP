package com.malimar.models;

import com.malimar.utils.GetMaxID;
import com.malimar.utils.ManageTable;
import com.malimar.utils.Variable;
import static com.malimar.utils.Variable.c;
import static com.malimar.utils.Variable.langType;
import static com.malimar.utils.Variable.userLoginID;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PayRoll {

    int departmentID;
    String departmentName;
    Date startDate;
    Date endDate;
    int payrollID;
    int empID;
    int payrollStatus;
    int countNotProcess;
    int countProcess;
    int countFull;
    int countPart;
    int empFullTime;

    public int getEmpFullTime() {
        return empFullTime;
    }

    public void setEmpFullTime(int empFullTime) {
        this.empFullTime = empFullTime;
    }

    public int getCountFull() {
        return countFull;
    }

    public void setCountFull(int countFull) {
        this.countFull = countFull;
    }

    public int getCountPart() {
        return countPart;
    }

    public void setCountPart(int countPart) {
        this.countPart = countPart;
    }

    public int getCountNotProcess() {
        return countNotProcess;
    }

    public void setCountNotProcess(int countNotProcess) {
        this.countNotProcess = countNotProcess;
    }

    public int getCountProcess() {
        return countProcess;
    }

    public void setCountProcess(int countProcess) {
        this.countProcess = countProcess;
    }

    public int getPayrollStatus() {
        return payrollStatus;
    }

    public void setPayrollStatus(int payrollStatus) {
        this.payrollStatus = payrollStatus;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getPayrollID() {
        return payrollID;
    }

    public void setPayrollID(int payrollID) {
        this.payrollID = payrollID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public HashMap<String, Object[]> loadEmpDetails() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "SELECT dbo.Tbl_Employee.Emp_ID, dbo.Tbl_Employee.EMP_Nbr, dbo.Tbl_Employee.F_name_" + langType + " as empName, dbo.Tbl_Depart.Dept_ID, dbo.Tbl_Depart.Dept_Name_" + langType + " as deptName, dbo.Tbl_Employee.Full_Time, dbo.Tbl_Work_Status.Work_Type_" + langType + " as empWST\n"
                    + "FROM dbo.Tbl_Employee INNER JOIN\n"
                    + "dbo.Tbl_Depart ON dbo.Tbl_Employee.Depart_ID = dbo.Tbl_Depart.Dept_ID INNER JOIN\n"
                    + "dbo.Tbl_Work_Status ON dbo.Tbl_Employee.Work_Status_ID = dbo.Tbl_Work_Status.Work_Status_ID\n"
                    + "where dbo.Tbl_Employee.Cal_payRoll=1 and dbo.Tbl_Employee.Emp_EndDate is null and dbo.Tbl_Depart.Dept_ID=" + this.getDepartmentID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("EMP_Nbr"), new Object[]{rs.getInt("Emp_ID"), rs.getString("EMP_Nbr"), rs.getString("empName"), rs.getInt("Dept_ID"), rs.getString("deptName"), rs.getBoolean("Full_Time"), rs.getString("empWST")});
            }
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void loadDepartment(JTable table, DefaultTableModel model) {
        try {
            int row = 1;
            ManageTable.clearTable(table, model);
            String query = "Select * from Tbl_Depart order by DSortOrder";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                Object[] obj = new Object[]{row++, rs.getInt(1), rs.getString("Dept_Name_" + langType + "")};
                model.addRow(obj);
            }
            table.setModel(model);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertPayrollAll() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            GetMaxID gm = new GetMaxID();
            String exec = "Alter view vw_PayrollTemp as\n"
                    + "Select empID, startdate from tbl_Payroll where StartDate ='" + Variable.bomG + "'";
            PreparedStatement ps = c.prepareStatement(exec);
            ps.execute();
            String query = "SELECT dbo.vw_EmployeePayroll.*\n"
                    + "FROM dbo.vw_EmployeePayroll LEFT OUTER JOIN\n"
                    + "dbo.vw_PayrollTemp ON dbo.vw_EmployeePayroll.Emp_ID = dbo.vw_PayrollTemp.empID\n"
                    + "WHERE (dbo.vw_PayrollTemp.empID IS NULL)";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int emid = rs.getInt("Emp_ID");
                String emNbr = rs.getString("EMP_Nbr");
                double grossSalar = SalaryCalc.getSalary(emid, "G");
                double taxSalar = SalaryCalc.getSalary(emid, "T");
                double excludeTax = SalaryCalc.getSalary(emid, "X");
                double abSalary = (grossSalar / (SalaryCalc.getAbsentDayInMonth() * SalaryCalc.getDayWorkHours() * 60)) * SalaryCalc.getABMinutes(emid, Variable.bomG, Variable.eomG);
                double insur = SalaryCalc.getInsurance(emid, grossSalar - abSalary);
                double ot = SalaryCalc.getOverTime(emid, Variable.bomG, Variable.eomG);
                double asTax = SalaryCalc.getAddOrSubtract(emid, 1);
                double asNoTax = SalaryCalc.getAddOrSubtract(emid, 0);
                double totalSalary = taxSalar - abSalary - insur + asTax + ot;
                double payTax = SalaryCalc.getPayTax(emid, totalSalary);
                double netSalary = totalSalary - payTax + asNoTax + excludeTax;
                String insert = "Insert into tbl_Payroll(PRID, PRDate, StartDate, EndDate, PRStatus, PRProcess, EmpID, EmpNbr, EmpName_L1, EmpName_L2, GrossSalary, TaxSalary,"
                        + "ExcludedTax, Absent, Insurance, TaxAddSubtract, Overtime, PayTax, NonTaxAddSubtract, NetSalary, YearMonth, EmpEmail, Gender_L1, Gender_L2, TitleID,"
                        + "TitleName_L1, TitleName_L2, DivisionID, DiviName_L1, DiviName_L2, DiviSortBy, LocID, LocName_L1, LocName_L2, LocSortBy, DeptID, DeptName_L1,"
                        + "DeptName_L2, DeptSortBy, UnitID, UnitName_L1, UnitName_L2, UnitSortBy, WorkStatusID, WorkStatusDesc_L1, WorkStatusDesc_L2, PayrollPeriod, EmpFullTime,"
                        + "EmpPayroll, EmpInOffice, EmpConsultant, BankNbr, BankAcc_L1, BankAcc_L2, PRBy) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p = c.prepareStatement(insert);
                p.setInt(1, gm.getIntID2("tbl_Payroll", "PRID"));
                p.setString(2, df.format(new Date()));
                p.setString(3, Variable.bomG);
                p.setString(4, Variable.eomG);
                p.setBoolean(5, false);
                p.setBoolean(6, false);
                p.setInt(7, rs.getInt("Emp_ID"));
                p.setString(8, emNbr);
                p.setString(9, rs.getString("F_name_L1"));
                p.setString(10, rs.getString("F_name_L2"));
                p.setDouble(11, grossSalar);
                p.setDouble(12, taxSalar);
                p.setDouble(13, excludeTax);
                p.setDouble(14, abSalary);
                p.setDouble(15, insur);
                p.setDouble(16, asTax);
                p.setDouble(17, ot);
                p.setDouble(18, payTax);
                p.setDouble(19, asNoTax);
                p.setDouble(20, netSalary);
                p.setString(21, Variable.ymG);
                p.setString(22, rs.getString("User_Email"));
                p.setString(23, rs.getString("Gen_Desc_L1"));
                p.setString(24, rs.getString("Gen_Desc_L2"));
                p.setInt(25, rs.getInt("Title_ID"));
                p.setString(26, rs.getString("Title_name_L1"));
                p.setString(27, rs.getString("Title_name_L2"));
                p.setInt(28, rs.getInt("Division_ID"));
                p.setString(29, rs.getString("Division_L1"));
                p.setString(30, rs.getString("Division_L2"));
                p.setInt(31, rs.getInt("SortOrder"));
                p.setInt(32, rs.getInt("Loc_ID"));
                p.setString(33, rs.getString("Loc_name_L1"));
                p.setString(34, rs.getString("Loc_name_L2"));
                p.setInt(35, rs.getInt("LSortOrder"));
                p.setInt(36, rs.getInt("Depart_ID"));
                p.setString(37, rs.getString("Dept_Name_L1"));
                p.setString(38, rs.getString("Dept_Name_L2"));
                p.setInt(39, rs.getInt("DSortOrder"));
                p.setInt(40, rs.getInt("WorkUnitID"));
                p.setString(41, rs.getString("UnitName_L1"));
                p.setString(42, rs.getString("UnitName_L2"));
                p.setInt(43, rs.getInt("UnitSortID"));
                p.setInt(44, rs.getInt("Work_Status_ID"));
                p.setString(45, rs.getString("Work_Type_L1"));
                p.setString(46, rs.getString("Work_Type_L2"));
                p.setInt(47, rs.getInt("PRPeriod"));
                p.setBoolean(48, rs.getBoolean("Full_Time"));
                p.setBoolean(49, rs.getBoolean("Cal_payRoll"));
                p.setBoolean(50, rs.getBoolean("Emp_InOffice"));
                p.setBoolean(51, rs.getBoolean("Consult"));
                p.setString(52, rs.getString("BankNbr"));
                p.setString(53, rs.getString("BankAccount_Lao"));
                p.setString(54, rs.getString("BankAccount_Eng"));
                p.setInt(55, userLoginID);
                p.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadPayroll(JTable table, DefaultTableModel model, int deptID, int pst, int workType) {
        try {
            double g = 0;
            double tx = 0;
            double etx = 0;
            double abs = 0;
            double ins = 0;
            double ast = 0;
            double ov = 0;
            double ptx = 0;
            double nast = 0;
            double nets = 0;
            double taxNets = 0;
            int cntPrc = 0;
            int cntNotPrc = 0;
            int cntFull = 0;
            int cntPart = 0;
            ManageTable.clearTable(table, model);
            DecimalFormat df = new DecimalFormat("#,##0");
            String query;
            String wh;

            if (deptID == 0) {
                if (pst == 3) {
                    wh = "WHERE (StartDate = '" + Variable.bomG + "') AND (EndDate ='" + Variable.eomG + "')";
                } else {
                    wh = "WHERE (StartDate = '" + Variable.bomG + "') AND (EndDate ='" + Variable.eomG + "') and PRStatus=" + pst + "";
                }
                if (workType != 3) {
                    wh = wh + " and EmpFullTime=" + workType + "";
                }
            } else {
                wh = "WHERE (StartDate = '" + Variable.bomG + "') AND (EndDate ='" + Variable.eomG + "') and DeptID=" + deptID;
                if (pst != 3) {
                    wh = wh + " and PRStatus=" + pst + "";
                }
                if (workType != 3) {
                    wh = wh + " and EmpFullTime=" + workType + "";
                }
            }
            query = "SELECT PRID, PRStatus, EmpID, EmpNbr, EmpName_" + langType + " as empName, GrossSalary, TaxSalary, ExcludedTax,\n"
                    + "Absent, Insurance, TaxAddSubtract, Overtime, NonTaxAddSubtract, PayTax, NetSalary, StartDate, EndDate, EmpFullTime \n"
                    + "FROM dbo.tbl_Payroll " + wh;
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                Boolean fulltime = rs.getBoolean("EmpFullTime");
                int id = rs.getInt("PRID");
                Boolean st = rs.getBoolean("PRStatus");
                int eid = rs.getInt("EmpID");
                String enbr = rs.getString("EmpNbr");
                String eName = rs.getString("empName");
                Object[] obj = null;
                double grossSalar = 0;
                double taxSalar = 0;
                double excludeTax = 0;
                double abSalary;
                double insur;
                double asTax;
                double ot;
                double totalSalary;
                double payTax;
                double asNoTax;
                double netSalary;
                if (st == false) {
                    cntNotPrc = cntNotPrc + 1;
                    if (fulltime == false) {
                        grossSalar = SalaryCalc.getHourlyAmount(eid);
                        if (SalaryCalc.getSalary(eid, "T") == 0) {
                            taxSalar = 0;
                        } else {
                            taxSalar = grossSalar;
                        }
                        excludeTax = 0;
                    } else {
                        grossSalar = SalaryCalc.getSalary(eid, "G");
                        taxSalar = SalaryCalc.getSalary(eid, "T");
                        excludeTax = SalaryCalc.getSalary(eid, "X");
                    }
                    g = grossSalar + g;
                    tx = taxSalar + tx;
                    etx = excludeTax + etx;
                    abSalary = (grossSalar / (SalaryCalc.getAbsentDayInMonth() * SalaryCalc.getDayWorkHours() * 60)) * SalaryCalc.getABMinutes(eid, Variable.bomG, Variable.eomG);
                    abs = abSalary + abs;
                    insur = SalaryCalc.getInsurance(eid, grossSalar - abSalary);
                    ins = insur + ins;
                    asTax = SalaryCalc.getAddOrSubtract(eid, 1);
                    ast = asTax + ast;
                    ot = SalaryCalc.getOverTime(eid, Variable.bomG, Variable.eomG);
                    ov = ot + ov;
                    totalSalary = taxSalar - abSalary - insur + asTax + ot;
                    payTax = SalaryCalc.getPayTax(eid, totalSalary);
                    ptx = payTax + ptx;
                    asNoTax = SalaryCalc.getAddOrSubtract(eid, 0);
                    nast = asNoTax + nast;
                    netSalary = totalSalary - payTax + asNoTax + excludeTax;
                    nets = netSalary + nets;
                    taxNets = totalSalary + taxNets;
                } else {
                    cntPrc = cntPrc + 1;
                    grossSalar = rs.getDouble("GrossSalary");
                    g = grossSalar + g;
                    taxSalar = rs.getDouble("TaxSalary");
                    tx = taxSalar + tx;
                    excludeTax = rs.getDouble("ExcludedTax");
                    etx = excludeTax + etx;
                    abSalary = rs.getDouble("Absent");
                    abs = abSalary + abs;
                    insur = rs.getDouble("Insurance");
                    ins = insur + ins;
                    asTax = rs.getDouble("TaxAddSubtract");
                    ast = asTax + ast;
                    ot = rs.getDouble("Overtime");
                    ov = ot + ov;
                    payTax = rs.getDouble("PayTax");
                    ptx = payTax + ptx;
                    asNoTax = rs.getDouble("NonTaxAddSubtract");
                    nast = asNoTax + nast;
                    netSalary = rs.getDouble("NetSalary");
                    nets = netSalary + nets;
                    totalSalary = taxSalar - abSalary - insur + asTax + ot;
//                    netSalary = totalSalary - payTax + asNoTax + excludeTax;
                    taxNets = totalSalary + taxNets;
                }
                obj = new Object[]{id, false, eid, enbr, eName, df.format(grossSalar), df.format(taxSalar), df.format(excludeTax), df.format(abSalary), df.format(insur), df.format(asTax), df.format(ot), df.format(totalSalary), df.format(payTax), df.format(asNoTax), df.format(netSalary), rs.getInt("PRStatus"), rs.getInt("EmpFullTime")};
                model.addRow(obj);
            }
            int cnt = cntPrc + cntNotPrc;
            Object[] obj = new Object[]{0, false, 0, null, "Total(" + cntPrc + "+" + cntNotPrc + "=" + cnt + ")", df.format(g), df.format(tx), df.format(etx), df.format(abs), df.format(ins), df.format(ast), df.format(ov), df.format(taxNets), df.format(ptx), df.format(nast), df.format(nets), 0, 0};
            model.addRow(obj);
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePayrollSelected() {
        try {
            double grossSalar = 0;
            double taxSalar = 0;
            double excludeTax = 0;
            double abSalary = 0;
            double insur = 0;
            double ot = 0;
            double asTax = 0;
            double asNoTax = 0;
            double totalSalary = 0;
            double payTax = 0;
            double netSalary = 0;
            if (this.getEmpFullTime() == 0) {
                grossSalar = SalaryCalc.getHourlyAmount(this.getEmpID());
                if (SalaryCalc.getSalary(this.getEmpID(), "T") == 0) {
                    taxSalar = 0;
                } else {
                    taxSalar = grossSalar;
                }
                if (SalaryCalc.getSalary(this.getEmpID(), "X") == 0) {
                    excludeTax = 0;
                } else {
                    excludeTax = grossSalar;
                }
                abSalary = (grossSalar / (SalaryCalc.getAbsentDayInMonth() * SalaryCalc.getDayWorkHours() * 60)) * SalaryCalc.getABMinutes(this.getEmpID(), Variable.bomG, Variable.eomG);
                insur = SalaryCalc.getInsurance(this.getEmpID(), grossSalar - abSalary);
                ot = SalaryCalc.getOverTime(this.getEmpID(), Variable.bomG, Variable.eomG);
                asTax = SalaryCalc.getAddOrSubtract(this.getEmpID(), 1);
                asNoTax = SalaryCalc.getAddOrSubtract(this.getEmpID(), 0);
                totalSalary = taxSalar - abSalary - insur + asTax + ot;
                payTax = SalaryCalc.getPayTax(this.getEmpID(), totalSalary);
            } else {
                grossSalar = SalaryCalc.getSalary(this.getEmpID(), "G");
                taxSalar = SalaryCalc.getSalary(this.getEmpID(), "T");
                abSalary = (grossSalar / (SalaryCalc.getAbsentDayInMonth() * SalaryCalc.getDayWorkHours() * 60)) * SalaryCalc.getABMinutes(this.getEmpID(), Variable.bomG, Variable.eomG);
                insur = SalaryCalc.getInsurance(this.getEmpID(), grossSalar - abSalary);
                ot = SalaryCalc.getOverTime(this.getEmpID(), Variable.bomG, Variable.eomG);
                asTax = SalaryCalc.getAddOrSubtract(this.getEmpID(), 1);
                asNoTax = SalaryCalc.getAddOrSubtract(this.getEmpID(), 0);
                totalSalary = taxSalar - abSalary - insur + asTax + ot;
                payTax = SalaryCalc.getPayTax(this.getEmpID(), totalSalary);
            }
            netSalary = totalSalary - payTax + asNoTax + excludeTax;
            String insert = "Update tbl_Payroll set PRStatus=?, GrossSalary=?, TaxSalary=?,"
                    + "ExcludedTax=?, Absent=?, Insurance=?, TaxAddSubtract=?, Overtime=?, PayTax=?, NonTaxAddSubtract=?, NetSalary=?, PRBy=? where PRID=?";
            PreparedStatement p = c.prepareStatement(insert);
            if (this.getPayrollStatus() == 1) {
                p.setBoolean(1, false);
            } else {
                p.setBoolean(1, true);
            }
            p.setDouble(2, grossSalar);
            p.setDouble(3, taxSalar);
            p.setDouble(4, excludeTax);
            p.setDouble(5, abSalary);
            p.setDouble(6, insur);
            p.setDouble(7, asTax);
            p.setDouble(8, ot);
            p.setDouble(9, payTax);
            p.setDouble(10, asNoTax);
            p.setDouble(11, netSalary);
            p.setInt(12, userLoginID);
            p.setInt(13, this.getPayrollID());
            p.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getPayrollStatusInfo() {
        try {
            String query = "Select count(pr.PRStatus) as cntPrc,\n"
                    + "(Select count(p.PRStatus) from tbl_Payroll p where p.PRStatus=0 and p.StartDate='" + Variable.bomG + "') as cntNotPrc \n"
                    + "from tbl_Payroll pr where pr.PRStatus=1 and pr.StartDate='" + Variable.bomG + "'";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                this.setCountProcess(rs.getInt(1));
                this.setCountNotProcess(rs.getInt(2));
            }
        } catch (SQLException e) {
        }
    }

    public void getPayrollWorkTypeInfo() {
        try {
            String query = "Select count(pr.EmpFullTime) as cntFull,\n"
                    + "(Select count(p.EmpFullTime) from tbl_Payroll p where p.EmpFullTime=0 and p.StartDate='" + Variable.bomG + "') as cntPart \n"
                    + "from tbl_Payroll pr where pr.EmpFullTime=1 and pr.StartDate='" + Variable.bomG + "'";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                this.setCountFull(rs.getInt(1));
                this.setCountPart(rs.getInt(2));
            }
        } catch (SQLException e) {
        }
    }
}
