package com.malimar.models;

import static com.malimar.utils.Variable.c;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Company {

    int compayID;
    String compayName_L1;
    String compayName_L2;
    String telephone;
    String fax;
    String address_L1;
    String address_L2;
    String pathLogo;
    byte[] logo;

    public int getCompayID() {
        return compayID;
    }

    public void setCompayID(int compayID) {
        this.compayID = compayID;
    }

    public String getCompayName_L1() {
        return compayName_L1;
    }

    public void setCompayName_L1(String compayName_L1) {
        this.compayName_L1 = compayName_L1;
    }

    public String getCompayName_L2() {
        return compayName_L2;
    }

    public void setCompayName_L2(String compayName_L2) {
        this.compayName_L2 = compayName_L2;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress_L1() {
        return address_L1;
    }

    public void setAddress_L1(String address_L1) {
        this.address_L1 = address_L1;
    }

    public String getAddress_L2() {
        return address_L2;
    }

    public void setAddress_L2(String address_L2) {
        this.address_L2 = address_L2;
    }

    public String getPathLogo() {
        return pathLogo;
    }

    public void setPathLogo(String pathLogo) {
        this.pathLogo = pathLogo;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public boolean insert() {
        try {
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Company(CPID, CP_L1, CP_L2, mobile, fax, Address_L1, Address_L2, logo) values(?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Company", "CPID"));
            p.setString(2, this.getCompayName_L1());
            p.setString(3, this.getCompayName_L2());
            p.setString(4, this.getTelephone());
            p.setString(5, this.getFax());
            p.setString(6, this.getAddress_L1());
            p.setString(7, this.getAddress_L2());
            if (this.getPathLogo() != null) {
                File ff = new File(this.getPathLogo());
                FileInputStream fis = new FileInputStream(ff);
                int len = (int) ff.length();
                p.setBinaryStream(8, fis, len);
            } else {
                p.setNull(8, java.sql.Types.BLOB);
            }
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
            String update = "update tbl_Company set CP_L1=?, CP_L2=?, mobile=?, fax=?, Address_L1=?, Address_L2=? where CPID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getCompayName_L1());
            p.setString(2, this.getCompayName_L2());
            p.setString(3, this.getTelephone());
            p.setString(4, this.getFax());
            p.setString(5, this.getAddress_L1());
            p.setString(6, this.getAddress_L2());
            p.setInt(7, this.getCompayID());
            if (p.executeUpdate() != -1) {
                if (this.getPathLogo() != null) {
                    String updateImage = "update tbl_Company set Logo=? where CPID=?";
                    PreparedStatement p1 = c.prepareStatement(updateImage);
                    File ff = new File(this.getPathLogo());
                    FileInputStream fis = new FileInputStream(ff);
                    int len = (int) ff.length();
                    p1.setBinaryStream(1, fis, len);
                    p1.setInt(2, this.getCompayID());
                    p1.executeUpdate();
                    p1.close();
                }
            }
            p.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            String update = "delete tbl_Company where CPID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getCompayID());
            p.executeUpdate();
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void setCompanyInfo() {
        try {
            String query = "Select * from tbl_Company";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                this.setCompayID(rs.getInt("CPID"));
                this.setCompayName_L1(rs.getString("CP_L1"));
                this.setCompayName_L2(rs.getString("CP_L2"));
                this.setTelephone(rs.getString("Mobile"));
                this.setFax(rs.getString("Fax"));
                this.setAddress_L1(rs.getString("Address_L1"));
                this.setAddress_L2(rs.getString("Address_L2"));
                this.setLogo(rs.getBytes("Logo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
