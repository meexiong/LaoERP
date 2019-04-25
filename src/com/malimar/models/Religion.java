
package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Religion {
    int religionID;
    String religionName_L1;
    String religionName_L2;

    public int getReligionID() {
        return religionID;
    }

    public void setReligionID(int religionID) {
        this.religionID = religionID;
    }

    public String getReligionName_L1() {
        return religionName_L1;
    }

    public void setReligionName_L1(String religionName_L1) {
        this.religionName_L1 = religionName_L1;
    }

    public String getReligionName_L2() {
        return religionName_L2;
    }

    public void setReligionName_L2(String religionName_L2) {
        this.religionName_L2 = religionName_L2;
    }
    
    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Region(RegionID, Region_L1, Region_L2)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Region", "RegionID"));
            p.setString(2, this.getReligionName_L1());
            p.setString(3, this.getReligionName_L2());
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
            String update = "Update tbl_Region set Region_L1=?, Region_L2=? where RegionID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getReligionName_L1());
            p.setString(2, this.getReligionName_L2());
            p.setInt(3, this.getReligionID());
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
            String delete = "Delete tbl_Region where RegionID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getReligionID());
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
            String query = "Select * from tbl_Region";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("RegionID");
                String name1 = rs.getString("Region_L1");
                String name2 = rs.getString("Region_L2");
                Object[] obj = new Object[]{id, name1, name2};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
