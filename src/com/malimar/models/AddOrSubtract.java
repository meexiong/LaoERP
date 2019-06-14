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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddOrSubtract {

    int asID;
    Date asDate;
    double amount;
    String asNote;
    boolean tax;
    int empID;
    int column;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public boolean isTax() {
        return tax;
    }

    public void setTax(boolean tax) {
        this.tax = tax;
    }

    public int getAsID() {
        return asID;
    }

    public void setAsID(int asID) {
        this.asID = asID;
    }

    public Date getAsDate() {
        return asDate;
    }

    public void setAsDate(Date asDate) {
        this.asDate = asDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAsNote() {
        return asNote;
    }

    public void setAsNote(String asNote) {
        this.asNote = asNote;
    }

    public boolean insert() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into tbl_AddOrSubtract(ASID, ASDate, Amount, ASNote, Tax, CreateBy, EmpID)values(?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("tbl_AddOrSubtract", "ASID"));
            p.setString(2, df.format(this.getAsDate()));
            p.setDouble(3, this.getAmount());
            p.setString(4, this.getAsNote());
            p.setBoolean(5, this.isTax());
            p.setInt(6, userLoginID);
            p.setInt(7, this.getEmpID());
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
            String update = "Update tbl_AddOrSubtract set ASDate=?, Amount=?, ASNote=?, Tax=?, CreateBy=?, EmpID=? where ASID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, df.format(this.getAsDate()));
            p.setDouble(2, this.getAmount());
            p.setString(3, this.getAsNote());
            p.setBoolean(4, this.isTax());
            p.setInt(5, userLoginID);
            p.setInt(6, this.getEmpID());
            p.setInt(7, this.getAsID());
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
            String delete = "Delete tbl_AddOrSubtract where ASID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getAsID());
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
            String t;
            if (this.getColumn() == 10) {
                t = "1";
            } else {
                t = "0";
            }
            String query = "Select * from tbl_AddOrSubtract where (Tax=" + t + ") and (ASDate Between '" + SalaryCalc.convertDate(SalaryCalc.getPayrollStartDate()) + "' and '" + SalaryCalc.convertDate(SalaryCalc.getPayrollEndDate()) + "') and empID=" + this.getEmpID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int asid = rs.getInt(1);
                Date date = rs.getDate(2);
                double amt = rs.getDouble(3);
                String note = rs.getString(4);
                Boolean tx = rs.getBoolean(5);
                Object[] obj = new Object[]{asid, sf.format(date), df.format(amt), tx, note};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
