package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SalaryType {

    int salaryTypeID;
    String salaryType_L1;
    String salaryType_L2;
    double amount;
    boolean active;

    public int getSalaryTypeID() {
        return salaryTypeID;
    }

    public void setSalaryTypeID(int salaryTypeID) {
        this.salaryTypeID = salaryTypeID;
    }

    public String getSalaryType_L1() {
        return salaryType_L1;
    }

    public void setSalaryType_L1(String salaryType_L1) {
        this.salaryType_L1 = salaryType_L1;
    }

    public String getSalaryType_L2() {
        return salaryType_L2;
    }

    public void setSalaryType_L2(String salaryType_L2) {
        this.salaryType_L2 = salaryType_L2;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_SalaryType(SalT_ID, SalT_Name_L1, SalT_Name_L2, SalT_Amt, SalT_Active)values(?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_SalaryType", "SalT_ID"));
            p.setString(2, this.getSalaryType_L1());
            p.setString(3, this.getSalaryType_L2());
            p.setDouble(4, this.getAmount());
            p.setBoolean(5, this.isActive());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update() {
        try {
            Connection c = DatabaseManager.getConnection();
            String update = "Update tbl_SalaryType set SalT_Name_L1=?, SalT_Name_L2=?, SalT_Amt=?, SalT_Active=? where SalT_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getSalaryType_L1());
            p.setString(2, this.getSalaryType_L2());
            p.setDouble(3, this.getAmount());
            p.setBoolean(4, this.isActive());
            p.setInt(5, this.getSalaryTypeID());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            Connection c = DatabaseManager.getConnection();
            String delete = "Delete tbl_SalaryType where SalT_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getSalaryTypeID());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void load(JTable table, DefaultTableModel model) {
        try {
            ManageTable.clearTable(table, model);
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_SalaryType";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("SalT_ID");
                String salary1 = rs.getString("SalT_Name_L2");
                String salary2 = rs.getString("SalT_Name_L2");
                double ma = rs.getDouble("SalT_Amt");
                Boolean at = rs.getBoolean("SalT_Active");
                Object[] obj = new Object[]{id, salary1, salary2, ma, at};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
