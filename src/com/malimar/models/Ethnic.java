package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ethnic {

    int ethnicID;
    String ethnicName_L1;
    String ethnicName_L2;

    public int getEthnicID() {
        return ethnicID;
    }

    public void setEthnicID(int ethnicID) {
        this.ethnicID = ethnicID;
    }

    public String getEthnicName_L1() {
        return ethnicName_L1;
    }

    public void setEthnicName_L1(String ethnicName_L1) {
        this.ethnicName_L1 = ethnicName_L1;
    }

    public String getEthnicName_L2() {
        return ethnicName_L2;
    }

    public void setEthnicName_L2(String ethnicName_L2) {
        this.ethnicName_L2 = ethnicName_L2;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Ethnic(EthnicID, Ethnic_L1, Ethnic_L2)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Ethnic", "EthnicID"));
            p.setString(2, this.getEthnicName_L1());
            p.setString(3, this.getEthnicName_L2());
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
            String update = "Update tbl_Ethnic set Ethnic_L1=?, Ethnic_L2=? where EthnicID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getEthnicName_L1());
            p.setString(2, this.getEthnicName_L2());
            p.setInt(3, this.getEthnicID());
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
            String delete = "Delete tbl_Ethnic where EthnicID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getEthnicID());
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
            String query = "Select * from tbl_Ethnic";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("EthnicID");
                String name1 = rs.getString("Ethnic_L1");
                String name2 = rs.getString("Ethnic_L2");
                Object[] obj = new Object[]{id, name1, name2};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
