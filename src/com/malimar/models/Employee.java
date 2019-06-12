package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.utils.GetMaxID;
import com.malimar.utils.ManageTable;
import com.malimar.utils.Variable;
import static com.malimar.utils.Variable.c;
import static com.malimar.utils.Variable.langType;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    int empLevel;
    int empManagerID;
    String empManagerName;
    int empInsuranceID;
    String empInsuranceName;
    int empSalaryPeriod;
    int empWorkStatusID;
    String empWorkStatusName;
    String empPicturePath;
    byte[] empPicture;
    boolean empFullTime;
    boolean empInOffice;
    boolean empCalculateSalary;
    boolean empConsultant;
    //=============== Tab InsertDetails========================
    String empFacebook;
    String empPhone1;
    String empPhone2;
    String empBurn;
    String empIDCard;
    String empFamilyNbr;
    String empPassportNbr;
    String empBloodGroup;
    String empHeight;
    String empWeight;
    String empDriverIDCard;
    boolean empCar;
    boolean empMotobile;
    String empHusbandName;
    int empHusbandAge;
    String empHusbandCareer;
    String empHusbandWorkPlace;
    String empHusbandPhone;
    String empFatherName;
    int empFatherAge;
    String empFatherCareer;
    String empFatherWorkPlace;
    String empFatherPhone;
    String empMotherName;
    int empMotherAge;
    String empMotherCareer;
    String empMotherWorkPlace;
    String empMotherrPhone;
    String empEmpEmergency;
    //================ Tab Salary ===========================
    int empSalaryID;
    int salaryTypeID;
    String salaryTypeName;
    double salaryAmount;
    boolean salaryTax;
    boolean salaryOvertime;
    float salaryDeductionRate;
    boolean salaryInsurance;
    //====================Employee Tax ========================
    boolean empTaxCol;
    int empTaxID;
    int taxTypeID;
    String taxTypeName;
    //====================Insurance =============================
    int insurEmpID;
    int insurTypeID;
    String insurTypeName;
    String insurNbr;
    double insurMaxSalary;

    public String getEmpFacebook() {
        return empFacebook;
    }

    public void setEmpFacebook(String empFacebook) {
        this.empFacebook = empFacebook;
    }

    public String getEmpPhone1() {
        return empPhone1;
    }

    public void setEmpPhone1(String empPhone1) {
        this.empPhone1 = empPhone1;
    }

    public String getEmpPhone2() {
        return empPhone2;
    }

    public void setEmpPhone2(String empPhone2) {
        this.empPhone2 = empPhone2;
    }

    public String getEmpBurn() {
        return empBurn;
    }

    public void setEmpBurn(String empBurn) {
        this.empBurn = empBurn;
    }

    public String getEmpIDCard() {
        return empIDCard;
    }

    public void setEmpIDCard(String empIDCard) {
        this.empIDCard = empIDCard;
    }

    public String getEmpFamilyNbr() {
        return empFamilyNbr;
    }

    public void setEmpFamilyNbr(String empFamilyNbr) {
        this.empFamilyNbr = empFamilyNbr;
    }

    public String getEmpPassportNbr() {
        return empPassportNbr;
    }

    public void setEmpPassportNbr(String empPassportNbr) {
        this.empPassportNbr = empPassportNbr;
    }

    public String getEmpBloodGroup() {
        return empBloodGroup;
    }

    public void setEmpBloodGroup(String empBloodGroup) {
        this.empBloodGroup = empBloodGroup;
    }

    public String getEmpHeight() {
        return empHeight;
    }

    public void setEmpHeight(String empHeight) {
        this.empHeight = empHeight;
    }

    public String getEmpWeight() {
        return empWeight;
    }

    public void setEmpWeight(String empWeight) {
        this.empWeight = empWeight;
    }

    public String getEmpDriverIDCard() {
        return empDriverIDCard;
    }

    public void setEmpDriverIDCard(String empDriverIDCard) {
        this.empDriverIDCard = empDriverIDCard;
    }

    public boolean isEmpCar() {
        return empCar;
    }

    public void setEmpCar(boolean empCar) {
        this.empCar = empCar;
    }

    public boolean isEmpMotobile() {
        return empMotobile;
    }

    public void setEmpMotobile(boolean empMotobile) {
        this.empMotobile = empMotobile;
    }

    public String getEmpHusbandName() {
        return empHusbandName;
    }

    public void setEmpHusbandName(String empHusbandName) {
        this.empHusbandName = empHusbandName;
    }

    public int getEmpHusbandAge() {
        return empHusbandAge;
    }

    public void setEmpHusbandAge(int empHusbandAge) {
        this.empHusbandAge = empHusbandAge;
    }

    public String getEmpHusbandCareer() {
        return empHusbandCareer;
    }

    public void setEmpHusbandCareer(String empHusbandCareer) {
        this.empHusbandCareer = empHusbandCareer;
    }

    public String getEmpHusbandWorkPlace() {
        return empHusbandWorkPlace;
    }

    public void setEmpHusbandWorkPlace(String empHusbandWorkPlace) {
        this.empHusbandWorkPlace = empHusbandWorkPlace;
    }

    public String getEmpHusbandPhone() {
        return empHusbandPhone;
    }

    public void setEmpHusbandPhone(String empHusbandPhone) {
        this.empHusbandPhone = empHusbandPhone;
    }

    public String getEmpFatherName() {
        return empFatherName;
    }

    public void setEmpFatherName(String empFatherName) {
        this.empFatherName = empFatherName;
    }

    public int getEmpFatherAge() {
        return empFatherAge;
    }

    public void setEmpFatherAge(int empFatherAge) {
        this.empFatherAge = empFatherAge;
    }

    public String getEmpFatherCareer() {
        return empFatherCareer;
    }

    public void setEmpFatherCareer(String empFatherCareer) {
        this.empFatherCareer = empFatherCareer;
    }

    public String getEmpFatherWorkPlace() {
        return empFatherWorkPlace;
    }

    public void setEmpFatherWorkPlace(String empFatherWorkPlace) {
        this.empFatherWorkPlace = empFatherWorkPlace;
    }

    public String getEmpFatherPhone() {
        return empFatherPhone;
    }

    public void setEmpFatherPhone(String empFatherPhone) {
        this.empFatherPhone = empFatherPhone;
    }

    public String getEmpMotherName() {
        return empMotherName;
    }

    public void setEmpMotherName(String empMotherName) {
        this.empMotherName = empMotherName;
    }

    public int getEmpMotherAge() {
        return empMotherAge;
    }

    public void setEmpMotherAge(int empMotherAge) {
        this.empMotherAge = empMotherAge;
    }

    public String getEmpMotherCareer() {
        return empMotherCareer;
    }

    public void setEmpMotherCareer(String empMotherCareer) {
        this.empMotherCareer = empMotherCareer;
    }

    public String getEmpMotherWorkPlace() {
        return empMotherWorkPlace;
    }

    public void setEmpMotherWorkPlace(String empMotherWorkPlace) {
        this.empMotherWorkPlace = empMotherWorkPlace;
    }

    public String getEmpMotherrPhone() {
        return empMotherrPhone;
    }

    public void setEmpMotherrPhone(String empMotherrPhone) {
        this.empMotherrPhone = empMotherrPhone;
    }

    public String getEmpEmpEmergency() {
        return empEmpEmergency;
    }

    public void setEmpEmpEmergency(String empEmpEmergency) {
        this.empEmpEmergency = empEmpEmergency;
    }

    public byte[] getEmpPicture() {
        return empPicture;
    }

    public void setEmpPicture(byte[] empPicture) {
        this.empPicture = empPicture;
    }

    public void setInsurMaxSalary(double insurMaxSalary) {
        this.insurMaxSalary = insurMaxSalary;
    }

    public double getInsurMaxSalary() {
        return insurMaxSalary;
    }

    public int getInsurEmpID() {
        return insurEmpID;
    }

    public void setInsurEmpID(int insurEmpID) {
        this.insurEmpID = insurEmpID;
    }

    public int getInsurTypeID() {
        return insurTypeID;
    }

    public void setInsurTypeID(int insurTypeID) {
        this.insurTypeID = insurTypeID;
    }

    public String getInsurTypeName() {
        return insurTypeName;
    }

    public void setInsurTypeName(String insurTypeName) {
        this.insurTypeName = insurTypeName;
    }

    public String getInsurNbr() {
        return insurNbr;
    }

    public void setInsurNbr(String insurNbr) {
        this.insurNbr = insurNbr;
    }

    public int getEmpTaxID() {
        return empTaxID;
    }

    public void setEmpTaxID(int empTaxID) {
        this.empTaxID = empTaxID;
    }

    public int getTaxTypeID() {
        return taxTypeID;
    }

    public void setTaxTypeID(int taxTypeID) {
        this.taxTypeID = taxTypeID;
    }

    public String getTaxTypeName() {
        return taxTypeName;
    }

    public void setTaxTypeName(String taxTypeName) {
        this.taxTypeName = taxTypeName;
    }

    public boolean isEmpTaxCol() {
        return empTaxCol;
    }

    public void setEmpTaxCol(boolean empTaxCol) {
        this.empTaxCol = empTaxCol;
    }

    public int getEmpSalaryID() {
        return empSalaryID;
    }

    public void setEmpSalaryID(int empSalaryID) {
        this.empSalaryID = empSalaryID;
    }

    public int getSalaryTypeID() {
        return salaryTypeID;
    }

    public void setSalaryTypeID(int salaryTypeID) {
        this.salaryTypeID = salaryTypeID;
    }

    public String getSalaryTypeName() {
        return salaryTypeName;
    }

    public void setSalaryTypeName(String salaryTypeName) {
        this.salaryTypeName = salaryTypeName;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public boolean isSalaryTax() {
        return salaryTax;
    }

    public void setSalaryTax(boolean salaryTax) {
        this.salaryTax = salaryTax;
    }

    public boolean isSalaryOvertime() {
        return salaryOvertime;
    }

    public void setSalaryOvertime(boolean salaryOvertime) {
        this.salaryOvertime = salaryOvertime;
    }

    public float getSalaryDeductionRate() {
        return salaryDeductionRate;
    }

    public void setSalaryDeductionRate(float salaryDeductionRate) {
        this.salaryDeductionRate = salaryDeductionRate;
    }

    public boolean isSalaryInsurance() {
        return salaryInsurance;
    }

    public void setSalaryInsurance(boolean salaryInsurance) {
        this.salaryInsurance = salaryInsurance;
    }

    public boolean isEmpFullTime() {
        return empFullTime;
    }

    public void setEmpFullTime(boolean empFullTime) {
        this.empFullTime = empFullTime;
    }

    public boolean isEmpInOffice() {
        return empInOffice;
    }

    public void setEmpInOffice(boolean empInOffice) {
        this.empInOffice = empInOffice;
    }

    public boolean isEmpCalculateSalary() {
        return empCalculateSalary;
    }

    public void setEmpCalculateSalary(boolean empCalculateSalary) {
        this.empCalculateSalary = empCalculateSalary;
    }

    public boolean isEmpConsultant() {
        return empConsultant;
    }

    public void setEmpConsultant(boolean empConsultant) {
        this.empConsultant = empConsultant;
    }

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

    public int getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(int empLevel) {
        this.empLevel = empLevel;
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
            String query = "Select * from tbl_Gender";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Gen_Desc_" + Variable.langType + ""), new Object[]{rs.getInt("Gen_ID"), rs.getString("Gen_Desc_L1"), rs.getString("Gen_Desc_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getEmpStatusCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_EmpStatus";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Emp_Status_" + Variable.langType + ""), new Object[]{rs.getInt("EMPSTID"), rs.getString("Emp_Status_L1"), rs.getString("Emp_Status_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getDivisionCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Division";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Division_" + Variable.langType + ""), new Object[]{rs.getInt("DID"), rs.getString("Division_L1"), rs.getString("Division_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getLocationCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Location where DID=" + this.getEmpDivisionID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Loc_name_" + Variable.langType + ""), new Object[]{rs.getInt("Loc_ID"), rs.getString("Loc_name_L1"), rs.getString("Loc_name_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getDepartmentCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Depart where Loc_ID=" + this.getEmpLocationID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Dept_Name_" + Variable.langType + ""), new Object[]{rs.getInt("Dept_ID"), rs.getString("Dept_Name_L1"), rs.getString("Dept_Name_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getUnitCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_WorkUnit order by UnitSortID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("UnitName_" + Variable.langType + ""), new Object[]{rs.getInt("UnitID"), rs.getString("UnitName_L1"), rs.getString("UnitName_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getNationalityCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_Nationality";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Nation_" + Variable.langType + ""), new Object[]{rs.getInt("NationID"), rs.getString("Nation_L1"), rs.getString("Nation_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getEthnicCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_Ethnic";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Ethnic_" + Variable.langType + ""), new Object[]{rs.getInt("EthnicID"), rs.getString("Ethnic_L1"), rs.getString("Ethnic_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getReligionCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from tbl_Region";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Region_" + Variable.langType + ""), new Object[]{rs.getInt("RegionID"), rs.getString("Region_L1"), rs.getString("Region_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getPositionCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Title";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Title_name_" + Variable.langType + ""), new Object[]{rs.getInt("Title_ID"), rs.getString("Title_name_L1"), rs.getString("Title_name_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getManagerCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Employee where Loc_ID=" + this.getEmpLocationID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("F_name_" + Variable.langType + ""), new Object[]{rs.getInt("Emp_ID"), rs.getString("EMP_Nbr"), rs.getString("User_Email"), rs.getString("F_name_L1"), rs.getString("F_name_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getWorkStatusCombo() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Work_Status";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Work_Type_" + Variable.langType + ""), new Object[]{rs.getInt("Work_Status_ID"), rs.getString("Work_Type_L1"), rs.getString("Work_Type_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public HashMap<String, Object[]> getSalaryType() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_SalaryType";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("SalT_Name_" + Variable.langType + ""), new Object[]{rs.getInt("SalT_ID"), rs.getString("SalT_Name_L1"), rs.getString("SalT_Name_L2")});
            }
            rs.close();
            return map;
        } catch (SQLException e) {

        }
        return null;
    }

    public boolean insert() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into Tbl_Employee(Emp_ID, EMP_Nbr, User_Email, F_name_L1, F_name_L2, NickName, Gen_ID, Emp_DOB, EMPSTID, Emp_StartDate, Emp_EndDate, Division_ID, Loc_ID, Depart_ID,"
                    + "WorkUnitID, NationID, EthnicID, RegionID, Title_ID, Emp_Level, Mgr_ID, TypeSalary, Work_Status_ID, Full_Time, Cal_payRoll, Emp_InOffice, Consult, Emp_photo)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("Tbl_Employee", "Emp_ID"));
            p.setString(2, this.getEmpNbr());
            p.setString(3, this.getEmpEmail());
            p.setString(4, this.getEmpName_L1());
            p.setString(5, this.getEmpName_L2());
            p.setString(6, this.getEmpNickname());
            p.setInt(7, this.getEmpGenderID());
            p.setString(8, df.format(this.getEmpDOB()));
            p.setInt(9, this.getEmpStatusID());
            p.setString(10, df.format(this.getEmpStartDate()));
            if (this.getEmpEndDate() == null) {
                p.setNull(11, java.sql.Types.DATE);
            } else {
                p.setString(11, df.format(this.getEmpEndDate()));
            }
            p.setInt(12, this.getEmpDivisionID());
            p.setInt(13, this.getEmpLocationID());
            p.setInt(14, this.getEmpDepartmentID());
            p.setInt(15, this.getEmpUnitID());
            p.setInt(16, this.getEmpNationalityID());
            p.setInt(17, this.getEmpEthnicID());
            p.setInt(18, this.getEmpReligionID());
            p.setInt(19, this.getEmpPositionID());
            p.setInt(20, this.getEmpLevel());
            p.setInt(21, this.getEmpManagerID());
            p.setInt(22, this.getEmpSalaryPeriod());
            p.setInt(23, this.getEmpWorkStatusID());
            p.setBoolean(24, this.isEmpFullTime());
            p.setBoolean(25, this.isEmpCalculateSalary());
            p.setBoolean(26, this.isEmpInOffice());
            p.setBoolean(27, this.isEmpConsultant());
            if (this.getEmpPicturePath() != null) {
                File ff = new File(this.getEmpPicturePath());
                FileInputStream fis = new FileInputStream(ff);
                int len = (int) ff.length();
                p.setBinaryStream(28, fis, len);
            } else {
                p.setNull(28, java.sql.Types.BLOB);
            }
            p.executeUpdate();
            p.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void load(JTable table, DefaultTableModel model) {
        try {
            ManageTable.clearTable(table, model);
            String query = "SELECT dbo.Tbl_Employee.Emp_ID, dbo.Tbl_Employee.EMP_Nbr, dbo.Tbl_Employee.F_name_" + langType + " as EmpName, \n"
                    + "dbo.Tbl_Gender.Gen_Desc_" + langType + " as sex, dbo.Tbl_Employee.User_Email, dbo.Tbl_Title.Title_name_" + langType + " as Positoin, \n"
                    + "dbo.Tbl_Depart.Dept_Name_" + langType + " as DeptName, dbo.Tbl_Location.Loc_name_" + langType + " as LocName, dbo.Tbl_Work_Status.Work_Type_" + langType + " as WrokStatusName\n"
                    + "FROM dbo.Tbl_Employee INNER JOIN\n"
                    + "dbo.Tbl_Location ON dbo.Tbl_Employee.Loc_ID = dbo.Tbl_Location.Loc_ID INNER JOIN\n"
                    + "dbo.Tbl_Work_Status ON dbo.Tbl_Employee.Work_Status_ID = dbo.Tbl_Work_Status.Work_Status_ID INNER JOIN\n"
                    + "dbo.Tbl_Title ON dbo.Tbl_Employee.Title_ID = dbo.Tbl_Title.Title_ID INNER JOIN\n"
                    + "dbo.Tbl_Depart ON dbo.Tbl_Employee.Depart_ID = dbo.Tbl_Depart.Dept_ID INNER JOIN\n"
                    + "dbo.Tbl_Gender ON dbo.Tbl_Employee.Gen_ID = dbo.Tbl_Gender.Gen_ID\n"
                    + "where dbo.Tbl_Employee.Emp_EndDate is null and Emp_ID !=1 order by dbo.Tbl_Employee.EMP_Nbr desc";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int eid = rs.getInt("Emp_ID");
                String enbr = rs.getString("Emp_Nbr");
                String ename = rs.getString("EmpName");
                String sex = rs.getString("Sex");
                String email = rs.getString("User_Email");
                String position = rs.getString("Positoin");
                String deptName = rs.getString("DeptName");
                String locName = rs.getString("DeptName");
                String workStatus = rs.getString("WrokStatusName");
                Object[] obj = new Object[]{eid, enbr, ename, sex, email, position, deptName, locName, workStatus};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEmployeeDetails() {
        try {
            String query = "SELECT dbo.Tbl_Employee.Emp_ID, dbo.Tbl_Employee.EMP_Nbr, dbo.Tbl_Employee.User_Email, \n"
                    + "dbo.Tbl_Employee.F_name_L1, dbo.Tbl_Employee.F_name_L2, dbo.Tbl_Employee.NickName, \n"
                    + "dbo.Tbl_Gender.Gen_Desc_" + langType + " as sex, dbo.Tbl_Employee.Emp_DOB, dbo.tbl_EmpStatus.Emp_Status_" + langType + " as empStatus, \n"
                    + "dbo.Tbl_Employee.Emp_StartDate, dbo.Tbl_Employee.Emp_EndDate, dbo.Tbl_Division.Division_" + langType + " as divisionName, \n"
                    + "dbo.Tbl_Location.Loc_name_" + langType + " as locName, dbo.Tbl_Depart.Dept_Name_" + langType + " as deptName, dbo.tbl_WorkUnit.UnitName_" + langType + " as unitName, \n"
                    + "dbo.tbl_Nationality.Nation_" + langType + " as nationName, dbo.tbl_Ethnic.Ethnic_" + langType + " as ethnicName, dbo.tbl_Region.Region_" + langType + " as relationName, \n"
                    + "dbo.Tbl_Title.Title_name_" + langType + " as titleName, dbo.Tbl_Employee.Emp_Level, Tbl_Employee_1.F_name_" + langType + " as manager, \n"
                    + "dbo.Tbl_Work_Status.Work_Type_" + langType + " as workStatus, dbo.Tbl_Employee.TypeSalary, dbo.Tbl_Employee.Full_Time, dbo.Tbl_Employee.Cal_payRoll, dbo.Tbl_Employee.Emp_InOffice, dbo.Tbl_Employee.Consult, dbo.Tbl_Employee.Emp_photo\n"
                    + "FROM dbo.Tbl_Employee INNER JOIN\n"
                    + "dbo.Tbl_Gender ON dbo.Tbl_Employee.Gen_ID = dbo.Tbl_Gender.Gen_ID INNER JOIN\n"
                    + "dbo.tbl_EmpStatus ON dbo.Tbl_Employee.EMPSTID = dbo.tbl_EmpStatus.EMPSTID INNER JOIN\n"
                    + "dbo.tbl_Ethnic ON dbo.Tbl_Employee.EthnicID = dbo.tbl_Ethnic.EthnicID INNER JOIN\n"
                    + "dbo.Tbl_Location ON dbo.Tbl_Employee.Loc_ID = dbo.Tbl_Location.Loc_ID INNER JOIN\n"
                    + "dbo.tbl_Nationality ON dbo.Tbl_Employee.NationID = dbo.tbl_Nationality.NationID INNER JOIN\n"
                    + "dbo.tbl_Region ON dbo.Tbl_Employee.RegionID = dbo.tbl_Region.RegionID INNER JOIN\n"
                    + "dbo.Tbl_Work_Status ON dbo.Tbl_Employee.Work_Status_ID = dbo.Tbl_Work_Status.Work_Status_ID INNER JOIN\n"
                    + "dbo.Tbl_Depart ON dbo.Tbl_Employee.Depart_ID = dbo.Tbl_Depart.Dept_ID INNER JOIN\n"
                    + "dbo.tbl_WorkUnit ON dbo.Tbl_Employee.WorkUnitID = dbo.tbl_WorkUnit.UnitID INNER JOIN\n"
                    + "dbo.Tbl_Division ON dbo.Tbl_Employee.Division_ID = dbo.Tbl_Division.DID INNER JOIN\n"
                    + "dbo.Tbl_Title ON dbo.Tbl_Employee.Title_ID = dbo.Tbl_Title.Title_ID INNER JOIN\n"
                    + "dbo.Tbl_Employee AS Tbl_Employee_1 ON dbo.Tbl_Employee.Mgr_ID = Tbl_Employee_1.Emp_ID\n"
                    + "where dbo.Tbl_Employee.Emp_ID=" + this.getEmpID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            if (rs.next()) {
                this.setEmpNbr(rs.getString("EMP_Nbr"));
                this.setEmpEmail(rs.getString("User_Email"));
                this.setEmpName_L1(rs.getString("F_name_L1"));
                this.setEmpName_L2(rs.getString("F_name_L2"));
                this.setEmpNickname(rs.getString("NickName"));
                this.setEmpGenderDescription(rs.getString("sex"));
                this.setEmpDOB(rs.getDate("Emp_DOB"));
                this.setEmpStatusDescription(rs.getString("empStatus"));
                this.setEmpStartDate(rs.getDate("Emp_StartDate"));
                this.setEmpEndDate(rs.getDate("Emp_EndDate"));
                this.setEmpDivisionName(rs.getString("divisionName"));
                this.setEmpLocationName(rs.getString("locName"));
                this.setEmpDepartmentName(rs.getString("deptName"));
                this.setEmpUnitName(rs.getString("unitName"));
                this.setEmpNationlityName(rs.getString("nationName"));
                this.setEmpEthnicName(rs.getString("ethnicName"));
                this.setEmpReligionName(rs.getString("relationName"));
                this.setEmpPositionName(rs.getString("titleName"));
                this.setEmpLevel(rs.getInt("Emp_Level"));
                this.setEmpManagerName(rs.getString("manager"));
                this.setEmpSalaryPeriod(rs.getInt("TypeSalary"));
                this.setEmpWorkStatusName(rs.getString("workStatus"));
                this.setEmpFullTime(rs.getBoolean("Full_Time"));
                this.setEmpCalculateSalary(rs.getBoolean("Cal_payRoll"));
                this.setEmpInOffice(rs.getBoolean("Emp_InOffice"));
                this.setEmpConsultant(rs.getBoolean("Consult"));
                this.setEmpPicture(rs.getBytes("Emp_photo"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadSalary(JTable table, DefaultTableModel model) {
        try {
            ManageTable.clearTable(table, model);
            DecimalFormat df = new DecimalFormat("#,##0");
            String query = "SELECT dbo.Tbl_SalaryEmp.Sal_Emp_ID, dbo.Tbl_SalaryType.SalT_Name_" + langType + " as salaryType, \n"
                    + "dbo.Tbl_SalaryEmp.Sal_Emp_Amt, dbo.Tbl_SalaryEmp.Sal_Calc, \n"
                    + "dbo.Tbl_SalaryEmp.Sal_Calc_OT, dbo.Tbl_SalaryEmp.P_Percents, \n"
                    + "dbo.Tbl_SalaryEmp.P_Amount, dbo.Tbl_SalaryEmp.Sal_Insu\n"
                    + "FROM dbo.Tbl_SalaryType INNER JOIN\n"
                    + "dbo.Tbl_SalaryEmp ON dbo.Tbl_SalaryType.SalT_ID = dbo.Tbl_SalaryEmp.SalT_ID\n"
                    + "where dbo.Tbl_SalaryEmp.Emp_ID=" + this.getEmpID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sal_Emp_ID");
                String type = rs.getString("salaryType");
                double amount = rs.getDouble("Sal_Emp_Amt");
                Boolean tax = rs.getBoolean("Sal_Calc");
                Boolean ot = rs.getBoolean("Sal_Calc_OT");
                float deduction = rs.getFloat("P_Percents");
                double dedAmount = rs.getDouble("P_Amount");
                Boolean insur = rs.getBoolean("Sal_Insu");
                Object[] obj = new Object[]{id, type, df.format(amount), tax, ot, deduction, df.format(dedAmount), insur};
                model.addRow(obj);
            }
            table.setModel(model);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insertEmpSalary() {
        try {
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into Tbl_SalaryEmp(Sal_Emp_ID, Emp_ID, SalT_ID, Sal_Emp_Amt, Sal_Calc, Sal_Calc_OT, P_Percents, P_Amount, Sal_Insu)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("Tbl_SalaryEmp", "Sal_Emp_ID"));
            p.setInt(2, this.getEmpID());
            p.setInt(3, this.getSalaryTypeID());
            p.setDouble(4, this.getSalaryAmount());
            p.setBoolean(5, this.isSalaryTax());
            p.setBoolean(6, this.isSalaryOvertime());
            p.setFloat(7, this.getSalaryDeductionRate());
            p.setDouble(8, (this.getSalaryAmount() * this.getSalaryDeductionRate()) / 100);
            p.setBoolean(9, this.isSalaryInsurance());
            p.executeUpdate();
            p.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateEmpSalary() {
        try {
            String update = "Update Tbl_SalaryEmp set SalT_ID=?, Sal_Emp_Amt=?, Sal_Calc=?, Sal_Calc_OT=?, P_Percents=?, P_Amount=?, Sal_Insu=? where Sal_Emp_ID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getSalaryTypeID());
            p.setDouble(2, this.getSalaryAmount());
            p.setBoolean(3, this.isSalaryTax());
            p.setBoolean(4, this.isSalaryOvertime());
            p.setFloat(5, this.getSalaryDeductionRate());
            p.setDouble(6, (this.getSalaryAmount() * this.getSalaryDeductionRate()) / 100);
            p.setBoolean(7, this.isSalaryInsurance());
            p.setInt(8, this.getEmpSalaryID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete() {
        try {
            String delete = "Delete Tbl_SalaryEmp where Sal_Emp_ID=?";
            PreparedStatement p = c.prepareStatement(delete);
            int a = this.getEmpSalaryID();
            p.setInt(1, this.getEmpSalaryID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public HashMap<String, Object[]> getStandardTax() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_DeductType";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Ded_Name_" + langType + ""), new Object[]{rs.getInt("Ded_ID"), rs.getString("Ded_Name_L1"), rs.getString("Ded_Name_L2"), rs.getInt("Ded_Pct"), rs.getDouble("Ded_Limit_A"), rs.getDouble("Ded_Limit_B")});
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateEmpTaxColumn() {
        try {
            String update = "update tbl_employee set StandardTax = ? where emp_id =?";
            PreparedStatement p = c.prepareStatement(update);
            p.setBoolean(1, this.isEmpTaxCol());
            p.setInt(2, this.getEmpID());
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmpTax() {
        try {
            Statement sts;
            sts = c.createStatement();
            String delete = "Delete from tbl_emp_tax where emp_id = " + this.getEmpID() + "";
            sts.executeUpdate(delete);
            sts.close();
        } catch (Exception e) {
        }
    }

    public void insertEmpStandardTax() {
        try {
            deleteEmpTax();
            String query = "Select ded_ID from tbl_DeductType where not ded_note =0 order by Ded_Pct";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int ded_id = rs.getInt("ded_ID");
                GetMaxID gm = new GetMaxID();
                String insert = "Insert into tbl_emp_tax (Etax_ID, ded_ID, emp_id, Using_tax) values (?,?,?,?)";
                PreparedStatement p = c.prepareStatement(insert);
                p.setInt(1, gm.getIntID("tbl_emp_tax", "Etax_ID"));
                p.setInt(2, ded_id);
                p.setInt(3, this.getEmpID());
                p.setInt(4, 1);
                p.executeUpdate();
                p.close();
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertEmpCustomizeTax() {
        try {
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into tbl_emp_tax (ded_id, emp_id, using_tax, Etax_ID) values (?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, this.getTaxTypeID());
            p.setInt(2, this.getEmpID());
            p.setBoolean(3, true);
            p.setInt(4, gm.getIntID("tbl_emp_tax", "Etax_ID"));
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean insertEmpInsurance() {
        try {
            GetMaxID gm = new GetMaxID();
            String insert = "Insert into tbl_Insurance_Emp(InTypeEmpID, Health_ID, emp_id, InsuranceNbr, MaxSalary)values(?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, gm.getIntID("tbl_Insurance_Emp", "InTypeEmpID"));
            p.setInt(2, this.getInsurTypeID());
            p.setInt(3, this.getEmpID());
            p.setString(4, this.getInsurNbr());
            p.setDouble(5, this.getInsurMaxSalary());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateEmpInsurance() {
        try {
            String update = "Update tbl_Insurance_Emp set Health_ID=?, emp_id=?, InsuranceNbr=?, MaxSalary=? where InTypeEmpID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, this.getInsurTypeID());
            p.setInt(2, this.getEmpID());
            p.setString(3, this.getInsurNbr());
            p.setDouble(4, this.getInsurMaxSalary());
            p.setInt(5, this.getInsurEmpID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteEmpInsurance() {
        try {
            String delete = "Delete tbl_Insurance_Emp where InTypeEmpID=?";
            PreparedStatement p = c.prepareStatement(delete);
            p.setInt(1, this.getInsurEmpID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void loadEmpInsurance(JTable table, DefaultTableModel model) {
        try {
            int i = 1;
            DecimalFormat df = new DecimalFormat("#,##0");
            ManageTable.clearTable(table, model);
            String query = "SELECT dbo.tbl_Insurance_Emp.InTypeEmpID, dbo.Tbl_Health.Health_Name_" + langType + " as type, \n"
                    + "dbo.tbl_Insurance_Emp.InsuranceNbr, dbo.tbl_Insurance_Emp.MaxSalary\n"
                    + "FROM dbo.tbl_Insurance_Emp INNER JOIN\n"
                    + "dbo.Tbl_Health ON dbo.tbl_Insurance_Emp.Health_ID = dbo.Tbl_Health.Health_ID\n"
                    + "WHERE dbo.tbl_Insurance_Emp.emp_id = " + this.getEmpID() + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("InTypeEmpID");
                String type = rs.getString("type");
                String nbr = rs.getString("InsuranceNbr");
                double sal = rs.getDouble("MaxSalary");
                Object[] obj = new Object[]{ id, i++, type, nbr, df.format(sal)};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public HashMap<String, Object[]> getInsuranceType() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "Select * from Tbl_Health where Health_Active=1";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("Health_Name_" + langType + ""), new Object[]{rs.getInt("Health_ID"), rs.getString("Health_Name_L1"), rs.getString("Health_Name_L2"), rs.getBoolean("Health_Active"), rs.getFloat("EmpPercent"), rs.getFloat("CompanyPercent"), rs.getDouble("Max_Money")});
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insertEmpDetails(){
        try {
            String insert = "update tbl_Employee set Emp_FBook=?, Emp_Phone1=?, Emp_Phone2=?, Born=?, Emp_IDCard=?, Emp_SProf_ID=?, PassportNo=?, GroupBlood=?, Heigh=?, Weight=?,"
                    + "DriverCardID=?, DriverCar=?, DriverMotor=?, CompanionName=?, Age=?, Job=?, Company=?, Title=?, FatherName=?, FatherAge=?, FatherJob=?, FatherCompany=?, FatherPhone=?,"
                    + "MotherName=?, MotherAge=?, MotherJob=?, MotherCompany=?, MotherPhone=?, FamilyContact=? where Emp_ID=?";
            PreparedStatement p = c.prepareStatement(insert);
            p.setString(1, this.getEmpFacebook());
            p.setString(2, this.getEmpPhone1());
            p.setString(3, this.getEmpPhone2());
            p.setString(4, this.getEmpBurn());
            p.setString(5, this.getEmpIDCard());
            p.setString(6, this.getEmpFamilyNbr());
            p.setString(7, this.getEmpPassportNbr());
            p.setString(8, this.getEmpBloodGroup());
            p.setString(9, this.getEmpHeight());
            p.setString(10, this.getEmpWeight());
            p.setString(11, this.getEmpDriverIDCard());
            p.setBoolean(12, this.isEmpCar());
            p.setBoolean(13, this.isEmpMotobile());
            p.setString(14, this.getEmpHusbandName());
            p.setInt(15, this.getEmpHusbandAge());
            p.setString(16, this.getEmpHusbandCareer());
            p.setString(17, this.getEmpHusbandWorkPlace());
            p.setString(18, this.getEmpHusbandPhone());
            p.setString(19, this.getEmpFatherName());
            p.setInt(20, this.getEmpFatherAge());
            p.setString(21, this.getEmpFatherCareer());
            p.setString(22, this.getEmpFatherWorkPlace());
            p.setString(23, this.getEmpFatherPhone());
            p.setString(24, this.getEmpMotherName());
            p.setInt(25, this.getEmpMotherAge());
            p.setString(26, this.getEmpMotherCareer());
            p.setString(27, this.getEmpMotherWorkPlace());
            p.setString(28, this.getEmpMotherrPhone());
            p.setString(29, this.getEmpEmpEmergency());
            p.setInt(30, this.getEmpID());
            p.executeUpdate();
            p.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void loadEmployeeDetails(){
        try {
            String query = "SELECT Emp_FBook, Emp_Phone1, Emp_Phone2, Born, Emp_IDCard, Emp_SProf_ID, \n" +
            "PassportNo, GroupBlood, Heigh, Weight, DriverCardID, DriverCar, DriverMotor, \n" +
            "CompanionName, Age, Job, Company, Title, FatherName, FatherAge, FatherJob, \n" +
            "FatherCompany, FatherPhone, MotherName, MotherAge, MotherJob, MotherCompany, \n" +
            "MotherPhone, FamilyContact FROM dbo.Tbl_Employee where emp_ID="+this.getEmpID()+"";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
                this.setEmpFacebook(rs.getString("Emp_FBook"));
                this.setEmpPhone1(rs.getString("Emp_Phone1"));
                this.setEmpPhone2(rs.getString("Emp_Phone2"));
                this.setEmpBurn(rs.getString("Born"));
                this.setEmpIDCard(rs.getString("Emp_IDCard"));
                this.setEmpFamilyNbr(rs.getString("Emp_SProf_ID"));
                this.setEmpPassportNbr(rs.getString("PassportNo"));
                this.setEmpBloodGroup(rs.getString("GroupBlood"));
                this.setEmpHeight(rs.getString("Heigh"));
                this.setEmpWeight(rs.getString("Weight"));
                this.setEmpDriverIDCard(rs.getString("DriverCardID"));
                this.setEmpCar(rs.getBoolean("DriverCar"));
                this.setEmpMotobile(rs.getBoolean("DriverMotor"));
                this.setEmpHusbandName(rs.getString("CompanionName"));
                this.setEmpHusbandAge(rs.getInt("Age"));
                this.setEmpHusbandCareer(rs.getString("Job"));
                this.setEmpHusbandWorkPlace(rs.getString("Company"));
                this.setEmpHusbandPhone(rs.getString("Title"));
                this.setEmpFatherName(rs.getString("FatherName"));
                this.setEmpFatherAge(rs.getInt("FatherAge"));
                this.setEmpFatherCareer(rs.getString("FatherJob"));
                this.setEmpFatherWorkPlace(rs.getString("FatherCompany"));
                this.setEmpFatherPhone(rs.getString("FatherPhone"));
                this.setEmpMotherName(rs.getString("MotherName"));
                this.setEmpMotherAge(rs.getInt("MotherAge"));
                this.setEmpMotherCareer(rs.getString("MotherJob"));
                this.setEmpMotherWorkPlace(rs.getString("MotherCompany"));
                this.setEmpMotherrPhone(rs.getString("MotherPhone"));
                this.setEmpEmpEmergency(rs.getString("FamilyContact"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
