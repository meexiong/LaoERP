package com.malimar.models;

import com.malimar.utils.GetMaxID;
import com.malimar.utils.ManageTable;
import com.malimar.utils.Valiables;
import static com.malimar.utils.Valiables.c;
import static com.malimar.utils.Valiables.langType;
import static com.malimar.utils.Valiables.userLoginID;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Absent {

    int absentID;
    int empID;
    String empName;
    Date absentDate;
    int hours;
    int minute;
    int dedID;
    String dedDesc;
    int reasonID;
    String reasonDesc;
    boolean mgrApprove;
    boolean hrApprove;
    int empLeaveID;

    public int getEmpLeaveID() {
        return empLeaveID;
    }

    public void setEmpLeaveID(int empLeaveID) {
        this.empLeaveID = empLeaveID;
    }

    public int getAbsentID() {
        return absentID;
    }

    public void setAbsentID(int absentID) {
        this.absentID = absentID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getAbsentDate() {
        return absentDate;
    }

    public void setAbsentDate(Date absentDate) {
        this.absentDate = absentDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getDedID() {
        return dedID;
    }

    public void setDedID(int dedID) {
        this.dedID = dedID;
    }

    public String getDedDesc() {
        return dedDesc;
    }

    public void setDedDesc(String dedDesc) {
        this.dedDesc = dedDesc;
    }

    public int getReasonID() {
        return reasonID;
    }

    public void setReasonID(int reasonID) {
        this.reasonID = reasonID;
    }

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    public boolean isMgrApprove() {
        return mgrApprove;
    }

    public void setMgrApprove(boolean mgrApprove) {
        this.mgrApprove = mgrApprove;
    }

    public boolean isHrApprove() {
        return hrApprove;
    }

    public void setHrApprove(boolean hrApprove) {
        this.hrApprove = hrApprove;
    }

    public HashMap<String, Object[]> getAbReason() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_AbsentReason";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("RDesc_" + Valiables.langType + ""), new Object[]{rs.getInt("RID"), rs.getString("RDesc_L1"), rs.getString("RDesc_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public HashMap<String, Object[]> getAbDeduction() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
//            String query = "SELECT dbo.Tbl_Employee_Leave.ELID, dbo.tbl_Absent_category.CAbsentID, (dbo.tbl_Absent_category.Amount_Hours*60) +   as mnt, dbo.tbl_Absent_category.Display, dbo.tbl_Absent_category.Absent_" + Valiables.langType + " as cate ,dbo.Tbl_Employee_Leave.Amount_Hour\n"
//                    + "FROM dbo.Tbl_Employee_Leave INNER JOIN\n"
//                    + "dbo.tbl_Absent_category ON dbo.Tbl_Employee_Leave.CAbsentID = dbo.tbl_Absent_category.CAbsentID\n"
//                    + "WHERE (dbo.Tbl_Employee_Leave.emp_id = " + this.getEmpID() + ")";
            String query = "Select * from tbl_Absent_category";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                Boolean display = rs.getBoolean("Display");
                if (display == true) {
                    int totalMnt = getLeaveHour(rs.getInt("CAbsentID"));
                    if (totalMnt > 0) {
                        int tHour = totalMnt / 60;
                        int tMnt = totalMnt % 60;
                        map.put(rs.getString("Absent_" + langType + "") + "(" + tHour + ":" + tMnt + ")", new Object[]{rs.getInt("CAbsentID"), rs.getString("Absent_L1"), rs.getString("Absent_L2"), rs.getString("Absent_" + langType + "") + "(" + tHour + ":" + tMnt + ")"});
                    }
                } else {
                    map.put(rs.getString("Absent_" + langType + ""), new Object[]{rs.getInt("CAbsentID"), rs.getString("Absent_L1"), rs.getString("Absent_L2")});
                }

            }
            rs.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean insert() {
        try {
            GetMaxID gm = new GetMaxID();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String insert = "Insert into tbl_Absent(AbsentID, EmpID, CAbsentID, Hrs, Minte, AbsentDate, CreateDate, CreateBy, MgrApprove, HRApprove, RID)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("tbl_Absent", "AbsentID"));
            p.setInt(2, this.getEmpID());
            p.setInt(3, this.getDedID());
            p.setInt(4, this.getHours());
            p.setInt(5, this.getMinute());
            p.setString(6, df.format(this.getAbsentDate()));
            p.setString(7, df.format(new Date()));
            p.setInt(8, userLoginID);
            p.setBoolean(9, this.isMgrApprove());
            p.setBoolean(10, this.isHrApprove());
            p.setInt(11, this.getReasonID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String insert = "Update tbl_Absent set EmpID=?, CAbsentID=?, Hrs=?, Minte=?, AbsentDate=?, CreateBy=?, MgrApprove=?, HRApprove=?, RID=? where AbsentID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, this.getEmpID());
            p.setInt(2, this.getDedID());
            p.setInt(3, this.getHours());
            p.setInt(4, this.getMinute());
            p.setString(5, df.format(this.getAbsentDate()));
            p.setInt(6, userLoginID);
            p.setBoolean(7, this.isMgrApprove());
            p.setBoolean(8, this.isHrApprove());
            p.setInt(9, this.getReasonID());
            p.setInt(10, this.getAbsentID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            String insert = "Delete tbl_Absent where AbsentID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, this.getAbsentID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void load(JTable table, DefaultTableModel model) {
        try {
            ManageTable.clearTable(table, model);
            String query = "SELECT  dbo.tbl_Absent.AbsentID, format(dbo.tbl_Absent.AbsentDate,'dd-MM-yyyy') as abDate, \n"
                    + "dbo.tbl_Absent.Hrs, dbo.tbl_Absent.Minte, dbo.tbl_Absent_category.Absent_" + langType + " as ded, dbo.tbl_AbsentReason.RDesc_L1\n"
                    + "FROM dbo.tbl_Absent INNER JOIN\n"
                    + "dbo.tbl_Absent_category ON dbo.tbl_Absent.CAbsentID = dbo.tbl_Absent_category.CAbsentID INNER JOIN\n"
                    + "dbo.tbl_AbsentReason ON dbo.tbl_Absent.RID = dbo.tbl_AbsentReason.RID\n"
                    + "where dbo.tbl_Absent.EmpID=" + this.getEmpID() + " and (dbo.tbl_Absent.AbsentDate between '" + SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()) + "' and '" + SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()) + "')";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String abDate = rs.getString(2);
                int hrs = rs.getInt(3);
                int mite = rs.getInt(4);
                String ded = rs.getString(5);
                String res = rs.getString(6);
                Object[] obj = new Object[]{id, abDate, hrs, mite, ded, res};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getABHour(int cateID) {
        try {
            String query = "SELECT dbo.tbl_Absent.CAbsentID,Sum(dbo.tbl_Absent.Hrs*60) +dbo.tbl_Absent.Minte  as totalABMinute\n"
                    + "FROM dbo.tbl_Absent WHERE (EmpID = " + this.getEmpID() + ") and (dbo.tbl_Absent.CAbsentID=" + cateID + ")\n"
                    + "and (dbo.tbl_Absent.AbsentDate between '" + SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()) + "' and '" + SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()) + "')\n"
                    + "Group By dbo.tbl_Absent.Minte,dbo.tbl_Absent.CAbsentID";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                return rs.getInt("totalABMinute");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getLeaveHour(int cateID) {
        try {
//            String query = "SELECT dbo.tbl_Absent_category.CAbsentID, dbo.tbl_Absent_category.Absent_L1,  \n"
//                    + "dbo.Tbl_Employee_Leave.Amount_Hour,dbo.Tbl_Employee_Leave.UseHours,dbo.Tbl_Employee_Leave.UseMinute,\n"
//                    + "Sum(dbo.tbl_Absent.Hrs*60) +dbo.tbl_Absent.Minte  as totalABMinute\n"
//                    + "FROM dbo.tbl_Absent INNER JOIN\n"
//                    + "dbo.tbl_Absent_category ON dbo.tbl_Absent.CAbsentID = dbo.tbl_Absent_category.CAbsentID INNER JOIN\n"
//                    + "dbo.Tbl_Employee_Leave ON dbo.tbl_Absent.EmpID = dbo.Tbl_Employee_Leave.emp_id \n"
//                    + "AND dbo.tbl_Absent_category.CAbsentID = dbo.Tbl_Employee_Leave.CAbsentID\n"
//                    + "WHERE (dbo.tbl_Absent.EmpID = " + this.getEmpID() + ") and (dbo.tbl_Absent.AbsentDate between '" + SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()) + "' and '" + SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()) + "') and dbo.tbl_Absent_category.CAbsentID=" + cateID + "\n"
//                    + "group by dbo.tbl_Absent_category.CAbsentID ,tbl_Absent.Minte,dbo.tbl_Absent_category.Absent_L1,\n"
//                    + "dbo.Tbl_Employee_Leave.UseMinute,dbo.Tbl_Employee_Leave.Amount_Hour,dbo.Tbl_Employee_Leave.UseHours";
            String query = "SELECT dbo.Tbl_Employee_Leave.CAbsentID,\n"
                    + "dbo.Tbl_Employee_Leave.Amount_Hour, dbo.Tbl_Employee_Leave.UseHours, \n"
                    + "dbo.Tbl_Employee_Leave.UseMinute\n"
                    + "FROM dbo.Tbl_Employee_Leave\n"
                    + "where dbo.Tbl_Employee_Leave.CAbsentID=" + cateID + " and dbo.Tbl_Employee_Leave.emp_id = " + this.getEmpID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                int tlminute = rs.getInt("Amount_Hour") * 60;
                int tuminute = (rs.getInt("UseHours") * 60) + rs.getInt("UseMinute") + getABHour(cateID);
                return tlminute - tuminute;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getDedMapKey(HashMap<String, Object[]> map, String values) {
        try {
            for (Entry<String, Object[]> entry : map.entrySet()) {
                if (entry.getValue()[1].equals(values)) {
                    System.out.println(entry.getKey());
                    return entry.getKey();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
