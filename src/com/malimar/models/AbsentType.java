
package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import static com.malimar.utils.Variable.c;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AbsentType {
    int absentTypeID;
    String absentType_L1;
    String absentType_L2;

    public int getAbsentTypeID() {
        return absentTypeID;
    }

    public void setAbsentTypeID(int absentTypeID) {
        this.absentTypeID = absentTypeID;
    }

    public String getAbsentType_L1() {
        return absentType_L1;
    }

    public void setAbsentType_L1(String absentType_L1) {
        this.absentType_L1 = absentType_L1;
    }

    public String getAbsentType_L2() {
        return absentType_L2;
    }

    public void setAbsentType_L2(String absentType_L2) {
        this.absentType_L2 = absentType_L2;
    }
    
    public boolean insert() {
        try {
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Absent_category(CAbsentID, Absent_L1, Absent_L2)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Absent_category", "CAbsentID"));
            p.setString(2, this.getAbsentType_L1());
            p.setString(3, this.getAbsentType_L2());
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
            String insert = "Update tbl_Absent_category set Absent_L1=?, Absent_L2=? where CAbsentID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setString(1, this.getAbsentType_L1());
            p.setString(2, this.getAbsentType_L2());
            p.setInt(3, this.getAbsentTypeID());
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
            String insert = "delete tbl_Absent_category where CAbsentID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, this.getAbsentTypeID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void load(JTable table, DefaultTableModel model){
        try {
            ManageTable.clearTable(table, model);
            String query = "Select * from tbl_Absent_category";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("CAbsentID");
                String name1 = rs.getString("Absent_L1");
                String name2 = rs.getString("Absent_L2");
                Object[] obj = new Object[]{id, name1, name2};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
