
/**
 * @Description: 带文字与图片的按钮
 * @Date: 2021-09-06 16:12:35
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 18:29:04
 * @FilePath: /13/src/JButtonTest.java
 */
import java.awt.*;
import java.awt.event.*;

import java.net.*;
import javax.swing.*;

public class JButtonTest extends JFrame {
  private static final long serialVersionUID = 1L;

  public JButtonTest() {
    URL url = JButtonTest.class.getResource("imageButton.jpg");
    Icon icon = new ImageIcon(url);
    setLayout(new GridLayout(3, 2, 5, 5));
    Container c = getContentPane();
    for (int i = 0; i < 5; i++) {
      JButton j = new JButton("button" + i, icon);
      c.add(j);
      if (i % 2 == 0) {
        j.setEnabled(false);
      }
    }

    JButton jb = new JButton();
    jb.setMaximumSize(new Dimension(90, 30));
    jb.setIcon(icon);
    jb.setHideActionText(true);
    jb.setToolTipText("图片按钮");
    jb.setBorderPainted(false);
    jb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "弹出对话框");
      }
    });
    c.add(jb);

    JRadioButton jr1 = new JRadioButton("图片", null, true);
    JRadioButton jr2 = new JRadioButton();
    JRadioButton jr3 = new JRadioButton();
    ButtonGroup group = new ButtonGroup();
    c.add(jr1);
    c.add(jr2);
    c.add(jr3);
    group.add(jr1);
    group.add(jr2);
    group.add(jr3);

    setTitle("创建带文字与图片的按钮");
    setSize(350, 150);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public static void main(String[] args) {
    new JButtonTest();
  }
}