package com.malimar.models;

import com.malimar.utils.GetMaxID;
import com.malimar.utils.ManageTable;
import com.malimar.utils.Variable;
import static com.malimar.utils.Variable.c;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpHourly {

    int hrsID;
    int empID;
    Date hrsDate;
    double hrsAmount;
    int hrs;
    int mnt;
    double total;
    boolean mgr;
    boolean hr;

    public int getHrsID() {
        return hrsID;
    }

    public void setHrsID(int hrsID) {
        this.hrsID = hrsID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Date getHrsDate() {
        return hrsDate;
    }

    public void setHrsDate(Date hrsDate) {
        this.hrsDate = hrsDate;
    }

    public double getHrsAmount() {
        return hrsAmount;
    }

    public void setHrsAmount(double hrsAmount) {
        this.hrsAmount = hrsAmount;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public int getMnt() {
        return mnt;
    }

    public void setMnt(int mnt) {
        this.mnt = mnt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isMgr() {
        return mgr;
    }

    public void setMgr(boolean mgr) {
        this.mgr = mgr;
    }

    public boolean isHr() {
        return hr;
    }

    public void setHr(boolean hr) {
        this.hr = hr;
    }

    public boolean insert() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into tbl_EmpHourly(HourlyID, EmpID, HrsDate, HrsAmount, Hrs, Mnt, Total, Mgr, HR, CreateBy)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("tbl_EmpHourly", "HourlyID"));
            p.setInt(2, this.getEmpID());
            p.setString(3, df.format(this.getHrsDate()));
            p.setDouble(4, this.getHrsAmount());
            p.setInt(5, this.getHrs());
            p.setInt(6, this.getMnt());
            p.setDouble(7, this.getTotal());
            p.setBoolean(8, this.isMgr());
            p.setBoolean(9, this.isHr());
            p.setInt(10, Variable.userLoginID);
            p.executeUpdate();
            p.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String update = "Update tbl_EmpHourly set EmpID=?, HrsDate=?, HrsAmount=?, Hrs=?, Mnt=?, Total=?, Mgr=?, HR=?, CreateBy=? where HourlyID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getEmpID());
            p.setString(2, df.format(this.getHrsDate()));
            p.setDouble(3, this.getHrsAmount());
            p.setInt(4, this.getHrs());
            p.setInt(5, this.getMnt());
            p.setDouble(6, this.getTotal());
            p.setBoolean(7, this.isMgr());
            p.setBoolean(8, this.isHr());
            p.setInt(9, Variable.userLoginID);
            p.setInt(10, this.getHrsID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            String delete = "Delete tbl_EmpHourly where HourlyID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getHrsID());
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
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            DecimalFormat df = new DecimalFormat("#,##0");
            ManageTable.clearTable(table, model);
            String query = "Select * from tbl_EmpHourly where EmpID=" + this.getEmpID() + " and (HrsDate between '" + Variable.bomG + "' and '" + Variable.eomG + "') and HR=1";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("HourlyID");
                Date date = rs.getDate("HrsDate");
                double ram = rs.getDouble("HrsAmount");
                int hor = rs.getInt("Hrs");
                int mn = rs.getInt("Mnt");
                double tt = rs.getDouble("Total");
                Boolean mg = rs.getBoolean("Mgr");
                Boolean h = rs.getBoolean("HR");
                Object[] obj = new Object[]{id, sf.format(date), df.format(ram), hor, mn, df.format(tt), mg, h};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
