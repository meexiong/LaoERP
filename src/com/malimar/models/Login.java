
package com.malimar.models;

import com.malimar.utils.Valiables;
import static com.malimar.utils.Valiables.c;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean getNewUser(){
        try {
            String query = "Select userLogin from tbl_User where UserLogin=N'"+this.getUsername()+"' and type_default = 0";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
               return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public String getUserPassword(){
        try {
            String query = "Select u.userid, u.UserLogin, e.F_name_L1, u.User_pwd, u.Userlogin_Status, u.Type_Default, u.Type_Login \n" +
            "from tbl_User u inner join Tbl_Employee e on u.EMP_ID = e.Emp_ID\n" +
            "where u.UserLogin = '"+this.getUsername()+"'";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
                Valiables.userLoginID = rs.getInt("userid");
                Valiables.emailLogin = this.getUsername();
                return rs.getString("User_pwd");
            }
        } catch (SQLException e) {
        }
        return null;
    }
   
}
