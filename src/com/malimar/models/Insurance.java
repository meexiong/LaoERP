package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Insurance {

    int insuranceID;
    String insurance_L1;
    String insurance_L2;
    int InsuranceActive;
    float empPercentage;
    float comPercentage;
    double maxMoney;

    public int getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getInsurance_L1() {
        return insurance_L1;
    }

    public void setInsurance_L1(String insurance_L1) {
        this.insurance_L1 = insurance_L1;
    }

    public String getInsurance_L2() {
        return insurance_L2;
    }

    public void setInsurance_L2(String insurance_L2) {
        this.insurance_L2 = insurance_L2;
    }

    public int getInsuranceActive() {
        return InsuranceActive;
    }

    public void setInsuranceActive(int InsuranceActive) {
        this.InsuranceActive = InsuranceActive;
    }

    public float getEmpPercentage() {
        return empPercentage;
    }

    public void setEmpPercentage(float empPercentage) {
        this.empPercentage = empPercentage;
    }

    public float getComPercentage() {
        return comPercentage;
    }

    public void setComPercentage(float comPercentage) {
        this.comPercentage = comPercentage;
    }

    public double getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(double maxMoney) {
        this.maxMoney = maxMoney;
    }

    public boolean insert() {
        try {
            Connection c = DatabaseManager.getConnection();
            GenerateID g = new GenerateID();
            String insert = "Insert into tbl_Health(Health_ID, Health_Name_L1, Health_Name_L2, Health_Active, EmpPercent, CompanyPercent, Max_Money)values(?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("tbl_Health", "Health_ID"));
            p.setString(2, this.getInsurance_L1());
            p.setString(3, this.getInsurance_L2());
            p.setInt(4, this.getInsuranceActive());
            p.setFloat(5, this.getEmpPercentage());
            p.setFloat(6, this.getComPercentage());
            p.setDouble(7, this.getMaxMoney());
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
            String update = "Update tbl_Health set Health_Name_L1=?, Health_Name_L2=?, Health_Active=?, EmpPercent=?, CompanyPercent=?, Max_Money=? where Health_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getInsurance_L1());
            p.setString(2, this.getInsurance_L2());
            p.setInt(3, this.getInsuranceActive());
            p.setFloat(4, this.getEmpPercentage());
            p.setFloat(5, this.getComPercentage());
            p.setDouble(6, this.getMaxMoney());
            p.setInt(7, this.getInsuranceID());
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
            String update = "delete tbl_Health where Health_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getInsuranceID());
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
            String query = "Select * from tbl_Health";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Health_ID");
                String name1 = rs.getString("Health_Name_L1");
                String name2 = rs.getString("Health_Name_L2");
                float empP = rs.getFloat("EmpPercent");
                float comP = rs.getFloat("CompanyPercent");
                double maxM = rs.getDouble("Max_Money");
                Object[] obj = new Object[]{id, name1, name2, empP, comP, maxM};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
