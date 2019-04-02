package com.malimar.models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseSetting {

    String serverName;
    String databaseName;
    String userName;
    String password;
    String port;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public boolean write() {
        try {
            Properties prop = new Properties();
            OutputStream output = null;
            output = new FileOutputStream("src/com/malimar/databases/Datasource.properties");
            prop.setProperty("ServerName", this.getServerName());
            prop.setProperty("DatabaseName", this.getDatabaseName());
            prop.setProperty("UserName", this.getUserName());
            prop.setProperty("Password", this.getPassword());
            prop.setProperty("Port", this.getPort());
            prop.store(output, null);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void read(){
        try {
            Properties prop = new Properties();
            InputStream input =null;
            input = new FileInputStream("src/com/malimar/databases/Datasource.properties");
            prop.load(input);
            this.setServerName(prop.getProperty("ServerName"));
            this.setDatabaseName(prop.getProperty("DatabaseName"));
            this.setUserName(prop.getProperty("UserName"));
            this.setPassword(prop.getProperty("Password"));
            this.setPort(prop.getProperty("Port"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean test(){
        try {
            String url = "jdbc:sqlserver://"+this.getServerName()+":"+this.getPort()+"; DatabaseName="+this.getDatabaseName();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(url, this.getUserName(), this.getPassword());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
