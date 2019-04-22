
package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenerateID {
    public int getMaxID(String table, String col){
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "Select isnull(Max("+col+"),0)+1 as id from "+table+"";
            ResultSet rs = c.createStatement().executeQuery(query);
            if(rs.next()){
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
