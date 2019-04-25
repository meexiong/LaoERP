
package com.malimar.utils;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CheckField {

    public static boolean comboBox(JComboBox cmb) {
        if (cmb.getSelectedIndex() == -1) {
            cmb.setBorder(new LineBorder(Color.RED));
            cmb.requestFocus();
            return false;
        }
        return true;
    }
    public static void textString(JTextField txt){
        if(txt.getText().isEmpty()){
            txt.setBorder(new LineBorder(Color.RED));
            return;
        }
    }
    public static void textNumber(JTextField txt){
        if(txt.getText().equals("0")){
            txt.setBorder(new LineBorder(Color.RED));
            return;
        }
    }
}
