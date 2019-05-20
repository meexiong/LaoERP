
package com.malimar.utils;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class InternalFrame {
    private final JComponent northPane;
    private final Border border;
    public InternalFrame(JInternalFrame frame){
        border = frame.getBorder();
        northPane = ((BasicInternalFrameUI) frame.getUI()).getNorthPane();
        setUndecorated(true, frame);
    }
    private void setUndecorated(boolean val, JInternalFrame frame)
    {
        frame.setBorder(val ? null : border);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(val ? null : northPane);
    }
}
