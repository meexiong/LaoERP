
package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OvertimeType {
    int overtimeTypeID;
    String overtimeType_L1;
    String overtimeType_L2;
    float overtimeRate;

    public int getOvertimeTypeID() {
        return overtimeTypeID;
    }

    public void setOvertimeTypeID(int overtimeTypeID) {
        this.overtimeTypeID = overtimeTypeID;
    }

    public String getOvertimeType_L1() {
        return overtimeType_L1;
    }

    public void setOvertimeType_L1(String overtimeType_L1) {
        this.overtimeType_L1 = overtimeType_L1;
    }

    public String getOvertimeType_L2() {
        return overtimeType_L2;
    }

    public void setOvertimeType_L2(String overtimeType_L2) {
        this.overtimeType_L2 = overtimeType_L2;
    }

    public float getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(float overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    
    public boolean insert() {
        try {
            GenerateID g = new GenerateID();
            Connection c = DatabaseManager.getConnection();
            String insert = "Insert into tbl_OTCategory(CategoryOTID, CateName_L1, CateName_L2, Late_MN_Hour)values(?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_OTCategory", "CategoryOTID"));
            p.setString(2, this.getOvertimeType_L1());
            p.setString(3, this.getOvertimeType_L2());
            p.setFloat(4, this.getOvertimeRate());
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
            String update = "update tbl_OTCategory set CateName_L1=?, CateName_L2=?, Late_MN_Hour=? where CategoryOTID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getOvertimeType_L1());
            p.setString(2, this.getOvertimeType_L2());
            p.setFloat(3, this.getOvertimeRate());
            p.setInt(4, this.getOvertimeTypeID());
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
            String delete = "delete tbl_OTCategory where CategoryOTID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getOvertimeTypeID());
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
            String query = "Select * from tbl_OTCategory";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("CategoryOTID");
                String c1 = rs.getString("CateName_L1");
                String c2 = rs.getString("CateName_L2");
                int h = rs.getInt("Late_MN_Hour");
                Object[] obj = new Object[]{id, c1, c2, h};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
