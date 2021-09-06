
/**
 * @Description: 绝对布局
 * @Date: 2021-09-06 14:20:06
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 17:16:29
 * @FilePath: /13/src/AbsolutePosition.java
 */

import java.awt.*;
import javax.swing.*;

public class AbsolutePosition extends JFrame {
  public AbsolutePosition() {
    setTitle("本窗体使用绝对布局");
    setLayout(null);
    setBounds(0, 0, 200, 150);
    Container c = getContentPane();
    JButton b1 = new JButton("按钮1");
    JButton b2 = new JButton("按钮2");
    b1.setBounds(10, 30, 80, 30);
    b2.setBounds(60, 70, 100, 20);
    c.add(b1);
    c.add(b2);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new AbsolutePosition();
  }
}
