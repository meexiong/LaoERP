package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static com.malimar.utils.Valiables.langType;
import java.util.HashMap;

public class Title {

    int titleID;
    String titleName_L1;
    String titleName_L2;
    int jobDutiesID;
    String jobDutiesName;

    public int getTitleID() {
        return titleID;
    }

    public void setTitleID(int titleID) {
        this.titleID = titleID;
    }

    public String getTitleName_L1() {
        return titleName_L1;
    }

    public void setTitleName_L1(String titleName_L1) {
        this.titleName_L1 = titleName_L1;
    }

    public String getTitleName_L2() {
        return titleName_L2;
    }

    public void setTitleName_L2(String titleName_L2) {
        this.titleName_L2 = titleName_L2;
    }

    public int getJobDutiesID() {
        return jobDutiesID;
    }

    public void setJobDutiesID(int jobDutiesID) {
        this.jobDutiesID = jobDutiesID;
    }

    public String getJobDutiesName() {
        return jobDutiesName;
    }

    public void setJobDutiesName(String jobDutiesName) {
        this.jobDutiesName = jobDutiesName;
    }

    public HashMap<String, Object[]> getJobInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_JFunction";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("JFPosition_" + langType + "").trim(), new Object[]{rs.getInt("JFID"), rs.getString("JFPosition_L1").trim(), rs.getString("JFPosition_L2").trim(),});
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
            String insert = "Insert into tbl_Title(Title_ID, Title_name_L1, Title_name_L2, JFID)values(?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Title", "Title_ID"));
            p.setString(2, this.getTitleName_L1());
            p.setString(3, this.getTitleName_L2());
            p.setInt(4, this.getJobDutiesID());
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
            String update = "Update tbl_Title set Title_name_L1=?, Title_name_L2=?, JFID=? where Title_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getTitleName_L1());
            p.setString(2, this.getTitleName_L2());
            p.setInt(3, this.getJobDutiesID());
            p.setInt(4, this.getTitleID());
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
            String delete = "delete tbl_Title where Title_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getTitleID());
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
            String query = "SELECT dbo.Tbl_Title.Title_ID, dbo.Tbl_Title.Title_name_L1, \n"
                    + "dbo.Tbl_Title.Title_name_L2, dbo.tbl_JFunction.JFPosition_" + langType + " as jname\n"
                    + "FROM dbo.tbl_JFunction INNER JOIN\n"
                    + "dbo.Tbl_Title ON dbo.tbl_JFunction.JFID = dbo.Tbl_Title.JFID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Title_ID");
                String name1 = rs.getString("Title_name_L1");
                String name2 = rs.getString("Title_name_L2");
                String job = rs.getString("jname");
                Object[] obj = new Object[]{id, name1, name2, job};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
