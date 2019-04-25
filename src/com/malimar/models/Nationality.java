package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Nationality {

    int nationID;
    String nation_L1;
    String nation_L2;

    public int getNationID() {
        return nationID;
    }

    public void setNationID(int nationID) {
        this.nationID = nationID;
    }

    public String getNation_L1() {
        return nation_L1;
    }

    public void setNation_L1(String nation_L1) {
        this.nation_L1 = nation_L1;
    }

    public String getNation_L2() {
        return nation_L2;
    }

    public void setNation_L2(String nation_L2) {
        this.nation_L2 = nation_L2;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Nationality(NationID, Nation_L1, Nation_L2)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Nationality", "NationID"));
            p.setString(2, this.getNation_L1());
            p.setString(3, this.getNation_L2());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update() {
        try {
            Connection c = DatabaseManager.getConnection();
            String insert = "Update tbl_Nationality set Nation_L1=?, Nation_L2=? where NationID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setString(1, this.getNation_L1());
            p.setString(2, this.getNation_L2());
            p.setInt(3, this.getNationID());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            Connection c = DatabaseManager.getConnection();
            String insert = "delete tbl_Nationality where NationID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, this.getNationID());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void load(JTable table, DefaultTableModel model){
        try {
            ManageTable.clearTable(table, model);
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Nationality";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("NationID");
                String name1 = rs.getString("Nation_L1");
                String name2 = rs.getString("Nation_L2");
                Object[] obj = new Object[]{id, name1, name2};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
