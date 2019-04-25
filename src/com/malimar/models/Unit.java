package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Unit {

    int unitID;
    String unitName_L1;
    String unitName_L2;
    int unitSortby;

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public String getUnitName_L1() {
        return unitName_L1;
    }

    public void setUnitName_L1(String unitName_L1) {
        this.unitName_L1 = unitName_L1;
    }

    public String getUnitName_L2() {
        return unitName_L2;
    }

    public void setUnitName_L2(String unitName_L2) {
        this.unitName_L2 = unitName_L2;
    }

    public int getUnitSortby() {
        return unitSortby;
    }

    public void setUnitSortby(int unitSortby) {
        this.unitSortby = unitSortby;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_WorkUnit(UnitID, UnitName_L1, UnitName_L2, UnitSortID)values(?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_WorkUnit", "UnitID"));
            p.setString(2, this.getUnitName_L1());
            p.setString(3, this.getUnitName_L2());
            p.setInt(4, this.getUnitSortby());
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
            String update = "update tbl_WorkUnit set UnitName_L1=?, UnitName_L2=?, UnitSortID=? where UnitID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getUnitName_L1());
            p.setString(2, this.getUnitName_L2());
            p.setInt(3, this.getUnitSortby());
            p.setInt(4, this.getUnitID());
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
            String update = "delete tbl_WorkUnit where UnitID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getUnitID());
            p.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void load(JTable table, DefaultTableModel model){
        try {
            Connection c = DatabaseManager.getConnection();
            ManageTable.clearTable(table, model);
            String query = "Select * from tbl_WorkUnit";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("UnitID");
                String unitName1 = rs.getString("UnitName_L1");
                String unitName2 = rs.getString("UnitName_L2");
                int sortby = rs.getInt("UnitSortID");
                Object[] obj = new Object[]{id, sortby, unitName1, unitName2};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
