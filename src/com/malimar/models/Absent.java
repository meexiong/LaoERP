package com.malimar.models;

import com.malimar.utils.GetMaxID;
import com.malimar.utils.Valiables;
import static com.malimar.utils.Valiables.c;
import static com.malimar.utils.Valiables.userLoginID;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

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

    public HashMap<String, Object[]> getEmpStatusCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_EmpStatus";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Emp_Status_" + Valiables.langType + ""), new Object[]{rs.getInt("EMPSTID"), rs.getString("Emp_Status_L1"), rs.getString("Emp_Status_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }
    
    public boolean insert() {
        try {
            GetMaxID gm = new GetMaxID();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String insert = "Insert into tbl_Absent(AbsentID, EmpID, CAbsentID, Hours, Minute, AbsentDate, CreateDate, CreateBy, MgrApprove, HRApprove, RID)values(?,?,?,?,?,?,?,?,?,?,?)";
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
            String insert = "Update tbl_Absent set EmpID=?, CAbsentID=?, Hours=?, Minute=?, AbsentDate=?, CreateBy=?, MgrApprove=?, HRApprove=?, RID=? where AbsentID=?";
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

}
