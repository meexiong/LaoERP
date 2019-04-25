package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JobDuties {

    int jobDutiesID;
    String jobDuties_L1;
    String jobDuties_L2;

    public int getJobDutiesID() {
        return jobDutiesID;
    }

    public void setJobDutiesID(int jobDutiesID) {
        this.jobDutiesID = jobDutiesID;
    }

    public String getJobDuties_L1() {
        return jobDuties_L1;
    }

    public void setJobDuties_L1(String jobDuties_L1) {
        this.jobDuties_L1 = jobDuties_L1;
    }

    public String getJobDuties_L2() {
        return jobDuties_L2;
    }

    public void setJobDuties_L2(String jobDuties_L2) {
        this.jobDuties_L2 = jobDuties_L2;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_JFunction(JFID, JFPosition_L1, JFPosition_L2)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_JFunction", "JFID"));
            p.setString(2, this.getJobDuties_L1());
            p.setString(3, this.getJobDuties_L2());
            p.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update() {
        try {
            Connection c = DatabaseManager.getConnection();
            String insert = "update tbl_JFunction set JFPosition_L1=?, JFPosition_L2=? where JFID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setString(1, this.getJobDuties_L1());
            p.setString(2, this.getJobDuties_L2());
            p.setInt(3, this.getJobDutiesID());
            p.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            Connection c = DatabaseManager.getConnection();
            String insert = "delete tbl_JFunction where JFID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, this.getJobDutiesID());
            p.executeUpdate();
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
            String query = "Select * from tbl_JFunction";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("JFID");
                String name1 = rs.getString("JFPosition_L1");
                String name2 = rs.getString("JFPosition_L2");
                Object[] job = new Object[]{id, name1, name2};
                model.addRow(job);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
