
package com.malimar.utils;

import com.malimar.databases.DatabaseManager;
import java.sql.Connection;

public class Valiables {
    public static String langType;
    public static int userLoginID;
    public static String emailLogin;
    public static Connection c = DatabaseManager.getConnection();
}
