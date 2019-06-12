package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.ManageTable;
import static com.malimar.utils.Variable.langType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Location {

    int locationID;
    int sortBy;
    int divisionID;
    String divisionName;
    String locationName_L1;
    String locationName_L2;
    String telephone;
    int groupID;
    String groupName;
    int districtID;
    String districtName;
    String address_L1;
    String address_L2;
    int managerID;
    String managerName;
    int assistantID;
    String assistantName;
    String locNumber;

    public String getLocNumber() {
        return locNumber;
    }

    public void setLocNumber(String locNumber) {
        this.locNumber = locNumber;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }

    public int getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getLocationName_L1() {
        return locationName_L1;
    }

    public void setLocationName_L1(String locationName_L1) {
        this.locationName_L1 = locationName_L1;
    }

    public String getLocationName_L2() {
        return locationName_L2;
    }

    public void setLocationName_L2(String locationName_L2) {
        this.locationName_L2 = locationName_L2;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getAssistantID() {
        return assistantID;
    }

    public void setAssistantID(int assistantID) {
        this.assistantID = assistantID;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public HashMap<String, Object[]> getDivisionInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Division order by SortOrder";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Division_" + langType + ""), new Object[]{rs.getInt("DID"), rs.getString("Division_L1"), rs.getString("Division_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getGroupInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Group";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Grp_Name_" + langType + ""), new Object[]{rs.getInt("Grp_ID"), rs.getString("Grp_Name_L1"), rs.getString("Grp_Name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getDistrictInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_District";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Dist_Name_" + langType + ""), new Object[]{rs.getInt("Dist_ID"), rs.getString("Dist_Name_L1"), rs.getString("Dist_Name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getManagerInfo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Employee where Emp_EndDate is null and Emp_ID<>1";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("F_Name_" + langType + ""), new Object[]{rs.getInt("Emp_ID"), rs.getString("F_Name_L1"), rs.getString("F_Name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getAssistant() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Employee where Emp_EndDate is null and Emp_ID<>1";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("F_Name_" + langType + ""), new Object[]{rs.getInt("Emp_ID"), rs.getString("F_Name_L1"), rs.getString("F_Name_L2")});
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
            String insert = "Insert into tbl_Location(Loc_ID, Loc_name_L1, Loc_name_L2, Grp_ID, Loc_Phone_Nbr, loc_Addr_L1, Loc_Addr_L2, Dist_ID, MGR_ID, Assist_MGR_ID, Loc_number, DID, LSortOrder)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, g.getMaxID("Tbl_Location", "Loc_ID"));
            p.setString(2, this.getLocationName_L1());
            p.setString(3, this.getLocationName_L2());
            p.setInt(4, this.getGroupID());
            p.setString(5, this.getTelephone());
            p.setString(6, this.getAddress_L1());
            p.setString(7, this.getAddress_L2());
            p.setInt(8, this.getDistrictID());
            p.setInt(9, this.getManagerID());
            p.setInt(10, this.getAssistantID());
            p.setString(11, this.getLocNumber());
            p.setInt(12, this.getDivisionID());
            p.setInt(13, this.getSortBy());
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
            String update = "Update tbl_Location set Loc_name_L1=?, Loc_name_L2=?, Grp_ID=?, Loc_Phone_Nbr=?, loc_Addr_L1=?, "
                    + "Loc_Addr_L2=?, Dist_ID=?, MGR_ID=?, Assist_MGR_ID=?, Loc_number=?, DID=?, LSortOrder=? where Loc_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, this.getLocationName_L1());
            p.setString(2, this.getLocationName_L2());
            p.setInt(3, this.getGroupID());
            p.setString(4, this.getTelephone());
            p.setString(5, this.getAddress_L1());
            p.setString(6, this.getAddress_L2());
            p.setInt(7, this.getDistrictID());
            p.setInt(8, this.getManagerID());
            p.setInt(9, this.getAssistantID());
            p.setString(10, this.getLocNumber());
            p.setInt(11, this.getDivisionID());
            p.setInt(12, this.getSortBy());
            p.setInt(13, this.getLocationID());
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
            String delete = "Delete tbl_Location where Loc_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getLocationID());
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
            String query = "SELECT dbo.Tbl_Location.Loc_ID, dbo.Tbl_Location.Loc_number, dbo.Tbl_Location.Loc_name_L1, \n"
                    + "dbo.Tbl_Location.Loc_name_L2, dbo.Tbl_Location.Loc_Phone_Nbr, dbo.Tbl_Group.Grp_Name_" + langType + " as group1,\n"
                    + "dbo.Tbl_District.Dist_Name_" + langType + " as district, dbo.Tbl_Location.Loc_Addr_L1, dbo.Tbl_Location.Loc_Addr_L2, \n"
                    + "dbo.Tbl_Employee.F_name_" + langType + " as Manager, Tbl_Employee_1.F_name_" + langType + " AS Assistant, dbo.Tbl_Division.Division_" + langType + " as divisionname, dbo.Tbl_Location.LSortOrder\n"
                    + "FROM dbo.Tbl_Location INNER JOIN\n"
                    + "dbo.Tbl_District ON dbo.Tbl_Location.Dist_ID = dbo.Tbl_District.Dist_ID INNER JOIN\n"
                    + "dbo.Tbl_Employee ON dbo.Tbl_Location.MGR_ID = dbo.Tbl_Employee.Emp_ID INNER JOIN\n"
                    + "dbo.Tbl_Group ON dbo.Tbl_Location.Grp_ID = dbo.Tbl_Group.Grp_ID INNER JOIN\n"
                    + "dbo.Tbl_Employee AS Tbl_Employee_1 ON dbo.Tbl_Location.Assist_MGR_ID = Tbl_Employee_1.Emp_ID INNER JOIN\n"
                    + "dbo.Tbl_Division ON dbo.Tbl_Location.DID = dbo.Tbl_Division.DID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Loc_ID");
                String nbr = rs.getString("Loc_number");
                String locname1 = rs.getString("Loc_name_L1");
                String locname2 = rs.getString("Loc_name_L2");
                String phone = rs.getString("Loc_Phone_Nbr");
                String group = rs.getString("group1");
                String district = rs.getString("district");
                String address1 = rs.getString("Loc_Addr_L1");
                String address2 = rs.getString("Loc_Addr_L2");
                String manager = rs.getString("Manager");
                String assistant = rs.getString("Assistant");
                String division = rs.getString("divisionname");
                int sortby = rs.getInt("LSortOrder");
                Object[] obj = new Object[]{id, nbr, locname1, locname2, phone, group, district, address1, address2, manager, assistant, division, sortby};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
