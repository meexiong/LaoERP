package com.malimar.models;

import com.malimar.utils.GetMaxID;
import com.malimar.utils.ManageTable;
import static com.malimar.utils.Variable.c;
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

public class Overtime {

    int overtimeID;
    int empID;
    int rateID;
    String rateDesc;
    int hour;
    int minute;
    double amount;
    Date overtimeDate;
    int createBy;
    boolean mgrApprove;
    boolean hrApprove;

    public int getOvertimeID() {
        return overtimeID;
    }

    public void setOvertimeID(int overtimeID) {
        this.overtimeID = overtimeID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getRateID() {
        return rateID;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public String getRateDisce() {
        return rateDesc;
    }

    public void setRateDisce(String rateDesc) {
        this.rateDesc = rateDesc;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getOvertimeDate() {
        return overtimeDate;
    }

    public void setOvertimeDate(Date overtimeDate) {
        this.overtimeDate = overtimeDate;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
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

    public HashMap<Float, Object[]> getMultiplerInfo() {
        try {
            HashMap<Float, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_OTCategory";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getFloat("Late_MN_Hour"), new Object[]{rs.getInt("CategoryOTID"), rs.getString("CateName_L1"), rs.getString("CateName_L2"), rs.getFloat("Late_MN_Hour")});
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
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into tbl_Overtime(OvertimeID, EmpID, CategoryOTID, Hours, Minute, OTAmount, WorkDate, CreateDate, CreateBy, MgrApprove, HRApprove)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("tbl_Overtime", "OvertimeID"));
            p.setInt(2, this.getEmpID());
            p.setInt(3, this.getRateID());
            p.setInt(4, this.getHour());
            p.setInt(5, this.getMinute());
            p.setDouble(6, this.getAmount());
            p.setString(7, df.format(this.getOvertimeDate()));
            p.setString(8, df.format(new Date()));
            p.setInt(9, userLoginID);
            p.setBoolean(10, this.isMgrApprove());
            p.setBoolean(11, this.isHrApprove());
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
            if (SalaryCalc.getPayrollStatus(this.getEmpID()) == 0) {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String update = "Update tbl_Overtime set EmpID=?, CategoryOTID=?, Hours=?, Minute=?, OTAmount=?, WorkDate=?, CreateDate=?, CreateBy=?, MgrApprove=?, HRApprove=? where OvertimeID=?";
                PreparedStatement p = c.prepareStatement(update);
                p.setInt(1, this.getEmpID());
                p.setInt(2, this.getRateID());
                p.setInt(3, this.getHour());
                p.setInt(4, this.getMinute());
                p.setDouble(5, this.getAmount());
                p.setString(6, df.format(this.getOvertimeDate()));
                p.setString(7, df.format(new Date()));
                p.setInt(8, userLoginID);
                p.setBoolean(9, this.isMgrApprove());
                p.setBoolean(10, this.isHrApprove());
                p.setInt(11, this.getOvertimeID());
                p.executeUpdate();
                p.close();
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void load(JTable table, DefaultTableModel model) {
        try {
            ManageTable.clearTable(table, model);
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            DecimalFormat df = new DecimalFormat("#,##0");
            String query = "SELECT dbo.tbl_Overtime.OvertimeID, dbo.tbl_Overtime.WorkDate, \n"
                    + "dbo.tbl_Overtime.Hours, dbo.tbl_Overtime.Minute, \n"
                    + "dbo.tbl_OTCategory.Late_MN_Hour, dbo.tbl_Overtime.OTAmount, dbo.tbl_Overtime.MgrApprove, dbo.tbl_Overtime.HRApprove\n"
                    + "FROM dbo.tbl_Overtime INNER JOIN\n"
                    + "dbo.tbl_OTCategory ON dbo.tbl_Overtime.CategoryOTID = dbo.tbl_OTCategory.CategoryOTID\n"
                    + "where dbo.tbl_Overtime.EmpID=" + this.getEmpID() + " and (dbo.tbl_Overtime.WorkDate between '" + SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()) + "' and '" + SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()) + "')";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("OvertimeID");
                Date date = rs.getDate("WorkDate");
                int hrs = rs.getInt("Hours");
                int mnt = rs.getInt("Minute");
                float mtp = rs.getFloat("Late_MN_Hour");
                double total = rs.getDouble("OTAmount");
                Boolean mgr = rs.getBoolean("MgrApprove");
                Boolean hr = rs.getBoolean("HRApprove");
                Object[] obj = new Object[]{id, sf.format(date), hrs, mnt, mtp, df.format(total), mgr, hr};
                model.addRow(obj);
            }
            table.setModel(model);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean delete() {
        try {
            if (SalaryCalc.getPayrollStatus(this.getEmpID()) == 0) {
                String delete = "Delete tbl_Overtime where OvertimeID=?";
                PreparedStatement p = c.prepareStatement(delete);
                p.setInt(1, this.getOvertimeID());
                p.executeUpdate();
                p.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkRate() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String query = "Select * from tbl_Overtime where EmpID=" + this.getEmpID() + " and WorkDate='" + df.format(this.getOvertimeDate()) + "' and CategoryOTID=" + this.getRateID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
