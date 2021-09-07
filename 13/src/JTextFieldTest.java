
/**
 * @Description: 文本框
 * @Date: 2021-09-07 10:14:55
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-07 10:45:44
 * @FilePath: /13/src/JTextFieldTest.java
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldTest extends JFrame {
  private static final long serialVersionUID = 1L;

  public JTextFieldTest() {
    setSize(250, 100);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    Container cp = getContentPane();
    getContentPane().setLayout(new FlowLayout());
    final JTextField jt = new JTextField("aaa", 20);
    final JButton jb = new JButton("清除");
    cp.add(jt);
    cp.add(jb);
    jt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        jt.setText("触发事件");
      }
    });

    jb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg1) {
        jt.setText("");
        jt.requestFocus();
      }
    });
    setVisible(true);
  }

  public static void main(String[] args) {
    new JTextFieldTest();
  }
}