
package com.malimar.utils;

import static com.malimar.utils.Valiables.langType;
import javax.swing.JOptionPane;

public class MessageBox {
    public static void msgWarning() {
        if (langType.equals(EnumStatus.L1.name())) {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "ການລຸນາກວດສອບໃໝ່" + "</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "Plese check data again" + "</font></p></html>", "MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }
    public static void msgError() {
        if (langType.equals(EnumStatus.L1.name())) {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "ລະບົບມີບັນຫາ" + "</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "System Error" + "</font></p></html>", "MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }
     public static void msgSuccess() {
        if (langType.equals(EnumStatus.L1.name())) {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "ສຳເລັດ" + "</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "Success" + "</font></p></html>", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void msgConnected() {
        if (langType.equals(EnumStatus.L1.name())) {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "ຕິດຕໍ່ຖານຂໍ້ມູນສຳເລັດ" + "</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "Connected" + "</font></p></html>", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void msgDisconnected() {
        if (langType.equals(EnumStatus.L1.name())) {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "ບໍ່ສາມາດຕິດຕໍ່ຖານຂໍ້ມູນໄດ້" + "</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">" + "Connect failed" + "</font></p></html>", "MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }
}
