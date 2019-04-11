/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malimar.models;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class Main {

  public static void main(final String args[]) {
    final String labels[] = { "A", "B", "C", "D", "E" };
    JFrame frame = new JFrame("Popup JComboBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComboBox comboBox = new JComboBox(labels);
    comboBox.setUI((ComboBoxUI) MyComboBoxUI.createUI(comboBox));
    frame.add(comboBox, BorderLayout.NORTH);

    frame.setSize(300, 200);
    frame.setVisible(true);

  }

  static class MyComboBoxUI extends BasicComboBoxUI {
    public static ComponentUI createUI(JComponent c) {
      return new MyComboBoxUI();
    }

    protected JButton createArrowButton() {
      JButton button = new BasicArrowButton(BasicArrowButton.EAST);
      return button;
    }
  }
}
