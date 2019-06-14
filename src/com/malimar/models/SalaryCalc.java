package com.malimar.models;

import com.malimar.utils.Variable;
import static com.malimar.utils.Variable.c;
import static com.malimar.utils.Variable.langType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class SalaryCalc {

    public static int getNormalDay() {
        try {
            String query = "select System_values from Tbl_System_Setting where Tbl_System_ID = 7";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                int a = Integer.parseInt(rs.getString("system_values"));
                rs.close();
                return a;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static float getDayHour(int emid) {
        try {
//            Connection c = DatabaseManager.getConnection();
            String sql = "Select w.hour from Tbl_Work_Status w \n"
                    + "inner join Tbl_Employee e on e.Work_Status_ID = w.Work_Status_ID\n"
                    + "where e.Emp_ID = " + emid + "";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                float a = rs.getFloat("hour");
                rs.close();
//                c.close();
                return a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getOTday() {
        try {
//            Connection c = DatabaseManager.getConnection();
            String query = "select System_values from Tbl_System_Setting where Tbl_System_ID = 1";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                int a = Integer.parseInt(rs.getString("system_values"));
                rs.close();
//                c.close();
                return a;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static HashMap<Integer, Object[]> getTax(int emid) {
        try {
            HashMap<Integer, Object[]> map = new HashMap<>();
//            Connection c = DatabaseManager.getConnection();
            String query = "Select t.etax_id, t.ded_id, d.ded_name_L1, d.ded_pct, d.ded_limit_a, d.ded_limit_B, d.Ded_Amount from Tbl_Emp_Tax t\n"
                    + "left join Tbl_DeductType d on d.Ded_ID = t.ded_ID where t.emp_id =" + emid + "\n"
                    + "group by t.etax_id, t.ded_id, d.ded_name_L1, d.ded_pct, d.ded_limit_a, d.ded_limit_B, d.Ded_Amount \n"
                    + "order by cast (d.ded_pct as float)";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getInt(1), new Object[]{rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getInt(7)});
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static double fuctionTax(double Salary, double percents, double min, double max, double exams) {
        double totals = 0;
        try {
            //double sum = Salary;
            totals = 0;
//            if (Salary > -exams) {
            if (Salary > min && Salary < max) {
                totals = ((Salary - min) * percents) / 100;
            } else {
                if (min == 0) {
                    totals = ((max + exams) * percents) / 100;
                } else {
                    if (Salary < min) {
                        totals = 0;
                    } else {
                        totals = ((max - min) * percents) / 100;
                    }
                }
            }
//            }
        } catch (Exception e) {
        }
        return totals;
    }

    public static double getTotalTax(int emid) {
        try {
//            Connection c = DatabaseManager.getConnection();
            String sql = "Select sum(sal_emp_amt) as Salary from Tbl_SalaryEmp where Emp_ID = " + emid + " and Sal_Calc = 1";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                double a = rs.getDouble("salary");
                rs.close();
//                c.close();
                return a;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static float getInsurancePct(int emid) {
        try {
//            Connection c = DatabaseManager.getConnection();
            String sql = "select isnull(h.empPercent,0) as empPercent, h.Max_money from tbl_health h left join tbl_employee e on e.health_ID = h.health_ID where e.emp_id = " + emid + "";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                float a = rs.getFloat("empPercent");
                rs.close();
//                c.close();
                return a;
            }

            rs.close();
            c.close();
        } catch (Exception e) {
        }
        return 0;
    }

    public static double getInsuranceMax(int emid) {
        try {
//            Connection c = DatabaseManager.getConnection();
            String sql = "select isnull(h.empPercent,0) as empPercent, h.Max_money from tbl_health h left join tbl_employee e on e.health_ID = h.health_ID where e.emp_id = " + emid + "";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                double a = rs.getDouble("Max_money");
                rs.close();
                c.close();
                return a;
            }

            rs.close();
//            c.close();
        } catch (Exception e) {
        }
        return 0;
    }

    public static double getInsurance(int emid, double netSalary) {
        try {
//            Connection c = DatabaseManager.getConnection();
//            String sql = "Select sum(sal_emp_amt) as Salary from Tbl_SalaryEmp where Emp_ID = " + emid + " and Sal_Insu = 1";
//            ResultSet rs = c.createStatement().executeQuery(sql);
//            if (rs.next()) {
            double y = 0;
//                double salary = rs.getDouble("salary");
            String query = "SELECT dbo.tbl_Insurance_Emp.InTypeEmpID, dbo.Tbl_Health.Health_Name_" + langType + " as type,\n"
                    + " dbo.tbl_Insurance_Emp.InsuranceNbr, dbo.Tbl_Health.EmpPercent, \n"
                    + " dbo.Tbl_Health.CompanyPercent, dbo.Tbl_Health.Max_Money, \n"
                    + "dbo.tbl_Insurance_Emp.MaxSalary\n"
                    + "FROM dbo.tbl_Insurance_Emp INNER JOIN\n"
                    + "dbo.Tbl_Health ON dbo.tbl_Insurance_Emp.Health_ID = dbo.Tbl_Health.Health_ID\n"
                    + "WHERE (dbo.tbl_Insurance_Emp.emp_id = " + emid + ")";
            ResultSet rs1 = c.createStatement().executeQuery(query);
            while (rs1.next()) {
                double maxDeduction = rs1.getDouble("Max_Money");
                double pct = rs1.getDouble("EmpPercent");
                double maxSalary = rs1.getDouble("MaxSalary");
                if (maxSalary == 0 || netSalary == 0) {
                    maxSalary = netSalary;
                }
                double x;
                if (maxSalary > maxDeduction) {
                    x = (maxDeduction * pct) / 100;
                } else {
                    x = (pct * maxSalary) / 100;
                }
                y += x;
            }
            return y;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static double getSalary(int emid, String type) {
        try {
            double salary = 0;
            boolean t;
            boolean o;
            boolean i;
//            Connection c = DatabaseManager.getConnection();
            String sql = "Select * from Tbl_SalaryEmp where Emp_ID = " + emid + "";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {
                double a = rs.getDouble("sal_emp_amt");
                float pct = rs.getFloat("P_Percents");
                t = rs.getBoolean("Sal_Calc");
                o = rs.getBoolean("Sal_Calc_OT");
                i = rs.getBoolean("Sal_Insu");
                double total = 0;
                switch (type.toUpperCase()) {
                    case "T":
                        if (t == true) {
                            total = a - (a * (pct / 100));
                            salary += total;
                        }
                        break;
                    case "O":
                        if (o == true) {
                            total = a - (a * (pct / 100));
                            salary += total;
                        }
                        break;
                    case "X":
                        if (t == false) {
                            total = a - (a * (pct / 100));
                            salary += total;
                        }
                        break;
                    case "G":
                        total = a - (a * (pct / 100));
                        salary += total;
                        break;
                    case "I":
                        if (i == true) {
                            total = a - (a * (pct / 100));
                            salary += total;
                        }
                        break;
                }
            }
            return salary;
        } catch (Exception e) {
        }
        return 0;
    }

    public static double getABMinutes(int emid, String bom, String eom) {
        try {
            float totalMinute = 0;
//            String query = "Select * from tbl_Absent where AbsentDate between '" + bom + "' and '" + eom + "'\n"
//                    + "and HRApprove=1 and empID=" + emid + "";
            String query = "SELECT dbo.tbl_Absent.AbsentID, dbo.tbl_Absent.EmpID, dbo.tbl_Absent.CAbsentID, \n"
                    + "dbo.tbl_Absent.Hrs, dbo.tbl_Absent.Minte, dbo.tbl_Absent.AbsentDate, \n"
                    + "dbo.tbl_Absent.CreateDate, dbo.tbl_Absent.CreateBy, dbo.tbl_Absent.MgrApprove, \n"
                    + "dbo.tbl_Absent.HRApprove, dbo.tbl_Absent.RID, dbo.tbl_Absent_category.Display\n"
                    + "FROM dbo.tbl_Absent INNER JOIN\n"
                    + "dbo.tbl_Absent_category ON dbo.tbl_Absent.CAbsentID = dbo.tbl_Absent_category.CAbsentID\n"
                    + "WHERE (dbo.tbl_Absent.AbsentDate BETWEEN '" + bom + "' AND '" + eom + "') AND \n"
                    + "(dbo.tbl_Absent.HRApprove = 1) AND (dbo.tbl_Absent.EmpID = " + emid + ") AND (dbo.tbl_Absent_category.Display = 0)";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int hour = rs.getInt("Hrs");
                int minute = rs.getInt("Minte");
                totalMinute = ((hour * 60) + minute) + totalMinute;
            }
            return totalMinute;
        } catch (SQLException e) {
        }
        return 0;
    }

    public static int getAbsentDayInMonth() {
        try {
            String query = "Select System_values from Tbl_System_Setting where Tbl_System_ID=7";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                String days = rs.getString(1);
                return Integer.parseInt(days);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getDayWorkHours() {
        try {
//            Connection c = DatabaseManager.getConnection();
            String query = "Select System_values from Tbl_System_Setting where Tbl_System_ID=2";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                String hour = rs.getString(1);
                return Integer.parseInt(hour);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static double getOverTime(int emid, String bom, String eom) {
        try {
            String query = "Select Sum(OTAmount) as OT from tbl_Overtime where empID=" + emid + " and HRApprove = 1 and (WorkDate between '" + bom + "' and '" + eom + "')";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                return rs.getDouble("OT");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getPayrollStartDate() {
        try {
            String query = "Select System_values from Tbl_System_Setting where Tbl_System_ID=3";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                String day = rs.getString(1);
                Calendar calen = Calendar.getInstance();
                calen.setTime(new Date());
                calen.add(Calendar.DAY_OF_MONTH, -10);
                Date enddate = calen.getTime();
                Calendar calen1 = Calendar.getInstance();
                calen1.setTime(enddate);
                calen1.add(Calendar.MONTH, -1);
                Date startdate = calen1.getTime();
                String bom = new SimpleDateFormat("MM").format(startdate);
                String year = new SimpleDateFormat("yyyy").format(startdate);
                String x = day + "/" + bom + "/" + year;
                return x;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getPayrollEndDate() {
        try {
            String query = "Select System_values from Tbl_System_Setting where Tbl_System_ID=4";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                String day = rs.getString(1);

                Calendar calen = Calendar.getInstance();
                calen.setTime(new Date());
                calen.add(Calendar.DAY_OF_MONTH, -10);
                Date enddate = calen.getTime();
                String eom = new SimpleDateFormat("MM").format(enddate);
                String year = new SimpleDateFormat("yyyy").format(enddate);
                String x = day + "/" + eom + "/" + year;
                return x;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String convertDate(String date) {
        try {
            java.util.Date stdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            String x = new SimpleDateFormat("yyyy-MM-dd").format(stdate);
            return x;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String convertDToYM(String date) {
        try {
            java.util.Date stdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            String x = new SimpleDateFormat("yyyy-MM").format(stdate);
            return x;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static double getAddOrSubtract(int emID, int tax) {
        try {
            double amount = 0;
            String query = "Select * from tbl_AddorSubtract where (ASDate between '" + SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()) + "' and '" + SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()) + "') and (empID=" + emID + ") and Tax=" + tax + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                amount = rs.getDouble(3) + amount;
            }
            return amount;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    static double totalTax;

    public static double getPayTax(int emid, double salary) {
        try {
            totalTax = 0;
            getTax(emid).keySet().forEach((s) -> {
                double netTax = 0;
                double pct = Double.parseDouble(getTax(emid).get(s)[3].toString());
                double min = Double.parseDouble(getTax(emid).get(s)[4].toString());
                double max = Double.parseDouble(getTax(emid).get(s)[5].toString());
                double deduction = Double.parseDouble(getTax(emid).get(s)[6].toString());
                double sum = salary + deduction;
                totalTax += SalaryCalc.fuctionTax(sum, pct, min, max, deduction);
            });
            return totalTax;
        } catch (Exception e) {
        }
        return 0;
    }

    public static double getHourlyAmount(int emid) {
        try {
            String query = "Select sum(Total) as hrsAmount from tbl_EmpHourly where empID=" + emid + " and (HrsDate between '" + Variable.bomG + "' and '" + Variable.eomG + "') and HR=1";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
