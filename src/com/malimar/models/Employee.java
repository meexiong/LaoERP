package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.GetMaxID;
import com.malimar.utils.Valiables;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Employee {

    int empID;
    String empNbr;
    String empEmail;
    String empName_L1;
    String empName_L2;
    String empNickname;
    int empGenderID;
    String empGenderDescription;
    Date empDOB;
    int empStatusID;
    String empStatusDescription;
    Date empStartDate;
    Date empEndDate;
    int empDivisionID;
    String empDivisionName;
    int empLocationID;
    String empLocationName;
    int empDepartmentID;
    String empDepartmentName;
    int empUnitID;
    String empUnitName;
    int empNationalityID;
    String empNationlityName;
    int empEthnicID;
    String empEthnicName;
    int empReligionID;
    String empReligionName;
    int empPositionID;
    String empPositionName;
    int empLevelID;
    String empLevelName;
    int empManagerID;
    String empManagerName;
    int empInsuranceID;
    String empInsuranceName;
    int empSalaryPeriod;
    int empWorkStatusID;
    String empWorkStatusName;
    String empPicturePath;

    public String getEmpPicturePath() {
        return empPicturePath;
    }

    public void setEmpPicturePath(String empPicturePath) {
        this.empPicturePath = empPicturePath;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(String empNbr) {
        this.empNbr = empNbr;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName_L1() {
        return empName_L1;
    }

    public void setEmpName_L1(String empName_L1) {
        this.empName_L1 = empName_L1;
    }

    public String getEmpName_L2() {
        return empName_L2;
    }

    public void setEmpName_L2(String empName_L2) {
        this.empName_L2 = empName_L2;
    }

    public String getEmpNickname() {
        return empNickname;
    }

    public void setEmpNickname(String empNickname) {
        this.empNickname = empNickname;
    }

    public int getEmpGenderID() {
        return empGenderID;
    }

    public void setEmpGenderID(int empGenderID) {
        this.empGenderID = empGenderID;
    }

    public String getEmpGenderDescription() {
        return empGenderDescription;
    }

    public void setEmpGenderDescription(String empGenderDescription) {
        this.empGenderDescription = empGenderDescription;
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(Date empDOB) {
        this.empDOB = empDOB;
    }

    public int getEmpStatusID() {
        return empStatusID;
    }

    public void setEmpStatusID(int empStatusID) {
        this.empStatusID = empStatusID;
    }

    public String getEmpStatusDescription() {
        return empStatusDescription;
    }

    public void setEmpStatusDescription(String empStatusDescription) {
        this.empStatusDescription = empStatusDescription;
    }

    public Date getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(Date empStartDate) {
        this.empStartDate = empStartDate;
    }

    public Date getEmpEndDate() {
        return empEndDate;
    }

    public void setEmpEndDate(Date empEndDate) {
        this.empEndDate = empEndDate;
    }

    public int getEmpDivisionID() {
        return empDivisionID;
    }

    public void setEmpDivisionID(int empDivisionID) {
        this.empDivisionID = empDivisionID;
    }

    public String getEmpDivisionName() {
        return empDivisionName;
    }

    public void setEmpDivisionName(String empDivisionName) {
        this.empDivisionName = empDivisionName;
    }

    public int getEmpLocationID() {
        return empLocationID;
    }

    public void setEmpLocationID(int empLocationID) {
        this.empLocationID = empLocationID;
    }

    public String getEmpLocationName() {
        return empLocationName;
    }

    public void setEmpLocationName(String empLocationName) {
        this.empLocationName = empLocationName;
    }

    public int getEmpDepartmentID() {
        return empDepartmentID;
    }

    public void setEmpDepartmentID(int empDepartmentID) {
        this.empDepartmentID = empDepartmentID;
    }

    public String getEmpDepartmentName() {
        return empDepartmentName;
    }

    public void setEmpDepartmentName(String empDepartmentName) {
        this.empDepartmentName = empDepartmentName;
    }

    public int getEmpUnitID() {
        return empUnitID;
    }

    public void setEmpUnitID(int empUnitID) {
        this.empUnitID = empUnitID;
    }

    public String getEmpUnitName() {
        return empUnitName;
    }

    public void setEmpUnitName(String empUnitName) {
        this.empUnitName = empUnitName;
    }

    public int getEmpNationalityID() {
        return empNationalityID;
    }

    public void setEmpNationalityID(int empNationalityID) {
        this.empNationalityID = empNationalityID;
    }

    public String getEmpNationlityName() {
        return empNationlityName;
    }

    public void setEmpNationlityName(String empNationlityName) {
        this.empNationlityName = empNationlityName;
    }

    public int getEmpEthnicID() {
        return empEthnicID;
    }

    public void setEmpEthnicID(int empEthnicID) {
        this.empEthnicID = empEthnicID;
    }

    public String getEmpEthnicName() {
        return empEthnicName;
    }

    public void setEmpEthnicName(String empEthnicName) {
        this.empEthnicName = empEthnicName;
    }

    public int getEmpReligionID() {
        return empReligionID;
    }

    public void setEmpReligionID(int empReligionID) {
        this.empReligionID = empReligionID;
    }

    public String getEmpReligionName() {
        return empReligionName;
    }

    public void setEmpReligionName(String empReligionName) {
        this.empReligionName = empReligionName;
    }

    public int getEmpPositionID() {
        return empPositionID;
    }

    public void setEmpPositionID(int empPositionID) {
        this.empPositionID = empPositionID;
    }

    public String getEmpPositionName() {
        return empPositionName;
    }

    public void setEmpPositionName(String empPositionName) {
        this.empPositionName = empPositionName;
    }

    public int getEmpLevelID() {
        return empLevelID;
    }

    public void setEmpLevelID(int empLevelID) {
        this.empLevelID = empLevelID;
    }

    public String getEmpLevelName() {
        return empLevelName;
    }

    public void setEmpLevelName(String empLevelName) {
        this.empLevelName = empLevelName;
    }

    public int getEmpManagerID() {
        return empManagerID;
    }

    public void setEmpManagerID(int empManagerID) {
        this.empManagerID = empManagerID;
    }

    public String getEmpManagerName() {
        return empManagerName;
    }

    public void setEmpManagerName(String empManagerName) {
        this.empManagerName = empManagerName;
    }

    public int getEmpInsuranceID() {
        return empInsuranceID;
    }

    public void setEmpInsuranceID(int empInsuranceID) {
        this.empInsuranceID = empInsuranceID;
    }

    public String getEmpInsuranceName() {
        return empInsuranceName;
    }

    public void setEmpInsuranceName(String empInsuranceName) {
        this.empInsuranceName = empInsuranceName;
    }

    public int getEmpSalaryPeriod() {
        return empSalaryPeriod;
    }

    public void setEmpSalaryPeriod(int empSalaryPeriod) {
        this.empSalaryPeriod = empSalaryPeriod;
    }

    public int getEmpWorkStatusID() {
        return empWorkStatusID;
    }

    public void setEmpWorkStatusID(int empWorkStatusID) {
        this.empWorkStatusID = empWorkStatusID;
    }

    public String getEmpWorkStatusName() {
        return empWorkStatusName;
    }

    public void setEmpWorkStatusName(String empWorkStatusName) {
        this.empWorkStatusName = empWorkStatusName;
    }

    public HashMap<String, Object[]> getGenderCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Gender";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Gen_Desc_" + Valiables.langType + ""), new Object[]{rs.getInt("Gen_ID"), rs.getString("Gen_Desc_L1"), rs.getString("Gen_Desc_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getEmpStatusCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_EmpStatus";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Emp_Status_" + Valiables.langType + ""), new Object[]{rs.getInt("EMPSTID"), rs.getString("Emp_Status_L1"), rs.getString("Emp_Status_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getDivisionCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Division";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Division_" + Valiables.langType + ""), new Object[]{rs.getInt("DID"), rs.getString("Division_L1"), rs.getString("Division_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getLocationCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Location where DID=" + this.getEmpDivisionID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Loc_name_" + Valiables.langType + ""), new Object[]{rs.getInt("Loc_ID"), rs.getString("Loc_name_L1"), rs.getString("Loc_name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getDepartmentCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Depart where Loc_ID=" + this.getEmpLocationID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Dept_Name_" + Valiables.langType + ""), new Object[]{rs.getInt("Dept_ID"), rs.getString("Dept_Name_L1"), rs.getString("Dept_Name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getUnitCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_WorkUnit order by UnitSortID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("UnitName_" + Valiables.langType + ""), new Object[]{rs.getInt("UnitID"), rs.getString("UnitName_L1"), rs.getString("UnitName_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getNationalityCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Nationality";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Nation_" + Valiables.langType + ""), new Object[]{rs.getInt("NationID"), rs.getString("Nation_L1"), rs.getString("Nation_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getEthnicCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Ethnic";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Ethnic_" + Valiables.langType + ""), new Object[]{rs.getInt("EthnicID"), rs.getString("Ethnic_L1"), rs.getString("Ethnic_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getReligionCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Region";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Region_" + Valiables.langType + ""), new Object[]{rs.getInt("RegionID"), rs.getString("Region_L1"), rs.getString("Region_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getPositionCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Title";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Title_name_" + Valiables.langType + ""), new Object[]{rs.getInt("Title_ID"), rs.getString("Title_name_L1"), rs.getString("Title_name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Object[]> getManagerCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Employee where Loc_ID=" + this.getEmpLocationID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("F_name_" + Valiables.langType + ""), new Object[]{rs.getInt("Emp_ID"), rs.getString("EMP_Nbr"), rs.getString("User_Email"), rs.getString("F_name_L1"), rs.getString("F_name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public HashMap<String, Object[]> getInsuranceCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Health";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Health_Name_" + Valiables.langType + ""), new Object[]{rs.getInt("Health_ID"), rs.getString("Health_Name_L1"), rs.getString("Health_Name_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public HashMap<String, Object[]> getWorkStatusCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from Tbl_Work_Status";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Work_Type_" + Valiables.langType + ""), new Object[]{rs.getInt("Work_Status_ID"), rs.getString("Work_Type_L1"), rs.getString("Work_Type_L2")});
            }
            rs.close();
            c.close();
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insert(){
        try {
            Connection c = DatabaseManager.getConnection();
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into Tbl_Employee(Emp_ID, EMP_Nbr, User_Email, F_name_L1, F_name_L2, NickName, Gen_ID, Emp_DOB, EMPSTID, Emp_StartDate, Emp_EndDate, Division_ID, Loc_ID, Depart_ID,"
                    + "WorkUnitID, NationID, EthnicID, RegionID, Title_ID, Emp_Level, Mgr_ID, TypeSalary, Work_Status_ID, Full_Time, Cal_payRoll, Emp_InOffice, Consult, Emp_photo)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
