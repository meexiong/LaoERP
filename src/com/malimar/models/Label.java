package com.malimar.models;

import com.malimar.databases.DatabaseManager;
import com.malimar.views.FrmChangeLabel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Label {

    public static int LN;
    public static String LangType;
    public static String frameName;
    public static String fieldName;
    String labelLao;
    String labelEN;

    public String getLabelLao() {
        return labelLao;
    }

    public void setLabelLao(String labelLao) {
        this.labelLao = labelLao;
    }

    public String getLabelEN() {
        return labelEN;
    }

    public void setLabelEN(String labelEN) {
        this.labelEN = labelEN;
    }

    public static HashMap<String, String[]> hmapLang = new HashMap();

    public static String getLabelLang() {
        try {
            String sql;
            Connection c = DatabaseManager.getConnection();
            sql = "EXEC pd_ChangeLabelLang";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {
                hmapLang.put(rs.getString(1), new String[]{rs.getString(2), rs.getString(3)});
            }
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void WindowChangeLabel(String s, String frm, java.awt.event.MouseEvent evt) {
        try {
            if (evt.getModifiers() == 6) {
                fieldName = s;
                frameName = frm;
                FrmChangeLabel ch = new FrmChangeLabel(null, true);
                ch.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        return null;
    }

    public void saveLabel() {
        try {
            Connection c = DatabaseManager.getConnection();
            String sql = "update Tbl_Sys_Lang_Label set Sys_L1 = ?, Sys_L2 = ? where Sys_LL_FieldName = (?) and frm = (?)";
            PreparedStatement p = c.prepareStatement(sql);
            String a = this.getLabelLao();
            p.setString(1, this.getLabelLao());
            p.setString(2, this.getLabelEN());
            p.setString(3, fieldName);
            p.setString(4, frameName);
            p.executeUpdate();
            p.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            Connection c = DatabaseManager.getConnection();
            String sql = "Select * from Tbl_Sys_Lang_Label where Sys_LL_FieldName = '" + fieldName + "' and frm = N'" + frameName + "'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                String lao = rs.getString("sys_l1");
                String eng = rs.getString("sys_l2");
                this.setLabelLao(lao);
                this.setLabelEN(eng);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
