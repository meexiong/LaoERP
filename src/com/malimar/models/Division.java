package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import static com.malimar.utils.Valiables.langType;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Division {

    int divisionID;
    int sortBy;
    String division_L1;
    String division_L2;
    int bankID;
    String bankName;
    String logoPath;

    public int getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }

    public String getDivision_L1() {
        return division_L1;
    }

    public void setDivision_L1(String division_L1) {
        this.division_L1 = division_L1;
    }

    public String getDivision_L2() {
        return division_L2;
    }

    public void setDivision_L2(String division_L2) {
        this.division_L2 = division_L2;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public HashMap<String, Object[]> getBankInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Banking";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Bank_Name_" + langType + ""), new Object[]{rs.getInt("Bank_ID"), rs.getString("Bank_Name_L1"), rs.getString("Bank_Name_L2")});
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
            String insert = "Insert into tbl_Division(DID, Division_L1, Division_L2, Bank_ID, Di_Img, SortOrder) values(?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("Tbl_Division", "DID"));
            p.setString(2, this.getDivision_L1());
            p.setString(3, this.getDivision_L2());
            p.setInt(4, this.getBankID());
            if (this.getLogoPath() != null) {
                File ff = new File(this.getLogoPath());
                FileInputStream fis = new FileInputStream(ff);
                int len = (int) ff.length();
                p.setBinaryStream(5, fis, len);
            } else {
                p.setNull(5, java.sql.Types.BLOB);
            }
            p.setInt(6, this.getSortBy());
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
            String update = "Update tbl_Division set Division_L1=?, Division_L2=?, Bank_ID=?, SortOrder=? where DID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getDivision_L1());
            p.setString(2, this.getDivision_L2());
            p.setInt(3, this.getBankID());
            p.setInt(4, this.getSortBy());
            p.setInt(5, this.getDivisionID());
            if (p.executeUpdate() != -1) {
                if (this.getLogoPath() != null) {
                    String updateImage = "Update tbl_Division set Di_Img=? where DID=?";
                    PreparedStatement p1 = c.prepareStatement(updateImage);
                    File ff = new File(this.getLogoPath());
                    FileInputStream fis = new FileInputStream(ff);
                    int len = (int) ff.length();
                    p1.setBinaryStream(1, fis, len);
                    p1.setInt(2, this.getDivisionID());
                    p1.executeUpdate();
                    p1.close();
                }
            }
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
            String update = "Delete tbl_Division where DID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getDivisionID());
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
            String query = "SELECT dbo.Tbl_Division.DID,dbo.Tbl_Division.SortOrder, dbo.Tbl_Division.Division_L1, \n" +
            "dbo.Tbl_Division.Division_L2, dbo.Tbl_Banking.Bank_Name_"+langType+" as bankname\n" +
            "FROM dbo.Tbl_Division INNER JOIN\n" +
            "dbo.Tbl_Banking ON dbo.Tbl_Division.Bank_ID = dbo.Tbl_Banking.Bank_ID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("DID");
                int sortby = rs.getInt("SortOrder");
                String dv1 = rs.getString("Division_L1");
                String dv2 = rs.getString("Division_L2");
                String bank = rs.getString("bankname");
                Object[] obj = new Object[]{id, sortby, dv1, dv2, bank};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public byte[] getLogoImage(){
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "Select Di_img from tbl_Division where DID="+this.getDivisionID()+"";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                return rs.getBytes("Di_img");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
