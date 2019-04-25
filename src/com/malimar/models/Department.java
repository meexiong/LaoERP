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

public class Department {

    int departmentID;
    String departmentName_L1;
    String departmentName_L2;
    int locationID;
    String locationName;
    int sortBy;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName_L1() {
        return departmentName_L1;
    }

    public void setDepartmentName_L1(String departmentName_L1) {
        this.departmentName_L1 = departmentName_L1;
    }

    public String getDepartmentName_L2() {
        return departmentName_L2;
    }

    public void setDepartmentName_L2(String departmentName_L2) {
        this.departmentName_L2 = departmentName_L2;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }

    public HashMap<String, Object[]> getLocationInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Location";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Loc_name_" + langType + ""), new Object[]{rs.getInt("Loc_ID"), rs.getString("Loc_name_L1"), rs.getString("Loc_name_L2")});
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
            String insert = "Insert into tbl_Depart(Dept_ID, Loc_ID, Dept_Name_L1, Dept_Name_L2, DSortOrder) values(?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("Tbl_Depart", "Dept_ID"));
            p.setInt(2, this.getLocationID());
            p.setString(3, this.getDepartmentName_L1());
            p.setString(4, this.getDepartmentName_L2());
            p.setInt(5, this.getSortBy());
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
            String update = "update tbl_Depart set Loc_ID=?, Dept_Name_L1=?, Dept_Name_L2=?, DSortOrder=? where Dept_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getLocationID());
            p.setString(2, this.getDepartmentName_L1());
            p.setString(3, this.getDepartmentName_L2());
            p.setInt(4, this.getSortBy());
            p.setInt(5, this.getDepartmentID());
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
            String delete = "delete tbl_Depart where Dept_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getDepartmentID());
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
            String query = "SELECT dbo.Tbl_Depart.Dept_ID, dbo.Tbl_Depart.DSortOrder, \n" +
            "dbo.Tbl_Location.Loc_name_"+langType+" as locname, dbo.Tbl_Depart.Dept_Name_L1, \n" +
            "dbo.Tbl_Depart.Dept_Name_L2\n" +
            "FROM  dbo.Tbl_Depart INNER JOIN\n" +
            "dbo.Tbl_Location ON dbo.Tbl_Depart.Loc_ID = dbo.Tbl_Location.Loc_ID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Dept_ID");
                int sortby = rs.getInt("DSortOrder");
                String d1 = rs.getString("Dept_Name_L1");
                String d2 = rs.getString("Dept_Name_L2");
                String loc = rs.getString("locname");
                Object[] obj = new Object[]{id, sortby, d1, d2, loc};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
