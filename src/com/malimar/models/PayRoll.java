package com.malimar.models;

import com.malimar.utils.ManageTable;
import static com.malimar.utils.Valiables.c;
import static com.malimar.utils.Valiables.langType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PayRoll {
    int departmentID;
    String departmentName;
    Date startDate;
    Date endDate;
    
    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public HashMap<String, Object[]> loadEmpDetails() {
        try {
            HashMap<String, Object[]> map = new HashMap<>();
            String query = "SELECT dbo.Tbl_Employee.Emp_ID, dbo.Tbl_Employee.EMP_Nbr, dbo.Tbl_Employee.F_name_" + langType + " as empName, dbo.Tbl_Depart.Dept_ID, dbo.Tbl_Depart.Dept_Name_" + langType + " as deptName, dbo.Tbl_Employee.Full_Time, dbo.Tbl_Work_Status.Work_Type_" + langType + " as empWST\n"
                    + "FROM dbo.Tbl_Employee INNER JOIN\n"
                    + "dbo.Tbl_Depart ON dbo.Tbl_Employee.Depart_ID = dbo.Tbl_Depart.Dept_ID INNER JOIN\n"
                    + "dbo.Tbl_Work_Status ON dbo.Tbl_Employee.Work_Status_ID = dbo.Tbl_Work_Status.Work_Status_ID\n"
                    + "where dbo.Tbl_Employee.Cal_payRoll=1 and dbo.Tbl_Employee.Emp_EndDate is null and dbo.Tbl_Depart.Dept_ID="+this.getDepartmentID()+"";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                map.put(rs.getString("EMP_Nbr"), new Object[]{rs.getInt("Emp_ID"), rs.getString("EMP_Nbr"), rs.getString("empName"), rs.getInt("Dept_ID"), rs.getString("deptName"), rs.getBoolean("Full_Time"), rs.getString("empWST")});
            }
            return map;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void loadDepartment(JTable table, DefaultTableModel model){
        try {
            ManageTable.clearTable(table, model);
            String query = "Select * from Tbl_Depart order by DSortOrder";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                Object[] obj = new Object[]{false,rs.getInt(1), rs.getString("Dept_Name_"+langType+"")};
                model.addRow(obj);
            }
            table.setModel(model);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
