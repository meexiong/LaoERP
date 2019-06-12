
package com.malimar.utils;

import com.malimar.databases.DatabaseManager;
import java.sql.Connection;

public class Variable {
    public static String langType;
    public static int userLoginID;
    public static String emailLogin;
    public static Connection c = DatabaseManager.getConnection();
    public static String bomG;
    public static String eomG;
    public static String ymG;
}
