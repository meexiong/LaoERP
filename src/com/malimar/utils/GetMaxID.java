
package com.malimar.utils;

import com.malimar.databases.DatabaseManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetMaxID {
    Connection c = DatabaseManager.getConnection();
    public int getIntID(String dbTable, String colID){
        try {
            String query = "Select isnull(Max("+colID+"),0)+1 as maxID from "+dbTable+"";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
                return rs.getInt("maxID");
            }
        } catch (SQLException e) {
        }
        return 0;
    }
    public int getIntID2(String dbTable, String colID){
        try {
            String query = "Select isnull(Max("+colID+"),1000)+1 as maxID from "+dbTable+"";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
                return rs.getInt("maxID");
            }
        } catch (SQLException e) {
        }
        return 0;
    }
}
