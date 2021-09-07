
/**
 * @Description: 焦点事件监听器
 * @Date: 2021-09-07 10:54:18
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-07 11:00:06
 * @FilePath: /13/src/FocusEventTest.java
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FocusEventTest extends JFrame {

  public static final long serialVersionUID = 1L;

  public FocusEventTest() {
    setSize(250, 100);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    getContentPane().setLayout(new FlowLayout());

    final JLabel label = new JLabel();
    getContentPane().add(label);
    JTextField jt = new JTextField("请点击其他文本框", 10);
    JTextField jt2 = new JTextField("请单击我", 10);
    cp.add(jt);
    cp.add(jt2);
    jt.addFocusListener(new FocusListener() {
      public void focusLost(FocusEvent arg0) {
        JOptionPane.showMessageDialog(null, "文本框失去焦点");
      }

      public void focusGained(FocusEvent arg0) {
      }
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new FocusEventTest();
  }
}