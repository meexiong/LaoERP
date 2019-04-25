package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import static com.malimar.utils.Valiables.langType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Bank {

    int bankID;
    String bankName_L1;
    String bankName_L2;
    int districtID;
    String districtName;
    String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName_L1() {
        return bankName_L1;
    }

    public void setBankName_L1(String bankName_L1) {
        this.bankName_L1 = bankName_L1;
    }

    public String getBankName_L2() {
        return bankName_L2;
    }

    public void setBankName_L2(String bankName_L2) {
        this.bankName_L2 = bankName_L2;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public HashMap<String, Object[]> getDistrictInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_District";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Dist_Name_" + langType + ""), new Object[]{rs.getInt("Dist_ID"), rs.getString("Dist_Name_L1"), rs.getString("Dist_Name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Banking(Bank_ID, Bank_Name_L1, Bank_Name_L2, Bank_Info, Dist_ID)values(?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Banking", "Bank_ID"));
            p.setString(2, this.getBankName_L1());
            p.setString(3, this.getBankName_L2());
            p.setString(4, this.getDetails());
            p.setInt(5, this.getDistrictID());
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
            String update = "Update tbl_Banking set Bank_Name_L1=?, Bank_Name_L2=?, Bank_info=?, Dist_ID=? where Bank_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getBankName_L1());
            p.setString(2, this.getBankName_L2());
            p.setString(3, this.getDetails());
            p.setInt(4, this.getDistrictID());
            p.setInt(5, this.getBankID());
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
            String delete = "Delete tbl_Banking where Bank_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getBankID());
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
            Connection c = DatabaseManager.getConnection();
            ManageTable.clearTable(table, model);
            String query = "SELECT dbo.Tbl_Banking.Bank_ID, dbo.Tbl_Banking.Bank_Name_L1, \n"
                    + "dbo.Tbl_Banking.Bank_Name_L2, dbo.Tbl_Banking.Bank_info, \n"
                    + "dbo.Tbl_District.Dist_Name_" + langType + " as districtName\n"
                    + "FROM dbo.Tbl_Banking INNER JOIN\n"
                    + "dbo.Tbl_District ON dbo.Tbl_Banking.Dist_ID = dbo.Tbl_District.Dist_ID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Bank_ID");
                String name1 = rs.getString("Bank_Name_L1");
                String name2 = rs.getString("Bank_Name_L2");
                String details1 = rs.getString("Bank_info");
                String district = rs.getString("districtName");
                Object[] obj = new Object[]{id, name1, name2, details1, district};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
