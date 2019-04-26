package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkStatus {

    int workStatusID;
    String workStatus_L1;
    String workStatus_L2;
    int hour;

    public int getWorkStatusID() {
        return workStatusID;
    }

    public void setWorkStatusID(int workStatusID) {
        this.workStatusID = workStatusID;
    }

    public String getWorkStatus_L1() {
        return workStatus_L1;
    }

    public void setWorkStatus_L1(String workStatus_L1) {
        this.workStatus_L1 = workStatus_L1;
    }

    public String getWorkStatus_L2() {
        return workStatus_L2;
    }

    public void setWorkStatus_L2(String workStatus_L2) {
        this.workStatus_L2 = workStatus_L2;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean insert() {
        try {
            GenerateID g = new GenerateID();
            Connection c = DatabaseManager.getConnection();
            String insert = "Insert into tbl_Work_Status(Work_Status_ID, Work_Type_L1, Work_Type_L2, Hour)values(?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Work_Status", "Work_Status_ID"));
            p.setString(2, this.getWorkStatus_L1());
            p.setString(3, this.getWorkStatus_L2());
            p.setInt(4, this.getHour());
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
            String update = "Update tbl_Work_Status set Work_Type_L1=?, Work_Type_L2=?, Hour=? where Work_Status_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getWorkStatus_L1());
            p.setString(2, this.getWorkStatus_L2());
            p.setInt(3, this.getHour());
            p.setInt(4, this.getWorkStatusID());
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
            String update = "delete tbl_Work_Status where Work_Status_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getWorkStatusID());
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
            String query = "Select * from Tbl_Work_Status";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Work_Status_ID");
                String w1 = rs.getString("Work_Type_L1");
                String w2 = rs.getString("Work_Type_L2");
                int h = rs.getInt("Hour");
                Object[] obj = new Object[]{id, w1, w2, h};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
