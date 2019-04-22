package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import static com.malimar.utils.Valiables.langType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class District {

    int districtID;
    String districtName_L1;
    String districtName_L2;
    int provinceID;
    String provinceName;

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName_L1() {
        return districtName_L1;
    }

    public void setDistrictName_L1(String districtName_L1) {
        this.districtName_L1 = districtName_L1;
    }

    public String getDistrictName_L2() {
        return districtName_L2;
    }

    public void setDistrictName_L2(String districtName_L2) {
        this.districtName_L2 = districtName_L2;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public HashMap<String, Object[]> getProvinceInfo() {
        try {
            Connection c = DatabaseManager.getConnection();
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_Province";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Pro_Name_" + langType + ""), new Object[]{rs.getInt("Pro_ID"), rs.getString("Pro_Name_L1"), rs.getString("Pro_Name_L2")});
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
            String insert = "Insert into tbl_District(Dist_ID, Pro_ID, Dist_Name_L1, Dist_Name_L2) values(?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("Tbl_District", "Dist_ID"));
            p.setInt(2, this.getProvinceID());
            p.setString(3, this.getDistrictName_L1());
            p.setString(4, this.getDistrictName_L2());
            p.executeUpdate();
            p.close();
            c.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update(){
        try {
            Connection c = DatabaseManager.getConnection();
            String update = "update tbl_District set Pro_ID=?, Dist_Name_L1=?, Dist_Name_L2=? where Dist_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getProvinceID());
            p.setString(2, this.getDistrictName_L1());
            p.setString(3, this.getDistrictName_L2());
            p.setInt(4, this.getDistrictID());
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
            String update = "Delete tbl_District where Dist_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getDistrictID());
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
            String query = "SELECT dbo.Tbl_District.Dist_ID, dbo.Tbl_District.Dist_Name_L1, \n" +
            "dbo.Tbl_District.Dist_Name_L2, dbo.Tbl_Province.Pro_Name_"+langType+" as proname\n" +
            "FROM dbo.Tbl_Province INNER JOIN\n" +
            "dbo.Tbl_District ON dbo.Tbl_Province.Pro_ID = dbo.Tbl_District.Pro_ID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("Dist_ID");
                String name1 = rs.getString("Dist_Name_L1");
                String name2 = rs.getString("Dist_Name_L2");
                String pro = rs.getString("proname");
                Object[] obj = new Object[]{id, name1, name2, pro};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
