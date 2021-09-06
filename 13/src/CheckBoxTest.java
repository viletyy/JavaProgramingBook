
/**
 * @Description: 复选框
 * @Date: 2021-09-06 17:04:23
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 17:16:51
 * @FilePath: /13/src/CheckBoxTest.java
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel panel1 = new JPanel();
  private JPanel panel2 = new JPanel();
  private JTextArea jt = new JTextArea(3, 10);
  private JCheckBox jc1 = new JCheckBox("1");
  private JCheckBox jc2 = new JCheckBox("2");
  private JCheckBox jc3 = new JCheckBox("3");

  public CheckBoxTest() {
    Container c = getContentPane();

    c.setLayout(new BorderLayout());
    c.add(panel1, BorderLayout.NORTH);
    final JScrollPane scrollPane = new JScrollPane(jt);
    panel1.add(scrollPane);

    c.add(panel2, BorderLayout.SOUTH);
    panel2.add(jc1);
    jc1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jc1.isSelected()) {
          jt.append("复选框1被选中\n");
        }
      }
    });

    panel2.add(jc2);
    jc2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jc2.isSelected()) {
          jt.append("复选框2被选中\n");
        }
      }
    });

    panel2.add(jc3);
    jc3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jc3.isSelected()) {
          jt.append("复选框3被选中\n");
        }
      }
    });

    setSize(200, 160);
    setVisible(true);
    setTitle("复选框使用");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new CheckBoxTest();
  }
}