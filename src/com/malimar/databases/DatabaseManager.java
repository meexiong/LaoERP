
package com.malimar.databases;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseManager {
    public static Connection getConnection(){
        try {
            Properties prop = new Properties();
            InputStream input =null;
            input = new FileInputStream("src/com/malimar/databases/Datasource.properties");
            prop.load(input);
            String url = "jdbc:sqlserver://"+prop.getProperty("ServerName")+":"+prop.getProperty("Port")+"; DatabaseName="+prop.getProperty("DatabaseName");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(url, prop.getProperty("UserName"), prop.getProperty("Password"));
            return c;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
