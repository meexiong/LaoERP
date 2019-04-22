
package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Province {
    int provinceID;
    String provinceName_L1;
    String provinceName_L2;

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvinceName_L1() {
        return provinceName_L1;
    }

    public void setProvinceName_L1(String provinceName_L1) {
        this.provinceName_L1 = provinceName_L1;
    }

    public String getProvinceName_L2() {
        return provinceName_L2;
    }

    public void setProvinceName_L2(String provinceName_L2) {
        this.provinceName_L2 = provinceName_L2;
    }
    
    public boolean insert(){
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g  = new GenerateID();
            String insert = "Insert into tbl_Province(Pro_ID, Pro_Name_L1, Pro_Name_L2)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Province", "Pro_ID"));
            p.setString(2, this.getProvinceName_L1());
            p.setString(3, this.getProvinceName_L2());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update(){
        try {
            Connection c = DatabaseManager.getConnection();
            String update = "Update tbl_Province set Pro_Name_L1=?, Pro_Name_L2=? where Pro_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getProvinceName_L1());
            p.setString(2, this.getProvinceName_L2());
            p.setInt(3, this.getProvinceID());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete(){
        try {
            Connection c = DatabaseManager.getConnection();
            String delete = "Delete tbl_Province where Pro_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getProvinceID());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void load(JTable table, DefaultTableModel model){
        try {
            ManageTable.clearTable(table, model);
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Province";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("Pro_ID");
                String name1 = rs.getString("Pro_Name_L1");
                String name2 = rs.getString("Pro_Name_L2");
                Object[] obj = new Object[]{id, name1, name2};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
